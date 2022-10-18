package typings.yaml.anon

import typings.std.ReturnType
import typings.yaml.distNodesPairMod.Pair
import typings.yaml.distNodesToJSMod.ToJSContext
import typings.yaml.distNodesYamlmapMod.MapLike
import typings.yaml.distParseCstMod.CollectionItem
import typings.yaml.distSchemaSchemaMod.Schema
import typings.yaml.distStringifyStringifyMod.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<yaml.yaml/dist/nodes/Pair.Pair<unknown, unknown>> */
@js.native
trait ReadonlyPairunknownunknow extends StObject {
  
  def clone(schema: Schema): Pair[Any, Any] = js.native
  
  val key: Any = js.native
  
  val srcToken: js.UndefOr[CollectionItem] = js.native
  
  def toJSON(): ReturnType[
    js.Function3[
      /* ctx */ js.UndefOr[ToJSContext], 
      /* map */ MapLike, 
      /* hasKeyValue */ Pair[Any, Any], 
      MapLike
    ]
  ] = js.native
  def toJSON(_underscore: Any): ReturnType[
    js.Function3[
      /* ctx */ js.UndefOr[ToJSContext], 
      /* map */ MapLike, 
      /* hasKeyValue */ Pair[Any, Any], 
      MapLike
    ]
  ] = js.native
  def toJSON(_underscore: Any, ctx: ToJSContext): ReturnType[
    js.Function3[
      /* ctx */ js.UndefOr[ToJSContext], 
      /* map */ MapLike, 
      /* hasKeyValue */ Pair[Any, Any], 
      MapLike
    ]
  ] = js.native
  def toJSON(_underscore: Unit, ctx: ToJSContext): ReturnType[
    js.Function3[
      /* ctx */ js.UndefOr[ToJSContext], 
      /* map */ MapLike, 
      /* hasKeyValue */ Pair[Any, Any], 
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
  
  val value: js.UndefOr[Any | Null] = js.native
}
