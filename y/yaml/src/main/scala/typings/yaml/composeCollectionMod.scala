package typings.yaml

import typings.yaml.composeNodeMod.ComposeContext
import typings.yaml.composeNodeMod.ComposeNode_
import typings.yaml.composerMod.ComposeErrorHandler
import typings.yaml.cstMod.BlockMap
import typings.yaml.cstMod.BlockSequence
import typings.yaml.cstMod.FlowCollection
import typings.yaml.cstMod.SourceToken
import typings.yaml.nodeMod.ParsedNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeCollectionMod {
  
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
