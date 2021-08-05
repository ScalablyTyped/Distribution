package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Test extends StObject {
  
  var test: js.UndefOr[String] = js.undefined
}
object Test {
  
  inline def apply(): Test = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Test]
  }
  
  extension [Self <: Test](x: Self) {
    
    inline def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
