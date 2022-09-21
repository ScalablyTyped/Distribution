package typings.yaml

import typings.yaml.composeNodeMod.ComposeContext
import typings.yaml.composeNodeMod.ComposeNode_
import typings.yaml.composerMod.ComposeErrorHandler
import typings.yaml.cstMod.FlowCollection
import typings.yaml.nodeMod.ParsedNode
import typings.yaml.yamlmapMod.YAMLMap.Parsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveFlowCollectionMod {
  
  @JSImport("yaml/dist/compose/resolve-flow-collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveFlowCollection(
    hasComposeNodeComposeEmptyNode: ComposeNode_,
    ctx: ComposeContext,
    fc: FlowCollection,
    onError: ComposeErrorHandler
  ): (Parsed[ParsedNode, ParsedNode | Null]) | typings.yaml.yamlseqMod.YAMLSeq.Parsed[ParsedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFlowCollection")(hasComposeNodeComposeEmptyNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], fc.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[(Parsed[ParsedNode, ParsedNode | Null]) | typings.yaml.yamlseqMod.YAMLSeq.Parsed[ParsedNode]]
}
