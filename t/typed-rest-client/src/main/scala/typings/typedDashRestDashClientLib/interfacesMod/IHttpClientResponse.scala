package typings
package typedDashRestDashClientLib.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpClientResponse extends js.Object {
  var message: nodeLib.httpMod.IncomingMessage
  def readBody(): js.Promise[java.lang.String]
}

