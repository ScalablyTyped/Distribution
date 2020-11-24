package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xregexp", "isInstalled")
@js.native
object isInstalled extends js.Object {
  
  /**
    * Checks whether an individual optional feature is installed.
    *
    * @param feature - Name of the feature to check. One of:
    *   - `astral`
    *   - `namespacing`
    * @returns Whether the feature is installed.
    * @example
    *
    * XRegExp.isInstalled('astral');
    */
  def apply(feature: Feature): Boolean = js.native
}
