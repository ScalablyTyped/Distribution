package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationChangeEvent extends js.Object {
  
  /**
    * Checks if the given section has changed.
    * If scope is provided, checks if the section has changed for resources under the given scope.
    *
    * @param section Configuration name, supports _dotted_ names.
    * @param scope A scope in which to check.
    * @return `true` if the given section has changed.
    */
  def affectsConfiguration(section: String): Boolean = js.native
  def affectsConfiguration(section: String, scope: ConfigurationScope): Boolean = js.native
}
