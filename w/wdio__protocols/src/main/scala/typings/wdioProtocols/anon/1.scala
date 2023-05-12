package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var DELETE: CommandDescriptionParametersRefVariables
}
object `1` {
  
  inline def apply(DELETE: CommandDescriptionParametersRefVariables): `1` = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: CommandDescriptionParametersRefVariables): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
  }
}
