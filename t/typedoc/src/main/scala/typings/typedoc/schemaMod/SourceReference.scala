package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.SourceReference, 'fileName' | 'line' | 'character' | 'url'> */
trait SourceReference
  extends StObject
     with __ModelToObject[Any] {
  
  var character: ToSerialized[Double]
  
  var fileName: ToSerialized[String]
  
  var line: ToSerialized[Double]
  
  var url: ToSerialized[js.UndefOr[String]]
}
object SourceReference {
  
  inline def apply(character: ToSerialized[Double], fileName: ToSerialized[String], line: ToSerialized[Double]): SourceReference = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceReference]
  }
  
  extension [Self <: SourceReference](x: Self) {
    
    inline def setCharacter(value: ToSerialized[Double]): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setCharacterVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "character", js.Array(value*))
    
    inline def setFileName(value: ToSerialized[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "fileName", js.Array(value*))
    
    inline def setLine(value: ToSerialized[Double]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "line", js.Array(value*))
    
    inline def setUrl(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrlVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "url", js.Array(value*))
  }
}
