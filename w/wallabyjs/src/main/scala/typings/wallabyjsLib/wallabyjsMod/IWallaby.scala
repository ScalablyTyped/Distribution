package typings
package wallabyjsLib.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallaby extends js.Object {
  var compilers: js.UndefOr[IWallabyBuiltInCompilers] = js.undefined
  var defaults: js.UndefOr[js.Any] = js.undefined
  var localProjectDir: js.UndefOr[java.lang.String] = js.undefined
  var projectCacheDir: js.UndefOr[java.lang.String] = js.undefined
}

object IWallaby {
  @scala.inline
  def apply(
    compilers: IWallabyBuiltInCompilers = null,
    defaults: js.Any = null,
    localProjectDir: java.lang.String = null,
    projectCacheDir: java.lang.String = null
  ): IWallaby = {
    val __obj = js.Dynamic.literal()
    if (compilers != null) __obj.updateDynamic("compilers")(compilers)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (localProjectDir != null) __obj.updateDynamic("localProjectDir")(localProjectDir)
    if (projectCacheDir != null) __obj.updateDynamic("projectCacheDir")(projectCacheDir)
    __obj.asInstanceOf[IWallaby]
  }
}

