package typings.styledComponents.mod

import typings.styledComponents.styledComponentsMod.AnyIfEmpty
import typings.styledComponents.styledComponentsMod.CSSProp
import typings.styledComponents.styledComponentsMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var css: js.UndefOr[CSSProp[AnyIfEmpty[DefaultTheme]]] = js.native
}

object Attributes {
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCss(value: CSSProp[AnyIfEmpty[DefaultTheme]]): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
  }
  
}

