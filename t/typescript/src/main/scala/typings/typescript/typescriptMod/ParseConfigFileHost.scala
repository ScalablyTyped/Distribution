package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface extending ParseConfigHost to support ParseConfigFile that reads config file and reports errors
  */
@js.native
trait ParseConfigFileHost
  extends ParseConfigHost
     with ConfigFileDiagnosticsReporter {
  def getCurrentDirectory(): String = js.native
}

