package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends StObject {
  
  var context: scala.Double = js.native
  
  var fullyQualified: scala.Double = js.native
  
  var webApplication: scala.Double = js.native
}
object Context {
  
  @scala.inline
  def apply(context: scala.Double, fullyQualified: scala.Double, webApplication: scala.Double): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fullyQualified = fullyQualified.asInstanceOf[js.Any], webApplication = webApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: scala.Double): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullyQualified(value: scala.Double): Self = StObject.set(x, "fullyQualified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebApplication(value: scala.Double): Self = StObject.set(x, "webApplication", value.asInstanceOf[js.Any])
  }
}
