package typings.typedoc.optionsOptionsMod

import typings.std.Error
import typings.std.Exclude
import typings.std.Partial
import typings.typedoc.anon.File
import typings.typedoc.anon.Name
import typings.typedoc.anon.PartialTypeDocOptions
import typings.typedoc.anon.ReadonlyArrayDeclarationO
import typings.typedoc.anon.ReadonlyBooleanDeclaratio
import typings.typedoc.anon.ReadonlyMapDeclarationOpt
import typings.typedoc.anon.ReadonlyMixedDeclarationO
import typings.typedoc.anon.ReadonlyNumberDeclaration
import typings.typedoc.anon.ReadonlyStringDeclaration
import typings.typedoc.anon.`0`
import typings.typedoc.anon.`10`
import typings.typedoc.anon.`11`
import typings.typedoc.anon.`12`
import typings.typedoc.anon.`13`
import typings.typedoc.anon.`14`
import typings.typedoc.anon.`15`
import typings.typedoc.anon.`16`
import typings.typedoc.anon.`17`
import typings.typedoc.anon.`18`
import typings.typedoc.anon.`19`
import typings.typedoc.anon.`1`
import typings.typedoc.anon.`20`
import typings.typedoc.anon.`21`
import typings.typedoc.anon.`22`
import typings.typedoc.anon.`23`
import typings.typedoc.anon.`24`
import typings.typedoc.anon.`25`
import typings.typedoc.anon.`26`
import typings.typedoc.anon.`27`
import typings.typedoc.anon.`28`
import typings.typedoc.anon.`29`
import typings.typedoc.anon.`2`
import typings.typedoc.anon.`30`
import typings.typedoc.anon.`31`
import typings.typedoc.anon.`32`
import typings.typedoc.anon.`33`
import typings.typedoc.anon.`34`
import typings.typedoc.anon.`3`
import typings.typedoc.anon.`4`
import typings.typedoc.anon.`5`
import typings.typedoc.anon.`6`
import typings.typedoc.anon.`7`
import typings.typedoc.anon.`8`
import typings.typedoc.anon.`9`
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
  def addDeclaration_categorizeByGroup(declaration: `2` with KeyToDeclaration[categorizeByGroup]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_categoryOrder(declaration: `30` with KeyToDeclaration[categoryOrder]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_defaultCategory(declaration: `29` with KeyToDeclaration[defaultCategory]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_disableOutputCheck(declaration: `4` with KeyToDeclaration[disableOutputCheck]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_entryPoint(declaration: Name with KeyToDeclaration[entryPoint]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_exclude(declaration: `1` with KeyToDeclaration[exclude]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_excludeExternals(declaration: `24` with KeyToDeclaration[excludeExternals]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_excludeNotExported(declaration: `25` with KeyToDeclaration[excludeNotExported]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_excludePrivate(declaration: `3` with KeyToDeclaration[excludePrivate]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_excludeProtected(declaration: `14` with KeyToDeclaration[excludeProtected]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_excludeTags(declaration: `27` with KeyToDeclaration[excludeTags]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_externalPattern(declaration: `32` with KeyToDeclaration[externalPattern]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_gaID(declaration: `5` with KeyToDeclaration[gaID]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_gaSite(declaration: `20` with KeyToDeclaration[gaSite]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_gitRevision(declaration: `33` with KeyToDeclaration[gitRevision]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_help(declaration: `22` with KeyToDeclaration[help]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_hideGenerator(declaration: `28` with KeyToDeclaration[hideGenerator]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_ignoreCompilerErrors(declaration: `17` with KeyToDeclaration[ignoreCompilerErrors]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_includeDeclarations(declaration: `6` with KeyToDeclaration[includeDeclarations]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_includeVersion(declaration: `9` with KeyToDeclaration[includeVersion]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_includes(declaration: `8` with KeyToDeclaration[includes]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_inputFiles(declaration: `0` with KeyToDeclaration[inputFiles]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_json(declaration: `11` with KeyToDeclaration[json]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_listInvalidSymbolLinks(declaration: `13` with KeyToDeclaration[listInvalidSymbolLinks]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_logger(declaration: `19` with KeyToDeclaration[typings.typedoc.typedocStrings.logger]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_media(declaration: `7` with KeyToDeclaration[media]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_mode(declaration: `23` with KeyToDeclaration[mode]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_name(declaration: `21` with KeyToDeclaration[name]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_options(declaration: `12` with KeyToDeclaration[options]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_out(declaration: `34` with KeyToDeclaration[out]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_plugin(declaration: `10` with KeyToDeclaration[plugin]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_readme(declaration: `26` with KeyToDeclaration[readme]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_theme(declaration: `31` with KeyToDeclaration[theme]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_toc(declaration: `16` with KeyToDeclaration[toc]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_tsconfig(declaration: `15` with KeyToDeclaration[tsconfig]): Unit = js.native
  @JSName("addDeclaration")
  def addDeclaration_version(declaration: `18` with KeyToDeclaration[version]): Unit = js.native
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
  def getValue_categorizeByGroup(name: categorizeByGroup): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_categoryOrder(name: categoryOrder): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_defaultCategory(name: defaultCategory): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_disableOutputCheck(name: disableOutputCheck): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_entryPoint(name: entryPoint): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_exclude(name: exclude): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_excludeExternals(name: excludeExternals): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_excludeNotExported(name: excludeNotExported): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_excludePrivate(name: excludePrivate): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_excludeProtected(name: excludeProtected): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_excludeTags(name: excludeTags): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_externalPattern(name: externalPattern): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_gaID(name: gaID): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_gaSite(name: gaSite): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_gitRevision(name: gitRevision): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_help(name: help): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_hideGenerator(name: hideGenerator): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_ignoreCompilerErrors(name: ignoreCompilerErrors): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_includeDeclarations(name: includeDeclarations): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_includeVersion(name: includeVersion): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_includes(name: includes): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_inputFiles(name: inputFiles): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_json(name: json): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_listInvalidSymbolLinks(name: listInvalidSymbolLinks): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_logger(name: typings.typedoc.typedocStrings.logger): js.UndefOr[js.Any | (Exclude[_, String])] = js.native
  @JSName("getValue")
  def getValue_media(name: media): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_mode(name: mode): js.UndefOr[File | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_name(name: name): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_options(name: options): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_out(name: out): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_plugin(name: plugin): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_readme(name: readme): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_theme(name: theme): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_toc(name: toc): js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_tsconfig(name: tsconfig): js.UndefOr[String | (Exclude[_, String]) | js.Any] = js.native
  @JSName("getValue")
  def getValue_version(name: version): js.UndefOr[Boolean | (Exclude[_, String]) | js.Any] = js.native
  def isDefault(
    name: /* keyof typedoc.typedoc/dist/lib/utils/options/declaration.TypeDocAndTSOptions */ entryPoint | inputFiles | exclude | categorizeByGroup | excludePrivate | disableOutputCheck | gaID | includeDeclarations | media | includes | includeVersion | plugin | json | options | listInvalidSymbolLinks | excludeProtected | tsconfig | toc | ignoreCompilerErrors | version | typings.typedoc.typedocStrings.logger | gaSite | name | help | mode | excludeExternals | excludeNotExported | readme | excludeTags | hideGenerator | defaultCategory | categoryOrder | theme | externalPattern | gitRevision | out
  ): Boolean = js.native
  def isDefault(name: String): Boolean = js.native
  def read(logger: Logger): Unit = js.native
  def removeDeclarationByName(name: String): Unit = js.native
  def removeReaderByName(name: String): Unit = js.native
  def reset(): Unit = js.native
  def setLogger(logger: Logger): Unit = js.native
  def setValue(name: String, value: js.Any): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_categorizeByGroup(name: categorizeByGroup, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_categoryOrder(name: categoryOrder, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_defaultCategory(name: defaultCategory, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_disableOutputCheck(name: disableOutputCheck, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_entryPoint(name: entryPoint, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_exclude(name: exclude, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_excludeExternals(name: excludeExternals, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_excludeNotExported(name: excludeNotExported, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_excludePrivate(name: excludePrivate, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_excludeProtected(name: excludeProtected, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_excludeTags(name: excludeTags, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_externalPattern(name: externalPattern, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_gaID(name: gaID, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_gaSite(name: gaSite, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_gitRevision(name: gitRevision, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_help(name: help, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_hideGenerator(name: hideGenerator, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_ignoreCompilerErrors(name: ignoreCompilerErrors, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_includeDeclarations(name: includeDeclarations, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_includeVersion(name: includeVersion, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_includes(name: includes, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_inputFiles(name: inputFiles, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_json(name: json, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_listInvalidSymbolLinks(name: listInvalidSymbolLinks, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_logger(name: typings.typedoc.typedocStrings.logger, value: js.UndefOr[js.Any | (Exclude[_, String])]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_media(name: media, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_mode(name: mode, value: js.UndefOr[File | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_name(name: name, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_options(name: options, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_out(name: out, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_plugin(name: plugin, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_readme(name: readme, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_theme(name: theme, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_toc(name: toc, value: js.UndefOr[js.Array[String] | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_tsconfig(name: tsconfig, value: js.UndefOr[String | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  @JSName("setValue")
  def setValue_version(name: version, value: js.UndefOr[Boolean | (Exclude[_, String]) | js.Any]): Result[Unit, Error] = js.native
  def setValues(obj: Partial[TypeDocAndTSOptions]): Result[Unit, js.Array[Error]] = js.native
  def tryGetValue(name: String): Result[_, Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_categorizeByGroup(name: categorizeByGroup): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_categoryOrder(name: categoryOrder): Result[js.UndefOr[js.Array[String] | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_defaultCategory(name: defaultCategory): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_disableOutputCheck(name: disableOutputCheck): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_entryPoint(name: entryPoint): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_exclude(name: exclude): Result[js.UndefOr[js.Array[String] | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_excludeExternals(name: excludeExternals): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_excludeNotExported(name: excludeNotExported): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_excludePrivate(name: excludePrivate): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_excludeProtected(name: excludeProtected): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_excludeTags(name: excludeTags): Result[js.UndefOr[js.Array[String] | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_externalPattern(name: externalPattern): Result[js.UndefOr[js.Array[String] | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_gaID(name: gaID): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_gaSite(name: gaSite): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_gitRevision(name: gitRevision): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_help(name: help): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_hideGenerator(name: hideGenerator): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_ignoreCompilerErrors(name: ignoreCompilerErrors): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_includeDeclarations(name: includeDeclarations): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_includeVersion(name: includeVersion): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_includes(name: includes): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_inputFiles(name: inputFiles): Result[js.UndefOr[js.Array[String] | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_json(name: json): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_listInvalidSymbolLinks(name: listInvalidSymbolLinks): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_logger(name: typings.typedoc.typedocStrings.logger): Result[js.UndefOr[_ | (Exclude[_, String])], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_media(name: media): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_mode(name: mode): Result[js.UndefOr[File | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_name(name: name): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_options(name: options): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_out(name: out): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_plugin(name: plugin): Result[js.UndefOr[js.Array[String] | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_readme(name: readme): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_theme(name: theme): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_toc(name: toc): Result[js.UndefOr[js.Array[String] | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_tsconfig(name: tsconfig): Result[js.UndefOr[String | (Exclude[_, String]) | _], Error] = js.native
  @JSName("tryGetValue")
  def tryGetValue_version(name: version): Result[js.UndefOr[Boolean | (Exclude[_, String]) | _], Error] = js.native
}

