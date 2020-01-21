package typings.uifabricUtilities

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/IComponentAs", JSImport.Namespace)
@js.native
object icomponentasMod extends js.Object {
  type IComponentAs[T] = ComponentType[IComponentAsProps[T]]
  type IComponentAsProps[T] = T with AnonDefaultRender[T]
}

