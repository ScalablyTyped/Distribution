package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflections", JSImport.Namespace)
@js.native
object serializersReflectionsMod extends js.Object {
  @js.native
  class ContainerReflectionSerializer ()
    extends typings.typedoc.reflectionsContainerMod.ContainerReflectionSerializer
  
  @js.native
  class DeclarationReflectionSerializer ()
    extends typings.typedoc.serializersReflectionsDeclarationMod.DeclarationReflectionSerializer
  
  @js.native
  class ParameterReflectionSerializer ()
    extends typings.typedoc.serializersReflectionsParameterMod.ParameterReflectionSerializer
  
  @js.native
  class ProjectReflectionSerializer ()
    extends typings.typedoc.reflectionsProjectMod.ProjectReflectionSerializer
  
  @js.native
  class ReflectionSerializer ()
    extends typings.typedoc.reflectionsAbstractMod.ReflectionSerializer
  
  @js.native
  class SignatureReflectionSerializer ()
    extends typings.typedoc.serializersReflectionsSignatureMod.SignatureReflectionSerializer
  
  @js.native
  class TypeParameterReflectionSerializer ()
    extends typings.typedoc.serializersReflectionsTypeParameterMod.TypeParameterReflectionSerializer
  
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

