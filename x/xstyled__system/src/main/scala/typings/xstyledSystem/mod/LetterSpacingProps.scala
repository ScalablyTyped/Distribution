package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LetterSpacingProps[TLength] extends js.Object {
  val letterSpacing: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LetterSpacingProperty<TLength> */ _
    ]
  ] = js.native
}

object LetterSpacingProps {
  @scala.inline
  def apply[TLength](): LetterSpacingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LetterSpacingProps[TLength]]
  }
  @scala.inline
  implicit class LetterSpacingPropsOps[Self <: LetterSpacingProps[_], TLength] (val x: Self with LetterSpacingProps[TLength]) extends AnyVal {
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
    def setLetterSpacing(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LetterSpacingProperty<TLength> */ _
        ]
    ): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
  }
  
}

