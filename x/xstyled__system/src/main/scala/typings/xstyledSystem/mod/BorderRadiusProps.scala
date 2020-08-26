package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderRadiusProps[TLength] extends js.Object {
  val borderRadius: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRadiusProperty<TLength> */ _
    ]
  ] = js.native
}

object BorderRadiusProps {
  @scala.inline
  def apply[TLength](): BorderRadiusProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRadiusProps[TLength]]
  }
  @scala.inline
  implicit class BorderRadiusPropsOps[Self <: BorderRadiusProps[_], TLength] (val x: Self with BorderRadiusProps[TLength]) extends AnyVal {
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
    def setBorderRadius(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRadiusProperty<TLength> */ _
        ]
    ): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
  }
  
}

