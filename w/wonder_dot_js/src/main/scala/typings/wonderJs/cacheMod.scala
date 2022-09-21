package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("wonder.js/dist/es2015/definition/typescript/decorator/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cache(judgeFunc: Any, returnCacheValueFunc: Any, setCacheFunc: Any): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("cache")(judgeFunc.asInstanceOf[js.Any], returnCacheValueFunc.asInstanceOf[js.Any], setCacheFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
  
  inline def cacheBufferForBufferContainer(): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheBufferForBufferContainer")().asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
  
  inline def cacheBufferForBufferContainerWithFuncParam(setDataNameFuncName: String): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheBufferForBufferContainerWithFuncParam")(setDataNameFuncName.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
  
  inline def cacheGetter(
    judgeFunc: js.Function0[Boolean],
    returnCacheValueFunc: js.Function0[Any],
    setCacheFunc: js.Function1[/* returnVal */ Any, Unit]
  ): js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheGetter")(judgeFunc.asInstanceOf[js.Any], returnCacheValueFunc.asInstanceOf[js.Any], setCacheFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ Any, /* name */ Any, /* descriptor */ Any, Any]]
}
