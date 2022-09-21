package typings.typedoc.jsxElementsMod

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

trait JsxPortalElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var referrerPolicy: js.UndefOr[
    `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
  ] = js.undefined
  
  var src: String
}
object JsxPortalElementProps {
  
  inline def apply(src: String): JsxPortalElementProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsxPortalElementProps]
  }
  
  extension [Self <: JsxPortalElementProps](x: Self) {
    
    inline def setReferrerPolicy(
      value: `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
    ): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
