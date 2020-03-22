package typings.typedoc.optionsOptionsMod

import typings.std.Error
import typings.std.Exclude
import typings.std.Partial
import typings.typedoc.Anon0
import typings.typedoc.Anon1
import typings.typedoc.Anon10
import typings.typedoc.Anon11
import typings.typedoc.Anon12
import typings.typedoc.Anon13
import typings.typedoc.Anon14
import typings.typedoc.Anon15
import typings.typedoc.Anon16
import typings.typedoc.Anon17
import typings.typedoc.Anon18
import typings.typedoc.Anon19
import typings.typedoc.Anon2
import typings.typedoc.Anon20
import typings.typedoc.Anon21
import typings.typedoc.Anon22
import typings.typedoc.Anon23
import typings.typedoc.Anon24
import typings.typedoc.Anon25
import typings.typedoc.Anon26
import typings.typedoc.Anon27
import typings.typedoc.Anon28
import typings.typedoc.Anon29
import typings.typedoc.Anon3
import typings.typedoc.Anon30
import typings.typedoc.Anon31
import typings.typedoc.Anon32
import typings.typedoc.Anon33
import typings.typedoc.Anon34
import typings.typedoc.Anon4
import typings.typedoc.Anon5
import typings.typedoc.Anon6
import typings.typedoc.Anon7
import typings.typedoc.Anon8
import typings.typedoc.Anon9
import typings.typedoc.AnonFile
import typings.typedoc.AnonName
import typings.typedoc.PartialTypeDocOptions
import typings.typedoc.ReadonlyArrayDeclarationO
import typings.typedoc.ReadonlyBooleanDeclaratio
import typings.typedoc.ReadonlyMapDeclarationOpt
import typings.typedoc.ReadonlyMixedDeclarationO
import typings.typedoc.ReadonlyNumberDeclaration
import typings.typedoc.ReadonlyStringDeclaration
import typings.typedoc.loggersMod.Logger
import typings.typedoc.optionsDeclarationMod.DeclarationOption
import typings.typedoc.optionsDeclarationMod.KeyToDeclaration
import typings.typedoc.optionsDeclarationMod.ParameterScope
import typings.typedoc.optionsDeclarationMod.TypeDocAndTSOptions
import typings.typedoc.resultMod.Result
import typings.typedoc.typedocStrings.categorizeByGroup
import typings.typedoc.typedocStrings.categoryOrder
import typings.typedoc.typedocStrings.defaultCategory
import typings.typedoc.typedocStrings.disableOutputCheck
import typings.typedoc.typedocStrings.entryPoint
import typings.typedoc.typedocStrings.exclude
import typings.typedoc.typedocStrings.excludeExternals
import typings.typedoc.typedocStrings.excludeNotExported
import typings.typedoc.typedocStrings.excludePrivate
import typings.typedoc.typedocStrings.excludeProtected
import typings.typedoc.typedocStrings.excludeTags
import typings.typedoc.typedocStrings.externalPattern
import typings.typedoc.typedocStrings.gaID
import typings.typedoc.typedocStrings.gaSite
import typings.typedoc.typedocStrings.gitRevision
import typings.typedoc.typedocStrings.help
import typings.typedoc.typedocStrings.hideGenerator
import typings.typedoc.typedocStrings.ignoreCompilerErrors
import typings.typedoc.typedocStrings.includeDeclarations
import typings.typedoc.typedocStrings.includeVersion
import typings.typedoc.typedocStrings.includes
import typings.typedoc.typedocStrings.inputFiles
import typings.typedoc.typedocStrings.json
import typings.typedoc.typedocStrings.listInvalidSymbolLinks
import typings.typedoc.typedocStrings.logger
import typings.typedoc.typedocStrings.media
import typings.typedoc.typedocStrings.mode
import typings.typedoc.typedocStrings.name
import typings.typedoc.typedocStrings.options
import typings.typedoc.typedocStrings.out
import typings.typedoc.typedocStrings.plugin
import typings.typedoc.typedocStrings.readme
import typings.typedoc.typedocStrings.theme
import typings.typedoc.typedocStrings.toc
import typings.typedoc.typedocStrings.tsconfig
import typings.typedoc.typedocStrings.version
import typings.typescript.mod.CompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/options", "Options")
@js.native
class Options protected () extends js.Object {
  def this(logger: Logger) = this()
  var _compilerOptions: js.Any = js.native
  var _declarations: js.Any = js.native
  var _logger: js.Any = js.native
  var _readers: js.Any = js.native
  var _values: js.Any = js.native
  def addDeclaration(declaration: DeclarationOption): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_categorizeByGroup(declaration: Anon2 with KeyToDeclaration[categorizeByGroup]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_categoryOrder(declaration: Anon30 with KeyToDeclaration[categoryOrder]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_defaultCategory(declaration: Anon29 with KeyToDeclaration[defaultCategory]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_disableOutputCheck(declaration: Anon4 with KeyToDeclaration[disableOutputCheck]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_entryPoint(declaration: AnonName with KeyToDeclaration[entryPoint]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_exclude(declaration: Anon1 with KeyToDeclaration[exclude]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_excludeExternals(declaration: Anon24 with KeyToDeclaration[excludeExternals]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_excludeNotExported(declaration: Anon25 with KeyToDeclaration[excludeNotExported]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_excludePrivate(declaration: Anon3 with KeyToDeclaration[excludePrivate]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_excludeProtected(declaration: Anon14 with KeyToDeclaration[excludeProtected]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_excludeTags(declaration: Anon27 with KeyToDeclaration[excludeTags]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_externalPattern(declaration: Anon32 with KeyToDeclaration[externalPattern]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_gaID(declaration: Anon5 with KeyToDeclaration[gaID]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_gaSite(declaration: Anon20 with KeyToDeclaration[gaSite]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_gitRevision(declaration: Anon33 with KeyToDeclaration[gitRevision]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_help(declaration: Anon22 with KeyToDeclaration[help]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_hideGenerator(declaration: Anon28 with KeyToDeclaration[hideGenerator]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_ignoreCompilerErrors(declaration: Anon17 with KeyToDeclaration[ignoreCompilerErrors]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_includeDeclarations(declaration: Anon6 with KeyToDeclaration[includeDeclarations]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_includeVersion(declaration: Anon9 with KeyToDeclaration[includeVersion]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_includes(declaration: Anon8 with KeyToDeclaration[includes]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_inputFiles(declaration: Anon0 with KeyToDeclaration[inputFiles]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_json(declaration: Anon11 with KeyToDeclaration[json]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_listInvalidSymbolLinks(declaration: Anon13 with KeyToDeclaration[listInvalidSymbolLinks]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_logger(declaration: Anon19 with KeyToDeclaration[logger]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_media(declaration: Anon7 with KeyToDeclaration[media]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_mode(declaration: Anon23 with KeyToDeclaration[mode]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_name(declaration: Anon21 with KeyToDeclaration[name]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_options(declaration: Anon12 with KeyToDeclaration[options]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_out(declaration: Anon34 with KeyToDeclaration[out]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_plugin(declaration: Anon10 with KeyToDeclaration[plugin]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_readme(declaration: Anon26 with KeyToDeclaration[readme]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_theme(declaration: Anon31 with KeyToDeclaration[theme]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_toc(declaration: Anon16 with KeyToDeclaration[toc]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_tsconfig(declaration: Anon15 with KeyToDeclaration[tsconfig]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_version(declaration: Anon18 with KeyToDeclaration[version]): Unit = js.native
  def addDeclarations(declarations: js.Array[DeclarationOption]): Unit = js.native
  def addDefaultDeclarations(): Unit = js.native
  def addReader(reader: OptionsReader): Unit = js.native
  def getCompilerOptions(): CompilerOptions = js.native
  def getDeclaration(name: String): js.UndefOr[DeclarationOption] = js.native
  def getDeclarationsByScope(scope: ParameterScope): js.Array[
    ReadonlyStringDeclaration | ReadonlyNumberDeclaration | ReadonlyBooleanDeclaratio | ReadonlyMixedDeclarationO | ReadonlyMapDeclarationOpt | ReadonlyArrayDeclarationO
  ] = js.native
  def getRawValues(): PartialTypeDocOptions = js.native
  def getValue(name: String): js.Any = js.native
  @JSName("getValue")
  def getValue_categorizeByGroup(name: categorizeByGroup): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_categoryOrder(name: categoryOrder): js.Array[String] | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_defaultCategory(name: defaultCategory): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_disableOutputCheck(name: disableOutputCheck): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_entryPoint(name: entryPoint): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_exclude(name: exclude): js.Array[String] | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_excludeExternals(name: excludeExternals): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_excludeNotExported(name: excludeNotExported): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_excludePrivate(name: excludePrivate): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_excludeProtected(name: excludeProtected): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_excludeTags(name: excludeTags): js.Array[String] | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_externalPattern(name: externalPattern): js.Array[String] | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_gaID(name: gaID): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_gaSite(name: gaSite): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_gitRevision(name: gitRevision): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_help(name: help): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_hideGenerator(name: hideGenerator): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_ignoreCompilerErrors(name: ignoreCompilerErrors): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_includeDeclarations(name: includeDeclarations): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_includeVersion(name: includeVersion): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_includes(name: includes): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_inputFiles(name: inputFiles): js.Array[String] | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_json(name: json): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_listInvalidSymbolLinks(name: listInvalidSymbolLinks): Boolean | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_logger(name: logger): js.Any | (Exclude[_, String]) = js.native
  @JSName("getValue")
  def getValue_media(name: media): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_mode(name: mode): AnonFile | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_name(name: name): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_options(name: options): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_out(name: out): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_plugin(name: plugin): js.Array[String] | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_readme(name: readme): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_theme(name: theme): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_toc(name: toc): js.Array[String] | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_tsconfig(name: tsconfig): String | (Exclude[_, String]) | js.Any = js.native
  @JSName("getValue")
  def getValue_version(name: version): Boolean | (Exclude[_, String]) | js.Any = js.native
  def isDefault(name: String): Boolean = js.native
  def read(logger: Logger): Unit = js.native
  def removeDeclarationByName(name: String): Unit = js.native
  def removeReaderByName(name: String): Unit = js.native
  def reset(): Unit = js.native
  def setLogger(logger: Logger): Unit = js.native
  def setValue(name: String, value: js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_categorizeByGroup(name: categorizeByGroup, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_categoryOrder(name: categoryOrder, value: js.Array[String] | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_defaultCategory(name: defaultCategory, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_disableOutputCheck(name: disableOutputCheck, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_entryPoint(name: entryPoint, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_exclude(name: exclude, value: js.Array[String] | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_excludeExternals(name: excludeExternals, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_excludeNotExported(name: excludeNotExported, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_excludePrivate(name: excludePrivate, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_excludeProtected(name: excludeProtected, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_excludeTags(name: excludeTags, value: js.Array[String] | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_externalPattern(name: externalPattern, value: js.Array[String] | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_gaID(name: gaID, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_gaSite(name: gaSite, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_gitRevision(name: gitRevision, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_help(name: help, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_hideGenerator(name: hideGenerator, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_ignoreCompilerErrors(name: ignoreCompilerErrors, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_includeDeclarations(name: includeDeclarations, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_includeVersion(name: includeVersion, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_includes(name: includes, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_inputFiles(name: inputFiles, value: js.Array[String] | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_json(name: json, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_listInvalidSymbolLinks(name: listInvalidSymbolLinks, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_logger(name: logger, value: js.Any | (Exclude[_, String])): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_media(name: media, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_mode(name: mode, value: AnonFile | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_name(name: name, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_options(name: options, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_out(name: out, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_plugin(name: plugin, value: js.Array[String] | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_readme(name: readme, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_theme(name: theme, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_toc(name: toc, value: js.Array[String] | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_tsconfig(name: tsconfig, value: String | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_version(name: version, value: Boolean | (Exclude[_, String]) | js.Any): Result[Unit, Error] = js.native
  def setValues(obj: Partial[TypeDocAndTSOptions]): Result[Unit, js.Array[Error]] = js.native
  def tryGetValue(name: String): Result[_, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_categorizeByGroup(name: categorizeByGroup): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_categoryOrder(name: categoryOrder): Result[js.Array[String] | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_defaultCategory(name: defaultCategory): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_disableOutputCheck(name: disableOutputCheck): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_entryPoint(name: entryPoint): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_exclude(name: exclude): Result[js.Array[String] | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_excludeExternals(name: excludeExternals): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_excludeNotExported(name: excludeNotExported): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_excludePrivate(name: excludePrivate): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_excludeProtected(name: excludeProtected): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_excludeTags(name: excludeTags): Result[js.Array[String] | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_externalPattern(name: externalPattern): Result[js.Array[String] | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_gaID(name: gaID): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_gaSite(name: gaSite): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_gitRevision(name: gitRevision): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_help(name: help): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_hideGenerator(name: hideGenerator): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_ignoreCompilerErrors(name: ignoreCompilerErrors): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_includeDeclarations(name: includeDeclarations): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_includeVersion(name: includeVersion): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_includes(name: includes): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_inputFiles(name: inputFiles): Result[js.Array[String] | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_json(name: json): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_listInvalidSymbolLinks(name: listInvalidSymbolLinks): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_logger(name: logger): Result[_ | (Exclude[_, String]), Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_media(name: media): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_mode(name: mode): Result[AnonFile | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_name(name: name): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_options(name: options): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_out(name: out): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_plugin(name: plugin): Result[js.Array[String] | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_readme(name: readme): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_theme(name: theme): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_toc(name: toc): Result[js.Array[String] | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_tsconfig(name: tsconfig): Result[String | (Exclude[_, String]) | _, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_version(name: version): Result[Boolean | (Exclude[_, String]) | _, Error] = js.native
}

