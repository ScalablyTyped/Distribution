package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.std.Partial
import typings.std.Record
import typings.vegaTypings.anon.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Binding = Signal & typings.vegaTypings.typesSpecBindMod.Binding

type ID = String | Double

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends T ? keyof T : never
  }}}
  */
type KeysOfUnion[T] = /* keyof T */ String

type ObjectOrAny[T /* <: js.Object */] = T | js.Array[Any] | ((Record[String, Any]) & (Partial[Record[KeysOfUnion[T], scala.Nothing]])) | Primitive

type ObjectOrListObjectOrAny[T /* <: js.Object */] = T | js.Array[ObjectOrAny[T]] | ((Record[String, Any]) & (Partial[Record[KeysOfUnion[T], scala.Nothing]])) | Primitive

type OrArray[T] = T | js.Array[T]

type Parameter = ObjectOrListObjectOrAny[BuiltinParameter]

type Primitive = js.UndefOr[Double | String | js.BigInt | Boolean | js.Symbol | Null]
