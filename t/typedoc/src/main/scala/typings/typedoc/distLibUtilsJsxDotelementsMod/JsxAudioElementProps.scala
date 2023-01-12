package typings.typedoc.distLibUtilsJsxDotelementsMod

import typings.typedoc.typedocStrings._empty
import typings.typedoc.typedocStrings.`use-credentials`
import typings.typedoc.typedocStrings.anonymous
import typings.typedoc.typedocStrings.auto
import typings.typedoc.typedocStrings.metadata
import typings.typedoc.typedocStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxAudioElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  var controls: js.UndefOr[Boolean] = js.undefined
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials`] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var muted: js.UndefOr[Boolean] = js.undefined
  
  var preload: js.UndefOr[none | metadata | auto | _empty] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
}
object JsxAudioElementProps {
  
  inline def apply(): JsxAudioElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxAudioElementProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsxAudioElementProps] (val x: Self) extends AnyVal {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setCrossOrigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setPreload(value: none | metadata | auto | _empty): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
