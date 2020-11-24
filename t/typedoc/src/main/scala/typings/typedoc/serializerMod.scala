package typings.typedoc

import typings.typedoc.anon.Begin
import typings.typedoc.modelsMod.ProjectReflection
import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.serializationComponentsMod.SerializerComponent
import typings.typedoc.utilsEventsMod.EventDispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializer", JSImport.Namespace)
@js.native
object serializerMod extends js.Object {
  
  @js.native
  class Serializer () extends EventDispatcher {
    
    def addSerializer(serializer: SerializerComponent[_]): Unit = js.native
    
    var findSerializers: js.Any = js.native
    
    def projectToObject(value: ProjectReflection): ModelToObject[ProjectReflection] = js.native
    def projectToObject(value: ProjectReflection, eventData: Begin): ModelToObject[ProjectReflection] = js.native
    
    var serializers: js.Any = js.native
    
    def toObject[T](value: T): ModelToObject[T] = js.native
    def toObject[T](value: T, init: js.Object): ModelToObject[T] = js.native
  }
  /* static members */
  @js.native
  object Serializer extends js.Object {
    
    var EVENT_BEGIN: String = js.native
    
    var EVENT_END: String = js.native
  }
}
