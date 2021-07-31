package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceInWords extends StObject {
  
  var distanceInWords: js.UndefOr[js.Object] = js.undefined
  
  var format: js.UndefOr[js.Object] = js.undefined
}
object DistanceInWords {
  
  @scala.inline
  def apply(): DistanceInWords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceInWords]
  }
  
  @scala.inline
  implicit class DistanceInWordsMutableBuilder[Self <: DistanceInWords] (val x: Self) extends AnyVal {
    
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
