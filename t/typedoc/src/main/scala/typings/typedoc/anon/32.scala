package typings.typedoc.anon

import typings.typedoc.typedocStrings.searchGroupBoosts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  var name: searchGroupBoosts
}
object `32` {
  
  inline def apply(): `32` = {
    val __obj = js.Dynamic.literal(name = "searchGroupBoosts")
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `32`] (val x: Self) extends AnyVal {
    
    inline def setName(value: searchGroupBoosts): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
