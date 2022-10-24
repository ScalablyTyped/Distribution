package typings.yaml

import typings.yaml.distComposeComposeNodeMod.ComposeContext
import typings.yaml.distComposeComposeNodeMod.ComposeNode_
import typings.yaml.distComposeComposerMod.ComposeErrorHandler
import typings.yaml.distNodesNodeMod.ParsedNode
import typings.yaml.distNodesYamlmapMod.YAMLMap.Parsed
import typings.yaml.distParseCstMod.BlockMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeResolveBlockMapMod {
  
  @JSImport("yaml/dist/compose/resolve-block-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveBlockMap(param0: ComposeNode_, ctx: ComposeContext, bm: BlockMap, onError: ComposeErrorHandler): Parsed[ParsedNode, ParsedNode | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBlockMap")(param0.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], bm.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed[ParsedNode, ParsedNode | Null]]
}
