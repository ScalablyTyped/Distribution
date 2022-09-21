package typings.yaml

import typings.yaml.composeNodeMod.ComposeContext
import typings.yaml.composeNodeMod.ComposeNode_
import typings.yaml.composerMod.ComposeErrorHandler
import typings.yaml.cstMod.BlockSequence
import typings.yaml.nodeMod.ParsedNode
import typings.yaml.yamlseqMod.YAMLSeq.Parsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveBlockSeqMod {
  
  @JSImport("yaml/dist/compose/resolve-block-seq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveBlockSeq(
    hasComposeNodeComposeEmptyNode: ComposeNode_,
    ctx: ComposeContext,
    bs: BlockSequence,
    onError: ComposeErrorHandler
  ): Parsed[ParsedNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBlockSeq")(hasComposeNodeComposeEmptyNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], bs.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed[ParsedNode]]
}
