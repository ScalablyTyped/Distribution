package typings.typedoc.anon

import typings.typedoc.distLibSerializationSchemaMod.ModelToObject
import typings.typedoc.distLibSerializationSerializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToObject[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {toObject (serializer : typedoc.typedoc/dist/lib/serialization/serializer.Serializer): typedoc.typedoc/dist/lib/serialization/schema.ModelToObject<T>} */ js.Any */] extends StObject {
  
  def toObject(serializer: Serializer): ModelToObject[T]
}
object ToObject {
  
  inline def apply[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {toObject (serializer : typedoc.typedoc/dist/lib/serialization/serializer.Serializer): typedoc.typedoc/dist/lib/serialization/schema.ModelToObject<T>} */ js.Any */](toObject: Serializer => ModelToObject[T]): ToObject[T] = {
    val __obj = js.Dynamic.literal(toObject = js.Any.fromFunction1(toObject))
    __obj.asInstanceOf[ToObject[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToObject[?], T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {toObject (serializer : typedoc.typedoc/dist/lib/serialization/serializer.Serializer): typedoc.typedoc/dist/lib/serialization/schema.ModelToObject<T>} */ js.Any */] (val x: Self & ToObject[T]) extends AnyVal {
    
    inline def setToObject(value: Serializer => ModelToObject[T]): Self = StObject.set(x, "toObject", js.Any.fromFunction1(value))
  }
}
