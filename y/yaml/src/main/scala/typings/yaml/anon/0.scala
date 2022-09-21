package typings.yaml.anon

import typings.yaml.yamlStrings.`[`
import typings.yaml.yamlStrings.`]`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var end: `]`
  
  var start: `[`
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(end = "]", start = "[")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setEnd(value: `]`): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: `[`): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
