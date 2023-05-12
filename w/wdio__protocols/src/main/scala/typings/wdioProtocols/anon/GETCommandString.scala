package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETCommandString extends StObject {
  
  var GET: CommandString
}
object GETCommandString {
  
  inline def apply(GET: CommandString): GETCommandString = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETCommandString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETCommandString] (val x: Self) extends AnyVal {
    
    inline def setGET(value: CommandString): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
