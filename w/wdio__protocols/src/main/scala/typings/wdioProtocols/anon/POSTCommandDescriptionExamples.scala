package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTCommandDescriptionExamples extends StObject {
  
  var GET: DescriptionParameters
  
  var POST: CommandDescriptionExamples
}
object POSTCommandDescriptionExamples {
  
  inline def apply(GET: DescriptionParameters, POST: CommandDescriptionExamples): POSTCommandDescriptionExamples = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTCommandDescriptionExamples]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTCommandDescriptionExamples] (val x: Self) extends AnyVal {
    
    inline def setGET(value: DescriptionParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: CommandDescriptionExamples): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
