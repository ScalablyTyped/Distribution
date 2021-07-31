package typings.superstruct

import org.scalablytyped.runtime.TopLevel
import typings.std.Iterable
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.StructContext
import typings.superstruct.structMod.StructFailure
import typings.superstruct.structMod.StructResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xtrasMod {
  
  @JSImport("superstruct/lib/xtras", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def toFailures(result: StructResult, context: StructContext): Iterable[StructFailure] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFailures")(result.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Iterable[StructFailure]]
  
  type Assign[T, U] = Simplify[U & (Omit[T, /* keyof U */ String])]
  
  type InferObjectStruct[S /* <: ObjectSchema */] = Struct[InferObjectType[S], S]
  
  type InferObjectType[S /* <: ObjectSchema */] = Simplify[
    Optionalize[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: superstruct.superstruct/lib/struct.StructType<S[K]>}
    */ typings.superstruct.superstructStrings.InferObjectType & TopLevel[S]
    ]
  ]
  
  type ObjectSchema = Record[String, Struct[js.Any, js.Any]]
  
  /**
    * Omit properties from a type that extend from a specific type.
    */
  type OmitBy[T, V] = Omit[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: V extends std.Extract<T[K], V>? K : never}[keyof T] */ js.Any
  ]
  
  /**
    * Normalize properties of a type that allow `undefined` to make them optional.
    */
  type Optionalize[S /* <: js.Object */] = (OmitBy[S, Unit]) & (Partial[PickBy[S, Unit]])
  
  /**
    * Pick properties from a type that extend from a specific type.
    */
  type PickBy[T, V] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: V extends std.Extract<T[K], V>? K : never}[keyof T] */ js.Any
  ]
  
  /**
    * Simplifies a type definition to its most basic representation.
    */
  type Simplify[T] = (typings.superstruct.superstructStrings.Simplify & TopLevel[T] & js.Object) | T
  
  type StructRecord[T] = Record[String, Struct[T, js.Any]]
  
  type StructTuple[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: superstruct.superstruct/lib/struct.Struct<T[K], any>}
    */ typings.superstruct.superstructStrings.StructTuple & TopLevel[T]
  
  type TupleSchema[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: superstruct.superstruct/lib/struct.Struct<T[K], any>}
    */ typings.superstruct.superstructStrings.TupleSchema & TopLevel[T]
}
