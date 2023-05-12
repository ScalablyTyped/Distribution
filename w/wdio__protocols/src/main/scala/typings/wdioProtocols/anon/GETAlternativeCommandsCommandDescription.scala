package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETAlternativeCommandsCommandDescription extends StObject {
  
  var GET: AlternativeCommandsCommandDescription
}
object GETAlternativeCommandsCommandDescription {
  
  inline def apply(GET: AlternativeCommandsCommandDescription): GETAlternativeCommandsCommandDescription = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETAlternativeCommandsCommandDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETAlternativeCommandsCommandDescription] (val x: Self) extends AnyVal {
    
    inline def setGET(value: AlternativeCommandsCommandDescription): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
