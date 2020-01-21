package typings.typescript.mod

import typings.typescript.AnonConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "readConfigFile")
@js.native
object readConfigFile extends js.Object {
  def apply(
    fileName: java.lang.String,
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
  ): AnonConfig = js.native
}

