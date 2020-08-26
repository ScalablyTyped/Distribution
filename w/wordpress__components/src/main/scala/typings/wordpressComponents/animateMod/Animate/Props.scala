package typings.wordpressComponents.animateMod.Animate

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.ClassName
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
  def AppearProps(children: ClassName => ReactNode, `type`: appear): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  def SlideInProps(children: ClassName => ReactNode, `type`: `slide-in`): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

