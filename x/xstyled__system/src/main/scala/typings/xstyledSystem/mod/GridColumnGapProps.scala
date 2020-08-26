package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnGapProps[TLength] extends js.Object {
  val gridColumnGap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridColumnGapProperty<TLength> */ _
    ]
  ] = js.native
}

object GridColumnGapProps {
  @scala.inline
  def apply[TLength](): GridColumnGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnGapProps[TLength]]
  }
  @scala.inline
  implicit class GridColumnGapPropsOps[Self <: GridColumnGapProps[_], TLength] (val x: Self with GridColumnGapProps[TLength]) extends AnyVal {
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
    def setGridColumnGap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridColumnGapProperty<TLength> */ _
        ]
    ): Self = this.set("gridColumnGap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumnGap: Self = this.set("gridColumnGap", js.undefined)
  }
  
}

