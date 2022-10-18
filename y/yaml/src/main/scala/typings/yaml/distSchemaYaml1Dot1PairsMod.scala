package typings.yaml

import typings.yaml.distDocCreateNodeMod.CreateNodeContext
import typings.yaml.distNodesNodeMod.ParsedNode
import typings.yaml.distNodesPairMod.Pair
import typings.yaml.distNodesYamlmapMod.YAMLMap.Parsed
import typings.yaml.distNodesYamlseqMod.YAMLSeq
import typings.yaml.distSchemaSchemaMod.Schema
import typings.yaml.distSchemaTypesMod.CollectionTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaYaml1Dot1PairsMod {
  
  @JSImport("yaml/dist/schema/yaml-1.1/pairs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPairs(schema: Schema, iterable: Any, ctx: CreateNodeContext): YAMLSeq[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPairs")(schema.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[YAMLSeq[Any]]
  
  @JSImport("yaml/dist/schema/yaml-1.1/pairs", "pairs")
  @js.native
  val pairs: CollectionTag = js.native
  
  inline def resolvePairs(seq: Parsed[ParsedNode, ParsedNode | Null], onError: js.Function1[/* message */ String, Unit]): typings.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[Pair[ParsedNode, ParsedNode | Null]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePairs")(seq.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[Pair[ParsedNode, ParsedNode | Null]]]
  inline def resolvePairs(
    seq: typings.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[ParsedNode | (Pair[ParsedNode, ParsedNode | Null])],
    onError: js.Function1[/* message */ String, Unit]
  ): typings.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[Pair[ParsedNode, ParsedNode | Null]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePairs")(seq.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typings.yaml.distNodesYamlseqMod.YAMLSeq.Parsed[Pair[ParsedNode, ParsedNode | Null]]]
}
