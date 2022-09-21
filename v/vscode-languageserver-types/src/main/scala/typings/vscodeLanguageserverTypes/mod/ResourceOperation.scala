package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic resource operation.
  */
trait ResourceOperation extends StObject {
  
  /**
    * An optional annotation identifier describing the operation.
    *
    * @since 3.16.0
    */
  var annotationId: js.UndefOr[ChangeAnnotationIdentifier] = js.undefined
  
  /**
    * The resource operation kind.
    */
  var kind: String
}
object ResourceOperation {
  
  inline def apply(kind: String): ResourceOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceOperation]
  }
  
  extension [Self <: ResourceOperation](x: Self) {
    
    inline def setAnnotationId(value: ChangeAnnotationIdentifier): Self = StObject.set(x, "annotationId", value.asInstanceOf[js.Any])
    
    inline def setAnnotationIdUndefined: Self = StObject.set(x, "annotationId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
