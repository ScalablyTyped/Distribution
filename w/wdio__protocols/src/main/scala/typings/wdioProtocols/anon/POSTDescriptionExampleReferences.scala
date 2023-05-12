package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait POSTDescriptionExampleReferences extends StObject {
  
  var POST: DescriptionExampleReferences
}
object POSTDescriptionExampleReferences {
  
  inline def apply(POST: DescriptionExampleReferences): POSTDescriptionExampleReferences = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[POSTDescriptionExampleReferences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: POSTDescriptionExampleReferences] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: DescriptionExampleReferences): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
