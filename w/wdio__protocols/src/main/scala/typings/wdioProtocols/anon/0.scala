package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var POST: CommandDescriptionParameters
}
object `0` {
  
  inline def apply(POST: CommandDescriptionParameters): `0` = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: CommandDescriptionParameters): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
