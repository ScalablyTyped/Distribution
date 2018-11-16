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
  
  val crossSlide: crossSlide with java.lang.String = js.native
  val doubleTap: doubleTap with java.lang.String = js.native
  val drag: drag with java.lang.String = js.native
  val hold: hold with java.lang.String = js.native
  val holdWithMouse: holdWithMouse with java.lang.String = js.native
  val manipulationRotate: manipulationRotate with java.lang.String = js.native
  val manipulationRotateInertia: manipulationRotateInertia with java.lang.String = js.native
  val manipulationScale: manipulationScale with java.lang.String = js.native
  val manipulationScaleInertia: manipulationScaleInertia with java.lang.String = js.native
  val manipulationTranslateInertia: manipulationTranslateInertia with java.lang.String = js.native
  val manipulationTranslateRailsX: manipulationTranslateRailsX with java.lang.String = js.native
  val manipulationTranslateRailsY: manipulationTranslateRailsY with java.lang.String = js.native
  val manipulationTranslateX: manipulationTranslateX with java.lang.String = js.native
  val manipulationTranslateY: manipulationTranslateY with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val rightTap: rightTap with java.lang.String = js.native
  val tap: tap with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.GestureSettings with java.lang.String] = js.native
}

