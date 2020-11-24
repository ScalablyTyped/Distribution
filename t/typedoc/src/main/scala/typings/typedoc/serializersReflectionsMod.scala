package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/reflections", JSImport.Namespace)
@js.native
object serializersReflectionsMod extends js.Object {
  
  @js.native
  class ContainerReflectionSerializer ()
    extends typings.typedoc.reflectionsContainerMod.ContainerReflectionSerializer
  
  @js.native
  class DeclarationReflectionSerializer ()
    extends typings.typedoc.serializersReflectionsDeclarationMod.DeclarationReflectionSerializer
  /* static members */
  @js.native
  object DeclarationReflectionSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
  
  @js.native
  class ParameterReflectionSerializer ()
    extends typings.typedoc.serializersReflectionsParameterMod.ParameterReflectionSerializer
  
  @js.native
  class ProjectReflectionSerializer ()
    extends typings.typedoc.reflectionsProjectMod.ProjectReflectionSerializer
  /* static members */
  @js.native
  object ProjectReflectionSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
  
  @js.native
  class ReferenceReflectionSerializer ()
    extends typings.typedoc.serializersReflectionsReferenceMod.ReferenceReflectionSerializer
  /* static members */
  @js.native
  object ReferenceReflectionSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
  
  @js.native
  class ReflectionSerializer ()
    extends typings.typedoc.reflectionsAbstractMod.ReflectionSerializer
  /* static members */
  @js.native
  object ReflectionSerializer extends js.Object {
    
    var PRIORITY: Double = js.native
  }
  
  @js.native
  class SignatureReflectionSerializer ()
    extends typings.typedoc.serializersReflectionsSignatureMod.SignatureReflectionSerializer
  
  @js.native
  class TypeParameterReflectionSerializer ()
    extends typings.typedoc.serializersReflectionsTypeParameterMod.TypeParameterReflectionSerializer
}
