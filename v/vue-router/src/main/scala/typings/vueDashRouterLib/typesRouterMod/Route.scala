package typings
package vueDashRouterLib.typesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var fullPath: java.lang.String
  var hash: java.lang.String
  var matched: js.Array[RouteRecord]
  var meta: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var params: Dictionary[java.lang.String]
  var path: java.lang.String
  var query: Dictionary[java.lang.String | js.Array[java.lang.String]]
  var redirectedFrom: js.UndefOr[java.lang.String] = js.undefined
}

