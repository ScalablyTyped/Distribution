package typings.typedoc

import typings.typedoc.modelsMod.ReferenceReflection
import typings.typedoc.schemaMod.DeclarationReflection
import typings.typedoc.serializationComponentsMod.ReflectionSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersReflectionsReferenceMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/reflections/reference", "ReferenceReflectionSerializer")
  @js.native
  class ReferenceReflectionSerializer protected () extends ReflectionSerializerComponent[ReferenceReflection] {
    def this(owner: Serializer) = this()
    
    def toObject(ref: ReferenceReflection, obj: DeclarationReflection): typings.typedoc.schemaMod.ReferenceReflection = js.native
  }
  /* static members */
  object ReferenceReflectionSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/reference", "ReferenceReflectionSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/reflections/reference", "ReferenceReflectionSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    inline def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
