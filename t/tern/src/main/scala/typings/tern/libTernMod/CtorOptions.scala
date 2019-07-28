package typings.tern.libTernMod

import org.scalablytyped.runtime.StringDictionary
import typings.tern.ternNumbers.`5`
import typings.tern.ternNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CtorOptions extends js.Object {
  /** The definition objects to load into the server’s environment. */
  var defs: js.UndefOr[js.Array[Def]] = js.undefined
  /** The ECMAScript version to parse. Should be either 5 or 6. Default is 6. */
  var ecmaVersion: js.UndefOr[`5` | `6`] = js.undefined
  /** Indicates the maximum amount of milliseconds to wait for an asynchronous getFile before giving up on it. Defaults to 1000. */
  var fetchTimeout: js.UndefOr[Double] = js.undefined
  /** Specifies the set of plugins that the server should load. The property names of the object name the plugins, and their values hold options that will be passed to them. */
  var plugins: js.UndefOr[StringDictionary[js.Object]] = js.undefined
}

object CtorOptions {
  @scala.inline
  def apply(
    defs: js.Array[Def] = null,
    ecmaVersion: `5` | `6` = null,
    fetchTimeout: Int | Double = null,
    plugins: StringDictionary[js.Object] = null
  ): CtorOptions = {
    val __obj = js.Dynamic.literal()
    if (defs != null) __obj.updateDynamic("defs")(defs)
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (fetchTimeout != null) __obj.updateDynamic("fetchTimeout")(fetchTimeout.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[CtorOptions]
  }
}

