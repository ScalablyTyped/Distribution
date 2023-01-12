package typings.typedoc.anon

import typings.typedoc.typedocStrings.navigationLinks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var name: navigationLinks
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal(name = "navigationLinks")
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `14`] (val x: Self) extends AnyVal {
    
    inline def setName(value: navigationLinks): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
