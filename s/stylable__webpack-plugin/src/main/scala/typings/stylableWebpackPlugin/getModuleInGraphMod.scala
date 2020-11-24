package typings.stylableWebpackPlugin

import typings.std.Set
import typings.stylableWebpackPlugin.typesMod.StylableModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/webpack-plugin/cjs/get-module-in-graph", JSImport.Namespace)
@js.native
object getModuleInGraphMod extends js.Object {
  
  def getModuleInGraph(
    chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ js.Any,
    filterFn: js.Function1[/* m */ StylableModule, js.Symbol | Boolean]
  ): Set[StylableModule] = js.native
  def getModuleInGraph(
    chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ js.Any,
    filterFn: js.Function1[/* m */ StylableModule, js.Symbol | Boolean],
    filterChunkFn: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ /* c */ js.Any, 
      Boolean
    ]
  ): Set[StylableModule] = js.native
  
  def hasStylableModuleInGraph(
    chunk: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Chunk */ js.Any
  ): Boolean = js.native
}
