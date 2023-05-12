package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface extending ParseConfigHost to support ParseConfigFile that reads config file and reports errors
  */
@js.native
trait ParseConfigFileHost
  extends StObject
     with ParseConfigHost
     with ConfigFileDiagnosticsReporter {
  
  def getCurrentDirectory(): java.lang.String = js.native
}
