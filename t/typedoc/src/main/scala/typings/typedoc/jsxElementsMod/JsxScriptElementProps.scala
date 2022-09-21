package typings.typedoc.jsxElementsMod

import typings.typedoc.typedocStrings.`no-referrer-when-downgrade`
import typings.typedoc.typedocStrings.`no-referrer`
import typings.typedoc.typedocStrings.`origin-when-cross-origin`
import typings.typedoc.typedocStrings.`same-origin`
import typings.typedoc.typedocStrings.`strict-origin-when-cross-origin`
import typings.typedoc.typedocStrings.`strict-origin`
import typings.typedoc.typedocStrings.`unsafe-url`
import typings.typedoc.typedocStrings.`use-credentials`
import typings.typedoc.typedocStrings.anonymous
import typings.typedoc.typedocStrings.module
import typings.typedoc.typedocStrings.origin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxScriptElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials`] = js.undefined
  
  var defer: js.UndefOr[Boolean] = js.undefined
  
  var integrity: js.UndefOr[String] = js.undefined
  
  var noModule: js.UndefOr[Boolean] = js.undefined
  
  var referrerPolicy: js.UndefOr[
    `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
  ] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[module | String] = js.undefined
}
object JsxScriptElementProps {
  
  inline def apply(): JsxScriptElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxScriptElementProps]
  }
  
  extension [Self <: JsxScriptElementProps](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCrossOrigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setNoModule(value: Boolean): Self = StObject.set(x, "noModule", value.asInstanceOf[js.Any])
    
    inline def setNoModuleUndefined: Self = StObject.set(x, "noModule", js.undefined)
    
    inline def setReferrerPolicy(
      value: `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
    ): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(value: module | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
