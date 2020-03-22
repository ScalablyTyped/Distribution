package typings.typedoc

import typings.typedoc.modelsMod.SignatureReflection
import typings.typedoc.schemaMod.Reflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/signature", JSImport.Namespace)
@js.native
object serializersReflectionsSignatureMod extends js.Object {
  @js.native
  class SignatureReflectionSerializer () extends ReflectionSerializerComponent[SignatureReflection] {
    def toObject(signature: SignatureReflection, obj: Reflection): typings.typedoc.schemaMod.SignatureReflection = js.native
  }
  
}

