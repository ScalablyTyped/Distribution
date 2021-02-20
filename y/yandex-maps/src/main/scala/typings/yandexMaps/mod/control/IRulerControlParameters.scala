package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRulerControlParameters extends StObject {
  
  var data: js.UndefOr[js.Object] = js.native
  
  var options: js.UndefOr[Position] = js.native
  
  var state: js.UndefOr[js.Object] = js.native
}
object IRulerControlParameters {
  
  @scala.inline
  def apply(): IRulerControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRulerControlParameters]
  }
  
  @scala.inline
  implicit class IRulerControlParametersMutableBuilder[Self <: IRulerControlParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setOptions(value: Position): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setState(value: js.Object): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
