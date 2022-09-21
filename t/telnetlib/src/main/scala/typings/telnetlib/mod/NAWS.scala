package typings.telnetlib.mod

import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("telnetlib", "NAWS")
@js.native
open class NAWS protected () extends TelnetOption {
  def this(socket: Socket) = this()
  
  def sendResize(): Unit = js.native
  def sendResize(width: Double): Unit = js.native
  def sendResize(width: Double, height: Double): Unit = js.native
  def sendResize(width: Unit, height: Double): Unit = js.native
}
