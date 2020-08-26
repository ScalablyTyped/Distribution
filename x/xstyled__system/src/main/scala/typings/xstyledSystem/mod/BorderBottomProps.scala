package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderBottomProps[TLength] extends js.Object {
  val borderBottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderBottomProperty<TLength> */ _
    ]
  ] = js.native
}

object BorderBottomProps {
  @scala.inline
  def apply[TLength](): BorderBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderBottomProps[TLength]]
  }
  @scala.inline
  implicit class BorderBottomPropsOps[Self <: BorderBottomProps[_], TLength] (val x: Self with BorderBottomProps[TLength]) extends AnyVal {
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
    def setBorderBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderBottomProperty<TLength> */ _
        ]
    ): Self = this.set("borderBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottom: Self = this.set("borderBottom", js.undefined)
  }
  
}

