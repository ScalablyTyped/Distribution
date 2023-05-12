package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTDescriptionExamples extends StObject {
  
  var POST: DescriptionExamples
}
object POSTDescriptionExamples {
  
  inline def apply(POST: DescriptionExamples): POSTDescriptionExamples = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTDescriptionExamples]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTDescriptionExamples] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: DescriptionExamples): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
