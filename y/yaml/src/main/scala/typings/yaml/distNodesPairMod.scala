package typings.yaml

import typings.std.ReturnType
import typings.yaml.distDocCreateNodeMod.CreateNodeContext
import typings.yaml.distNodesAliasMod.Alias
import typings.yaml.distNodesNodeMod.Node
import typings.yaml.distNodesScalarMod.Scalar
import typings.yaml.distNodesToJSMod.ToJSContext
import typings.yaml.distNodesYamlmapMod.MapLike
import typings.yaml.distNodesYamlmapMod.YAMLMap
import typings.yaml.distNodesYamlseqMod.YAMLSeq
import typings.yaml.distParseCstMod.CollectionItem
import typings.yaml.distSchemaSchemaMod.Schema
import typings.yaml.distStringifyStringifyMod.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesPairMod {
  
  @JSImport("yaml/dist/nodes/Pair", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yaml/dist/nodes/Pair", "Pair")
  @js.native
  open class Pair[K, V] protected () extends StObject {
    def this(key: K) = this()
    def this(key: K, value: V) = this()
    
    def clone(schema: Schema): Pair[K, V] = js.native
    
    /** Always Node or null when parsed, but can be set to anything. */
    var key: K = js.native
    
    /** The CST token that was composed into this pair.  */
    var srcToken: js.UndefOr[CollectionItem] = js.native
    
    def toJSON(): ReturnType[
        js.Function3[
          /* ctx */ js.UndefOr[ToJSContext], 
          /* map */ MapLike, 
          /* param2 */ Pair[Any, Any], 
          MapLike
        ]
      ] = js.native
    def toJSON(_underscore: Any): ReturnType[
        js.Function3[
          /* ctx */ js.UndefOr[ToJSContext], 
          /* map */ MapLike, 
          /* param2 */ Pair[Any, Any], 
          MapLike
        ]
      ] = js.native
    def toJSON(_underscore: Any, ctx: ToJSContext): ReturnType[
        js.Function3[
          /* ctx */ js.UndefOr[ToJSContext], 
          /* map */ MapLike, 
          /* param2 */ Pair[Any, Any], 
          MapLike
        ]
      ] = js.native
    def toJSON(_underscore: Unit, ctx: ToJSContext): ReturnType[
        js.Function3[
          /* ctx */ js.UndefOr[ToJSContext], 
          /* map */ MapLike, 
          /* param2 */ Pair[Any, Any], 
          MapLike
        ]
      ] = js.native
    
    def toString(ctx: Unit, onComment: js.Function0[Unit]): String = js.native
    def toString(ctx: Unit, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
    def toString(ctx: Unit, onComment: Unit, onChompKeep: js.Function0[Unit]): String = js.native
    def toString(ctx: StringifyContext): String = js.native
    def toString(ctx: StringifyContext, onComment: js.Function0[Unit]): String = js.native
    def toString(ctx: StringifyContext, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
    def toString(ctx: StringifyContext, onComment: Unit, onChompKeep: js.Function0[Unit]): String = js.native
    
    /** Always Node or null when parsed, but can be set to anything. */
    var value: V | Null = js.native
  }
  
  inline def createPair(key: Any, value: Any, ctx: CreateNodeContext): Pair[Node[Any], Alias | Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPair")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Pair[Node[Any], Alias | Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any]]]
}
