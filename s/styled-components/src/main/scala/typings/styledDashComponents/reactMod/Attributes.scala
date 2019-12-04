package typings.styledDashComponents.reactMod

import typings.styledDashComponents.styledDashComponentsMod.AnyIfEmpty
import typings.styledDashComponents.styledDashComponentsMod.CSSProp
import typings.styledDashComponents.styledDashComponentsMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  // NOTE: unlike the plain javascript version, it is not possible to get access
  // to the element's own attributes inside function interpolations.
  // Only theme will be accessible, and only with the DefaultTheme due to the global
  // nature of this declaration.
  // If you are writing this inline you already have access to all the attributes anyway,
  // no need for the extra indirection.
  /**
    * If present, this React element will be converted by
    * `babel-plugin-styled-components` into a styled component
    * with the given css as its styles.
    */
  var css: js.UndefOr[CSSProp[AnyIfEmpty[DefaultTheme]]] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(css: CSSProp[AnyIfEmpty[DefaultTheme]] = null): Attributes = {
    val __obj = js.Dynamic.literal()
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

