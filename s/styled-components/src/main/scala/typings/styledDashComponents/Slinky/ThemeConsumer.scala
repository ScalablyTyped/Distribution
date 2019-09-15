package typings.styledDashComponents.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.reactMod.ConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeConsumer
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.styledDashComponents.macroMod.^.ThemeConsumer.asInstanceOf[String | js.Object]
  def apply[T](unstable_observedBits: Int | Double = null): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (unstable_observedBits != null) __obj.updateDynamic("unstable_observedBits")(unstable_observedBits.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ConsumerProps[js.Any]
}

