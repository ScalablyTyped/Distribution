package typings.tsconfigPaths.tsconfigLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tsconfig-paths/lib/tsconfig-loader", "loadTsconfig")
@js.native
object loadTsconfig extends js.Object {
  def apply(configFilePath: String): js.UndefOr[Tsconfig] = js.native
  def apply(
    configFilePath: String,
    existsSync: js.UndefOr[scala.Nothing],
    readFileSync: js.Function1[/* filename */ String, String]
  ): js.UndefOr[Tsconfig] = js.native
  def apply(configFilePath: String, existsSync: js.Function1[/* path */ String, Boolean]): js.UndefOr[Tsconfig] = js.native
  def apply(
    configFilePath: String,
    existsSync: js.Function1[/* path */ String, Boolean],
    readFileSync: js.Function1[/* filename */ String, String]
  ): js.UndefOr[Tsconfig] = js.native
}

