package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRun extends StObject {
  
  var firstView: Any
}
object TestRun {
  
  inline def apply(firstView: Any): TestRun = {
    val __obj = js.Dynamic.literal(firstView = firstView.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRun]
  }
  
  extension [Self <: TestRun](x: Self) {
    
    inline def setFirstView(value: Any): Self = StObject.set(x, "firstView", value.asInstanceOf[js.Any])
  }
}
