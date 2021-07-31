package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerUpdateKind extends StObject
@JSGlobal("Windows.UI.Input.PointerUpdateKind")
@js.native
object PointerUpdateKind extends StObject {
  
  @js.native
  sealed trait leftButtonPressed
    extends StObject
       with PointerUpdateKind
  
  @js.native
  sealed trait leftButtonReleased
    extends StObject
       with PointerUpdateKind
  
  @js.native
  sealed trait middleButtonPressed
    extends StObject
       with PointerUpdateKind
  
  @js.native
  sealed trait middleButtonReleased
    extends StObject
       with PointerUpdateKind
  
  @js.native
  sealed trait other
    extends StObject
       with PointerUpdateKind
  
  @js.native
  sealed trait rightButtonPressed
    extends StObject
       with PointerUpdateKind
  
  @js.native
  sealed trait rightButtonReleased
    extends StObject
       with PointerUpdateKind
  
  @js.native
  sealed trait xButton1Pressed
    extends StObject
       with PointerUpdateKind
  
  @js.native
  sealed trait xButton1Released
    extends StObject
       with PointerUpdateKind
  
  @js.native
  sealed trait xButton2Pressed
    extends StObject
       with PointerUpdateKind
  
  @js.native
  sealed trait xButton2Released
    extends StObject
       with PointerUpdateKind
}
