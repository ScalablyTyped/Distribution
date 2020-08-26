package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinHeightProps[TLength] extends js.Object {
  val minHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinHeightProperty<TLength> */ _
    ]
  ] = js.native
}

object MinHeightProps {
  @scala.inline
  def apply[TLength](): MinHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinHeightProps[TLength]]
  }
  @scala.inline
  implicit class MinHeightPropsOps[Self <: MinHeightProps[_], TLength] (val x: Self with MinHeightProps[TLength]) extends AnyVal {
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
    def setMinHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinHeightProperty<TLength> */ _
        ]
    ): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
  }
  
}

