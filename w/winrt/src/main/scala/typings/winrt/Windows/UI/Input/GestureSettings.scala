package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Input.GestureSettings.crossSlide
import typings.winrt.Windows.UI.Input.GestureSettings.doubleTap
import typings.winrt.Windows.UI.Input.GestureSettings.drag
import typings.winrt.Windows.UI.Input.GestureSettings.hold
import typings.winrt.Windows.UI.Input.GestureSettings.holdWithMouse
import typings.winrt.Windows.UI.Input.GestureSettings.manipulationRotate
import typings.winrt.Windows.UI.Input.GestureSettings.manipulationRotateInertia
import typings.winrt.Windows.UI.Input.GestureSettings.manipulationScale
import typings.winrt.Windows.UI.Input.GestureSettings.manipulationScaleInertia
import typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateInertia
import typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsX
import typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsY
import typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateX
import typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateY
import typings.winrt.Windows.UI.Input.GestureSettings.none
import typings.winrt.Windows.UI.Input.GestureSettings.rightTap
import typings.winrt.Windows.UI.Input.GestureSettings.tap
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GestureSettings with Double] = js.native
  /* 16 */ @js.native
  object crossSlide extends TopLevel[crossSlide with Double]
  
  /* 2 */ @js.native
  object doubleTap extends TopLevel[doubleTap with Double]
  
  /* 6 */ @js.native
  object drag extends TopLevel[drag with Double]
  
  /* 3 */ @js.native
  object hold extends TopLevel[hold with Double]
  
  /* 4 */ @js.native
  object holdWithMouse extends TopLevel[holdWithMouse with Double]
  
  /* 11 */ @js.native
  object manipulationRotate extends TopLevel[manipulationRotate with Double]
  
  /* 14 */ @js.native
  object manipulationRotateInertia extends TopLevel[manipulationRotateInertia with Double]
  
  /* 12 */ @js.native
  object manipulationScale extends TopLevel[manipulationScale with Double]
  
  /* 15 */ @js.native
  object manipulationScaleInertia extends TopLevel[manipulationScaleInertia with Double]
  
  /* 13 */ @js.native
  object manipulationTranslateInertia extends TopLevel[manipulationTranslateInertia with Double]
  
  /* 9 */ @js.native
  object manipulationTranslateRailsX extends TopLevel[manipulationTranslateRailsX with Double]
  
  /* 10 */ @js.native
  object manipulationTranslateRailsY extends TopLevel[manipulationTranslateRailsY with Double]
  
  /* 7 */ @js.native
  object manipulationTranslateX extends TopLevel[manipulationTranslateX with Double]
  
  /* 8 */ @js.native
  object manipulationTranslateY extends TopLevel[manipulationTranslateY with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 5 */ @js.native
  object rightTap extends TopLevel[rightTap with Double]
  
  /* 1 */ @js.native
  object tap extends TopLevel[tap with Double]
  
}

