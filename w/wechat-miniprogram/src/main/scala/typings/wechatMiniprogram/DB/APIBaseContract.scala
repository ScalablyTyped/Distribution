package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A contract that all API provider must adhere to
  */
@js.native
trait APIBaseContract[PromiseReturn, CallbackReturn, Param /* <: IAPIParam[_] */, Context] extends StObject {
  
  /**
    * In case of callback-style invocation, this function will be called
    */
  def getCallbackReturn(param: Param, context: Context): CallbackReturn = js.native
  
  def getContext(param: Param): Context = js.native
  
  def getFinalParam[T /* <: Param */](param: Param, context: Context): T = js.native
  
  def run[T /* <: Param */](param: T): js.Promise[PromiseReturn] = js.native
}
object APIBaseContract {
  
  @scala.inline
  def apply[PromiseReturn, CallbackReturn, Param /* <: IAPIParam[_] */, Context](
    getCallbackReturn: (Param, Context) => CallbackReturn,
    getContext: Param => Context,
    getFinalParam: (Param, Context) => js.Any,
    run: js.Any => js.Promise[PromiseReturn]
  ): APIBaseContract[PromiseReturn, CallbackReturn, Param, Context] = {
    val __obj = js.Dynamic.literal(getCallbackReturn = js.Any.fromFunction2(getCallbackReturn), getContext = js.Any.fromFunction1(getContext), getFinalParam = js.Any.fromFunction2(getFinalParam), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[APIBaseContract[PromiseReturn, CallbackReturn, Param, Context]]
  }
  
  @scala.inline
  implicit class APIBaseContractMutableBuilder[Self <: APIBaseContract[_, _, _, _], PromiseReturn, CallbackReturn, Param /* <: IAPIParam[_] */, Context] (val x: Self with (APIBaseContract[PromiseReturn, CallbackReturn, Param, Context])) extends AnyVal {
    
    @scala.inline
    def setGetCallbackReturn(value: (Param, Context) => CallbackReturn): Self = StObject.set(x, "getCallbackReturn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetContext(value: Param => Context): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFinalParam(value: (Param, Context) => js.Any): Self = StObject.set(x, "getFinalParam", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRun(value: js.Any => js.Promise[PromiseReturn]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
