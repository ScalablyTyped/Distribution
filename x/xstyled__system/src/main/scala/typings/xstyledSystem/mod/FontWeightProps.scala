package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontWeightProps extends js.Object {
  val fontWeight: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontWeightProperty */ _) | AliasKey
    ]
  ] = js.native
}

object FontWeightProps {
  @scala.inline
  def apply(): FontWeightProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeightProps]
  }
  @scala.inline
  implicit class FontWeightPropsOps[Self <: FontWeightProps] (val x: Self) extends AnyVal {
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
    def setFontWeight(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontWeightProperty */ _) | AliasKey
        ]
    ): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
  }
  
}

