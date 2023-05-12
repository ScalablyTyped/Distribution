package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETExampleReferences extends StObject {
  
  var GET: ExampleReferences
  
  var POST: AlternativeCommands
}
object GETExampleReferences {
  
  inline def apply(GET: ExampleReferences, POST: AlternativeCommands): GETExampleReferences = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETExampleReferences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETExampleReferences] (val x: Self) extends AnyVal {
    
    inline def setGET(value: ExampleReferences): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: AlternativeCommands): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
