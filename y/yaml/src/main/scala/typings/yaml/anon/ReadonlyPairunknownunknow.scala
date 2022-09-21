package typings.yaml.anon

import typings.std.Map
import typings.std.Record
import typings.std.ReturnType
import typings.std.Set
import typings.yaml.cstMod.CollectionItem
import typings.yaml.pairMod.Pair
import typings.yaml.schemaSchemaMod.Schema
import typings.yaml.stringifyMod.StringifyContext
import typings.yaml.toJSMod.ToJSContext
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
      /* map */ (Map[Any, Any]) | Set[Any] | (Record[String | Double | js.Symbol, Any]), 
      /* hasKeyValue */ Pair[Any, Any], 
      (Map[Any, Any]) | Set[Any] | (Record[String | Double | js.Symbol, Any])
    ]
  ] = js.native
  def toJSON(_underscore: Any): ReturnType[
    js.Function3[
      /* ctx */ js.UndefOr[ToJSContext], 
      /* map */ (Map[Any, Any]) | Set[Any] | (Record[String | Double | js.Symbol, Any]), 
      /* hasKeyValue */ Pair[Any, Any], 
      (Map[Any, Any]) | Set[Any] | (Record[String | Double | js.Symbol, Any])
    ]
  ] = js.native
  def toJSON(_underscore: Any, ctx: ToJSContext): ReturnType[
    js.Function3[
      /* ctx */ js.UndefOr[ToJSContext], 
      /* map */ (Map[Any, Any]) | Set[Any] | (Record[String | Double | js.Symbol, Any]), 
      /* hasKeyValue */ Pair[Any, Any], 
      (Map[Any, Any]) | Set[Any] | (Record[String | Double | js.Symbol, Any])
    ]
  ] = js.native
  def toJSON(_underscore: Unit, ctx: ToJSContext): ReturnType[
    js.Function3[
      /* ctx */ js.UndefOr[ToJSContext], 
      /* map */ (Map[Any, Any]) | Set[Any] | (Record[String | Double | js.Symbol, Any]), 
      /* hasKeyValue */ Pair[Any, Any], 
      (Map[Any, Any]) | Set[Any] | (Record[String | Double | js.Symbol, Any])
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
