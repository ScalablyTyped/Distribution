package typings.typedoc.anon

import typings.typedoc.typedocStrings.sidebarLinks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  var name: sidebarLinks
}
object `36` {
  
  inline def apply(): `36` = {
    val __obj = js.Dynamic.literal(name = "sidebarLinks")
    __obj.asInstanceOf[`36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `36`] (val x: Self) extends AnyVal {
    
    inline def setName(value: sidebarLinks): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
