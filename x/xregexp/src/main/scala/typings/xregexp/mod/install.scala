package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "install")
@js.native
object install extends js.Object {
  /**
    * Installs optional features according to the specified options. Can be undone using
    * `XRegExp.uninstall`.
    *
    * @param options - Options object or string.
    * @example
    *
    * // With an options object
    * XRegExp.install({
    *   // Enables support for astral code points in Unicode addons (implicitly sets flag A)
    *   astral: true,
    *
    *   // Adds named capture groups to the `groups` property of matches
    *   namespacing: true
    * });
    *
    * // With an options string
    * XRegExp.install('astral namespacing');
    */
  def apply(options: FeatureOptions): Unit = js.native
}

