package typings.telnetlib.mod

import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("telnetlib", "GMCP")
@js.native
open class GMCP protected () extends TelnetOption {
  def this(socket: Socket) = this()
  
  def send(packageName: String, messageName: String): Unit = js.native
  def send(packageName: String, messageName: String, data: js.Object): Unit = js.native
}
