package typings.wordpressComponents.animateMod.Animate

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.ClassName
import typings.wordpressComponents.anon.Origin
import typings.wordpressComponents.wordpressComponentsStrings.appear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppearProps
  extends BaseProps
     with Props {
  var options: js.UndefOr[Origin] = js.undefined
  @JSName("type")
  var type_AppearProps: appear
}

object AppearProps {
  @scala.inline
  def apply(children: ClassName => ReactNode, `type`: appear, options: Origin = null): AppearProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearProps]
  }
}

