package typings.typedoc.anon

import typings.typedoc.typedocStrings.categorizeByGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  var name: categorizeByGroup
}
object `60` {
  
  inline def apply(): `60` = {
    val __obj = js.Dynamic.literal(name = "categorizeByGroup")
    __obj.asInstanceOf[`60`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `60`] (val x: Self) extends AnyVal {
    
    inline def setName(value: categorizeByGroup): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
