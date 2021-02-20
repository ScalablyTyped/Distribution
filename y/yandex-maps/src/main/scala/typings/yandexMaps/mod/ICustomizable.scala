package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomizable extends IEventEmitter {
  
  var options: IOptionManager = js.native
}
object ICustomizable {
  
  @scala.inline
  def apply(events: IEventManager[js.Object], options: IOptionManager): ICustomizable = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomizable]
  }
  
  @scala.inline
  implicit class ICustomizableMutableBuilder[Self <: ICustomizable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: IOptionManager): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
