package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.typeFest.mergeMod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonifyMod {
  
  // Returns never if the key or property is not jsonable without testing whether the property is required or optional otherwise return the key.
  type BaseKeyFilter[Type, Key /* <: /* keyof Type */ String */] = Key
  
  type Jsonify[T] = (Merge[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof T as type-fest.type-fest/source/jsonify.RequiredKeyFilter<T, Key> ]: type-fest.type-fest/source/jsonify.Jsonify<T[Key]>}
    */ typings.typeFest.typeFestStrings.Jsonify & TopLevel[T], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof T as type-fest.type-fest/source/jsonify.OptionalKeyFilter<T, Key> ]:? type-fest.type-fest/source/jsonify.Jsonify<std.Exclude<T[Key], undefined>>}
    */ typings.typeFest.typeFestStrings.Jsonify & TopLevel[T]
  ]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ I in keyof T ]: T[I] extends type-fest.type-fest/source/jsonify.NotJsonable? null : type-fest.type-fest/source/jsonify.Jsonify<T[I]>}
    */ typings.typeFest.typeFestStrings.Jsonify & TopLevel[Any]) | (Record[String, Double]) | js.Object | Boolean | String | Double | Any | T | Null
  
  // Note: The return value has to be `any` and not `unknown` so it can match `void`.
  type NotJsonable = js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | js.Symbol]
  
  // Returns never if the key or property is not jsonable or required otherwise return the key.
  type OptionalKeyFilter[Type, Key /* <: /* keyof Type */ String */] = BaseKeyFilter[Type, Key]
  
  // Returns never if the key or property is not jsonable or optional otherwise return the key.
  type RequiredKeyFilter[Type, Key /* <: /* keyof Type */ String */] = BaseKeyFilter[Type, Key]
}
