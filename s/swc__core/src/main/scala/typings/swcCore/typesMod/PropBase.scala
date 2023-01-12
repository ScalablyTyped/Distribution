package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropBase
  extends StObject
     with Node {
  
  var key: PropertyName
}
object PropBase {
  
  inline def apply(key: PropertyName, `type`: String): PropBase = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropBase] (val x: Self) extends AnyVal {
    
    inline def setKey(value: PropertyName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
