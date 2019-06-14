package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GestureSettings extends js.Object

@JSGlobal("Windows.UI.Input.GestureSettings")
@js.native
object GestureSettings extends js.Object {
  @js.native
  sealed trait crossSlide
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait doubleTap
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait drag
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait hold
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait holdWithMouse
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait manipulationRotate
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait manipulationRotateInertia
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait manipulationScale
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait manipulationScaleInertia
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait manipulationTranslateInertia
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait manipulationTranslateRailsX
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait manipulationTranslateRailsY
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait manipulationTranslateX
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait manipulationTranslateY
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait rightTap
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  @js.native
  sealed trait tap
    extends winrtLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /* 16 */ val crossSlide: crossSlide with scala.Double = js.native
  /* 2 */ val doubleTap: doubleTap with scala.Double = js.native
  /* 6 */ val drag: drag with scala.Double = js.native
  /* 3 */ val hold: hold with scala.Double = js.native
  /* 4 */ val holdWithMouse: holdWithMouse with scala.Double = js.native
  /* 11 */ val manipulationRotate: manipulationRotate with scala.Double = js.native
  /* 14 */ val manipulationRotateInertia: manipulationRotateInertia with scala.Double = js.native
  /* 12 */ val manipulationScale: manipulationScale with scala.Double = js.native
  /* 15 */ val manipulationScaleInertia: manipulationScaleInertia with scala.Double = js.native
  /* 13 */ val manipulationTranslateInertia: manipulationTranslateInertia with scala.Double = js.native
  /* 9 */ val manipulationTranslateRailsX: manipulationTranslateRailsX with scala.Double = js.native
  /* 10 */ val manipulationTranslateRailsY: manipulationTranslateRailsY with scala.Double = js.native
  /* 7 */ val manipulationTranslateX: manipulationTranslateX with scala.Double = js.native
  /* 8 */ val manipulationTranslateY: manipulationTranslateY with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 5 */ val rightTap: rightTap with scala.Double = js.native
  /* 1 */ val tap: tap with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.GestureSettings with scala.Double] = js.native
}

