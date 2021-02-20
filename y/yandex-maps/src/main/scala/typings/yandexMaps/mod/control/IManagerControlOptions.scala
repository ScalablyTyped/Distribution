package typings.yandexMaps.mod.control

import typings.yandexMaps.anon.Bottom
import typings.yandexMaps.yandexMapsStrings.left
import typings.yandexMaps.yandexMapsStrings.none
import typings.yandexMaps.yandexMapsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManagerControlOptions extends StObject {
  
  var float: js.UndefOr[none | left | right] = js.native
  
  var floatIndex: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[Bottom] = js.native
}
object IManagerControlOptions {
  
  @scala.inline
  def apply(): IManagerControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IManagerControlOptions]
  }
  
  @scala.inline
  implicit class IManagerControlOptionsMutableBuilder[Self <: IManagerControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloat(value: none | left | right): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatIndex(value: Double): Self = StObject.set(x, "floatIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatIndexUndefined: Self = StObject.set(x, "floatIndex", js.undefined)
    
    @scala.inline
    def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
    
    @scala.inline
    def setPosition(value: Bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
