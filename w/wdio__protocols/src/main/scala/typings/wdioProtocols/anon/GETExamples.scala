package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETExamples extends StObject {
  
  var GET: Examples
}
object GETExamples {
  
  inline def apply(GET: Examples): GETExamples = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETExamples]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETExamples] (val x: Self) extends AnyVal {
    
    inline def setGET(value: Examples): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
