package typings.wixStyleReact.anon

import typings.color.mod.ColorParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current extends StObject {
  
  var current: typings.color.mod.Color[ColorParam]
  
  var previous: typings.color.mod.Color[ColorParam]
}
object Current {
  
  inline def apply(current: typings.color.mod.Color[ColorParam], previous: typings.color.mod.Color[ColorParam]): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  extension [Self <: Current](x: Self) {
    
    inline def setCurrent(value: typings.color.mod.Color[ColorParam]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: typings.color.mod.Color[ColorParam]): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
