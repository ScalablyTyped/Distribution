package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTDescriptionString extends StObject {
  
  var POST: DescriptionString
}
object POSTDescriptionString {
  
  inline def apply(POST: DescriptionString): POSTDescriptionString = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTDescriptionString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTDescriptionString] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: DescriptionString): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
