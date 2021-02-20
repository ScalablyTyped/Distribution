package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncMethodOptionLike extends StObject {
  
  var success: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
}
object AsyncMethodOptionLike {
  
  @scala.inline
  def apply(): AsyncMethodOptionLike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncMethodOptionLike]
  }
  
  @scala.inline
  implicit class AsyncMethodOptionLikeMutableBuilder[Self <: AsyncMethodOptionLike] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
