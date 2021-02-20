package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IZoomControlParameters extends StObject {
  
  var options: js.UndefOr[`1`] = js.native
}
object IZoomControlParameters {
  
  @scala.inline
  def apply(): IZoomControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IZoomControlParameters]
  }
  
  @scala.inline
  implicit class IZoomControlParametersMutableBuilder[Self <: IZoomControlParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: `1`): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
