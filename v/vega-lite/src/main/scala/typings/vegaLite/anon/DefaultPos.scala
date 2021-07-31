package typings.vegaLite.anon

import typings.vegaLite.vegaLiteStrings.mid
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.xc
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaLite.vegaLiteStrings.yc
import typings.vegaLite.vegaLiteStrings.zeroOrMax
import typings.vegaLite.vegaLiteStrings.zeroOrMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPos extends StObject {
  
  var defaultPos: mid | zeroOrMin | zeroOrMax | Null
  
  var isMidPoint: js.UndefOr[Boolean] = js.undefined
  
  var vgChannel: js.UndefOr[x | y | xc | yc] = js.undefined
}
object DefaultPos {
  
  @scala.inline
  def apply(): DefaultPos = {
    val __obj = js.Dynamic.literal(defaultPos = null)
    __obj.asInstanceOf[DefaultPos]
  }
  
  @scala.inline
  implicit class DefaultPosMutableBuilder[Self <: DefaultPos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPos(value: mid | zeroOrMin | zeroOrMax): Self = StObject.set(x, "defaultPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPosNull: Self = StObject.set(x, "defaultPos", null)
    
    @scala.inline
    def setIsMidPoint(value: Boolean): Self = StObject.set(x, "isMidPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMidPointUndefined: Self = StObject.set(x, "isMidPoint", js.undefined)
    
    @scala.inline
    def setVgChannel(value: typings.vegaLite.vegaLiteStrings.x | y | xc | yc): Self = StObject.set(x, "vgChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVgChannelUndefined: Self = StObject.set(x, "vgChannel", js.undefined)
  }
}
