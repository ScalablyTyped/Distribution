package typings.vegaLite.anon

import typings.vegaLite.vegaLiteStrings.mid
import typings.vegaLite.vegaLiteStrings.zeroOrMax
import typings.vegaLite.vegaLiteStrings.zeroOrMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPos extends StObject {
  
  var defaultPos: zeroOrMin | zeroOrMax | mid
  
  var defaultPos2: zeroOrMin | zeroOrMax
  
  var range: Boolean
}
object DefaultPos {
  
  inline def apply(defaultPos: zeroOrMin | zeroOrMax | mid, defaultPos2: zeroOrMin | zeroOrMax, range: Boolean): DefaultPos = {
    val __obj = js.Dynamic.literal(defaultPos = defaultPos.asInstanceOf[js.Any], defaultPos2 = defaultPos2.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPos]
  }
  
  extension [Self <: DefaultPos](x: Self) {
    
    inline def setDefaultPos(value: zeroOrMin | zeroOrMax | mid): Self = StObject.set(x, "defaultPos", value.asInstanceOf[js.Any])
    
    inline def setDefaultPos2(value: zeroOrMin | zeroOrMax): Self = StObject.set(x, "defaultPos2", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
