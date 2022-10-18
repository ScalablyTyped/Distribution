package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.std.Partial
import typings.std.Record
import typings.vegaTypings.anon.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Binding = Signal & typings.vegaTypings.typesSpecBindMod.Binding

type ID = String | Double

type ObjectOrAny[T /* <: js.Object */] = T | js.Array[Any] | ((Record[String, Any]) & (Partial[Record[KeysOfUnion[T], scala.Nothing]])) | Primitive

type ObjectOrListObjectOrAny[T /* <: js.Object */] = T | js.Array[ObjectOrAny[T]] | ((Record[String, Any]) & (Partial[Record[KeysOfUnion[T], scala.Nothing]])) | Primitive

type OrArray[T] = T | js.Array[T]

type Parameter = ObjectOrListObjectOrAny[BuiltinParameter]

type Primitive = js.UndefOr[Double | String | js.BigInt | Boolean | js.Symbol | Null]
