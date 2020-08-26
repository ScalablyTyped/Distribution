package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridTemplateAreasProps extends js.Object {
  val gridTemplateAreas: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridTemplateAreasProperty */ _
    ]
  ] = js.native
}

object GridTemplateAreasProps {
  @scala.inline
  def apply(): GridTemplateAreasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateAreasProps]
  }
  @scala.inline
  implicit class GridTemplateAreasPropsOps[Self <: GridTemplateAreasProps] (val x: Self) extends AnyVal {
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
    def setGridTemplateAreas(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridTemplateAreasProperty */ _
        ]
    ): Self = this.set("gridTemplateAreas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridTemplateAreas: Self = this.set("gridTemplateAreas", js.undefined)
  }
  
}

