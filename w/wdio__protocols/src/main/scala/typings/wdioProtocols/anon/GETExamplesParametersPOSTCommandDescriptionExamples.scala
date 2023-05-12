package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETExamplesParametersPOSTCommandDescriptionExamples extends StObject {
  
  var GET: ExamplesParameters
  
  var POST: CommandDescriptionExamples
}
object GETExamplesParametersPOSTCommandDescriptionExamples {
  
  inline def apply(GET: ExamplesParameters, POST: CommandDescriptionExamples): GETExamplesParametersPOSTCommandDescriptionExamples = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETExamplesParametersPOSTCommandDescriptionExamples]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETExamplesParametersPOSTCommandDescriptionExamples] (val x: Self) extends AnyVal {
    
    inline def setGET(value: ExamplesParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: CommandDescriptionExamples): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
