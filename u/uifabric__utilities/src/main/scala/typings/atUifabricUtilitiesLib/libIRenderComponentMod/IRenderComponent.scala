package typings
package atUifabricUtilitiesLib.libIRenderComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderComponent[TProps] extends js.Object {
  /**
    * JSX.Element to return in this component's render() function.
    */
  def children(props: TProps): reactLib.reactMod.Global.JSXNs.Element
}

object IRenderComponent {
  @scala.inline
  def apply[TProps](children: js.Function1[TProps, reactLib.reactMod.Global.JSXNs.Element]): IRenderComponent[TProps] = {
    val __obj = js.Dynamic.literal(children = children)
  
    __obj.asInstanceOf[IRenderComponent[TProps]]
  }
}

