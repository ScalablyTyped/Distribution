package typings.telnetlib.mod

import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("telnetlib", "TelnetOption")
@js.native
open class TelnetOption protected () extends EventEmitter {
  def this(socet: Socket, code: Double) = this()
  
  def disabled(at: At): Unit = js.native
  
  def enabled(at: At): Unit = js.native
  
  def handleDo(): Unit = js.native
  
  def handleDont(): Unit = js.native
  
  def handleWill(): Unit = js.native
  
  def handleWont(): Unit = js.native
  
  def him: OptionState = js.native
  def him_=(him: OptionState): Unit = js.native
  
  def subnegotiation(buffer: Any): Unit = js.native
  
  def us: OptionState = js.native
  def us_=(us: OptionState): Unit = js.native
}
