package typings.typedoc.optionsDeclarationMod

import typings.typedoc.AnonFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeDocOptionMap extends js.Object {
  var categorizeByGroup: Boolean
  var categoryOrder: js.Array[String]
  var defaultCategory: String
  var disableOutputCheck: Boolean
  var entryPoint: String
  var exclude: js.Array[String]
  var excludeExternals: Boolean
  var excludeNotExported: Boolean
  var excludePrivate: Boolean
  var excludeProtected: Boolean
  var excludeTags: js.Array[String]
  var externalPattern: js.Array[String]
  var gaID: String
  var gaSite: String
  var gitRevision: String
  var help: Boolean
  var hideGenerator: Boolean
  var ignoreCompilerErrors: Boolean
  var includeDeclarations: Boolean
  var includeVersion: Boolean
  var includes: String
  var inputFiles: js.Array[String]
  var json: String
  var listInvalidSymbolLinks: Boolean
  var logger: js.Any
  var media: String
  var mode: AnonFile
  var name: String
  var options: String
  var out: String
  var plugin: js.Array[String]
  var readme: String
  var theme: String
  var toc: js.Array[String]
  var tsconfig: String
  var version: Boolean
}

object TypeDocOptionMap {
  @scala.inline
  def apply(
    categorizeByGroup: Boolean,
    categoryOrder: js.Array[String],
    defaultCategory: String,
    disableOutputCheck: Boolean,
    entryPoint: String,
    exclude: js.Array[String],
    excludeExternals: Boolean,
    excludeNotExported: Boolean,
    excludePrivate: Boolean,
    excludeProtected: Boolean,
    excludeTags: js.Array[String],
    externalPattern: js.Array[String],
    gaID: String,
    gaSite: String,
    gitRevision: String,
    help: Boolean,
    hideGenerator: Boolean,
    ignoreCompilerErrors: Boolean,
    includeDeclarations: Boolean,
    includeVersion: Boolean,
    includes: String,
    inputFiles: js.Array[String],
    json: String,
    listInvalidSymbolLinks: Boolean,
    logger: js.Any,
    media: String,
    mode: AnonFile,
    name: String,
    options: String,
    out: String,
    plugin: js.Array[String],
    readme: String,
    theme: String,
    toc: js.Array[String],
    tsconfig: String,
    version: Boolean
  ): TypeDocOptionMap = {
    val __obj = js.Dynamic.literal(categorizeByGroup = categorizeByGroup.asInstanceOf[js.Any], categoryOrder = categoryOrder.asInstanceOf[js.Any], defaultCategory = defaultCategory.asInstanceOf[js.Any], disableOutputCheck = disableOutputCheck.asInstanceOf[js.Any], entryPoint = entryPoint.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], excludeExternals = excludeExternals.asInstanceOf[js.Any], excludeNotExported = excludeNotExported.asInstanceOf[js.Any], excludePrivate = excludePrivate.asInstanceOf[js.Any], excludeProtected = excludeProtected.asInstanceOf[js.Any], excludeTags = excludeTags.asInstanceOf[js.Any], externalPattern = externalPattern.asInstanceOf[js.Any], gaID = gaID.asInstanceOf[js.Any], gaSite = gaSite.asInstanceOf[js.Any], gitRevision = gitRevision.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], hideGenerator = hideGenerator.asInstanceOf[js.Any], ignoreCompilerErrors = ignoreCompilerErrors.asInstanceOf[js.Any], includeDeclarations = includeDeclarations.asInstanceOf[js.Any], includeVersion = includeVersion.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], inputFiles = inputFiles.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], listInvalidSymbolLinks = listInvalidSymbolLinks.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], readme = readme.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], toc = toc.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeDocOptionMap]
  }
}

