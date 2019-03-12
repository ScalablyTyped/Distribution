package typings
package uiDashBoxLib.uiDashBoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxProps
  extends // accept any other arbitrary prop
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** Set to border - box by default. */
  var boxSizing: js.UndefOr[uiDashBoxLib.UIBoxProp] = js.undefined
  /**
    * The className prop you know and love. Internally it gets enhanced with additional class
    * names for the CSS properties you specify.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Utility property for easily adding clearfix styles to the element. */
  var clearfix: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Callback that gets passed a ref to inner DOM node (or component if the is prop is set to a
    * React component type).
    */
  var innerRef: js.UndefOr[js.Function1[/* node */ reactLib.reactMod.ReactNs.ReactNode, _]] = js.undefined
  /**
    * Lets you change the underlying element type.
    * You can pass either a string to change the DOM element type, or a React component type to
    * inherit another component. The component just needs to accept a className prop to work.
    * A good example is inheriting the react-router Link component
    */
  var is: js.UndefOr[uiDashBoxLib.UIBoxIsProp] = js.undefined
  /** Sets marginLeft and marginRight to the same value */
  var marginX: js.UndefOr[uiDashBoxLib.UIBoxProp] = js.undefined
  /** Sets marginTop and marginBottom to the same value */
  var marginY: js.UndefOr[uiDashBoxLib.UIBoxProp] = js.undefined
  /** Sets paddingLeft and paddingRight to the same value */
  var paddingX: js.UndefOr[uiDashBoxLib.UIBoxProp] = js.undefined
  /** Sets paddingTop and paddingBottom to the same value */
  var paddingY: js.UndefOr[uiDashBoxLib.UIBoxProp] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    StringDictionary: // accept any other arbitrary prop
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    boxSizing: uiDashBoxLib.UIBoxProp = null,
    className: java.lang.String = null,
    clearfix: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: /* node */ reactLib.reactMod.ReactNs.ReactNode => _ = null,
    is: uiDashBoxLib.UIBoxIsProp = null,
    marginX: uiDashBoxLib.UIBoxProp = null,
    marginY: uiDashBoxLib.UIBoxProp = null,
    paddingX: uiDashBoxLib.UIBoxProp = null,
    paddingY: uiDashBoxLib.UIBoxProp = null
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (boxSizing != null) __obj.updateDynamic("boxSizing")(boxSizing.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clearfix)) __obj.updateDynamic("clearfix")(clearfix)
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

