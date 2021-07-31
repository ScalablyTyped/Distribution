package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VirtualKeyModifiers extends StObject
/** Specifies the virtual key used to modify another keypress. For example, the Ctrl key when pressed in conjunction with another key, as in Ctrl+C. */
@JSGlobal("Windows.System.VirtualKeyModifiers")
@js.native
object VirtualKeyModifiers extends StObject {
  
  /** The Ctrl (control) virtual key. */
  @js.native
  sealed trait control
    extends StObject
       with VirtualKeyModifiers
  
  /** The Menu virtual key. */
  @js.native
  sealed trait menu
    extends StObject
       with VirtualKeyModifiers
  
  /** No virtual key modifier. */
  @js.native
  sealed trait none
    extends StObject
       with VirtualKeyModifiers
  
  /** The Shift virtual key. */
  @js.native
  sealed trait shift
    extends StObject
       with VirtualKeyModifiers
  
  /** The Windows virtual key. */
  @js.native
  sealed trait windows
    extends StObject
       with VirtualKeyModifiers
}
