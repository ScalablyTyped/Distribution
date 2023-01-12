package typings.typedoc.anon

import typings.typedoc.typedocStrings.readme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `65` extends StObject {
  
  var name: readme
}
object `65` {
  
  inline def apply(): `65` = {
    val __obj = js.Dynamic.literal(name = "readme")
    __obj.asInstanceOf[`65`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `65`] (val x: Self) extends AnyVal {
    
    inline def setName(value: readme): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
