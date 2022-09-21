package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollapsedText extends StObject {
  
  /**
    * If set, the client signals that it supports setting collapsedText on
    * folding ranges to display custom labels instead of the default text.
    *
    * @since 3.17.0
    */
  var collapsedText: js.UndefOr[Boolean] = js.undefined
}
object CollapsedText {
  
  inline def apply(): CollapsedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsedText]
  }
  
  extension [Self <: CollapsedText](x: Self) {
    
    inline def setCollapsedText(value: Boolean): Self = StObject.set(x, "collapsedText", value.asInstanceOf[js.Any])
    
    inline def setCollapsedTextUndefined: Self = StObject.set(x, "collapsedText", js.undefined)
  }
}
