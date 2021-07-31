package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTrackSettingsOptions
  extends StObject
     with ModalDialogOptions {
  
  var persistTextTrackSettings: js.UndefOr[Boolean] = js.undefined
}
object TextTrackSettingsOptions {
  
  @scala.inline
  def apply(): TextTrackSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTrackSettingsOptions]
  }
  
  @scala.inline
  implicit class TextTrackSettingsOptionsMutableBuilder[Self <: TextTrackSettingsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPersistTextTrackSettings(value: Boolean): Self = StObject.set(x, "persistTextTrackSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistTextTrackSettingsUndefined: Self = StObject.set(x, "persistTextTrackSettings", js.undefined)
  }
}
