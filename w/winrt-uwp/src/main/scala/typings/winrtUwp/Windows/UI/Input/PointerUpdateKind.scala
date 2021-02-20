package typings.winrtUwp.Windows.UI.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerUpdateKind extends StObject
/** Specifies the types of pointer updates that are supported by an application. */
@JSGlobal("Windows.UI.Input.PointerUpdateKind")
@js.native
object PointerUpdateKind extends StObject {
  
  /** Left button pressed. */
  @js.native
  sealed trait leftButtonPressed extends PointerUpdateKind
  
  /** Left button released. */
  @js.native
  sealed trait leftButtonReleased extends PointerUpdateKind
  
  /** Middle button pressed. */
  @js.native
  sealed trait middleButtonPressed extends PointerUpdateKind
  
  /** Middle button released. */
  @js.native
  sealed trait middleButtonReleased extends PointerUpdateKind
  
  /** Pointer updates not identified by other PointerUpdateKind values. */
  @js.native
  sealed trait other extends PointerUpdateKind
  
  /** Right button pressed. */
  @js.native
  sealed trait rightButtonPressed extends PointerUpdateKind
  
  /** Right button released. */
  @js.native
  sealed trait rightButtonReleased extends PointerUpdateKind
  
  /** XBUTTON1 pressed. */
  @js.native
  sealed trait xbutton1Pressed extends PointerUpdateKind
  
  /** XBUTTON1 released. */
  @js.native
  sealed trait xbutton1Released extends PointerUpdateKind
  
  /** XBUTTON2 pressed. */
  @js.native
  sealed trait xbutton2Pressed extends PointerUpdateKind
  
  /** XBUTTON2 released. */
  @js.native
  sealed trait xbutton2Released extends PointerUpdateKind
}
