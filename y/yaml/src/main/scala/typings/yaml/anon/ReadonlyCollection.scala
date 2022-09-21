package typings.yaml.anon

import typings.yaml.cstMod.Token
import typings.yaml.schemaSchemaMod.Schema
import typings.yaml.stringifyMod.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<yaml.yaml/dist/nodes/Collection.Collection> */
@js.native
trait ReadonlyCollection extends StObject {
  
  def add(value: Any): Unit = js.native
  
  def addIn(path: js.Iterable[Any], value: Any): Unit = js.native
  
  val anchor: js.UndefOr[String] = js.native
  
  def clone(schema: Schema): typings.yaml.collectionMod.Collection = js.native
  
  val comment: js.UndefOr[String | Null] = js.native
  
  val commentBefore: js.UndefOr[String | Null] = js.native
  
  def delete(key: Any): Boolean = js.native
  
  def deleteIn(path: js.Iterable[Any]): Boolean = js.native
  
  val flow: js.UndefOr[Boolean] = js.native
  
  def get(key: Any): Any = js.native
  def get(key: Any, keepScalar: Boolean): Any = js.native
  
  def getIn(path: js.Iterable[Any]): Any = js.native
  def getIn(path: js.Iterable[Any], keepScalar: Boolean): Any = js.native
  
  def has(key: Any): Boolean = js.native
  
  def hasAllNullValues(): Boolean = js.native
  def hasAllNullValues(allowScalar: Boolean): Boolean = js.native
  
  def hasIn(path: js.Iterable[Any]): Boolean = js.native
  
  val items: js.Array[Any] = js.native
  
  val maxFlowStringSingleLineLength: js.UndefOr[Any] = js.native
  
  val range: js.UndefOr[typings.yaml.nodeMod.Range | Null] = js.native
  
  val schema: js.UndefOr[Schema] = js.native
  
  def set(key: Any, value: Any): Unit = js.native
  
  def setIn(path: js.Iterable[Any], value: Any): Unit = js.native
  
  val spaceBefore: js.UndefOr[Boolean] = js.native
  
  val srcToken: js.UndefOr[Token] = js.native
  
  val tag: js.UndefOr[String] = js.native
  
  def toJSON(): Any = js.native
  
  def toString(ctx: Unit, onComment: js.Function0[Unit]): String = js.native
  def toString(ctx: Unit, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
  def toString(ctx: Unit, onComment: Unit, onChompKeep: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext): String = js.native
  def toString(ctx: StringifyContext, onComment: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = js.native
  def toString(ctx: StringifyContext, onComment: Unit, onChompKeep: js.Function0[Unit]): String = js.native
}
