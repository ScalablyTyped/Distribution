package typings.yaml

import typings.yaml.distComposeComposeNodeMod.ComposeContext
import typings.yaml.distComposeComposeNodeMod.ComposeNode_
import typings.yaml.distComposeComposerMod.ComposeErrorHandler
import typings.yaml.distNodesNodeMod.ParsedNode
import typings.yaml.distParseCstMod.BlockMap
import typings.yaml.distParseCstMod.BlockSequence
import typings.yaml.distParseCstMod.FlowCollection
import typings.yaml.distParseCstMod.SourceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeComposeCollectionMod {
  
  @JSImport("yaml/dist/compose/compose-collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: BlockMap,
    tagToken: Null,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: BlockMap,
    tagToken: SourceToken,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: BlockSequence,
    tagToken: Null,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: BlockSequence,
    tagToken: SourceToken,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: FlowCollection,
    tagToken: Null,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
  inline def composeCollection(
    CN: ComposeNode_,
    ctx: ComposeContext,
    token: FlowCollection,
    tagToken: SourceToken,
    onError: ComposeErrorHandler
  ): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeCollection")(CN.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], tagToken.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
}
