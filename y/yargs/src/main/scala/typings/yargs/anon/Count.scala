package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var count: `true`
}
object Count {
  
  inline def apply(): Count = {
    val __obj = js.Dynamic.literal(count = true)
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: `true`): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
