package typings
package xmlrpcLib.xmlrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlrpc", "dateFormatter")
@js.native
object dateFormatter extends js.Object {
  def decodeIso8601(time: java.lang.String): stdLib.Date = js.native
  def encodeIso8601(date: stdLib.Date): java.lang.String = js.native
  def setOpts(opts: xmlrpcLib.xmlrpcMod.DateFormatterOptions): scala.Unit = js.native
}

