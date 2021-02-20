package typings.winrt.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VirtualKeyModifiers extends StObject
@JSGlobal("Windows.System.VirtualKeyModifiers")
@js.native
object VirtualKeyModifiers extends StObject {
  
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
