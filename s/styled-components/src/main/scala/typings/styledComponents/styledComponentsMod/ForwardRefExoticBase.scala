package typings.styledComponents.styledComponentsMod

import typings.react.mod.WeakValidationMap
import typings.std.Partial
import typings.styledComponents.styledComponentsStrings.defaultProps
import typings.styledComponents.styledComponentsStrings.propTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// abuse Pick to strip the call signature from ForwardRefExoticComponent
/* Inlined std.Pick<react.react.ForwardRefExoticComponent<P>, keyof react.react.ForwardRefExoticComponent<any>> */
@js.native
trait ForwardRefExoticBase[P] extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[Partial[typings.styledComponents.styledComponentsStrings.defaultProps]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[typings.styledComponents.styledComponentsStrings.propTypes]] = js.native
}

object ForwardRefExoticBase {
  @scala.inline
  def apply[P](DollarDollartypeof: js.Symbol): ForwardRefExoticBase[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardRefExoticBase[P]]
  }
  @scala.inline
  implicit class ForwardRefExoticBaseOps[Self <: ForwardRefExoticBase[_], P] (val x: Self with ForwardRefExoticBase[P]) extends AnyVal {
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
    def setDollarDollartypeof(value: js.Symbol): Self = this.set("$$typeof", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultProps(value: Partial[defaultProps]): Self = this.set("defaultProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultProps: Self = this.set("defaultProps", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setPropTypes(value: WeakValidationMap[propTypes]): Self = this.set("propTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropTypes: Self = this.set("propTypes", js.undefined)
  }
  
}

