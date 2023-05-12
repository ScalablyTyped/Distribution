package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETDescriptionParametersPOSTExamples extends StObject {
  
  var DELETE: Parameters
  
  var GET: DescriptionParameters
  
  var POST: Examples
}
object GETDescriptionParametersPOSTExamples {
  
  inline def apply(DELETE: Parameters, GET: DescriptionParameters, POST: Examples): GETDescriptionParametersPOSTExamples = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETDescriptionParametersPOSTExamples]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETDescriptionParametersPOSTExamples] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: Parameters): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setGET(value: DescriptionParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: Examples): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
