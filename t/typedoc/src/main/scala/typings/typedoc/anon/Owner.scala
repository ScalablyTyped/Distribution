package typings.typedoc.anon

import typings.typedoc.modelsMod.ReferenceType
import typings.typedoc.modelsMod.Reflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Owner extends StObject {
  
  var owner: Reflection
  
  var `type`: ReferenceType
}
object Owner {
  
  inline def apply(owner: Reflection, `type`: ReferenceType): Owner = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Owner]
  }
  
  extension [Self <: Owner](x: Self) {
    
    inline def setOwner(value: Reflection): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setType(value: ReferenceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
