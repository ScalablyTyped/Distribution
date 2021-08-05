package typings.typedoc

import typings.typedoc.modelsMod.DeclarationReflection
import typings.typedoc.schemaMod.ContainerReflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionsDeclarationMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/declaration", "DeclarationReflectionSerializer")
  @js.native
  class DeclarationReflectionSerializer protected () extends ReflectionSerializerComponent[DeclarationReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(declaration: DeclarationReflection, obj: ContainerReflection): typings.typedoc.schemaMod.DeclarationReflection = js.native
  }
  /* static members */
  object DeclarationReflectionSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/declaration", "DeclarationReflectionSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/declaration", "DeclarationReflectionSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    inline def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
