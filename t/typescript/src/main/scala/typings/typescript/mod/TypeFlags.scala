package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeFlags extends StObject
@JSImport("typescript", "TypeFlags")
@js.native
object TypeFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeFlags with Double] = js.native
  
  @js.native
  sealed trait Any extends TypeFlags
  /* 1 */ val Any: typings.typescript.mod.TypeFlags.Any with Double = js.native
  
  @js.native
  sealed trait BigInt extends TypeFlags
  /* 64 */ val BigInt: typings.typescript.mod.TypeFlags.BigInt with Double = js.native
  
  @js.native
  sealed trait BigIntLike extends TypeFlags
  /* 2112 */ val BigIntLike: typings.typescript.mod.TypeFlags.BigIntLike with Double = js.native
  
  @js.native
  sealed trait BigIntLiteral extends TypeFlags
  /* 2048 */ val BigIntLiteral: typings.typescript.mod.TypeFlags.BigIntLiteral with Double = js.native
  
  @js.native
  sealed trait Boolean extends TypeFlags
  /* 16 */ val Boolean: typings.typescript.mod.TypeFlags.Boolean with Double = js.native
  
  @js.native
  sealed trait BooleanLike extends TypeFlags
  /* 528 */ val BooleanLike: typings.typescript.mod.TypeFlags.BooleanLike with Double = js.native
  
  @js.native
  sealed trait BooleanLiteral extends TypeFlags
  /* 512 */ val BooleanLiteral: typings.typescript.mod.TypeFlags.BooleanLiteral with Double = js.native
  
  @js.native
  sealed trait Conditional extends TypeFlags
  /* 16777216 */ val Conditional: typings.typescript.mod.TypeFlags.Conditional with Double = js.native
  
  @js.native
  sealed trait ESSymbol extends TypeFlags
  /* 4096 */ val ESSymbol: typings.typescript.mod.TypeFlags.ESSymbol with Double = js.native
  
  @js.native
  sealed trait ESSymbolLike extends TypeFlags
  /* 12288 */ val ESSymbolLike: typings.typescript.mod.TypeFlags.ESSymbolLike with Double = js.native
  
  @js.native
  sealed trait Enum extends TypeFlags
  /* 32 */ val Enum: typings.typescript.mod.TypeFlags.Enum with Double = js.native
  
  @js.native
  sealed trait EnumLike extends TypeFlags
  /* 1056 */ val EnumLike: typings.typescript.mod.TypeFlags.EnumLike with Double = js.native
  
  @js.native
  sealed trait EnumLiteral extends TypeFlags
  /* 1024 */ val EnumLiteral: typings.typescript.mod.TypeFlags.EnumLiteral with Double = js.native
  
  @js.native
  sealed trait Index extends TypeFlags
  /* 4194304 */ val Index: typings.typescript.mod.TypeFlags.Index with Double = js.native
  
  @js.native
  sealed trait IndexedAccess extends TypeFlags
  /* 8388608 */ val IndexedAccess: typings.typescript.mod.TypeFlags.IndexedAccess with Double = js.native
  
  @js.native
  sealed trait Instantiable extends TypeFlags
  /* 465829888 */ val Instantiable: typings.typescript.mod.TypeFlags.Instantiable with Double = js.native
  
  @js.native
  sealed trait InstantiableNonPrimitive extends TypeFlags
  /* 58982400 */ val InstantiableNonPrimitive: typings.typescript.mod.TypeFlags.InstantiableNonPrimitive with Double = js.native
  
  @js.native
  sealed trait InstantiablePrimitive extends TypeFlags
  /* 406847488 */ val InstantiablePrimitive: typings.typescript.mod.TypeFlags.InstantiablePrimitive with Double = js.native
  
  @js.native
  sealed trait Intersection extends TypeFlags
  /* 2097152 */ val Intersection: typings.typescript.mod.TypeFlags.Intersection with Double = js.native
  
  @js.native
  sealed trait Literal extends TypeFlags
  /* 2944 */ val Literal: typings.typescript.mod.TypeFlags.Literal with Double = js.native
  
  @js.native
  sealed trait Narrowable extends TypeFlags
  /* 536624127 */ val Narrowable: typings.typescript.mod.TypeFlags.Narrowable with Double = js.native
  
  @js.native
  sealed trait Never extends TypeFlags
  /* 131072 */ val Never: typings.typescript.mod.TypeFlags.Never with Double = js.native
  
  @js.native
  sealed trait NonPrimitive extends TypeFlags
  /* 67108864 */ val NonPrimitive: typings.typescript.mod.TypeFlags.NonPrimitive with Double = js.native
  
  @js.native
  sealed trait Null extends TypeFlags
  /* 65536 */ val Null: typings.typescript.mod.TypeFlags.Null with Double = js.native
  
  @js.native
  sealed trait Number extends TypeFlags
  /* 8 */ val Number: typings.typescript.mod.TypeFlags.Number with Double = js.native
  
  @js.native
  sealed trait NumberLike extends TypeFlags
  /* 296 */ val NumberLike: typings.typescript.mod.TypeFlags.NumberLike with Double = js.native
  
  @js.native
  sealed trait NumberLiteral extends TypeFlags
  /* 256 */ val NumberLiteral: typings.typescript.mod.TypeFlags.NumberLiteral with Double = js.native
  
  @js.native
  sealed trait Object extends TypeFlags
  /* 524288 */ val Object: typings.typescript.mod.TypeFlags.Object with Double = js.native
  
  @js.native
  sealed trait PossiblyFalsy extends TypeFlags
  /* 117724 */ val PossiblyFalsy: typings.typescript.mod.TypeFlags.PossiblyFalsy with Double = js.native
  
  @js.native
  sealed trait String extends TypeFlags
  /* 4 */ val String: typings.typescript.mod.TypeFlags.String with Double = js.native
  
  @js.native
  sealed trait StringLike extends TypeFlags
  /* 402653316 */ val StringLike: typings.typescript.mod.TypeFlags.StringLike with Double = js.native
  
  @js.native
  sealed trait StringLiteral extends TypeFlags
  /* 128 */ val StringLiteral: typings.typescript.mod.TypeFlags.StringLiteral with Double = js.native
  
  @js.native
  sealed trait StringMapping extends TypeFlags
  /* 268435456 */ val StringMapping: typings.typescript.mod.TypeFlags.StringMapping with Double = js.native
  
  @js.native
  sealed trait StringOrNumberLiteral extends TypeFlags
  /* 384 */ val StringOrNumberLiteral: typings.typescript.mod.TypeFlags.StringOrNumberLiteral with Double = js.native
  
  @js.native
  sealed trait StructuredOrInstantiable extends TypeFlags
  /* 469499904 */ val StructuredOrInstantiable: typings.typescript.mod.TypeFlags.StructuredOrInstantiable with Double = js.native
  
  @js.native
  sealed trait StructuredType extends TypeFlags
  /* 3670016 */ val StructuredType: typings.typescript.mod.TypeFlags.StructuredType with Double = js.native
  
  @js.native
  sealed trait Substitution extends TypeFlags
  /* 33554432 */ val Substitution: typings.typescript.mod.TypeFlags.Substitution with Double = js.native
  
  @js.native
  sealed trait TemplateLiteral extends TypeFlags
  /* 134217728 */ val TemplateLiteral: typings.typescript.mod.TypeFlags.TemplateLiteral with Double = js.native
  
  @js.native
  sealed trait TypeParameter extends TypeFlags
  /* 262144 */ val TypeParameter: typings.typescript.mod.TypeFlags.TypeParameter with Double = js.native
  
  @js.native
  sealed trait TypeVariable extends TypeFlags
  /* 8650752 */ val TypeVariable: typings.typescript.mod.TypeFlags.TypeVariable with Double = js.native
  
  @js.native
  sealed trait Undefined extends TypeFlags
  /* 32768 */ val Undefined: typings.typescript.mod.TypeFlags.Undefined with Double = js.native
  
  @js.native
  sealed trait Union extends TypeFlags
  /* 1048576 */ val Union: typings.typescript.mod.TypeFlags.Union with Double = js.native
  
  @js.native
  sealed trait UnionOrIntersection extends TypeFlags
  /* 3145728 */ val UnionOrIntersection: typings.typescript.mod.TypeFlags.UnionOrIntersection with Double = js.native
  
  @js.native
  sealed trait UniqueESSymbol extends TypeFlags
  /* 8192 */ val UniqueESSymbol: typings.typescript.mod.TypeFlags.UniqueESSymbol with Double = js.native
  
  @js.native
  sealed trait Unit extends TypeFlags
  /* 109440 */ val Unit: typings.typescript.mod.TypeFlags.Unit with Double = js.native
  
  @js.native
  sealed trait Unknown extends TypeFlags
  /* 2 */ val Unknown: typings.typescript.mod.TypeFlags.Unknown with Double = js.native
  
  @js.native
  sealed trait Void extends TypeFlags
  /* 16384 */ val Void: typings.typescript.mod.TypeFlags.Void with Double = js.native
  
  @js.native
  sealed trait VoidLike extends TypeFlags
  /* 49152 */ val VoidLike: typings.typescript.mod.TypeFlags.VoidLike with Double = js.native
}
