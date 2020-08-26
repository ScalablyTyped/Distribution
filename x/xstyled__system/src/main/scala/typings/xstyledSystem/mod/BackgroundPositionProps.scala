package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundPositionProps[TLength] extends js.Object {
  val backgroundPosition: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BackgroundPositionProperty<TLength> */ _
    ]
  ] = js.native
}

object BackgroundPositionProps {
  @scala.inline
  def apply[TLength](): BackgroundPositionProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundPositionProps[TLength]]
  }
  @scala.inline
  implicit class BackgroundPositionPropsOps[Self <: BackgroundPositionProps[_], TLength] (val x: Self with BackgroundPositionProps[TLength]) extends AnyVal {
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
    def setBackgroundPosition(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BackgroundPositionProperty<TLength> */ _
        ]
    ): Self = this.set("backgroundPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundPosition: Self = this.set("backgroundPosition", js.undefined)
  }
  
}

