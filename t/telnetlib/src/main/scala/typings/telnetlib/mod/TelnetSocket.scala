package typings.telnetlib.mod

import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("telnetlib", "TelnetSocket")
@js.native
open class TelnetSocket protected () extends Socket {
  def this(socket: Socket, options: Options_[TelnetOption]) = this()
  
  def disableLocal(option: TelnetOption): Unit = js.native
  def disableLocal(option: TelnetOption, timeout: Double): Unit = js.native
  
  def disableRemote(option: TelnetOption): Unit = js.native
  def disableRemote(option: TelnetOption, timeout: Double): Unit = js.native
  
  def enableLocal(option: TelnetOption): Unit = js.native
  def enableLocal(option: TelnetOption, timeout: Double): Unit = js.native
  
  def enableRemote(option: TelnetOption): Unit = js.native
  def enableRemote(option: TelnetOption, timeout: Double): Unit = js.native
  
  def getOption[T /* <: TelnetOption */](code: T): T = js.native
  
  def negotiate(): js.Promise[Any] = js.native
}
