package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyObject extends StObject {
  
  @JSName("apply")
  var apply: js.Object
}
object ApplyObject {
  
  inline def apply(apply: js.Object): ApplyObject = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplyObject] (val x: Self) extends AnyVal {
    
    inline def setApply(value: js.Object): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
  }
}
