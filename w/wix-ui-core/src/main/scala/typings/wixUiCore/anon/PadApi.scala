package typings.wixUiCore.anon

import typings.wixUiCore.signatureInputSignatureInputContextMod.SignaturePadApiContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PadApi extends StObject {
  
  var inputId: js.Any
  
  var padApi: js.Any
  
  def setInputId(inputId: String): Unit
  
  def setSignaturePadContext(padApi: SignaturePadApiContext): Unit
  
  def setSignatureTitleId(titleId: String): Unit
  
  var titleId: js.Any
}
object PadApi {
  
  @scala.inline
  def apply(
    inputId: js.Any,
    padApi: js.Any,
    setInputId: String => Unit,
    setSignaturePadContext: SignaturePadApiContext => Unit,
    setSignatureTitleId: String => Unit,
    titleId: js.Any
  ): PadApi = {
    val __obj = js.Dynamic.literal(inputId = inputId.asInstanceOf[js.Any], padApi = padApi.asInstanceOf[js.Any], setInputId = js.Any.fromFunction1(setInputId), setSignaturePadContext = js.Any.fromFunction1(setSignaturePadContext), setSignatureTitleId = js.Any.fromFunction1(setSignatureTitleId), titleId = titleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PadApi]
  }
  
  @scala.inline
  implicit class PadApiMutableBuilder[Self <: PadApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputId(value: js.Any): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadApi(value: js.Any): Self = StObject.set(x, "padApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetInputId(value: String => Unit): Self = StObject.set(x, "setInputId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSignaturePadContext(value: SignaturePadApiContext => Unit): Self = StObject.set(x, "setSignaturePadContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSignatureTitleId(value: String => Unit): Self = StObject.set(x, "setSignatureTitleId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleId(value: js.Any): Self = StObject.set(x, "titleId", value.asInstanceOf[js.Any])
  }
}
