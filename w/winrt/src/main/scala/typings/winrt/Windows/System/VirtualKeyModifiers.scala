package typings.winrt.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VirtualKeyModifiers extends js.Object

@JSGlobal("Windows.System.VirtualKeyModifiers")
@js.native
object VirtualKeyModifiers extends js.Object {
  @js.native
  sealed trait control extends VirtualKeyModifiers
  
  @js.native
  sealed trait menu extends VirtualKeyModifiers
  
  @js.native
  sealed trait none extends VirtualKeyModifiers
  
  @js.native
  sealed trait shift extends VirtualKeyModifiers
  
  @js.native
  sealed trait windows extends VirtualKeyModifiers
  
}

