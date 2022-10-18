package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper to describe a set of serialized properties. Primitive types are returned
  * directly, while other models are first passed through ModelToObject.
  * This helper removes the readonly modifier from properties since the result of serialization
  * is a plain object that consumers may modify as they choose, TypeDoc doesn't care.
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  {-readonly [ K2 in K ]: typedoc.typedoc/dist/lib/serialization/schema.ToSerialized<T[K2]>}
  }}}
  */
@js.native
trait S[T, K /* <: /* keyof T */ String */] extends StObject
