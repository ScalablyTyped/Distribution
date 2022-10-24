package typings.yaml

import typings.yaml.distComposeComposeNodeMod.ComposeContext
import typings.yaml.distComposeComposeNodeMod.ComposeNode_
import typings.yaml.distComposeComposerMod.ComposeErrorHandler
import typings.yaml.distNodesNodeMod.ParsedNode
import typings.yaml.distNodesYamlmapMod.YAMLMap.Parsed
import typings.yaml.distParseCstMod.FlowCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeResolveFlowCollectionMod {
  
  @JSImport("yaml/dist/compose/resolve-flow-collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveFlowCollection(param0: ComposeNode_, ctx: ComposeContext, fc: FlowCollection, onError: ComposeErrorHandler): (Parsed[ParsedNode, ParsedNode | Null]) | typings.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[ParsedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFlowCollection")(param0.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], fc.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[(Parsed[ParsedNode, ParsedNode | Null]) | typings.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[ParsedNode]]
}
