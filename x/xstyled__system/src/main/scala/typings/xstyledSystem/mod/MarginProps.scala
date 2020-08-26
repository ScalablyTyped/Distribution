package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginProps[TLength] extends js.Object {
  val m: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginTopProperty<TLength> */ _
    ]
  ] = js.native
  val margin: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginTopProperty<TLength> */ _
    ]
  ] = js.native
}

object MarginProps {
  @scala.inline
  def apply[TLength](): MarginProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginProps[TLength]]
  }
  @scala.inline
  implicit class MarginPropsOps[Self <: MarginProps[_], TLength] (val x: Self with MarginProps[TLength]) extends AnyVal {
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
    def setM(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginTopProperty<TLength> */ _
        ]
    ): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setMargin(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginTopProperty<TLength> */ _
        ]
    ): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
  }
  
}

