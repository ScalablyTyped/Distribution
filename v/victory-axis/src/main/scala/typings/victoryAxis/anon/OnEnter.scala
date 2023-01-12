package typings.victoryAxis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEnter extends StObject {
  
  var onEnter: Duration
  
  var onExit: Duration
}
object OnEnter {
  
  inline def apply(onEnter: Duration, onExit: Duration): OnEnter = {
    val __obj = js.Dynamic.literal(onEnter = onEnter.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEnter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnEnter] (val x: Self) extends AnyVal {
    
    inline def setOnEnter(value: Duration): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    inline def setOnExit(value: Duration): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
  }
}
