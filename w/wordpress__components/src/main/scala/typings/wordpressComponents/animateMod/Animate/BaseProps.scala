package typings.wordpressComponents.animateMod.Animate

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.ClassName
import typings.wordpressComponents.wordpressComponentsStrings.`slide-in`
import typings.wordpressComponents.wordpressComponentsStrings.appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  var `type`: appear | `slide-in`
  def children(props: ClassName): ReactNode
}

object BaseProps {
  @scala.inline
  def apply(children: ClassName => ReactNode, `type`: appear | `slide-in`): BaseProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

