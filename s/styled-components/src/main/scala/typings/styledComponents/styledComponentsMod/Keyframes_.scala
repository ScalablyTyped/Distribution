package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keyframes_ extends _InterpolationValue {
  
  def getName(): String = js.native
}
object Keyframes_ {
  
  @scala.inline
  def apply(getName: () => String): Keyframes_ = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[Keyframes_]
  }
  
  @scala.inline
  implicit class Keyframes_MutableBuilder[Self <: Keyframes_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
  }
}
