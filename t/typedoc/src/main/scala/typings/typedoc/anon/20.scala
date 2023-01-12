package typings.typedoc.anon

import typings.typedoc.typedocStrings.defaultCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var name: defaultCategory
}
object `20` {
  
  inline def apply(): `20` = {
    val __obj = js.Dynamic.literal(name = "defaultCategory")
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `20`] (val x: Self) extends AnyVal {
    
    inline def setName(value: defaultCategory): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
