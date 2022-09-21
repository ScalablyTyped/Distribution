package typings.telnetlib.mod

import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("telnetlib", "MCCP")
@js.native
open class MCCP protected () extends TelnetOption {
  def this(socet: Socket, code: Double) = this()
  
  def endCompression(): Unit = js.native
  def endCompression(callback: js.Function0[js.Object]): Unit = js.native
}
