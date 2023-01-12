package typings.typedoc.anon

import typings.typedoc.typedocStrings.showConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  var name: showConfig
}
object `31` {
  
  inline def apply(): `31` = {
    val __obj = js.Dynamic.literal(name = "showConfig")
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `31`] (val x: Self) extends AnyVal {
    
    inline def setName(value: showConfig): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
