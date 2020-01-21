package typings.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/definition/typescript/decorator/cache", JSImport.Namespace)
@js.native
object cacheMod extends js.Object {
  def cache(judgeFunc: js.Any, returnCacheValueFunc: js.Any, setCacheFunc: js.Any): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def cacheBufferForBufferContainer(): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def cacheBufferForBufferContainerWithFuncParam(setDataNameFuncName: String): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
  def cacheGetter(
    judgeFunc: js.Function0[Boolean],
    returnCacheValueFunc: js.Function0[_],
    setCacheFunc: js.Function1[/* returnVal */ js.Any, Unit]
  ): js.Function3[/* target */ js.Any, /* name */ js.Any, /* descriptor */ js.Any, _] = js.native
}

