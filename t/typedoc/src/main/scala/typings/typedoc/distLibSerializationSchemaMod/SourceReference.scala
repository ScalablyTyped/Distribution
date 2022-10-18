package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.SourceReference, 'fileName' | 'line' | 'character' | 'url'> */
trait SourceReference extends StObject {
  
  var character: ToSerialized[Double]
  
  var fileName: ToSerialized[String]
  
  var line: ToSerialized[Double]
  
  var url: ToSerialized[js.UndefOr[String]]
}
object SourceReference {
  
  inline def apply(
    character: ToSerialized[Double],
    fileName: ToSerialized[String],
    line: ToSerialized[Double],
    url: ToSerialized[js.UndefOr[String]]
  ): SourceReference = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceReference]
  }
  
  extension [Self <: SourceReference](x: Self) {
    
    inline def setCharacter(value: ToSerialized[Double]): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: ToSerialized[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setLine(value: ToSerialized[Double]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
