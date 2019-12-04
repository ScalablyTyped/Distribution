package typings.tslint

import typings.std.Partial
import typings.std.Set
import typings.tslint.libRulesCompletedDashDocsExclusionDescriptorsMod.ExclusionDescriptor
import typings.tslint.libRulesCompletedDocsRuleMod.All
import typings.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/completed-docs/exclusion", JSImport.Namespace)
@js.native
object libRulesCompletedDashDocsExclusionMod extends js.Object {
  @js.native
  abstract class Exclusion[TDescriptor /* <: ExclusionDescriptor */] () extends js.Object {
    def this(descriptor: Partial[TDescriptor]) = this()
    val descriptor: Partial[TDescriptor] = js.native
    /* protected */ def createSet[T /* <: All | String */](): Set[T] = js.native
    /* protected */ def createSet[T /* <: All | String */](values: js.Array[T]): Set[T] = js.native
    def excludes(node: Node): Boolean = js.native
  }
  
}

