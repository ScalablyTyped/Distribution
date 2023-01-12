package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientScriptContent
  extends StObject
     with ClientScriptCommon
     with ClientScript {
  
  var content: js.UndefOr[String] = js.undefined
}
object ClientScriptContent {
  
  inline def apply(): ClientScriptContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientScriptContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientScriptContent] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
