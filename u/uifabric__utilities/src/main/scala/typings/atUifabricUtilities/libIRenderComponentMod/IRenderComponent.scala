package typings.atUifabricUtilities.libIRenderComponentMod

import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderComponent[TProps] extends js.Object {
  /**
    * JSX.Element to return in this component's render() function.
    */
  def children(props: TProps): Element
}

object IRenderComponent {
  @scala.inline
  def apply[TProps](children: TProps => Element): IRenderComponent[TProps] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[IRenderComponent[TProps]]
  }
}

