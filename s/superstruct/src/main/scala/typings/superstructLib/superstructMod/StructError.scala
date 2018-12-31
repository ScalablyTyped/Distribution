package typings
package superstructLib.superstructMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructError
  extends stdLib.Error {
  var data: js.Any
  var errors: js.Array[StructError]
  var path: js.Array[java.lang.String]
  var reason: js.Any
  var `type`: java.lang.String
  var value: js.Any
}

