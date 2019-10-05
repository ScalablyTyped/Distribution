package typings.typedoc

import typings.typedoc.distLibModelsMod.DeclarationReflection
import typings.typedoc.distLibSerializationComponentsMod.ReflectionSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections/declaration", JSImport.Namespace)
@js.native
object distLibSerializationSerializersReflectionsDeclarationMod extends js.Object {
  @js.native
  class DeclarationReflectionSerializer () extends ReflectionSerializerComponent[DeclarationReflection]
  
  /* static members */
  @js.native
  object DeclarationReflectionSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

