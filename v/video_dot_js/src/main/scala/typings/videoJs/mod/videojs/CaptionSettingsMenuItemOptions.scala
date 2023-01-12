package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.TextTrack.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionSettingsMenuItemOptions
  extends StObject
     with TextTrackMenuItemOptions {
  
  var kind: Kind
}
object CaptionSettingsMenuItemOptions {
  
  inline def apply(kind: Kind, track: TextTrack): CaptionSettingsMenuItemOptions = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsMenuItemOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaptionSettingsMenuItemOptions] (val x: Self) extends AnyVal {
    
    inline def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
