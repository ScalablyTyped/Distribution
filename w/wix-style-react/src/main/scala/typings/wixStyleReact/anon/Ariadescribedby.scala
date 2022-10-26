package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ariadescribedby extends StObject {
  
  var `aria-describedby`: Any
}
object Ariadescribedby {
  
  inline def apply(`aria-describedby`: Any): Ariadescribedby = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariadescribedby]
  }
  
  extension [Self <: Ariadescribedby](x: Self) {
    
    inline def `setAria-describedby`(value: Any): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
  }
}
