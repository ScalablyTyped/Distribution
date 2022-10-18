package typings.typedoc.distLibUtilsJsxDotelementsMod

import typings.typedoc.typedocStrings._blank
import typings.typedoc.typedocStrings._parent
import typings.typedoc.typedocStrings._self
import typings.typedoc.typedocStrings._top
import typings.typedoc.typedocStrings.circle
import typings.typedoc.typedocStrings.default
import typings.typedoc.typedocStrings.poly
import typings.typedoc.typedocStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxAreaElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var alt: js.UndefOr[String] = js.undefined
  
  var coords: js.UndefOr[String] = js.undefined
  
  var download: js.UndefOr[String] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var hreflang: js.UndefOr[String] = js.undefined
  
  var ping: js.UndefOr[String] = js.undefined
  
  var referrerPolicy: js.UndefOr[String] = js.undefined
  
  var rel: js.UndefOr[String] = js.undefined
  
  var shape: js.UndefOr[rect | circle | poly | default] = js.undefined
  
  var target: js.UndefOr[_self | _blank | _parent | _top] = js.undefined
}
object JsxAreaElementProps {
  
  inline def apply(): JsxAreaElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxAreaElementProps]
  }
  
  extension [Self <: JsxAreaElementProps](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
    
    inline def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
    
    inline def setPing(value: String): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    inline def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
    
    inline def setReferrerPolicy(value: String): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setShape(value: rect | circle | poly | default): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setTarget(value: _self | _blank | _parent | _top): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
