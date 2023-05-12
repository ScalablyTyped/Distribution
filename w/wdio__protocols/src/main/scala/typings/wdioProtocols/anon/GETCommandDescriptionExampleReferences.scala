package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GETCommandDescriptionExampleReferences extends StObject {
  
  var GET: CommandDescriptionExampleReferences
}
object GETCommandDescriptionExampleReferences {
  
  inline def apply(GET: CommandDescriptionExampleReferences): GETCommandDescriptionExampleReferences = {
    val __obj = js.Dynamic.literal(GET = GET.asInstanceOf[js.Any])
    __obj.asInstanceOf[GETCommandDescriptionExampleReferences]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GETCommandDescriptionExampleReferences] (val x: Self) extends AnyVal {
    
    inline def setGET(value: CommandDescriptionExampleReferences): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
  }
}
