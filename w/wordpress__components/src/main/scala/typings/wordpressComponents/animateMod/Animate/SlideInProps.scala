package typings.wordpressComponents.animateMod.Animate

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.ClassName
import typings.wordpressComponents.anon.`0`
import typings.wordpressComponents.wordpressComponentsStrings.`slide-in`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideInProps
  extends BaseProps
     with Props {
  var options: js.UndefOr[`0`] = js.native
  @JSName("type")
  var type_SlideInProps: `slide-in` = js.native
}

object SlideInProps {
  @scala.inline
  def apply(children: ClassName => ReactNode, `type`: `slide-in`): SlideInProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideInProps]
  }
  @scala.inline
  implicit class SlideInPropsOps[Self <: SlideInProps] (val x: Self) extends AnyVal {
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
    def setType(value: `slide-in`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: `0`): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

