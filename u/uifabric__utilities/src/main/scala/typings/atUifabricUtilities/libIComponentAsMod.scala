package typings.atUifabricUtilities

import typings.atUifabricUtilities.libIComponentAsMod.IComponentAsProps
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/IComponentAs", JSImport.Namespace)
@js.native
object libIComponentAsMod extends js.Object {
  type IComponentAs[T] = ComponentType[IComponentAsProps[T]]
  type IComponentAsProps[T] = T with Anon_DefaultRender[T]
}

