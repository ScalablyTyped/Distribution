package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("wonder.js/dist/es2015/definition/typescript/decorator/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cache(judgeFunc: js.Any, returnCacheValueFunc: js.Any, setCacheFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("cache")(judgeFunc.asInstanceOf[js.Any], returnCacheValueFunc.asInstanceOf[js.Any], setCacheFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @scala.inline
  def cacheBufferForBufferContainer(): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheBufferForBufferContainer")().asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @scala.inline
  def cacheBufferForBufferContainerWithFuncParam(setDataNameFuncName: String): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheBufferForBufferContainerWithFuncParam")(setDataNameFuncName.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @scala.inline
  def cacheGetter(
    judgeFunc: js.Function0[Boolean],
    returnCacheValueFunc: js.Function0[js.Any],
    setCacheFunc: js.Function1[/* returnVal */ js.Any, Unit]
  ): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("cacheGetter")(judgeFunc.asInstanceOf[js.Any], returnCacheValueFunc.asInstanceOf[js.Any], setCacheFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, js.Any]]
}
