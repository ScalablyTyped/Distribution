package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastPage extends StObject {
  
  var currentPage: Double
  
  var lastPage: Double
}
object LastPage {
  
  inline def apply(currentPage: Double, lastPage: Double): LastPage = {
    val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], lastPage = lastPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastPage]
  }
  
  extension [Self <: LastPage](x: Self) {
    
    inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setLastPage(value: Double): Self = StObject.set(x, "lastPage", value.asInstanceOf[js.Any])
  }
}
