package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "uninstall")
@js.native
object uninstall extends js.Object {
  /**
    * Uninstalls optional features according to the specified options. All optional features start out
    * uninstalled, so this is used to undo the actions of `XRegExp.install`.
    *
    * @param options - Options object or string.
    * @example
    *
    * // With an options object
    * XRegExp.uninstall({
    *   // Disables support for astral code points in Unicode addons
    *   astral: true,
    *
    *   // Don't add named capture groups to the `groups` property of matches
    *   namespacing: true
    * });
    *
    * // With an options string
    * XRegExp.uninstall('astral namespacing');
    */
  def apply(options: FeatureOptions): Unit = js.native
}

