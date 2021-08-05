package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Svg2JsOptions extends StObject {
  
  /** @default true */
  var lowercase: js.UndefOr[Boolean] = js.undefined
  
  /** @default true */
  var normalize: js.UndefOr[Boolean] = js.undefined
  
  /** @default true */
  var position: js.UndefOr[Boolean] = js.undefined
  
  /** @default true */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /** @default false */
  var trim: js.UndefOr[Boolean] = js.undefined
  
  /** @default true */
  var xmlns: js.UndefOr[Boolean] = js.undefined
}
object Svg2JsOptions {
  
  inline def apply(): Svg2JsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Svg2JsOptions]
  }
  
  extension [Self <: Svg2JsOptions](x: Self) {
    
    inline def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
    
    inline def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
    
    inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    
    inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    inline def setXmlns(value: Boolean): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    inline def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
  }
}
