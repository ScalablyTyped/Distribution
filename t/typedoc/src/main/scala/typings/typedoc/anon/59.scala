package typings.typedoc.anon

import typings.typedoc.typedocStrings.options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59` extends StObject {
  
  var name: options
}
object `59` {
  
  inline def apply(): `59` = {
    val __obj = js.Dynamic.literal(name = "options")
    __obj.asInstanceOf[`59`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `59`] (val x: Self) extends AnyVal {
    
    inline def setName(value: options): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
