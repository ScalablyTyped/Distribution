package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var distanceInWords: js.UndefOr[js.Object] = js.undefined
  
  var format: js.UndefOr[js.Object] = js.undefined
}
object Format {
  
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistanceInWords(value: js.Object): Self = StObject.set(x, "distanceInWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceInWordsUndefined: Self = StObject.set(x, "distanceInWords", js.undefined)
    
    @scala.inline
    def setFormat(value: js.Object): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
