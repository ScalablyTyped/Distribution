package typings.xmlrpc.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmlrpc", "dateFormatter")
@js.native
object dateFormatter extends js.Object {
  
  def decodeIso8601(time: String): Date = js.native
  
  def encodeIso8601(date: Date): String = js.native
  
  def setOpts(opts: DateFormatterOptions): Unit = js.native
}
