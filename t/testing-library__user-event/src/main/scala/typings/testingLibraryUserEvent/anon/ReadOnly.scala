package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.testingLibraryUserEventBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOnly extends StObject {
  
  var readOnly: `false`
}
object ReadOnly {
  
  inline def apply(): ReadOnly = {
    val __obj = js.Dynamic.literal(readOnly = false)
    __obj.asInstanceOf[ReadOnly]
  }
  
  extension [Self <: ReadOnly](x: Self) {
    
    inline def setReadOnly(value: `false`): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
  }
}
