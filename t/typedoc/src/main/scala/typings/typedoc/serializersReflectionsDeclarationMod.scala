package typings.typedoc

import typings.typedoc.modelsMod.DeclarationReflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/declaration", JSImport.Namespace)
@js.native
object serializersReflectionsDeclarationMod extends js.Object {
  @js.native
  class DeclarationReflectionSerializer () extends ReflectionSerializerComponent[DeclarationReflection]
  
  /* static members */
  @js.native
  object DeclarationReflectionSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

