package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridTemplateRowsProps[TLength] extends js.Object {
  val gridTemplateRows: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridTemplateRowsProperty<TLength> */ _
    ]
  ] = js.native
}

object GridTemplateRowsProps {
  @scala.inline
  def apply[TLength](): GridTemplateRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateRowsProps[TLength]]
  }
  @scala.inline
  implicit class GridTemplateRowsPropsOps[Self <: GridTemplateRowsProps[_], TLength] (val x: Self with GridTemplateRowsProps[TLength]) extends AnyVal {
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
    def setGridTemplateRows(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridTemplateRowsProperty<TLength> */ _
        ]
    ): Self = this.set("gridTemplateRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplateRows: Self = this.set("gridTemplateRows", js.undefined)
  }
  
}

