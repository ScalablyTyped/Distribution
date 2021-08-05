package typings.superstruct

import org.scalablytyped.runtime.TopLevel
import typings.std.Omit
import typings.std.Pick
import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.StructContext
import typings.superstruct.structMod.StructResult
import typings.superstruct.xtrasMod.Assign
import typings.superstruct.xtrasMod.InferObjectStruct
import typings.superstruct.xtrasMod.ObjectSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesMod {
  
  @JSImport("superstruct/lib/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */](Structs: js.Tuple2[InferObjectStruct[A], InferObjectStruct[B]]): InferObjectStruct[Assign[A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(Structs.asInstanceOf[js.Any]).asInstanceOf[InferObjectStruct[Assign[A, B]]]
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */](Structs: js.Tuple3[InferObjectStruct[A], InferObjectStruct[B], InferObjectStruct[C]]): InferObjectStruct[Assign[Assign[A, B], C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(Structs.asInstanceOf[js.Any]).asInstanceOf[InferObjectStruct[Assign[Assign[A, B], C]]]
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */, D /* <: ObjectSchema */](
    Structs: js.Tuple4[InferObjectStruct[A], InferObjectStruct[B], InferObjectStruct[C], InferObjectStruct[D]]
  ): InferObjectStruct[Assign[Assign[Assign[A, B], C], D]] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(Structs.asInstanceOf[js.Any]).asInstanceOf[InferObjectStruct[Assign[Assign[Assign[A, B], C], D]]]
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */, D /* <: ObjectSchema */, E /* <: ObjectSchema */](
    Structs: js.Tuple5[
      InferObjectStruct[A], 
      InferObjectStruct[B], 
      InferObjectStruct[C], 
      InferObjectStruct[D], 
      InferObjectStruct[E]
    ]
  ): InferObjectStruct[Assign[Assign[Assign[Assign[A, B], C], D], E]] = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(Structs.asInstanceOf[js.Any]).asInstanceOf[InferObjectStruct[Assign[Assign[Assign[Assign[A, B], C], D], E]]]
  
  inline def dynamic[T](fn: js.Function2[/* value */ js.Any, /* ctx */ StructContext, Struct[T, js.Any]]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamic")(fn.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  inline def `lazy`[T](fn: js.Function0[Struct[T, js.Any]]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(fn.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  inline def omit[S /* <: ObjectSchema */, K /* <: /* keyof S */ String */](struct: InferObjectStruct[S], keys: js.Array[K]): InferObjectStruct[Omit[S, K]] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(struct.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[InferObjectStruct[Omit[S, K]]]
  
  inline def partial[S /* <: ObjectSchema */](struct: S): InferObjectStruct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: superstruct.superstruct/lib/struct.Struct<superstruct.superstruct/lib/struct.StructType<S[K]> | undefined, any>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[S]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(struct.asInstanceOf[js.Any]).asInstanceOf[InferObjectStruct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: superstruct.superstruct/lib/struct.Struct<superstruct.superstruct/lib/struct.StructType<S[K]> | undefined, any>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[S]
  ]]
  inline def partial[S /* <: ObjectSchema */](struct: InferObjectStruct[S]): InferObjectStruct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: superstruct.superstruct/lib/struct.Struct<superstruct.superstruct/lib/struct.StructType<S[K]> | undefined, any>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[S]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(struct.asInstanceOf[js.Any]).asInstanceOf[InferObjectStruct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: superstruct.superstruct/lib/struct.Struct<superstruct.superstruct/lib/struct.StructType<S[K]> | undefined, any>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[S]
  ]]
  
  inline def pick[S /* <: ObjectSchema */, K /* <: /* keyof S */ String */](struct: InferObjectStruct[S], keys: js.Array[K]): InferObjectStruct[Pick[S, K]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(struct.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[InferObjectStruct[Pick[S, K]]]
  
  inline def struct[T](
    name: String,
    validator: js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]
  ): Struct[T, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(name.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Struct[T, Null]]
}
