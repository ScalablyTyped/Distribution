package typings.typedoc.anon

import typings.typedoc.typedocStrings.searchInComments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54` extends StObject {
  
  var name: searchInComments
}
object `54` {
  
  inline def apply(): `54` = {
    val __obj = js.Dynamic.literal(name = "searchInComments")
    __obj.asInstanceOf[`54`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `54`] (val x: Self) extends AnyVal {
    
    inline def setName(value: searchInComments): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
