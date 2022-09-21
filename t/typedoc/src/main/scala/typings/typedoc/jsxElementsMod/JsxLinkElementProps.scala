package typings.typedoc.jsxElementsMod

import typings.typedoc.typedocStrings.`use-credentials`
import typings.typedoc.typedocStrings.anonymous
import typings.typedoc.typedocStrings.audio
import typings.typedoc.typedocStrings.document
import typings.typedoc.typedocStrings.embed
import typings.typedoc.typedocStrings.fetch
import typings.typedoc.typedocStrings.font
import typings.typedoc.typedocStrings.image
import typings.typedoc.typedocStrings.object_
import typings.typedoc.typedocStrings.script
import typings.typedoc.typedocStrings.style
import typings.typedoc.typedocStrings.track
import typings.typedoc.typedocStrings.video
import typings.typedoc.typedocStrings.worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxLinkElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var as: js.UndefOr[
    audio | document | embed | fetch | font | image | object_ | script | style | track | video | worker
  ] = js.undefined
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials`] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var hreflang: js.UndefOr[String] = js.undefined
  
  var imageSizes: js.UndefOr[String] = js.undefined
  
  var imageSrcset: js.UndefOr[String] = js.undefined
  
  var media: js.UndefOr[String] = js.undefined
  
  var rel: js.UndefOr[String] = js.undefined
  
  var sizes: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object JsxLinkElementProps {
  
  inline def apply(): JsxLinkElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxLinkElementProps]
  }
  
  extension [Self <: JsxLinkElementProps](x: Self) {
    
    inline def setAs(
      value: audio | document | embed | fetch | font | image | object_ | script | style | track | video | worker
    ): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setCrossOrigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
    
    inline def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
    
    inline def setImageSizes(value: String): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
    
    inline def setImageSizesUndefined: Self = StObject.set(x, "imageSizes", js.undefined)
    
    inline def setImageSrcset(value: String): Self = StObject.set(x, "imageSrcset", value.asInstanceOf[js.Any])
    
    inline def setImageSrcsetUndefined: Self = StObject.set(x, "imageSrcset", js.undefined)
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
