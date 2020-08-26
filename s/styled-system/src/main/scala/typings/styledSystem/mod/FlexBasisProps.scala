package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexBasisProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  // TODO: The FlexBasisValue currently really only exists for documentation
  //       purposes, because flex-basis also accepts `Nem` and `Npx` strings.
  //       Not sure there’s a way to still have the union values show up as
  //       auto-completion results.
  var flexBasis: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object FlexBasisProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): FlexBasisProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexBasisProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class FlexBasisPropsOps[Self <: FlexBasisProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (FlexBasisProps[ThemeType, TVal])) extends AnyVal {
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
    def setFlexBasisVarargs(value: (TVal | Null)*): Self = this.set("flexBasis", js.Array(value :_*))
    @scala.inline
    def setFlexBasis(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("flexBasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexBasis: Self = this.set("flexBasis", js.undefined)
    @scala.inline
    def setFlexBasisNull: Self = this.set("flexBasis", null)
  }
  
}

