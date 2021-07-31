package typings.vegaLite.anon

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explicit extends StObject {
  
  var explicit: Boolean
  
  var value: String | js.Array[String] | SignalRef
}
object Explicit {
  
  @scala.inline
  def apply(explicit: Boolean, value: String | js.Array[String] | SignalRef): Explicit = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explicit]
  }
  
  @scala.inline
  implicit class ExplicitMutableBuilder[Self <: Explicit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | js.Array[String] | SignalRef): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
