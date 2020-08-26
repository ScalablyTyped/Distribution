package typings.wordpressComponents.animateMod.Animate

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.ClassName
import typings.wordpressComponents.anon.Origin
import typings.wordpressComponents.wordpressComponentsStrings.appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppearProps
  extends BaseProps
     with Props {
  var options: js.UndefOr[Origin] = js.native
  @JSName("type")
  var type_AppearProps: appear = js.native
}

object AppearProps {
  @scala.inline
  def apply(children: ClassName => ReactNode, `type`: appear): AppearProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearProps]
  }
  @scala.inline
  implicit class AppearPropsOps[Self <: AppearProps] (val x: Self) extends AnyVal {
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
    def setType(value: appear): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Origin): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

