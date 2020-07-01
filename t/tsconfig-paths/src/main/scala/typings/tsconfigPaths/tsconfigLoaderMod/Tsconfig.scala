package typings.tsconfigPaths.tsconfigLoaderMod

import typings.tsconfigPaths.anon.BaseUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tsconfig extends js.Object {
  var compilerOptions: js.UndefOr[BaseUrl] = js.undefined
  var `extends`: js.UndefOr[String] = js.undefined
}

object Tsconfig {
  @scala.inline
  def apply(compilerOptions: BaseUrl = null, `extends`: String = null): Tsconfig = {
    val __obj = js.Dynamic.literal()
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tsconfig]
  }
}

