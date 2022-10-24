package typings.yarnpkgParsers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var fullName: String
}
object Description {
  
  inline def apply(fullName: String): Description = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
  }
}
