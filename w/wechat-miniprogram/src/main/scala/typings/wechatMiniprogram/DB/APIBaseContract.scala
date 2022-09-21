package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A contract that all API provider must adhere to
  */
trait APIBaseContract[PromiseReturn, CallbackReturn, Param /* <: IAPIParam[Any] */, Context] extends StObject {
  
  /**
    * In case of callback-style invocation, this function will be called
    */
  def getCallbackReturn(param: Param, context: Context): CallbackReturn
  
  def getContext(param: Param): Context
  
  def getFinalParam[T /* <: Param */](param: Param, context: Context): T
  
  def run[T /* <: Param */](param: T): js.Promise[PromiseReturn]
}
object APIBaseContract {
  
  inline def apply[PromiseReturn, CallbackReturn, Param /* <: IAPIParam[Any] */, Context](
    getCallbackReturn: (Param, Context) => CallbackReturn,
    getContext: Param => Context,
    getFinalParam: (Param, Context) => Any,
    run: Any => js.Promise[PromiseReturn]
  ): APIBaseContract[PromiseReturn, CallbackReturn, Param, Context] = {
    val __obj = js.Dynamic.literal(getCallbackReturn = js.Any.fromFunction2(getCallbackReturn), getContext = js.Any.fromFunction1(getContext), getFinalParam = js.Any.fromFunction2(getFinalParam), run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[APIBaseContract[PromiseReturn, CallbackReturn, Param, Context]]
  }
  
  extension [Self <: APIBaseContract[?, ?, ?, ?], PromiseReturn, CallbackReturn, Param /* <: IAPIParam[Any] */, Context](x: Self & (APIBaseContract[PromiseReturn, CallbackReturn, Param, Context])) {
    
    inline def setGetCallbackReturn(value: (Param, Context) => CallbackReturn): Self = StObject.set(x, "getCallbackReturn", js.Any.fromFunction2(value))
    
    inline def setGetContext(value: Param => Context): Self = StObject.set(x, "getContext", js.Any.fromFunction1(value))
    
    inline def setGetFinalParam(value: (Param, Context) => Any): Self = StObject.set(x, "getFinalParam", js.Any.fromFunction2(value))
    
    inline def setRun(value: Any => js.Promise[PromiseReturn]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
