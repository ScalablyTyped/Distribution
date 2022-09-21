package typings.yaml

import typings.yaml.createNodeMod.CreateNodeContext
import typings.yaml.nodeMod.ParsedNode
import typings.yaml.pairMod.Pair
import typings.yaml.schemaSchemaMod.Schema
import typings.yaml.typesMod.CollectionTag
import typings.yaml.yamlmapMod.YAMLMap.Parsed
import typings.yaml.yamlseqMod.YAMLSeq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pairsMod {
  
  @JSImport("yaml/dist/schema/yaml-1.1/pairs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPairs(schema: Schema, iterable: Any, ctx: CreateNodeContext): YAMLSeq[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPairs")(schema.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[YAMLSeq[Any]]
  
  @JSImport("yaml/dist/schema/yaml-1.1/pairs", "pairs")
  @js.native
  val pairs: CollectionTag = js.native
  
  inline def resolvePairs(seq: Parsed[ParsedNode, ParsedNode | Null], onError: js.Function1[/* message */ String, Unit]): typings.yaml.yamlseqMod.YAMLSeq.Parsed[Pair[ParsedNode, ParsedNode | Null]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePairs")(seq.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.yaml.yamlseqMod.YAMLSeq.Parsed[Pair[ParsedNode, ParsedNode | Null]]]
  inline def resolvePairs(
    seq: typings.yaml.yamlseqMod.YAMLSeq.Parsed[ParsedNode | (Pair[ParsedNode, ParsedNode | Null])],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.yaml.yamlseqMod.YAMLSeq.Parsed[Pair[ParsedNode, ParsedNode | Null]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePairs")(seq.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.yaml.yamlseqMod.YAMLSeq.Parsed[Pair[ParsedNode, ParsedNode | Null]]]
}
