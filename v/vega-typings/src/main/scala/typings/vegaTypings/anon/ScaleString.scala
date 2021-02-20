package typings.vegaTypings.anon

import typings.vegaTypings.onEventsMod._EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleString extends _EventListener {
  
  var scale: String = js.native
}
object ScaleString {
  
  @scala.inline
  def apply(scale: String): ScaleString = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleString]
  }
  
  @scala.inline
  implicit class ScaleStringMutableBuilder[Self <: ScaleString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
