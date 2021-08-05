package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.AudioTrack.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object of option names and values
  *
  * @param [options.kind='']
  *        A valid audio track kind
  *
  * @param [options.id='vjs_track_' + Guid.newGUID()]
  *        A unique id for this AudioTrack.
  *
  * @param [options.label='']
  *        The menu label for this track.
  *
  * @param [options.language='']
  *        A valid two character language code.
  *
  * @param [options.enabled]
  *        If this track is the one that is currently playing. If this track is part of
  *        an {@link AudioTrackList}, only one {@link AudioTrack} will be enabled.
  */
trait AudioTrackOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[Kind] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
}
object AudioTrackOptions {
  
  inline def apply(): AudioTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioTrackOptions]
  }
  
  extension [Self <: AudioTrackOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
