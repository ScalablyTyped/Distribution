package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderLeftProps[TLength] extends js.Object {
  val borderLeft: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderLeftProperty<TLength> */ _
    ]
  ] = js.native
}

object BorderLeftProps {
  @scala.inline
  def apply[TLength](): BorderLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLeftProps[TLength]]
  }
  @scala.inline
  implicit class BorderLeftPropsOps[Self <: BorderLeftProps[_], TLength] (val x: Self with BorderLeftProps[TLength]) extends AnyVal {
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
    def setBorderLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderLeftProperty<TLength> */ _
        ]
    ): Self = this.set("borderLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeft: Self = this.set("borderLeft", js.undefined)
  }
  
}

