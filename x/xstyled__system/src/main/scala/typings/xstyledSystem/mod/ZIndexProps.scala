package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZIndexProps extends js.Object {
  val zIndex: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ _) | AliasKey
    ]
  ] = js.native
}

object ZIndexProps {
  @scala.inline
  def apply(): ZIndexProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndexProps]
  }
  @scala.inline
  implicit class ZIndexPropsOps[Self <: ZIndexProps] (val x: Self) extends AnyVal {
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
    def setZIndex(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ _) | AliasKey
        ]
    ): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

