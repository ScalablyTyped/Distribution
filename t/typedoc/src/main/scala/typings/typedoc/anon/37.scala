package typings.typedoc.anon

import typings.typedoc.typedocStrings.modifierTags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  var name: modifierTags
}
object `37` {
  
  inline def apply(): `37` = {
    val __obj = js.Dynamic.literal(name = "modifierTags")
    __obj.asInstanceOf[`37`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `37`] (val x: Self) extends AnyVal {
    
    inline def setName(value: modifierTags): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
