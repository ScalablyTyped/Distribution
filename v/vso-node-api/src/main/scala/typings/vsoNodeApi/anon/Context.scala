package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var context: scala.Double
  
  var fullyQualified: scala.Double
  
  var webApplication: scala.Double
}
object Context {
  
  inline def apply(context: scala.Double, fullyQualified: scala.Double, webApplication: scala.Double): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fullyQualified = fullyQualified.asInstanceOf[js.Any], webApplication = webApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    inline def setContext(value: scala.Double): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFullyQualified(value: scala.Double): Self = StObject.set(x, "fullyQualified", value.asInstanceOf[js.Any])
    
    inline def setWebApplication(value: scala.Double): Self = StObject.set(x, "webApplication", value.asInstanceOf[js.Any])
  }
}
