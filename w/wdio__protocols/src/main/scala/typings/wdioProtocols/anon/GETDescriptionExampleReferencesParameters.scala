package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETDescriptionExampleReferencesParameters extends StObject {
  
  var GET: DescriptionExampleReferencesParameters
}
object GETDescriptionExampleReferencesParameters {
  
  inline def apply(GET: DescriptionExampleReferencesParameters): GETDescriptionExampleReferencesParameters = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETDescriptionExampleReferencesParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETDescriptionExampleReferencesParameters] (val x: Self) extends AnyVal {
    
    inline def setGET(value: DescriptionExampleReferencesParameters): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
