package typings.stylableOptimizer

import typings.postcss.mod.Root_
import typings.std.Record
import typings.stylableCore.typesMod.IStylableClassNameOptimizer
import typings.stylableOptimizer.anon.Names
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/optimizer/cjs/classname-optimizer", JSImport.Namespace)
@js.native
object classnameOptimizerMod extends js.Object {
  
  @js.native
  class StylableClassNameOptimizer () extends IStylableClassNameOptimizer {
    
    @JSName("context")
    var context_StylableClassNameOptimizer: Names = js.native
    
    def optimizeAstAndExports(
      ast: Root_,
      exported: Record[String, String],
      classes: js.UndefOr[scala.Nothing],
      usageMapping: Record[String, Boolean]
    ): Unit = js.native
    def optimizeAstAndExports(
      ast: Root_,
      exported: Record[String, String],
      classes: js.UndefOr[scala.Nothing],
      usageMapping: Record[String, Boolean],
      globals: Record[String, Boolean]
    ): Unit = js.native
    
    def rewriteSelector(selector: String, usageMapping: Record[String, Boolean]): String = js.native
  }
}
