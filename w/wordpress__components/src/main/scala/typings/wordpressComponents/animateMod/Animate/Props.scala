package typings.wordpressComponents.animateMod.Animate

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.ClassName
import typings.wordpressComponents.anon.Origin
import typings.wordpressComponents.anon.`0`
import typings.wordpressComponents.wordpressComponentsStrings.`slide-in`
import typings.wordpressComponents.wordpressComponentsStrings.appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressComponents.animateMod.Animate.AppearProps
  - typings.wordpressComponents.animateMod.Animate.SlideInProps
*/
trait Props extends js.Object

object Props {
  @scala.inline
  def AppearProps(children: ClassName => ReactNode, `type`: appear, options: Origin = null): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  def SlideInProps(children: ClassName => ReactNode, `type`: `slide-in`, options: `0` = null): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

