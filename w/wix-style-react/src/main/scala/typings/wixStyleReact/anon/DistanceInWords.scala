package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceInWords extends StObject {
  
  var distanceInWords: js.UndefOr[js.Object] = js.undefined
  
  var format: js.UndefOr[js.Object] = js.undefined
}
object DistanceInWords {
  
  inline def apply(): DistanceInWords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceInWords]
  }
  
  extension [Self <: DistanceInWords](x: Self) {
    
    inline def setDistanceInWords(value: js.Object): Self = StObject.set(x, "distanceInWords", value.asInstanceOf[js.Any])
    
    inline def setDistanceInWordsUndefined: Self = StObject.set(x, "distanceInWords", js.undefined)
    
    inline def setFormat(value: js.Object): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
