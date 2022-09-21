package typings.typedoc.anon

import typings.typedoc.typedocStrings.searchCategoryBoosts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: searchCategoryBoosts
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal(name = "searchCategoryBoosts")
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: searchCategoryBoosts): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
