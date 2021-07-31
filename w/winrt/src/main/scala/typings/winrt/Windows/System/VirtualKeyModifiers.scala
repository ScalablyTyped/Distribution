package typings.winrt.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VirtualKeyModifiers extends StObject
@JSGlobal("Windows.System.VirtualKeyModifiers")
@js.native
object VirtualKeyModifiers extends StObject {
  
  @js.native
  sealed trait control
    extends StObject
       with VirtualKeyModifiers
  
  @js.native
  sealed trait menu
    extends StObject
       with VirtualKeyModifiers
  
  @js.native
  sealed trait none
    extends StObject
       with VirtualKeyModifiers
  
  @js.native
  sealed trait shift
    extends StObject
       with VirtualKeyModifiers
  
  @js.native
  sealed trait windows
    extends StObject
       with VirtualKeyModifiers
}
