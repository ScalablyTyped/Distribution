package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebixProxy extends StObject {
  
  @JSName("$proxy")
  var $proxy: Boolean
  
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  def load(view: obj, params: obj): js.Promise[Any] | js.Array[Any] | obj
  
  var result: js.UndefOr[
    js.Function6[
      /* state */ obj, 
      /* view */ obj, 
      /* dp */ obj, 
      /* text */ String, 
      /* data */ obj, 
      /* loader */ obj, 
      Unit
    ]
  ] = js.undefined
  
  var save: js.UndefOr[
    js.Function3[/* view */ obj, /* params */ obj, /* dp */ Any, js.Promise[Any] | obj]
  ] = js.undefined
  
  var saveAll: js.UndefOr[
    js.Function3[/* view */ obj, /* params */ obj, /* dp */ Any, js.Promise[Any] | js.Array[Any]]
  ] = js.undefined
}
object WebixProxy {
  
  inline def apply($proxy: Boolean, load: (obj, obj) => js.Promise[Any] | js.Array[Any] | obj): WebixProxy = {
    val __obj = js.Dynamic.literal($proxy = $proxy.asInstanceOf[js.Any], load = js.Any.fromFunction2(load))
    __obj.asInstanceOf[WebixProxy]
  }
  
  extension [Self <: WebixProxy](x: Self) {
    
    inline def set$proxy(value: Boolean): Self = StObject.set(x, "$proxy", value.asInstanceOf[js.Any])
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setLoad(value: (obj, obj) => js.Promise[Any] | js.Array[Any] | obj): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
    
    inline def setResult(
      value: (/* state */ obj, /* view */ obj, /* dp */ obj, /* text */ String, /* data */ obj, /* loader */ obj) => Unit
    ): Self = StObject.set(x, "result", js.Any.fromFunction6(value))
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setSave(value: (/* view */ obj, /* params */ obj, /* dp */ Any) => js.Promise[Any] | obj): Self = StObject.set(x, "save", js.Any.fromFunction3(value))
    
    inline def setSaveAll(value: (/* view */ obj, /* params */ obj, /* dp */ Any) => js.Promise[Any] | js.Array[Any]): Self = StObject.set(x, "saveAll", js.Any.fromFunction3(value))
    
    inline def setSaveAllUndefined: Self = StObject.set(x, "saveAll", js.undefined)
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
