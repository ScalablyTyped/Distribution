package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginYProps[TLength] extends js.Object {
  val my: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginTopProperty<TLength> */ _
    ]
  ] = js.native
}

object MarginYProps {
  @scala.inline
  def apply[TLength](): MarginYProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginYProps[TLength]]
  }
  @scala.inline
  implicit class MarginYPropsOps[Self <: MarginYProps[_], TLength] (val x: Self with MarginYProps[TLength]) extends AnyVal {
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
    def setMy(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginTopProperty<TLength> */ _
        ]
    ): Self = this.set("my", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
  }
  
}

