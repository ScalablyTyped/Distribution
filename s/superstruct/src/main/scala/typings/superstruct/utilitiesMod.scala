package typings.superstruct

import typings.std.Omit
import typings.std.Pick
import typings.superstruct.structMod.Context
import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.Validator
import typings.superstruct.utilsMod.Assign
import typings.superstruct.utilsMod.ObjectSchema
import typings.superstruct.utilsMod.ObjectType
import typings.superstruct.utilsMod.PartialObjectSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilitiesMod {
  
  @JSImport("superstruct/lib/structs/utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */](A: Struct[ObjectType[A], A], B: Struct[ObjectType[B], B]): Struct[ObjectType[Assign[A, B]], Assign[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[Struct[ObjectType[Assign[A, B]], Assign[A, B]]]
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */](A: Struct[ObjectType[A], A], B: Struct[ObjectType[B], B], C: Struct[ObjectType[C], C]): Struct[ObjectType[Assign[Assign[A, B], C]], Assign[Assign[A, B], C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Struct[ObjectType[Assign[Assign[A, B], C]], Assign[Assign[A, B], C]]]
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */, D /* <: ObjectSchema */](
    A: Struct[ObjectType[A], A],
    B: Struct[ObjectType[B], B],
    C: Struct[ObjectType[C], C],
    D: Struct[ObjectType[D], D]
  ): Struct[ObjectType[Assign[Assign[Assign[A, B], C], D]], Assign[Assign[Assign[A, B], C], D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[Struct[ObjectType[Assign[Assign[Assign[A, B], C], D]], Assign[Assign[Assign[A, B], C], D]]]
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */, D /* <: ObjectSchema */, E /* <: ObjectSchema */](
    A: Struct[ObjectType[A], A],
    B: Struct[ObjectType[B], B],
    C: Struct[ObjectType[C], C],
    D: Struct[ObjectType[D], D],
    E: Struct[ObjectType[E], E]
  ): Struct[
    ObjectType[Assign[Assign[Assign[Assign[A, B], C], D], E]], 
    Assign[Assign[Assign[Assign[A, B], C], D], E]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[Struct[
    ObjectType[Assign[Assign[Assign[Assign[A, B], C], D], E]], 
    Assign[Assign[Assign[Assign[A, B], C], D], E]
  ]]
  
  inline def define[T](name: String, validator: Validator): Struct[T, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Struct[T, Null]]
  
  inline def deprecated[T](struct: Struct[T, Any], log: js.Function2[/* value */ Any, /* ctx */ Context, Unit]): Struct[T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(struct.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[Struct[T, Any]]
  
  inline def dynamic[T](fn: js.Function2[/* value */ Any, /* ctx */ Context, Struct[T, Any]]): Struct[T, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamic")(fn.asInstanceOf[js.Any]).asInstanceOf[Struct[T, Null]]
  
  inline def `lazy`[T](fn: js.Function0[Struct[T, Any]]): Struct[T, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(fn.asInstanceOf[js.Any]).asInstanceOf[Struct[T, Null]]
  
  inline def omit[S /* <: ObjectSchema */, K /* <: /* keyof S */ String */](struct: Struct[ObjectType[S], S], keys: js.Array[K]): Struct[ObjectType[Omit[S, K]], Omit[S, K]] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(struct.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Struct[ObjectType[Omit[S, K]], Omit[S, K]]]
  
  inline def partial[S /* <: ObjectSchema */](struct: S): Struct[ObjectType[PartialObjectSchema[S]], PartialObjectSchema[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[ObjectType[PartialObjectSchema[S]], PartialObjectSchema[S]]]
  inline def partial[S /* <: ObjectSchema */](struct: Struct[ObjectType[S], S]): Struct[ObjectType[PartialObjectSchema[S]], PartialObjectSchema[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[ObjectType[PartialObjectSchema[S]], PartialObjectSchema[S]]]
  
  inline def pick[S /* <: ObjectSchema */, K /* <: /* keyof S */ String */](struct: Struct[ObjectType[S], S], keys: js.Array[K]): Struct[ObjectType[Pick[S, K]], Pick[S, K]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(struct.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Struct[ObjectType[Pick[S, K]], Pick[S, K]]]
  
  inline def struct[T](name: String, validator: Validator): Struct[T, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(name.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Struct[T, Null]]
}
