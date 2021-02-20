package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurPercent extends StObject {
  
  var curPercent: Double = js.native
}
object CurPercent {
  
  @scala.inline
  def apply(curPercent: Double): CurPercent = {
    val __obj = js.Dynamic.literal(curPercent = curPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurPercent]
  }
  
  @scala.inline
  implicit class CurPercentMutableBuilder[Self <: CurPercent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurPercent(value: Double): Self = StObject.set(x, "curPercent", value.asInstanceOf[js.Any])
  }
}
