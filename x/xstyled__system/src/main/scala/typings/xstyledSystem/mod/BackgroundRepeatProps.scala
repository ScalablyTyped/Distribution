package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundRepeatProps extends js.Object {
  val backgroundRepeat: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BackgroundRepeatProperty */ _
    ]
  ] = js.native
}

object BackgroundRepeatProps {
  @scala.inline
  def apply(): BackgroundRepeatProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundRepeatProps]
  }
  @scala.inline
  implicit class BackgroundRepeatPropsOps[Self <: BackgroundRepeatProps] (val x: Self) extends AnyVal {
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
    def setBackgroundRepeat(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BackgroundRepeatProperty */ _
        ]
    ): Self = this.set("backgroundRepeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundRepeat: Self = this.set("backgroundRepeat", js.undefined)
  }
  
}

