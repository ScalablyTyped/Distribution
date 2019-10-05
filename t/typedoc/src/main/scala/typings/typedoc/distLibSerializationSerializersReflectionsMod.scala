package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections", JSImport.Namespace)
@js.native
object distLibSerializationSerializersReflectionsMod extends js.Object {
  @js.native
  class ContainerReflectionSerializer ()
    extends typings.typedoc.distLibSerializationSerializersReflectionsContainerMod.ContainerReflectionSerializer
  
  @js.native
  class DeclarationReflectionSerializer ()
    extends typings.typedoc.distLibSerializationSerializersReflectionsDeclarationMod.DeclarationReflectionSerializer
  
  @js.native
  class ParameterReflectionSerializer ()
    extends typings.typedoc.distLibSerializationSerializersReflectionsParameterMod.ParameterReflectionSerializer
  
  @js.native
  class ProjectReflectionSerializer ()
    extends typings.typedoc.distLibSerializationSerializersReflectionsProjectMod.ProjectReflectionSerializer
  
  @js.native
  class ReflectionSerializer ()
    extends typings.typedoc.distLibSerializationSerializersReflectionsAbstractMod.ReflectionSerializer
  
  @js.native
  class SignatureReflectionSerializer ()
    extends typings.typedoc.distLibSerializationSerializersReflectionsSignatureMod.SignatureReflectionSerializer
  
  @js.native
  class TypeParameterReflectionSerializer ()
    extends typings.typedoc.distLibSerializationSerializersReflectionsTypeDashParameterMod.TypeParameterReflectionSerializer
  
  /* static members */
  @js.native
  object DeclarationReflectionSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
  /* static members */
  @js.native
  object ProjectReflectionSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
  /* static members */
  @js.native
  object ReflectionSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

