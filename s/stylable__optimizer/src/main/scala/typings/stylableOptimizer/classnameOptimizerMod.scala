package typings.stylableOptimizer

import typings.postcss.mod.Root_
import typings.std.Record
import typings.stylableCore.typesMod.IStylableClassNameOptimizer
import typings.stylableOptimizer.anon.Names
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classnameOptimizerMod {
  
  @JSImport("@stylable/optimizer/cjs/classname-optimizer", "StylableClassNameOptimizer")
  @js.native
  class StylableClassNameOptimizer ()
    extends StObject
       with IStylableClassNameOptimizer {
    
    @JSName("context")
    var context_StylableClassNameOptimizer: Names = js.native
    
    def optimizeAstAndExports(ast: Root_, exported: Record[String, String], classes: Unit, usageMapping: Record[String, Boolean]): Unit = js.native
    def optimizeAstAndExports(
      ast: Root_,
      exported: Record[String, String],
      classes: Unit,
      usageMapping: Record[String, Boolean],
      globals: Record[String, Boolean]
    ): Unit = js.native
    
    def rewriteSelector(selector: String, usageMapping: Record[String, Boolean]): String = js.native
  }
}
