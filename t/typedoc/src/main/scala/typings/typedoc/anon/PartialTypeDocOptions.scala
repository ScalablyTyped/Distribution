package typings.typedoc.anon

import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptions> */
trait PartialTypeDocOptions extends js.Object {
  var categorizeByGroup: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var categoryOrder: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.undefined
  var defaultCategory: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var disableOutputCheck: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var entryPoint: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var exclude: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.undefined
  var excludeExternals: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var excludeNotExported: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var excludePrivate: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var excludeProtected: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var excludeTags: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.undefined
  var externalPattern: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.undefined
  var gaID: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var gaSite: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var gitRevision: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var help: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var hideGenerator: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var ignoreCompilerErrors: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var includeDeclarations: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var includeVersion: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var includes: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var inputFiles: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.undefined
  var json: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var listInvalidSymbolLinks: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
  var logger: js.UndefOr[js.Any | (Exclude[_, String])] = js.undefined
  var media: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var mode: js.UndefOr[File | (Exclude[_, String]) | js.Any] = js.undefined
  var name: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var options: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var out: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var plugin: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.undefined
  var readme: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var theme: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var toc: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.undefined
  var tsconfig: js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.undefined
  var version: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.undefined
}

object PartialTypeDocOptions {
  @scala.inline
  def apply(
    categorizeByGroup: Boolean | (Exclude[_, String]) | js.Any = null,
    categoryOrder: js.Array[String] | (Exclude[_, String]) | js.Any = null,
    defaultCategory: String | (Exclude[_, String]) | js.Any = null,
    disableOutputCheck: Boolean | (Exclude[_, String]) | js.Any = null,
    entryPoint: String | (Exclude[_, String]) | js.Any = null,
    exclude: js.Array[String] | (Exclude[_, String]) | js.Any = null,
    excludeExternals: Boolean | (Exclude[_, String]) | js.Any = null,
    excludeNotExported: Boolean | (Exclude[_, String]) | js.Any = null,
    excludePrivate: Boolean | (Exclude[_, String]) | js.Any = null,
    excludeProtected: Boolean | (Exclude[_, String]) | js.Any = null,
    excludeTags: js.Array[String] | (Exclude[_, String]) | js.Any = null,
    externalPattern: js.Array[String] | (Exclude[_, String]) | js.Any = null,
    gaID: String | (Exclude[_, String]) | js.Any = null,
    gaSite: String | (Exclude[_, String]) | js.Any = null,
    gitRevision: String | (Exclude[_, String]) | js.Any = null,
    help: Boolean | (Exclude[_, String]) | js.Any = null,
    hideGenerator: Boolean | (Exclude[_, String]) | js.Any = null,
    ignoreCompilerErrors: Boolean | (Exclude[_, String]) | js.Any = null,
    includeDeclarations: Boolean | (Exclude[_, String]) | js.Any = null,
    includeVersion: Boolean | (Exclude[_, String]) | js.Any = null,
    includes: String | (Exclude[_, String]) | js.Any = null,
    inputFiles: js.Array[String] | (Exclude[_, String]) | js.Any = null,
    json: String | (Exclude[_, String]) | js.Any = null,
    listInvalidSymbolLinks: Boolean | (Exclude[_, String]) | js.Any = null,
    logger: js.Any | (Exclude[_, String]) = null,
    media: String | (Exclude[_, String]) | js.Any = null,
    mode: File | (Exclude[_, String]) | js.Any = null,
    name: String | (Exclude[_, String]) | js.Any = null,
    options: String | (Exclude[_, String]) | js.Any = null,
    out: String | (Exclude[_, String]) | js.Any = null,
    plugin: js.Array[String] | (Exclude[_, String]) | js.Any = null,
    readme: String | (Exclude[_, String]) | js.Any = null,
    theme: String | (Exclude[_, String]) | js.Any = null,
    toc: js.Array[String] | (Exclude[_, String]) | js.Any = null,
    tsconfig: String | (Exclude[_, String]) | js.Any = null,
    version: Boolean | (Exclude[_, String]) | js.Any = null
  ): PartialTypeDocOptions = {
    val __obj = js.Dynamic.literal()
    if (categorizeByGroup != null) __obj.updateDynamic("categorizeByGroup")(categorizeByGroup.asInstanceOf[js.Any])
    if (categoryOrder != null) __obj.updateDynamic("categoryOrder")(categoryOrder.asInstanceOf[js.Any])
    if (defaultCategory != null) __obj.updateDynamic("defaultCategory")(defaultCategory.asInstanceOf[js.Any])
    if (disableOutputCheck != null) __obj.updateDynamic("disableOutputCheck")(disableOutputCheck.asInstanceOf[js.Any])
    if (entryPoint != null) __obj.updateDynamic("entryPoint")(entryPoint.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (excludeExternals != null) __obj.updateDynamic("excludeExternals")(excludeExternals.asInstanceOf[js.Any])
    if (excludeNotExported != null) __obj.updateDynamic("excludeNotExported")(excludeNotExported.asInstanceOf[js.Any])
    if (excludePrivate != null) __obj.updateDynamic("excludePrivate")(excludePrivate.asInstanceOf[js.Any])
    if (excludeProtected != null) __obj.updateDynamic("excludeProtected")(excludeProtected.asInstanceOf[js.Any])
    if (excludeTags != null) __obj.updateDynamic("excludeTags")(excludeTags.asInstanceOf[js.Any])
    if (externalPattern != null) __obj.updateDynamic("externalPattern")(externalPattern.asInstanceOf[js.Any])
    if (gaID != null) __obj.updateDynamic("gaID")(gaID.asInstanceOf[js.Any])
    if (gaSite != null) __obj.updateDynamic("gaSite")(gaSite.asInstanceOf[js.Any])
    if (gitRevision != null) __obj.updateDynamic("gitRevision")(gitRevision.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (hideGenerator != null) __obj.updateDynamic("hideGenerator")(hideGenerator.asInstanceOf[js.Any])
    if (ignoreCompilerErrors != null) __obj.updateDynamic("ignoreCompilerErrors")(ignoreCompilerErrors.asInstanceOf[js.Any])
    if (includeDeclarations != null) __obj.updateDynamic("includeDeclarations")(includeDeclarations.asInstanceOf[js.Any])
    if (includeVersion != null) __obj.updateDynamic("includeVersion")(includeVersion.asInstanceOf[js.Any])
    if (includes != null) __obj.updateDynamic("includes")(includes.asInstanceOf[js.Any])
    if (inputFiles != null) __obj.updateDynamic("inputFiles")(inputFiles.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (listInvalidSymbolLinks != null) __obj.updateDynamic("listInvalidSymbolLinks")(listInvalidSymbolLinks.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (readme != null) __obj.updateDynamic("readme")(readme.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (toc != null) __obj.updateDynamic("toc")(toc.asInstanceOf[js.Any])
    if (tsconfig != null) __obj.updateDynamic("tsconfig")(tsconfig.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTypeDocOptions]
  }
}

