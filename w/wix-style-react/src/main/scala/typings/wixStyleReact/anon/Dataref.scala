package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dataref
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var className: Any
  
  var `data-ref`: Any
}
object Dataref {
  
  inline def apply(className: Any, `data-ref`: Any): Dataref = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    __obj.updateDynamic("data-ref")(`data-ref`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataref]
  }
  
  extension [Self <: Dataref](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def `setData-ref`(value: Any): Self = StObject.set(x, "data-ref", value.asInstanceOf[js.Any])
  }
}
