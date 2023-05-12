package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var POST: CommandDescriptionExamples
}
object `3` {
  
  inline def apply(POST: CommandDescriptionExamples): `3` = {
    val __obj = js.Dynamic.literal(POST = POST.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setPOST(value: CommandDescriptionExamples): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
  }
}
