package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.countpattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountPatternTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  
  var `case`: js.UndefOr[String | SignalRef] = js.undefined
  
  var field: FieldRef
  
  var pattern: js.UndefOr[String | SignalRef] = js.undefined
  
  var stopwords: js.UndefOr[String | SignalRef] = js.undefined
  
  var `type`: countpattern
}
object CountPatternTransform {
  
  inline def apply(field: FieldRef): CountPatternTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("countpattern")
    __obj.asInstanceOf[CountPatternTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountPatternTransform] (val x: Self) extends AnyVal {
    
    inline def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setCase(value: String | SignalRef): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
    
    inline def setCaseUndefined: Self = StObject.set(x, "case", js.undefined)
    
    inline def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String | SignalRef): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setStopwords(value: String | SignalRef): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
    
    inline def setStopwordsUndefined: Self = StObject.set(x, "stopwords", js.undefined)
    
    inline def setType(value: countpattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
