package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinFontSize extends StObject {
  
  var minFontSize: js.UndefOr[String] = js.undefined
}
object MinFontSize {
  
  inline def apply(): MinFontSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinFontSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinFontSize] (val x: Self) extends AnyVal {
    
    inline def setMinFontSize(value: String): Self = StObject.set(x, "minFontSize", value.asInstanceOf[js.Any])
    
    inline def setMinFontSizeUndefined: Self = StObject.set(x, "minFontSize", js.undefined)
  }
}
