package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseConfigFileHost
  extends ParseConfigHost
     with ConfigFileDiagnosticsReporter {
  def getCurrentDirectory(): String = js.native
}

