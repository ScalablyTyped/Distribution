package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridAutoFlowProps extends js.Object {
  val gridAutoFlow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridAutoFlowProperty */ _
    ]
  ] = js.native
}

object GridAutoFlowProps {
  @scala.inline
  def apply(): GridAutoFlowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoFlowProps]
  }
  @scala.inline
  implicit class GridAutoFlowPropsOps[Self <: GridAutoFlowProps] (val x: Self) extends AnyVal {
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
    def setGridAutoFlow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridAutoFlowProperty */ _
        ]
    ): Self = this.set("gridAutoFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridAutoFlow: Self = this.set("gridAutoFlow", js.undefined)
  }
  
}

