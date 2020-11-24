package typings.uifabricUtilities

import typings.react.mod.ComponentType
import typings.uifabricUtilities.anon.DefaultRender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/IComponentAs", JSImport.Namespace)
@js.native
object icomponentasMod extends js.Object {
  
  type IComponentAs[T] = ComponentType[IComponentAsProps[T]]
  
  type IComponentAsProps[T] = T with DefaultRender[T]
}
