package typings.tokeyCssSelectorParser.astTypesMod

import typings.tokeyCore.typesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NthBase[PART /* <: String */]
  extends StObject
     with Token[PART] {
  
  var after: String
  
  var before: String
  
  var invalid: js.UndefOr[Boolean] = js.undefined
}
object NthBase {
  
  inline def apply[PART /* <: String */](after: String, before: String, end: Double, start: Double, `type`: PART, value: String): NthBase[PART] = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NthBase[PART]]
  }
  
  extension [Self <: NthBase[?], PART /* <: String */](x: Self & NthBase[PART]) {
    
    inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
  }
}
