package typings.yaml

import typings.yaml.composeNodeMod.ComposeContext
import typings.yaml.composeNodeMod.ComposeNode_
import typings.yaml.composerMod.ComposeErrorHandler
import typings.yaml.cstMod.BlockMap
import typings.yaml.nodeMod.ParsedNode
import typings.yaml.yamlmapMod.YAMLMap.Parsed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveBlockMapMod {
  
  @JSImport("yaml/dist/compose/resolve-block-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveBlockMap(
    hasComposeNodeComposeEmptyNode: ComposeNode_,
    ctx: ComposeContext,
    bm: BlockMap,
    onError: ComposeErrorHandler
  ): Parsed[ParsedNode, ParsedNode | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBlockMap")(hasComposeNodeComposeEmptyNode.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], bm.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed[ParsedNode, ParsedNode | Null]]
}
