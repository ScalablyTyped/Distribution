package typings.typedoc

import typings.std.Partial
import typings.typedoc.distLibSerializationSchemaMod.ModelToObject
import typings.typedoc.distLibSerializationSerializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSerializationComponentsMod {
  
  trait SerializerComponent[T] extends StObject {
    
    /**
      * The priority this serializer should be executed with.
      * A higher priority means the {@link Serializer} will be applied earlier.
      */
    val priority: Double
    
    /**
      * Technically this should return `item is T`, but that doesn't play nicely
      * with inference, so allow the looser `boolean` return type.
      * @param item
      */
    def supports(item: Any): Boolean
    
    def toObject(item: T, obj: Partial[ModelToObject[T]], serializer: Serializer): Partial[ModelToObject[T]]
  }
  object SerializerComponent {
    
    inline def apply[T](
      priority: Double,
      supports: Any => Boolean,
      toObject: (T, Partial[ModelToObject[T]], Serializer) => Partial[ModelToObject[T]]
    ): SerializerComponent[T] = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], supports = js.Any.fromFunction1(supports), toObject = js.Any.fromFunction3(toObject))
      __obj.asInstanceOf[SerializerComponent[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializerComponent[?], T] (val x: Self & SerializerComponent[T]) extends AnyVal {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setSupports(value: Any => Boolean): Self = StObject.set(x, "supports", js.Any.fromFunction1(value))
      
      inline def setToObject(value: (T, Partial[ModelToObject[T]], Serializer) => Partial[ModelToObject[T]]): Self = StObject.set(x, "toObject", js.Any.fromFunction3(value))
    }
  }
}
