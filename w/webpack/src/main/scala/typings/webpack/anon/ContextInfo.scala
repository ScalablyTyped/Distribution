package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextInfo extends StObject {
  
  /**
  			 * context string path
  			 */
  var context: String
  
  /**
  			 * additional context info for the root module
  			 */
  var contextInfo: js.UndefOr[PartialModuleFactoryCreat] = js.undefined
  
  /**
  			 * dependency used to create Module chain
  			 */
  var dependency: typings.webpack.mod.Dependency
}
object ContextInfo {
  
  inline def apply(context: String, dependency: typings.webpack.mod.Dependency): ContextInfo = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextInfo] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextInfo(value: PartialModuleFactoryCreat): Self = StObject.set(x, "contextInfo", value.asInstanceOf[js.Any])
    
    inline def setContextInfoUndefined: Self = StObject.set(x, "contextInfo", js.undefined)
    
    inline def setDependency(value: typings.webpack.mod.Dependency): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
  }
}
