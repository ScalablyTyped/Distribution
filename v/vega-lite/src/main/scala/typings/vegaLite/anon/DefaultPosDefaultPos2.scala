package typings.vegaLite.anon

import typings.vegaLite.vegaLiteStrings.mid
import typings.vegaLite.vegaLiteStrings.zeroOrMax
import typings.vegaLite.vegaLiteStrings.zeroOrMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultPosDefaultPos2 extends StObject {
  
  var defaultPos: zeroOrMin | zeroOrMax | mid = js.native
  
  var defaultPos2: zeroOrMin | zeroOrMax = js.native
}
object DefaultPosDefaultPos2 {
  
  @scala.inline
  def apply(defaultPos: zeroOrMin | zeroOrMax | mid, defaultPos2: zeroOrMin | zeroOrMax): DefaultPosDefaultPos2 = {
    val __obj = js.Dynamic.literal(defaultPos = defaultPos.asInstanceOf[js.Any], defaultPos2 = defaultPos2.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultPosDefaultPos2]
  }
  
  @scala.inline
  implicit class DefaultPosDefaultPos2MutableBuilder[Self <: DefaultPosDefaultPos2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPos(value: zeroOrMin | zeroOrMax | mid): Self = StObject.set(x, "defaultPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPos2(value: zeroOrMin | zeroOrMax): Self = StObject.set(x, "defaultPos2", value.asInstanceOf[js.Any])
  }
}
