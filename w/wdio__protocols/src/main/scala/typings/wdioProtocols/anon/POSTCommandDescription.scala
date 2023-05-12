package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTCommandDescription extends StObject {
  
  var POST: CommandDescription
}
object POSTCommandDescription {
  
  inline def apply(POST: CommandDescription): POSTCommandDescription = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTCommandDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTCommandDescription] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: CommandDescription): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
