package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTDescriptionParameters extends StObject {
  
  var POST: DescriptionParameters
}
object POSTDescriptionParameters {
  
  inline def apply(POST: DescriptionParameters): POSTDescriptionParameters = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTDescriptionParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTDescriptionParameters] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: DescriptionParameters): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
