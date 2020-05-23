package typings.wordpressComponents.animateMod.Animate

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.ClassName
import typings.wordpressComponents.anon.`0`
import typings.wordpressComponents.wordpressComponentsStrings.`slide-in`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideInProps
  extends BaseProps
     with Props {
  var options: js.UndefOr[`0`] = js.undefined
  @JSName("type")
  var type_SlideInProps: `slide-in`
}

object SlideInProps {
  @scala.inline
  def apply(children: ClassName => ReactNode, `type`: `slide-in`, options: `0` = null): SlideInProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideInProps]
  }
}

