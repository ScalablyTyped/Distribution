package typings.stripe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObject extends StObject {
  
  var `object`: String = js.native
}
object IObject {
  
  @scala.inline
  def apply(`object`: String): IObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObject]
  }
  
  @scala.inline
  implicit class IObjectMutableBuilder[Self <: IObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
