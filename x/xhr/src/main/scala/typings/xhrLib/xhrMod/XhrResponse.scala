package typings
package xhrLib.xhrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrResponse extends js.Object {
  var body: js.Object | java.lang.String
  var headers: XhrHeaders
  var method: java.lang.String
  var rawRequest: stdLib.XMLHttpRequest
  var statusCode: scala.Double
  var url: java.lang.String
}

