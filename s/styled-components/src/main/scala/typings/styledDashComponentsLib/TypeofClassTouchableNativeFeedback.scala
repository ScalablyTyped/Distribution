package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassTouchableNativeFeedback
  extends org.scalablytyped.runtime.Instantiable0[reactDashNativeLib.reactDashNativeMod.TouchableNativeFeedback] {
  /**
    * Creates an object that represents ripple drawable with specified color (as a
    * string). If property `borderless` evaluates to true the ripple will
    * render outside of the view bounds (see native actionbar buttons as an
    * example of that behavior). This background type is available on Android
    * API level 21+.
    *
    * @param color The ripple color
    * @param borderless If the ripple can render outside it's bounds
    */
  def Ripple(color: java.lang.String): reactDashNativeLib.reactDashNativeMod.RippleBackgroundPropType = js.native
  def Ripple(color: java.lang.String, borderless: scala.Boolean): reactDashNativeLib.reactDashNativeMod.RippleBackgroundPropType = js.native
  /**
    * Creates an object that represents android theme's default background for
    * selectable elements (?android:attr/selectableItemBackground).
    */
  def SelectableBackground(): reactDashNativeLib.reactDashNativeMod.ThemeAttributeBackgroundPropType = js.native
  /**
    * Creates an object that represent android theme's default background for borderless
    * selectable elements (?android:attr/selectableItemBackgroundBorderless).
    * Available on android API level 21+.
    */
  def SelectableBackgroundBorderless(): reactDashNativeLib.reactDashNativeMod.ThemeAttributeBackgroundPropType = js.native
  def canUseNativeForeground(): scala.Boolean = js.native
}

