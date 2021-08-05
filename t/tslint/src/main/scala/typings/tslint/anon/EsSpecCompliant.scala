package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EsSpecCompliant extends StObject {
  
  var esSpecCompliant: Boolean
  
  var multiline: String
  
  var singleline: String
}
object EsSpecCompliant {
  
  inline def apply(esSpecCompliant: Boolean, multiline: String, singleline: String): EsSpecCompliant = {
    val __obj = js.Dynamic.literal(esSpecCompliant = esSpecCompliant.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], singleline = singleline.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsSpecCompliant]
  }
  
  extension [Self <: EsSpecCompliant](x: Self) {
    
    inline def setEsSpecCompliant(value: Boolean): Self = StObject.set(x, "esSpecCompliant", value.asInstanceOf[js.Any])
    
    inline def setMultiline(value: String): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setSingleline(value: String): Self = StObject.set(x, "singleline", value.asInstanceOf[js.Any])
  }
}
