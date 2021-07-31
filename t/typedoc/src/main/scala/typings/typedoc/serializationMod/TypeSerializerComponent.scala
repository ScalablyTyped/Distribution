package typings.typedoc.serializationMod

import typings.typedoc.modelsMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization", "TypeSerializerComponent")
@js.native
abstract class TypeSerializerComponent[T /* <: Type */] protected ()
  extends typings.typedoc.serializationComponentsMod.TypeSerializerComponent[T] {
  def this(owner: typings.typedoc.serializerMod.Serializer) = this()
}
