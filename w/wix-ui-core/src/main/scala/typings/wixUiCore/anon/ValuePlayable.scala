package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuePlayable extends StObject {
  
  var label: String
  
  var value: Playable
}
object ValuePlayable {
  
  @scala.inline
  def apply(label: String, value: Playable): ValuePlayable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuePlayable]
  }
  
  @scala.inline
  implicit class ValuePlayableMutableBuilder[Self <: ValuePlayable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Playable): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
