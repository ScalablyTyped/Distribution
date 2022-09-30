package typings.tcomb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tcomb.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Any: Irreducible_[scala.Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("Any").asInstanceOf[Irreducible_[scala.Any]]
inline def Any_=(x: Irreducible_[scala.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])

inline def Array: Irreducible_[js.Array[scala.Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("Array").asInstanceOf[Irreducible_[js.Array[scala.Any]]]
inline def Array_=(x: Irreducible_[js.Array[scala.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])

inline def Boolean: Irreducible_[scala.Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("Boolean").asInstanceOf[Irreducible_[scala.Boolean]]
inline def Boolean_=(x: Irreducible_[scala.Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])

inline def Date: Irreducible_[js.Date] = ^.asInstanceOf[js.Dynamic].selectDynamic("Date").asInstanceOf[Irreducible_[js.Date]]
inline def Date_=(x: Irreducible_[js.Date]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])

inline def Error: Irreducible_[js.Error] = ^.asInstanceOf[js.Dynamic].selectDynamic("Error").asInstanceOf[Irreducible_[js.Error]]
inline def Error_=(x: Irreducible_[js.Error]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])

inline def Function: Irreducible_[js.Function] = ^.asInstanceOf[js.Dynamic].selectDynamic("Function").asInstanceOf[Irreducible_[js.Function]]
inline def Function_=(x: Irreducible_[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Function")(x.asInstanceOf[js.Any])

inline def Integer: Irreducible_[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("Integer").asInstanceOf[Irreducible_[Double]]
inline def Integer_=(x: Irreducible_[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])

inline def Nil: Irreducible_[Unit | Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("Nil").asInstanceOf[Irreducible_[Unit | Null]]
inline def Nil_=(x: Irreducible_[Unit | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Nil")(x.asInstanceOf[js.Any])

inline def Number: Irreducible_[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("Number").asInstanceOf[Irreducible_[Double]]
inline def Number_=(x: Irreducible_[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Number")(x.asInstanceOf[js.Any])

inline def Object: Irreducible_[js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Object").asInstanceOf[Irreducible_[js.Object]]
inline def Object_=(x: Irreducible_[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])

inline def RegExp: Irreducible_[js.RegExp] = ^.asInstanceOf[js.Dynamic].selectDynamic("RegExp").asInstanceOf[Irreducible_[js.RegExp]]
inline def RegExp_=(x: Irreducible_[js.RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegExp")(x.asInstanceOf[js.Any])

inline def String: Irreducible_[java.lang.String] = ^.asInstanceOf[js.Dynamic].selectDynamic("String").asInstanceOf[Irreducible_[java.lang.String]]
inline def String_=(x: Irreducible_[java.lang.String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])

inline def assert(guard: scala.Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(guard.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def assert(guard: scala.Boolean, message: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(guard.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def assert(guard: scala.Boolean, message: LazyMessage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(guard.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def declare[T](): Declare_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("declare")().asInstanceOf[Declare_[T]]
inline def declare[T](name: java.lang.String): Declare_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("declare")(name.asInstanceOf[js.Any]).asInstanceOf[Declare_[T]]

inline def dict[T](domain: Constructor[java.lang.String], codomain: Constructor[T]): Dict_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("dict")(domain.asInstanceOf[js.Any], codomain.asInstanceOf[js.Any])).asInstanceOf[Dict_[T]]
inline def dict[T](domain: Constructor[java.lang.String], codomain: Constructor[T], name: java.lang.String): Dict_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("dict")(domain.asInstanceOf[js.Any], codomain.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Dict_[T]]

inline def enums: EnumsFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("enums").asInstanceOf[EnumsFunction]
inline def enums_=(x: EnumsFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enums")(x.asInstanceOf[js.Any])

inline def fail(message: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getTypeName[T](x: Constructor[T]): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeName")(x.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def interface[T](props: StructProps): Interface_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("interface")(props.asInstanceOf[js.Any]).asInstanceOf[Interface_[T]]
inline def interface[T](props: StructProps, name: java.lang.String): Interface_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("interface")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Interface_[T]]
inline def interface[T](props: StructProps, name: StructOptions): Interface_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("interface")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Interface_[T]]

inline def intersection[T](types: js.Array[Constructor[scala.Any]]): Intersection_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(types.asInstanceOf[js.Any]).asInstanceOf[Intersection_[T]]
inline def intersection[T](types: js.Array[Constructor[scala.Any]], name: java.lang.String): Intersection_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(types.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Intersection_[T]]

inline def irreducible[T](name: java.lang.String, predicate: Predicate[scala.Any]): Irreducible_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("irreducible")(name.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Irreducible_[T]]

inline def is[T](x: scala.Any, `type`: Constructor[T]): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(x.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def isType[T](x: Constructor[T]): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isType")(x.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

inline def list[T](`type`: Constructor[T]): List_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(`type`.asInstanceOf[js.Any]).asInstanceOf[List_[T]]
inline def list[T](`type`: Constructor[T], name: java.lang.String): List_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[List_[T]]

inline def `match`(x: scala.Any, clauses: Clause*): scala.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("match")(scala.List(x.asInstanceOf[js.Any]).`++`(clauses.asInstanceOf[Seq[js.Any]])*).asInstanceOf[scala.Any]

inline def maybe[T](`type`: Constructor[T]): Maybe_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")(`type`.asInstanceOf[js.Any]).asInstanceOf[Maybe_[T]]
inline def maybe[T](`type`: Constructor[T], name: java.lang.String): Maybe_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("maybe")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Maybe_[T]]

inline def mixin[T, S](target: T, source: S): T & S = (^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & S]
inline def mixin[T, S](target: T, source: S, overwrite: scala.Boolean): T & S = (^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any])).asInstanceOf[T & S]

inline def refinement[T](`type`: Constructor[T], predicate: Predicate[T]): Refinement_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Refinement_[T]]
inline def refinement[T](`type`: Constructor[T], predicate: Predicate[T], name: java.lang.String): Refinement_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(`type`.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Refinement_[T]]

inline def struct[T](props: StructProps): Struct_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(props.asInstanceOf[js.Any]).asInstanceOf[Struct_[T]]
inline def struct[T](props: StructProps, name: java.lang.String): Struct_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Struct_[T]]
inline def struct[T](props: StructProps, name: StructOptions): Struct_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(props.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Struct_[T]]

inline def tuple[T](types: js.Array[Constructor[scala.Any]]): Tuple_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(types.asInstanceOf[js.Any]).asInstanceOf[Tuple_[T]]
inline def tuple[T](types: js.Array[Constructor[scala.Any]], name: java.lang.String): Tuple_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(types.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Tuple_[T]]

inline def union[T](types: js.Array[Constructor[T]]): Union_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(types.asInstanceOf[js.Any]).asInstanceOf[Union_[T]]
inline def union[T](types: js.Array[Constructor[T]], name: java.lang.String): Union_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(types.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Union_[T]]

inline def update: Update_[js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("update").asInstanceOf[Update_[js.Object]]
inline def update_=(x: Update_[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("update")(x.asInstanceOf[js.Any])

type Clause = Constructor[scala.Any] | Function1

type Constructor[T] = Type[T] | js.Function

type Function1 = js.Function1[/* x */ scala.Any, scala.Any]

type LazyMessage = js.Function0[java.lang.String]

type Predicate[T] = js.Function1[/* x */ T, scala.Boolean]

type StructMixin = StructProps | Struct_[scala.Any] | Interface_[scala.Any]

//
// struct
//
type StructProps = StringDictionary[Constructor[scala.Any]]

type TypeGuardPredicate[T] = js.Function1[/* x */ scala.Any, /* is T */ scala.Boolean]

type UpdatePatch = Command | StringDictionary[scala.Any]
