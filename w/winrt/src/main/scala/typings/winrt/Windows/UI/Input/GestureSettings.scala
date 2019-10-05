package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GestureSettings extends js.Object

@JSGlobal("Windows.UI.Input.GestureSettings")
@js.native
object GestureSettings extends js.Object {
  @js.native
  sealed trait crossSlide extends GestureSettings
  
  @js.native
  sealed trait doubleTap extends GestureSettings
  
  @js.native
  sealed trait drag extends GestureSettings
  
  @js.native
  sealed trait hold extends GestureSettings
  
  @js.native
  sealed trait holdWithMouse extends GestureSettings
  
  @js.native
  sealed trait manipulationRotate extends GestureSettings
  
  @js.native
  sealed trait manipulationRotateInertia extends GestureSettings
  
  @js.native
  sealed trait manipulationScale extends GestureSettings
  
  @js.native
  sealed trait manipulationScaleInertia extends GestureSettings
  
  @js.native
  sealed trait manipulationTranslateInertia extends GestureSettings
  
  @js.native
  sealed trait manipulationTranslateRailsX extends GestureSettings
  
  @js.native
  sealed trait manipulationTranslateRailsY extends GestureSettings
  
  @js.native
  sealed trait manipulationTranslateX extends GestureSettings
  
  @js.native
  sealed trait manipulationTranslateY extends GestureSettings
  
  @js.native
  sealed trait none extends GestureSettings
  
  @js.native
  sealed trait rightTap extends GestureSettings
  
  @js.native
  sealed trait tap extends GestureSettings
  
  /* 16 */ val crossSlide: typings.winrt.Windows.UI.Input.GestureSettings.crossSlide with Double = js.native
  /* 2 */ val doubleTap: typings.winrt.Windows.UI.Input.GestureSettings.doubleTap with Double = js.native
  /* 6 */ val drag: typings.winrt.Windows.UI.Input.GestureSettings.drag with Double = js.native
  /* 3 */ val hold: typings.winrt.Windows.UI.Input.GestureSettings.hold with Double = js.native
  /* 4 */ val holdWithMouse: typings.winrt.Windows.UI.Input.GestureSettings.holdWithMouse with Double = js.native
  /* 11 */ val manipulationRotate: typings.winrt.Windows.UI.Input.GestureSettings.manipulationRotate with Double = js.native
  /* 14 */ val manipulationRotateInertia: typings.winrt.Windows.UI.Input.GestureSettings.manipulationRotateInertia with Double = js.native
  /* 12 */ val manipulationScale: typings.winrt.Windows.UI.Input.GestureSettings.manipulationScale with Double = js.native
  /* 15 */ val manipulationScaleInertia: typings.winrt.Windows.UI.Input.GestureSettings.manipulationScaleInertia with Double = js.native
  /* 13 */ val manipulationTranslateInertia: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateInertia with Double = js.native
  /* 9 */ val manipulationTranslateRailsX: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsX with Double = js.native
  /* 10 */ val manipulationTranslateRailsY: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsY with Double = js.native
  /* 7 */ val manipulationTranslateX: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateX with Double = js.native
  /* 8 */ val manipulationTranslateY: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateY with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.UI.Input.GestureSettings.none with Double = js.native
  /* 5 */ val rightTap: typings.winrt.Windows.UI.Input.GestureSettings.rightTap with Double = js.native
  /* 1 */ val tap: typings.winrt.Windows.UI.Input.GestureSettings.tap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GestureSettings with Double] = js.native
}

