package typings.weixinApp.wx

import typings.weixinApp.anon.EncryptedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeRunDataOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_WeRunDataOptions: js.UndefOr[js.Function1[/* res */ EncryptedData, Unit]] = js.native
}
object WeRunDataOptions {
  
  @scala.inline
  def apply(): WeRunDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeRunDataOptions]
  }
  
  @scala.inline
  implicit class WeRunDataOptionsMutableBuilder[Self <: WeRunDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ EncryptedData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
