package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the result of module resolution.
  * Module resolution will pick up tsx/jsx/js files even if '--jsx' and '--allowJs' are turned off.
  * The Program will then filter results based on these flags.
  *
  * Prefer to return a `ResolvedModuleFull` so that the file type does not have to be inferred.
  */
trait ResolvedModule extends js.Object {
  /** True if `resolvedFileName` comes from `node_modules`. */
  var isExternalLibraryImport: js.UndefOr[scala.Boolean] = js.undefined
  /** Path of the file the module was resolved to. */
  var resolvedFileName: java.lang.String
}

