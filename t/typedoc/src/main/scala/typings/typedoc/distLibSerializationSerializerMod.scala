package typings.typedoc

import typings.typedoc.anon.Begin
import typings.typedoc.anon.ToObject
import typings.typedoc.distLibModelsMod.ProjectReflection
import typings.typedoc.distLibSerializationComponentsMod.SerializerComponent
import typings.typedoc.distLibSerializationSchemaMod.ModelToObject
import typings.typedoc.distLibUtilsMod.EventDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSerializationSerializerMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializer", "Serializer")
  @js.native
  open class Serializer () extends EventDispatcher {
    
    def addSerializer(serializer: SerializerComponent[Any]): Unit = js.native
    
    /**
      * Same as toObject but emits {@link Serializer.EVENT_BEGIN} and {@link Serializer.EVENT_END} events.
      * @param value
      * @param eventData Partial information to set in the event
      */
    def projectToObject(value: ProjectReflection): ModelToObject[ProjectReflection] = js.native
    def projectToObject(value: ProjectReflection, eventData: Begin): ModelToObject[ProjectReflection] = js.native
    
    /* private */ var serializers: Any = js.native
    
    def toObject[T /* <: ToObject[T] */](): js.UndefOr[ModelToObject[T]] = js.native
    def toObject[T /* <: ToObject[T] */](value: T): ModelToObject[T] = js.native
    @JSName("toObject")
    def toObject_T_Union[T /* <: ToObject[T] */](value: T): js.UndefOr[ModelToObject[T]] = js.native
    
    def toObjectsOptional[T /* <: ToObject[T] */](): js.UndefOr[js.Array[ModelToObject[T]]] = js.native
    def toObjectsOptional[T /* <: ToObject[T] */](value: js.Array[T]): js.UndefOr[js.Array[ModelToObject[T]]] = js.native
  }
  /* static members */
  object Serializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializer", "Serializer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Triggered when the {@link Serializer} begins transforming a project.
      * @event EVENT_BEGIN
      */
    @JSImport("typedoc/dist/lib/serialization/serializer", "Serializer.EVENT_BEGIN")
    @js.native
    def EVENT_BEGIN: String = js.native
    inline def EVENT_BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_BEGIN")(x.asInstanceOf[js.Any])
    
    /**
      * Triggered when the {@link Serializer} has finished transforming a project.
      * @event EVENT_END
      */
    @JSImport("typedoc/dist/lib/serialization/serializer", "Serializer.EVENT_END")
    @js.native
    def EVENT_END: String = js.native
    inline def EVENT_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_END")(x.asInstanceOf[js.Any])
  }
}
