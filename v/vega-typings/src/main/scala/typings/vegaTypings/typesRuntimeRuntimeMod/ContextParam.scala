package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.vegaTypings.vegaTypingsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextParam
  extends StObject
     with BuiltinParameter {
  
  @JSName("$context")
  var $context: `true`
}
object ContextParam {
  
  inline def apply(): ContextParam = {
    val __obj = js.Dynamic.literal($context = true)
    __obj.asInstanceOf[ContextParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextParam] (val x: Self) extends AnyVal {
    
    inline def set$context(value: `true`): Self = StObject.set(x, "$context", value.asInstanceOf[js.Any])
  }
}
