package typings.wxJsSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  /**
    * iOS微信6.5.3及其之后的版本 window.__wxjs_is_wkwebview 为true时是使用WKWebview，为 false或者 “undefine”时是 UIWebview
    */
  var __wxjs_is_wkwebview: js.UndefOr[Boolean] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def set__wxjs_is_wkwebview(value: Boolean): Self = StObject.set(x, "__wxjs_is_wkwebview", value.asInstanceOf[js.Any])
    
    inline def set__wxjs_is_wkwebviewUndefined: Self = StObject.set(x, "__wxjs_is_wkwebview", js.undefined)
  }
}
