package typings.tsconfigPaths.tsconfigLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TsConfigLoaderParams extends js.Object {
  var cwd: String
  var loadSync: js.UndefOr[
    js.Function2[/* cwd */ String, /* filename */ js.UndefOr[String], TsConfigLoaderResult]
  ] = js.undefined
  def getEnv(key: String): js.UndefOr[String]
}

object TsConfigLoaderParams {
  @scala.inline
  def apply(
    cwd: String,
    getEnv: String => js.UndefOr[String],
    loadSync: (/* cwd */ String, /* filename */ js.UndefOr[String]) => TsConfigLoaderResult = null
  ): TsConfigLoaderParams = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], getEnv = js.Any.fromFunction1(getEnv))
    if (loadSync != null) __obj.updateDynamic("loadSync")(js.Any.fromFunction2(loadSync))
    __obj.asInstanceOf[TsConfigLoaderParams]
  }
}

