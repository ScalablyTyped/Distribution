package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JustifySelfProps extends js.Object {
  val justifySelf: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.JustifySelfProperty */ _
    ]
  ] = js.native
}

object JustifySelfProps {
  @scala.inline
  def apply(): JustifySelfProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifySelfProps]
  }
  @scala.inline
  implicit class JustifySelfPropsOps[Self <: JustifySelfProps] (val x: Self) extends AnyVal {
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
    def setJustifySelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.JustifySelfProperty */ _
        ]
    ): Self = this.set("justifySelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifySelf: Self = this.set("justifySelf", js.undefined)
  }
  
}

