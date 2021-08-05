package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRun extends StObject {
  
  var firstView: js.Any
}
object TestRun {
  
  inline def apply(firstView: js.Any): TestRun = {
    val __obj = js.Dynamic.literal(firstView = firstView.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRun]
  }
  
  extension [Self <: TestRun](x: Self) {
    
    inline def setFirstView(value: js.Any): Self = StObject.set(x, "firstView", value.asInstanceOf[js.Any])
  }
}
