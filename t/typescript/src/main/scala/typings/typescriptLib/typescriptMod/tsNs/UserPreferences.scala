package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPreferences extends js.Object {
  val allowTextChangesInNewFiles: js.UndefOr[scala.Boolean] = js.undefined
  val disableSuggestions: js.UndefOr[scala.Boolean] = js.undefined
  /** Determines whether we import `foo/index.ts` as "foo", "foo/index", or "foo/index.js" */
  val importModuleSpecifierEnding: js.UndefOr[
    typescriptLib.typescriptLibStrings.minimal | typescriptLib.typescriptLibStrings.index | typescriptLib.typescriptLibStrings.JS
  ] = js.undefined
  val importModuleSpecifierPreference: js.UndefOr[
    typescriptLib.typescriptLibStrings.relative | typescriptLib.typescriptLibStrings.`non-relative`
  ] = js.undefined
  val includeCompletionsForModuleExports: js.UndefOr[scala.Boolean] = js.undefined
  val includeCompletionsWithInsertText: js.UndefOr[scala.Boolean] = js.undefined
  val providePrefixAndSuffixTextForRename: js.UndefOr[scala.Boolean] = js.undefined
  val quotePreference: js.UndefOr[
    typescriptLib.typescriptLibStrings.auto | typescriptLib.typescriptLibStrings.double | typescriptLib.typescriptLibStrings.single
  ] = js.undefined
}

