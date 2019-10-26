package typings.typescriptDashCollections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-collections/dist/lib/BSTree", JSImport.Namespace)
@js.native
object distLibBSTreeMod extends js.Object {
  @js.native
  class default[T] ()
    extends typings.typescriptDashCollections.distLibBSTreeKVMod.default[T, T]
  
  type BSTree[T] = typings.typescriptDashCollections.distLibBSTreeKVMod.default[T, T]
}

