package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for value returned from Xrm.Utility.getPageContext()
  * @see {@link https://docs.microsoft.com/powerapps/developer/model-driven-apps/clientapi/reference/xrm-utility/getpagecontext#returns External Link: getPageContext (Client API reference)}
  */
trait PageContext extends StObject {
  
  var input: EntityFormPageContext | EntityListPageContext
}
object PageContext {
  
  inline def apply(input: EntityFormPageContext | EntityListPageContext): PageContext = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageContext] (val x: Self) extends AnyVal {
    
    inline def setInput(value: EntityFormPageContext | EntityListPageContext): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
