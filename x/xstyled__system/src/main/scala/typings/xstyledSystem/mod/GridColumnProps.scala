package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridColumnProps extends js.Object {
  val gridColumn: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridColumnProperty */ _
    ]
  ] = js.native
}

object GridColumnProps {
  @scala.inline
  def apply(): GridColumnProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridColumnProps]
  }
  @scala.inline
  implicit class GridColumnPropsOps[Self <: GridColumnProps] (val x: Self) extends AnyVal {
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
    def setGridColumn(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridColumnProperty */ _
        ]
    ): Self = this.set("gridColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridColumn: Self = this.set("gridColumn", js.undefined)
  }
  
}

