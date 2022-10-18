package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends typedoc.typedoc/dist/lib/serialization/schema.Primitive ? T : T extends bigint ? {  value :string,   negative :boolean} : typedoc.typedoc/dist/lib/serialization/schema.ModelToObject<T>
  }}}
  */
@js.native
trait ToSerialized[T] extends StObject
