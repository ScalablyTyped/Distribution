package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormalParameterInfo extends StObject {
  
  var docComment: String = js.native
  
  var isVariable: Boolean = js.native
  
  var limChar: Double = js.native
  
  var minChar: Double = js.native
  
  var name: String = js.native
}
object FormalParameterInfo {
  
  @scala.inline
  def apply(docComment: String, isVariable: Boolean, limChar: Double, minChar: Double, name: String): FormalParameterInfo = {
    val __obj = js.Dynamic.literal(docComment = docComment.asInstanceOf[js.Any], isVariable = isVariable.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormalParameterInfo]
  }
  
  @scala.inline
  implicit class FormalParameterInfoMutableBuilder[Self <: FormalParameterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocComment(value: String): Self = StObject.set(x, "docComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVariable(value: Boolean): Self = StObject.set(x, "isVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimChar(value: Double): Self = StObject.set(x, "limChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinChar(value: Double): Self = StObject.set(x, "minChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
