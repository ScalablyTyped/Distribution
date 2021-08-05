package typings.typedoc

import typings.typedoc.anon.Begin
import typings.typedoc.libUtilsMod.EventDispatcher
import typings.typedoc.modelsMod.ProjectReflection
import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.serializationComponentsMod.SerializerComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializer", "Serializer")
  @js.native
  class Serializer () extends EventDispatcher {
    
    def addSerializer(serializer: SerializerComponent[js.Any]): Unit = js.native
    
    /* private */ var findSerializers: js.Any = js.native
    
    def projectToObject(value: ProjectReflection): ModelToObject[ProjectReflection] = js.native
    def projectToObject(value: ProjectReflection, eventData: Begin): ModelToObject[ProjectReflection] = js.native
    
    /* private */ var serializers: js.Any = js.native
    
    def toObject[T](value: T): ModelToObject[T] = js.native
    def toObject[T](value: T, init: js.Object): ModelToObject[T] = js.native
  }
  /* static members */
  object Serializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializer", "Serializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializer", "Serializer.EVENT_BEGIN")
    @js.native
    def EVENT_BEGIN: String = js.native
    inline def EVENT_BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_BEGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/serialization/serializer", "Serializer.EVENT_END")
    @js.native
    def EVENT_END: String = js.native
    inline def EVENT_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_END")(x.asInstanceOf[js.Any])
  }
}
