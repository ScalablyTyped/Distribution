package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeProtected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var name: excludeProtected
}
object `30` {
  
  inline def apply(): `30` = {
    val __obj = js.Dynamic.literal(name = "excludeProtected")
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `30`] (val x: Self) extends AnyVal {
    
    inline def setName(value: excludeProtected): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
