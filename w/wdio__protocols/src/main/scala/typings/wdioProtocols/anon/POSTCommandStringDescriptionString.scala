package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTCommandStringDescriptionString extends StObject {
  
  var POST: CommandStringDescriptionString
}
object POSTCommandStringDescriptionString {
  
  inline def apply(POST: CommandStringDescriptionString): POSTCommandStringDescriptionString = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTCommandStringDescriptionString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTCommandStringDescriptionString] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: CommandStringDescriptionString): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
