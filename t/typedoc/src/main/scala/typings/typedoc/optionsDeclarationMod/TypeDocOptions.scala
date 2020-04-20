package typings.typedoc.optionsDeclarationMod

import typings.std.Exclude
import typings.typedoc.AnonFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap ]: typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] extends std.Record<string, infer U>? std.Exclude<U, string> | keyof typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K] : typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocOptionMap[K]} */
trait TypeDocOptions extends js.Object {
  var categorizeByGroup: Boolean | (Exclude[_, String]) | js.Any
  var categoryOrder: js.Array[String] | (Exclude[_, String]) | js.Any
  var defaultCategory: String | (Exclude[_, String]) | js.Any
  var disableOutputCheck: Boolean | (Exclude[_, String]) | js.Any
  var entryPoint: String | (Exclude[_, String]) | js.Any
  var exclude: js.Array[String] | (Exclude[_, String]) | js.Any
  var excludeExternals: Boolean | (Exclude[_, String]) | js.Any
  var excludeNotExported: Boolean | (Exclude[_, String]) | js.Any
  var excludePrivate: Boolean | (Exclude[_, String]) | js.Any
  var excludeProtected: Boolean | (Exclude[_, String]) | js.Any
  var excludeTags: js.Array[String] | (Exclude[_, String]) | js.Any
  var externalPattern: js.Array[String] | (Exclude[_, String]) | js.Any
  var gaID: String | (Exclude[_, String]) | js.Any
  var gaSite: String | (Exclude[_, String]) | js.Any
  var gitRevision: String | (Exclude[_, String]) | js.Any
  var help: Boolean | (Exclude[_, String]) | js.Any
  var hideGenerator: Boolean | (Exclude[_, String]) | js.Any
  var ignoreCompilerErrors: Boolean | (Exclude[_, String]) | js.Any
  var includeDeclarations: Boolean | (Exclude[_, String]) | js.Any
  var includeVersion: Boolean | (Exclude[_, String]) | js.Any
  var includes: String | (Exclude[_, String]) | js.Any
  var inputFiles: js.Array[String] | (Exclude[_, String]) | js.Any
  var json: String | (Exclude[_, String]) | js.Any
  var listInvalidSymbolLinks: Boolean | (Exclude[_, String]) | js.Any
  var logger: js.Any | (Exclude[_, String])
  var media: String | (Exclude[_, String]) | js.Any
  var mode: AnonFile | (Exclude[_, String]) | js.Any
  var name: String | (Exclude[_, String]) | js.Any
  var options: String | (Exclude[_, String]) | js.Any
  var out: String | (Exclude[_, String]) | js.Any
  var plugin: js.Array[String] | (Exclude[_, String]) | js.Any
  var readme: String | (Exclude[_, String]) | js.Any
  var theme: String | (Exclude[_, String]) | js.Any
  var toc: js.Array[String] | (Exclude[_, String]) | js.Any
  var tsconfig: String | (Exclude[_, String]) | js.Any
  var version: Boolean | (Exclude[_, String]) | js.Any
}

object TypeDocOptions {
  @scala.inline
  def apply(
    categorizeByGroup: Boolean | (Exclude[_, String]) | js.Any,
    categoryOrder: js.Array[String] | (Exclude[_, String]) | js.Any,
    defaultCategory: String | (Exclude[_, String]) | js.Any,
    disableOutputCheck: Boolean | (Exclude[_, String]) | js.Any,
    entryPoint: String | (Exclude[_, String]) | js.Any,
    exclude: js.Array[String] | (Exclude[_, String]) | js.Any,
    excludeExternals: Boolean | (Exclude[_, String]) | js.Any,
    excludeNotExported: Boolean | (Exclude[_, String]) | js.Any,
    excludePrivate: Boolean | (Exclude[_, String]) | js.Any,
    excludeProtected: Boolean | (Exclude[_, String]) | js.Any,
    excludeTags: js.Array[String] | (Exclude[_, String]) | js.Any,
    externalPattern: js.Array[String] | (Exclude[_, String]) | js.Any,
    gaID: String | (Exclude[_, String]) | js.Any,
    gaSite: String | (Exclude[_, String]) | js.Any,
    gitRevision: String | (Exclude[_, String]) | js.Any,
    help: Boolean | (Exclude[_, String]) | js.Any,
    hideGenerator: Boolean | (Exclude[_, String]) | js.Any,
    ignoreCompilerErrors: Boolean | (Exclude[_, String]) | js.Any,
    includeDeclarations: Boolean | (Exclude[_, String]) | js.Any,
    includeVersion: Boolean | (Exclude[_, String]) | js.Any,
    includes: String | (Exclude[_, String]) | js.Any,
    inputFiles: js.Array[String] | (Exclude[_, String]) | js.Any,
    json: String | (Exclude[_, String]) | js.Any,
    listInvalidSymbolLinks: Boolean | (Exclude[_, String]) | js.Any,
    logger: js.Any | (Exclude[_, String]),
    media: String | (Exclude[_, String]) | js.Any,
    mode: AnonFile | (Exclude[_, String]) | js.Any,
    name: String | (Exclude[_, String]) | js.Any,
    options: String | (Exclude[_, String]) | js.Any,
    out: String | (Exclude[_, String]) | js.Any,
    plugin: js.Array[String] | (Exclude[_, String]) | js.Any,
    readme: String | (Exclude[_, String]) | js.Any,
    theme: String | (Exclude[_, String]) | js.Any,
    toc: js.Array[String] | (Exclude[_, String]) | js.Any,
    tsconfig: String | (Exclude[_, String]) | js.Any,
    version: Boolean | (Exclude[_, String]) | js.Any
  ): TypeDocOptions = {
    val __obj = js.Dynamic.literal(categorizeByGroup = categorizeByGroup.asInstanceOf[js.Any], categoryOrder = categoryOrder.asInstanceOf[js.Any], defaultCategory = defaultCategory.asInstanceOf[js.Any], disableOutputCheck = disableOutputCheck.asInstanceOf[js.Any], entryPoint = entryPoint.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], excludeExternals = excludeExternals.asInstanceOf[js.Any], excludeNotExported = excludeNotExported.asInstanceOf[js.Any], excludePrivate = excludePrivate.asInstanceOf[js.Any], excludeProtected = excludeProtected.asInstanceOf[js.Any], excludeTags = excludeTags.asInstanceOf[js.Any], externalPattern = externalPattern.asInstanceOf[js.Any], gaID = gaID.asInstanceOf[js.Any], gaSite = gaSite.asInstanceOf[js.Any], gitRevision = gitRevision.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], hideGenerator = hideGenerator.asInstanceOf[js.Any], ignoreCompilerErrors = ignoreCompilerErrors.asInstanceOf[js.Any], includeDeclarations = includeDeclarations.asInstanceOf[js.Any], includeVersion = includeVersion.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], inputFiles = inputFiles.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], listInvalidSymbolLinks = listInvalidSymbolLinks.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], readme = readme.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], toc = toc.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDocOptions]
  }
}

