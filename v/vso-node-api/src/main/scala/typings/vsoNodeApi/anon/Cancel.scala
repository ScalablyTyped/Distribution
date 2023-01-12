package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel extends StObject {
  
  var cancel: scala.Double
  
  var publish: scala.Double
}
object Cancel {
  
  inline def apply(cancel: scala.Double, publish: scala.Double): Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], publish = publish.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: scala.Double): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setPublish(value: scala.Double): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
  }
}
