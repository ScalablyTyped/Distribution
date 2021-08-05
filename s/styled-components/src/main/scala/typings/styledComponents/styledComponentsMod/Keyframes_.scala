package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyframes_
  extends StObject
     with _InterpolationValue {
  
  def getName(): String
}
object Keyframes_ {
  
  inline def apply(getName: () => String): Keyframes_ = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[Keyframes_]
  }
  
  extension [Self <: Keyframes_](x: Self) {
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
  }
}
