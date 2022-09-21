package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigateToItem extends StObject {
  
  var additionalSpans: js.Array[SpanInfo]
  
  var containerKind: String
  
  var containerName: String
  
  var fileName: String
  
  var kind: String
  
  var kindModifiers: String
  
  var limChar: Double
  
  var matchKind: String
  
  var minChar: Double
  
  var name: String
}
object NavigateToItem {
  
  inline def apply(
    additionalSpans: js.Array[SpanInfo],
    containerKind: String,
    containerName: String,
    fileName: String,
    kind: String,
    kindModifiers: String,
    limChar: Double,
    matchKind: String,
    minChar: Double,
    name: String
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal(additionalSpans = additionalSpans.asInstanceOf[js.Any], containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToItem]
  }
  
  extension [Self <: NavigateToItem](x: Self) {
    
    inline def setAdditionalSpans(value: js.Array[SpanInfo]): Self = StObject.set(x, "additionalSpans", value.asInstanceOf[js.Any])
    
    inline def setAdditionalSpansVarargs(value: SpanInfo*): Self = StObject.set(x, "additionalSpans", js.Array(value*))
    
    inline def setContainerKind(value: String): Self = StObject.set(x, "containerKind", value.asInstanceOf[js.Any])
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setLimChar(value: Double): Self = StObject.set(x, "limChar", value.asInstanceOf[js.Any])
    
    inline def setMatchKind(value: String): Self = StObject.set(x, "matchKind", value.asInstanceOf[js.Any])
    
    inline def setMinChar(value: Double): Self = StObject.set(x, "minChar", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
