package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerUpdateKind extends StObject
@JSGlobal("Windows.UI.Input.PointerUpdateKind")
@js.native
object PointerUpdateKind extends StObject {
  
  @js.native
  sealed trait leftButtonPressed extends PointerUpdateKind
  
  @js.native
  sealed trait leftButtonReleased extends PointerUpdateKind
  
  @js.native
  sealed trait middleButtonPressed extends PointerUpdateKind
  
  @js.native
  sealed trait middleButtonReleased extends PointerUpdateKind
  
  @js.native
  sealed trait other extends PointerUpdateKind
  
  @js.native
  sealed trait rightButtonPressed extends PointerUpdateKind
  
  @js.native
  sealed trait rightButtonReleased extends PointerUpdateKind
  
  @js.native
  sealed trait xButton1Pressed extends PointerUpdateKind
  
  @js.native
  sealed trait xButton1Released extends PointerUpdateKind
  
  @js.native
  sealed trait xButton2Pressed extends PointerUpdateKind
  
  @js.native
  sealed trait xButton2Released extends PointerUpdateKind
}
