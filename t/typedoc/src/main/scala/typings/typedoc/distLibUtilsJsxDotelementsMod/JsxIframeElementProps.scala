package typings.typedoc.distLibUtilsJsxDotelementsMod

import typings.typedoc.typedocStrings.`no-referrer-when-downgrade`
import typings.typedoc.typedocStrings.`no-referrer`
import typings.typedoc.typedocStrings.`origin-when-cross-origin`
import typings.typedoc.typedocStrings.`same-origin`
import typings.typedoc.typedocStrings.`strict-origin-when-cross-origin`
import typings.typedoc.typedocStrings.`strict-origin`
import typings.typedoc.typedocStrings.`unsafe-url`
import typings.typedoc.typedocStrings.origin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxIframeElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var allow: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var referrerPolicy: js.UndefOr[
    `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
  ] = js.undefined
  
  var sandbox: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var srcdoc: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object JsxIframeElementProps {
  
  inline def apply(): JsxIframeElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsxIframeElementProps]
  }
  
  extension [Self <: JsxIframeElementProps](x: Self) {
    
    inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferrerPolicy(
      value: `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
    ): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSrcdoc(value: String): Self = StObject.set(x, "srcdoc", value.asInstanceOf[js.Any])
    
    inline def setSrcdocUndefined: Self = StObject.set(x, "srcdoc", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
