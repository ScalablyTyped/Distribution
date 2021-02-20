package typings.typedoc

import typings.typedoc.modelsMod.SignatureReflection
import typings.typedoc.schemaMod.Reflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionsSignatureMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/signature", "SignatureReflectionSerializer")
  @js.native
  class SignatureReflectionSerializer protected () extends ReflectionSerializerComponent[SignatureReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(signature: SignatureReflection, obj: Reflection): typings.typedoc.schemaMod.SignatureReflection = js.native
  }
}
