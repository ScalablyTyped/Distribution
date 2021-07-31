package typings.superstruct

import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import typings.std.InstanceType
import typings.std.Map
import typings.std.Record
import typings.std.RegExp
import typings.std.Set
import typings.superstruct.anon.Instantiable
import typings.superstruct.structMod.Struct
import typings.superstruct.superstructStrings.enums
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("superstruct/lib/structs/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def any(): Struct[js.Any, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")().asInstanceOf[Struct[js.Any, Null]]
  
  @scala.inline
  def array(): Struct[js.Array[js.Any], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[Struct[js.Array[js.Any], Unit]]
  @scala.inline
  def array[T /* <: Struct[js.Any, js.Any] */](Element: T): Struct[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Infer<T> */ js.Any
    ], 
    T
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(Element.asInstanceOf[js.Any]).asInstanceOf[Struct[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Infer<T> */ js.Any
    ], 
    T
  ]]
  
  @scala.inline
  def boolean(): Struct[Boolean, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[Struct[Boolean, Null]]
  
  @scala.inline
  def date(): Struct[Date, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[Struct[Date, Null]]
  
  @scala.inline
  def enums[T /* <: String */](values: js.Array[T]): Struct[
    T, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in std.Array<T>[number] ]: K}
    */ typings.superstruct.superstructStrings.enums & TopLevel[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("enums")(values.asInstanceOf[js.Any]).asInstanceOf[Struct[
    T, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in std.Array<T>[number] ]: K}
    */ typings.superstruct.superstructStrings.enums & TopLevel[js.Any]
  ]]
  
  @scala.inline
  def enums_T_Double[T /* <: Double */](values: js.Array[T]): Struct[
    T, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in std.Array<T>[number] ]: K}
    */ enums & TopLevel[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("enums")(values.asInstanceOf[js.Any]).asInstanceOf[Struct[
    T, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in std.Array<T>[number] ]: K}
    */ enums & TopLevel[js.Any]
  ]]
  
  @scala.inline
  def func(): Struct[js.Function, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")().asInstanceOf[Struct[js.Function, Null]]
  
  @scala.inline
  def instance[T /* <: Instantiable */](Class: T): Struct[InstanceType[T], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(Class.asInstanceOf[js.Any]).asInstanceOf[Struct[InstanceType[T], Null]]
  
  @scala.inline
  def integer(): Struct[Double, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")().asInstanceOf[Struct[Double, Null]]
  
  @scala.inline
  def intersection[A](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A]> */ js.Any
  ): Struct[A, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A, Null]]
  
  @scala.inline
  def intersection_AB[A, B](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B]> */ js.Any
  ): Struct[A & B, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B, Null]]
  
  @scala.inline
  def intersection_ABC[A, B, C](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C]> */ js.Any
  ): Struct[A & B & C, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C, Null]]
  
  @scala.inline
  def intersection_ABCD[A, B, C, D](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D]> */ js.Any
  ): Struct[A & B & C & D, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D, Null]]
  
  @scala.inline
  def intersection_ABCDE[A, B, C, D, E](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E]> */ js.Any
  ): Struct[A & B & C & D & E, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E, Null]]
  
  @scala.inline
  def intersection_ABCDEF[A, B, C, D, E, F](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F]> */ js.Any
  ): Struct[A & B & C & D & E & F, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F, Null]]
  
  @scala.inline
  def intersection_ABCDEFG[A, B, C, D, E, F, G](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G]> */ js.Any
  ): Struct[A & B & C & D & E & F & G, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G, Null]]
  
  @scala.inline
  def intersection_ABCDEFGH[A, B, C, D, E, F, G, H](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H]> */ js.Any
  ): Struct[A & B & C & D & E & F & G & H, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H, Null]]
  
  @scala.inline
  def intersection_ABCDEFGHI[A, B, C, D, E, F, G, H, I](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I]> */ js.Any
  ): Struct[A & B & C & D & E & F & G & H & I, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I, Null]]
  
  @scala.inline
  def intersection_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J]> */ js.Any
  ): Struct[A & B & C & D & E & F & G & H & I & J, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J, Null]]
  
  @scala.inline
  def intersection_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K]> */ js.Any
  ): Struct[A & B & C & D & E & F & G & H & I & J & K, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K, Null]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L]> */ js.Any
  ): Struct[A & B & C & D & E & F & G & H & I & J & K & L, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L, Null]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M]> */ js.Any
  ): Struct[A & B & C & D & E & F & G & H & I & J & K & L & M, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L & M, Null]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N]> */ js.Any
  ): Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N, Null]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]> */ js.Any
  ): Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O, Null]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]> */ js.Any
  ): Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P, Null]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]> */ js.Any
  ): Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P & Q, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P & Q, Null]]
  
  @scala.inline
  def literal[T /* <: String */](constant: T): Struct[T, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct[T, Null]]
  
  @scala.inline
  def literal_T[T](constant: T): Struct[T, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct[T, Null]]
  
  @scala.inline
  def literal_T_Boolean[T /* <: Boolean */](constant: T): Struct[T, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct[T, Null]]
  
  @scala.inline
  def literal_T_Double[T /* <: Double */](constant: T): Struct[T, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct[T, Null]]
  
  @scala.inline
  def map(): Struct[Map[js.Any, js.Any], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[Struct[Map[js.Any, js.Any], Null]]
  @scala.inline
  def map[K, V](Key: Struct[K, js.Any], Value: Struct[V, js.Any]): Struct[Map[K, V], Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(Key.asInstanceOf[js.Any], Value.asInstanceOf[js.Any])).asInstanceOf[Struct[Map[K, V], Null]]
  
  @scala.inline
  def never(): Struct[scala.Nothing, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Struct[scala.Nothing, Null]]
  
  @scala.inline
  def nullable[T, S](struct: Struct[T, S]): Struct[T | Null, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T | Null, S]]
  
  @scala.inline
  def number(): Struct[Double, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Struct[Double, Null]]
  
  @scala.inline
  def `object`(): Struct[Record[String, js.Any], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[Struct[Record[String, js.Any], Null]]
  @scala.inline
  def `object`[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](schema: S): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ js.Any, 
    S
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(schema.asInstanceOf[js.Any]).asInstanceOf[Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ js.Any, 
    S
  ]]
  
  @scala.inline
  def optional[T, S](struct: Struct[T, S]): Struct[js.UndefOr[T], S] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[js.UndefOr[T], S]]
  
  @scala.inline
  def record[K /* <: String */, V](Key: Struct[K, js.Any], Value: Struct[V, js.Any]): Struct[Record[K, V], Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("record")(Key.asInstanceOf[js.Any], Value.asInstanceOf[js.Any])).asInstanceOf[Struct[Record[K, V], Null]]
  
  @scala.inline
  def regexp(): Struct[RegExp, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("regexp")().asInstanceOf[Struct[RegExp, Null]]
  
  @scala.inline
  def set(): Struct[Set[js.Any], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")().asInstanceOf[Struct[Set[js.Any], Null]]
  @scala.inline
  def set[T](Element: Struct[T, js.Any]): Struct[Set[T], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(Element.asInstanceOf[js.Any]).asInstanceOf[Struct[Set[T], Null]]
  
  @scala.inline
  def shape[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectSchema */ js.Any */](schema: S): Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ js.Any, 
    S
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("shape")(schema.asInstanceOf[js.Any]).asInstanceOf[Struct[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectType<S> */ js.Any, 
    S
  ]]
  
  @scala.inline
  def string(): Struct[String, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[Struct[String, Null]]
  
  @scala.inline
  def tuple[A](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A]> */ js.Any
  ): Struct[A, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A, Null]]
  
  @scala.inline
  def tuple_AB[A, B](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B]> */ js.Any
  ): Struct[js.Tuple2[A, B], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple2[A, B], Null]]
  
  @scala.inline
  def tuple_ABC[A, B, C](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C]> */ js.Any
  ): Struct[js.Tuple3[A, B, C], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple3[A, B, C], Null]]
  
  @scala.inline
  def tuple_ABCD[A, B, C, D](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D]> */ js.Any
  ): Struct[js.Tuple4[A, B, C, D], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple4[A, B, C, D], Null]]
  
  @scala.inline
  def tuple_ABCDE[A, B, C, D, E](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E]> */ js.Any
  ): Struct[js.Tuple5[A, B, C, D, E], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple5[A, B, C, D, E], Null]]
  
  @scala.inline
  def tuple_ABCDEF[A, B, C, D, E, F](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F]> */ js.Any
  ): Struct[js.Tuple6[A, B, C, D, E, F], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple6[A, B, C, D, E, F], Null]]
  
  @scala.inline
  def tuple_ABCDEFG[A, B, C, D, E, F, G](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G]> */ js.Any
  ): Struct[js.Tuple7[A, B, C, D, E, F, G], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple7[A, B, C, D, E, F, G], Null]]
  
  @scala.inline
  def tuple_ABCDEFGH[A, B, C, D, E, F, G, H](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H]> */ js.Any
  ): Struct[js.Tuple8[A, B, C, D, E, F, G, H], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple8[A, B, C, D, E, F, G, H], Null]]
  
  @scala.inline
  def tuple_ABCDEFGHI[A, B, C, D, E, F, G, H, I](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I]> */ js.Any
  ): Struct[js.Tuple9[A, B, C, D, E, F, G, H, I], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple9[A, B, C, D, E, F, G, H, I], Null]]
  
  @scala.inline
  def tuple_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J]> */ js.Any
  ): Struct[js.Tuple10[A, B, C, D, E, F, G, H, I, J], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple10[A, B, C, D, E, F, G, H, I, J], Null]]
  
  @scala.inline
  def tuple_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K]> */ js.Any
  ): Struct[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K], Null]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L]> */ js.Any
  ): Struct[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L], Null]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M]> */ js.Any
  ): Struct[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M], Null]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N]> */ js.Any
  ): Struct[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N], Null]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]> */ js.Any
  ): Struct[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O], Null]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]> */ js.Any
  ): Struct[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P], Null]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]> */ js.Any
  ): Struct[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q], Null]]
  
  @scala.inline
  def union[A](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A]> */ js.Any
  ): Struct[A, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A, Null]]
  
  @scala.inline
  def union_AB[A, B](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B]> */ js.Any
  ): Struct[A | B, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B, Null]]
  
  @scala.inline
  def union_ABC[A, B, C](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C]> */ js.Any
  ): Struct[A | B | C, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C, Null]]
  
  @scala.inline
  def union_ABCD[A, B, C, D](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D]> */ js.Any
  ): Struct[A | B | C | D, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D, Null]]
  
  @scala.inline
  def union_ABCDE[A, B, C, D, E](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E]> */ js.Any
  ): Struct[A | B | C | D | E, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E, Null]]
  
  @scala.inline
  def union_ABCDEF[A, B, C, D, E, F](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F]> */ js.Any
  ): Struct[A | B | C | D | E | F, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F, Null]]
  
  @scala.inline
  def union_ABCDEFG[A, B, C, D, E, F, G](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G]> */ js.Any
  ): Struct[A | B | C | D | E | F | G, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G, Null]]
  
  @scala.inline
  def union_ABCDEFGH[A, B, C, D, E, F, G, H](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H, Null]]
  
  @scala.inline
  def union_ABCDEFGHI[A, B, C, D, E, F, G, H, I](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I, Null]]
  
  @scala.inline
  def union_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J, Null]]
  
  @scala.inline
  def union_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K, Null]]
  
  @scala.inline
  def union_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L, Null]]
  
  @scala.inline
  def union_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L | M, Null]]
  
  @scala.inline
  def union_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N, Null]]
  
  @scala.inline
  def union_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O, Null]]
  
  @scala.inline
  def union_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P, Null]]
  
  @scala.inline
  def union_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](
    Structs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TupleSchema<[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]> */ js.Any
  ): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q, Null]]
  
  @scala.inline
  def unknown(): Struct[js.Any, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("unknown")().asInstanceOf[Struct[js.Any, Null]]
}
