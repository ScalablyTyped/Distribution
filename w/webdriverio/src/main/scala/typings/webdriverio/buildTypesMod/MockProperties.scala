package typings.webdriverio.buildTypesMod

import typings.webdriverio.buildUtilsInterceptionTypesMod.Matches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<webdriverio.webdriverio/build/utils/interception/devtools.default, 'calls'> */
trait MockProperties extends StObject {
  
  var calls: js.Array[Matches] | js.Promise[js.Array[Matches]]
}
object MockProperties {
  
  inline def apply(calls: js.Array[Matches] | js.Promise[js.Array[Matches]]): MockProperties = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockProperties]
  }
  
  extension [Self <: MockProperties](x: Self) {
    
    inline def setCalls(value: js.Array[Matches] | js.Promise[js.Array[Matches]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsVarargs(value: Matches*): Self = StObject.set(x, "calls", js.Array(value*))
  }
}
