package typings.typedoc.anon

import typings.typedoc.typedocStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  var name: typings.typedoc.typedocStrings.name
}
object `61` {
  
  inline def apply(): `61` = {
    val __obj = js.Dynamic.literal(name = "name")
    __obj.asInstanceOf[`61`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `61`] (val x: Self) extends AnyVal {
    
    inline def setName(value: name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
