package typings.typedoc

import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionsMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "ContainerReflectionSerializer")
  @js.native
  class ContainerReflectionSerializer protected ()
    extends typings.typedoc.reflectionsContainerMod.ContainerReflectionSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "DeclarationReflectionSerializer")
  @js.native
  class DeclarationReflectionSerializer protected ()
    extends typings.typedoc.serializersReflectionsDeclarationMod.DeclarationReflectionSerializer {
    def this(owner: Serializer) = this()
  }
  /* static members */
  object DeclarationReflectionSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "DeclarationReflectionSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "DeclarationReflectionSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "ParameterReflectionSerializer")
  @js.native
  class ParameterReflectionSerializer protected ()
    extends typings.typedoc.serializersReflectionsParameterMod.ParameterReflectionSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "ProjectReflectionSerializer")
  @js.native
  class ProjectReflectionSerializer protected ()
    extends typings.typedoc.reflectionsProjectMod.ProjectReflectionSerializer {
    def this(owner: Serializer) = this()
  }
  /* static members */
  object ProjectReflectionSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "ProjectReflectionSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "ProjectReflectionSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "ReferenceReflectionSerializer")
  @js.native
  class ReferenceReflectionSerializer protected ()
    extends typings.typedoc.serializersReflectionsReferenceMod.ReferenceReflectionSerializer {
    def this(owner: Serializer) = this()
  }
  /* static members */
  object ReferenceReflectionSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "ReferenceReflectionSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "ReferenceReflectionSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "ReflectionSerializer")
  @js.native
  class ReflectionSerializer protected ()
    extends typings.typedoc.reflectionsAbstractMod.ReflectionSerializer {
    def this(owner: Serializer) = this()
  }
  /* static members */
  object ReflectionSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "ReflectionSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "ReflectionSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    @scala.inline
    def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "SignatureReflectionSerializer")
  @js.native
  class SignatureReflectionSerializer protected ()
    extends typings.typedoc.serializersReflectionsSignatureMod.SignatureReflectionSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections", "TypeParameterReflectionSerializer")
  @js.native
  class TypeParameterReflectionSerializer protected ()
    extends typings.typedoc.serializersReflectionsTypeParameterMod.TypeParameterReflectionSerializer {
    def this(owner: Serializer) = this()
  }
}
