package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxHeightProps[TLength] extends js.Object {
  val maxHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxHeightProperty<TLength> */ _
    ]
  ] = js.native
}

object MaxHeightProps {
  @scala.inline
  def apply[TLength](): MaxHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxHeightProps[TLength]]
  }
  @scala.inline
  implicit class MaxHeightPropsOps[Self <: MaxHeightProps[_], TLength] (val x: Self with MaxHeightProps[TLength]) extends AnyVal {
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
    def setMaxHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxHeightProperty<TLength> */ _
        ]
    ): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
  }
  
}

