package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var GET: CommandParameters
}
object `2` {
  
  inline def apply(GET: CommandParameters): `2` = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setGET(value: CommandParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
