package typings.stylableWebpackPlugin

import typings.std.Set
import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getModuleInGraphMod {
  
  @JSImport("@stylable/webpack-plugin/cjs/get-module-in-graph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModuleInGraph(
    chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ js.Any,
    filterFn: js.Function1[/* m */ StylableModule, js.Symbol | Boolean]
  ): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleInGraph")(chunk.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  inline def getModuleInGraph(
    chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ js.Any,
    filterFn: js.Function1[/* m */ StylableModule, js.Symbol | Boolean],
    filterChunkFn: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ /* c */ js.Any, 
      Boolean
    ]
  ): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleInGraph")(chunk.asInstanceOf[js.Any], filterFn.asInstanceOf[js.Any], filterChunkFn.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  
  inline def hasStylableModuleInGraph(
    chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ js.Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasStylableModuleInGraph")(chunk.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
