package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridRowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The grid-row CSS property is a shorthand property for grid-row-start and grid-row-end specifying a grid item’s
    * size and location within the grid row by contributing a line, a span, or nothing (automatic) to its grid
    * placement, thereby specifying the inline-start and inline-end edge of its grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-row)
    */
  var gridRow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridRowProperty */ _, 
      ThemeType
    ]
  ] = js.native
}

object GridRowProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): GridRowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowProps[ThemeType]]
  }
  @scala.inline
  implicit class GridRowPropsOps[Self <: GridRowProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with GridRowProps[ThemeType]) extends AnyVal {
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
    def setGridRowVarargs(value: (js.Any | Null)*): Self = this.set("gridRow", js.Array(value :_*))
    @scala.inline
    def setGridRow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridRowProperty */ _, 
          ThemeType
        ]
    ): Self = this.set("gridRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridRow: Self = this.set("gridRow", js.undefined)
    @scala.inline
    def setGridRowNull: Self = this.set("gridRow", null)
  }
  
}

