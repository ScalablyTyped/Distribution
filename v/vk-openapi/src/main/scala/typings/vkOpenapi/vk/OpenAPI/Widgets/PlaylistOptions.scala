package typings.vkOpenapi.vk.OpenAPI.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistOptions extends StObject {
  
  var width: js.UndefOr[Double] = js.native
}
object PlaylistOptions {
  
  @scala.inline
  def apply(): PlaylistOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistOptions]
  }
  
  @scala.inline
  implicit class PlaylistOptionsMutableBuilder[Self <: PlaylistOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
