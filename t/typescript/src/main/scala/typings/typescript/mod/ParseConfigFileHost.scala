package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseConfigFileHost
  extends ParseConfigHost
     with ConfigFileDiagnosticsReporter {
  def getCurrentDirectory(): java.lang.String = js.native
}

