package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Space extends StObject {
  
  var space: Double
}
object Space {
  
  inline def apply(space: Double): Space = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Space]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Space] (val x: Self) extends AnyVal {
    
    inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
