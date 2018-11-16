package typings
package titaniumLib.TitaniumNs.AndroidNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The Titanium binding of the Android system-wide resources class.
		 */
@JSGlobal("Titanium.Android.R")
@js.native
object RNs extends js.Object {
  /**
  			 * Animation resources. See
  			 * [R.anim](https://developer.android.com/reference/android/R.anim.html)
  			 * in the Android Developer Reference.
  			 */
  val anim: js.Any = js.native
  /**
  			 * Animator resources. See
  			 * [R.animator](https://developer.android.com/reference/android/R.animator.html)
  			 * in the Android Developer Reference.
  			 */
  val animator: js.Any = js.native
  /**
  			 * The name of the API that this proxy corresponds to.
  			 */
  val apiName: java.lang.String = js.native
  /**
  			 * Array resources. See [R.array](https://developer.android.com/reference/android/R.array.html)
  			 * in the Android Developer Reference.
  			 */
  val array: js.Any = js.native
  /**
  			 * Attribute resources. See
  			 * [R.attr](https://developer.android.com/reference/android/R.attr.html)
  			 * in the Android Developer Reference.
  			 */
  val attr: js.Any = js.native
  /**
  			 * Boolean resources. See
  			 * [R.bool](https://developer.android.com/reference/android/R.bool.html)
  			 * in the Android Developer Reference.
  			 */
  val bool: js.Any = js.native
  /**
  			 * Indicates if the proxy will bubble an event to its parent.
  			 */
  var bubbleParent: scala.Boolean = js.native
  /**
  			 * Color resources. See
  			 * [R.color](https://developer.android.com/reference/android/R.color.html)
  			 * in the Android Developer Reference.
  			 */
  val color: js.Any = js.native
  /**
  			 * Dimension resources.  See
  			 * [https://developer.android.com/reference/android/R.dimen.html](https://developer.android.com/reference/android/R.dimen.html)
  			 * in the Android Developer Reference.
  			 */
  val dimen: js.Any = js.native
  /**
  			 * Drawable resources. See
  			 * [R.drawable](https://developer.android.com/reference/android/R.drawable.html)
  			 * in the Android Developer Reference.
  			 */
  val drawable: js.Any = js.native
  /**
  			 * Fraction resources. See
  			 * [R.fraction](https://developer.android.com/reference/android/R.fraction.html)
  			 * in the Android Developer Reference.
  			 */
  val fraction: js.Any = js.native
  /**
  			 * ID resources.  See
  			 * [R.id](https://developer.android.com/reference/android/R.id.html)
  			 * in the Android Developer Reference.
  			 */
  val id: js.Any = js.native
  /**
  			 * Integer resources. See
  			 * [R.integer](https://developer.android.com/reference/android/R.integer.html)
  			 * in the Android Developer Reference.
  			 */
  val integer: js.Any = js.native
  /**
  			 * Interpolator resources. See
  			 * [R.fraction](https://developer.android.com/reference/android/R.interpolator.html)
  			 * in the Android Developer Reference.
  			 */
  val interpolator: js.Any = js.native
  /**
  			 * Layout resources. See
  			 * [R.layout](https://developer.android.com/reference/android/R.layout.html)
  			 * in the Android Developer Reference.
  			 */
  val layout: js.Any = js.native
  /**
  			 * The Window or TabGroup whose Activity lifecycle should be triggered on the proxy.
  			 */
  var lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Menu resources. See
  			 * [R.menu](https://developer.android.com/reference/android/R.menu.html)
  			 * in the Android Developer Reference.
  			 */
  val menu: js.Any = js.native
  /**
  			 * Mipmap resources. See
  			 * [R.mipmap](https://developer.android.com/reference/android/R.mipmap.html)
  			 * in the Android Developer Reference.
  			 */
  val mipmap: js.Any = js.native
  /**
  			 * Plurals resources. See
  			 * [R.plurals](https://developer.android.com/reference/android/R.plurals.html)
  			 * in the Android Developer Reference.
  			 */
  val plurals: js.Any = js.native
  /**
  			 * Raw resources. See
  			 * [R.raw](https://developer.android.com/reference/android/R.raw.html)
  			 * in the Android Developer Reference.
  			 */
  val raw: js.Any = js.native
  /**
  			 * String resources. See
  			 * [R.string](https://developer.android.com/reference/android/R.string.html)
  			 * in the Android Developer Reference.
  			 */
  val string: js.Any = js.native
  /**
  			 * Style resources. See
  			 * [R.style](https://developer.android.com/reference/android/R.style.html)
  			 * in the Android Developer Reference.
  			 */
  val style: js.Any = js.native
  /**
  			 * Styleable reosurces. See
  			 * [R.styleable](https://developer.android.com/reference/android/R.styleable.html)
  			 * in the Android Developer Reference.
  			 */
  val styleable: js.Any = js.native
  /**
  			 * Transition resources. See
  			 * [R.transition](https://developer.android.com/reference/android/R.transition.html)
  			 * in the Android Developer Reference.
  			 */
  val transition: js.Any = js.native
  /**
  			 * XML resources. See
  			 * [R.xml](https://developer.android.com/reference/android/R.xml.html)
  			 * in the Android Developer Reference.
  			 */
  val xml: js.Any = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Applies the properties to the proxy.
  			 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Android.R.apiName> property.
  			 */
  def getApiName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Android.R.bubbleParent> property.
  			 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Android.R.lifecycleContainer> property.
  			 */
  def getLifecycleContainer(): titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.R.bubbleParent> property.
  			 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.R.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.TabGroup): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Android.R.lifecycleContainer> property.
  			 */
  def setLifecycleContainer(lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window): scala.Unit = js.native
}

