package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationInfo extends StObject {
  
  var classification: TokenClass
  
  var length: Double
}
object ClassificationInfo {
  
  @scala.inline
  def apply(classification: TokenClass, length: Double): ClassificationInfo = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationInfo]
  }
  
  @scala.inline
  implicit class ClassificationInfoMutableBuilder[Self <: ClassificationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassification(value: TokenClass): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
