package typings
package typedDashRestDashClientLib.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IHttpClientResponse extends js.Object {
  var message: nodeLib.httpMod.IncomingMessage
  def readBody(): stdLib.Promise[java.lang.String]
}

