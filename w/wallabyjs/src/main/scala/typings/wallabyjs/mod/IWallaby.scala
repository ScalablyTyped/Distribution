package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallaby extends js.Object {
  var compilers: js.UndefOr[IWallabyBuiltInCompilers] = js.undefined
  var defaults: js.UndefOr[js.Any] = js.undefined
  var localProjectDir: js.UndefOr[String] = js.undefined
  var projectCacheDir: js.UndefOr[String] = js.undefined
}

object IWallaby {
  @scala.inline
  def apply(
    compilers: IWallabyBuiltInCompilers = null,
    defaults: js.Any = null,
    localProjectDir: String = null,
    projectCacheDir: String = null
  ): IWallaby = {
    val __obj = js.Dynamic.literal()
    if (compilers != null) __obj.updateDynamic("compilers")(compilers.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (localProjectDir != null) __obj.updateDynamic("localProjectDir")(localProjectDir.asInstanceOf[js.Any])
    if (projectCacheDir != null) __obj.updateDynamic("projectCacheDir")(projectCacheDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallaby]
  }
}

