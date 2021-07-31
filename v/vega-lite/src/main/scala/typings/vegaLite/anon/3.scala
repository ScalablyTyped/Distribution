package typings.vegaLite.anon

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var description: SignalRef | ValueString
}
object `3` {
  
  @scala.inline
  def apply(description: SignalRef | ValueString): `3` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: SignalRef | ValueString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
