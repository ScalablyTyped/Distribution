package typings.typedoc.anon

import typings.typedoc.typedocStrings.cname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var name: cname
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal(name = "cname")
    __obj.asInstanceOf[`39`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `39`] (val x: Self) extends AnyVal {
    
    inline def setName(value: cname): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
