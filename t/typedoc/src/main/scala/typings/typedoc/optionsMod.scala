package typings.typedoc

import org.scalablytyped.runtime.TopLevel
import typings.std.PropertyKey
import typings.typedoc.loggersMod.Logger
import typings.typedoc.optionsDeclarationMod.DeclarationOption
import typings.typedoc.typedocStrings.BindOption
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options", JSImport.Namespace)
@js.native
object optionsMod extends js.Object {
  @js.native
  class ArgumentsReader protected ()
    extends typings.typedoc.readersMod.ArgumentsReader {
    def this(priority: Double) = this()
    def this(priority: Double, args: js.Array[String]) = this()
  }
  
  @js.native
  class Options protected ()
    extends typings.typedoc.optionsOptionsMod.Options {
    def this(logger: Logger) = this()
  }
  
  @js.native
  class TSConfigReader ()
    extends typings.typedoc.tsconfigMod.TSConfigReader
  
  @js.native
  class TypeDocReader ()
    extends typings.typedoc.typedocMod.TypeDocReader
  
  def BindOption(name: String): js.Function2[
    /* target */ AnonApplicationApplication | AnonOptionsOptions, 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_categorizeByGroup(name: categorizeByGroup): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_categoryOrder(name: categoryOrder): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_defaultCategory(name: defaultCategory): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_disableOutputCheck(name: disableOutputCheck): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_entryPoint(name: entryPoint): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_exclude(name: exclude): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_excludeExternals(name: excludeExternals): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_excludeNotExported(name: excludeNotExported): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_excludePrivate(name: excludePrivate): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_excludeProtected(name: excludeProtected): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_excludeTags(name: excludeTags): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_externalPattern(name: externalPattern): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_gaID(name: gaID): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_gaSite(name: gaSite): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_gitRevision(name: gitRevision): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_help(name: help): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_hideGenerator(name: hideGenerator): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_ignoreCompilerErrors(name: ignoreCompilerErrors): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_includeDeclarations(name: includeDeclarations): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_includeVersion(name: includeVersion): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_includes(name: includes): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_inputFiles(name: inputFiles): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_json(name: json): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_listInvalidSymbolLinks(name: listInvalidSymbolLinks): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_logger(name: logger): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_media(name: media): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_mode(name: mode): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_name(name: name): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_options(name: options): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_out(name: out): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_plugin(name: plugin): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_readme(name: readme): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_theme(name: theme): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_toc(name: toc): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_tsconfig(name: tsconfig): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  @JSName("BindOption")
  def BindOption_version(name: version): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with BindOption with TopLevel[js.Any], 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
  def Option(option: DeclarationOption): js.Function2[
    /* target */ AnonApplication | AnonOptions, 
    /* key */ String | Double | js.Symbol, 
    Unit
  ] = js.native
  @js.native
  object ParameterHint extends js.Object {
    /* 1 */ val Directory: typings.typedoc.optionsDeclarationMod.ParameterHint.Directory with Double = js.native
    /* 0 */ val File: typings.typedoc.optionsDeclarationMod.ParameterHint.File with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.optionsDeclarationMod.ParameterHint with Double] = js.native
  }
  
  @js.native
  object ParameterScope extends js.Object {
    /* 0 */ val TypeDoc: typings.typedoc.optionsDeclarationMod.ParameterScope.TypeDoc with Double = js.native
    /* 1 */ val TypeScript: typings.typedoc.optionsDeclarationMod.ParameterScope.TypeScript with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.optionsDeclarationMod.ParameterScope with Double] = js.native
  }
  
  @js.native
  object ParameterType extends js.Object {
    /* 5 */ val Array: typings.typedoc.optionsDeclarationMod.ParameterType.Array with Double = js.native
    /* 2 */ val Boolean: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean with Double = js.native
    /* 3 */ val Map: typings.typedoc.optionsDeclarationMod.ParameterType.Map with Double = js.native
    /* 4 */ val Mixed: typings.typedoc.optionsDeclarationMod.ParameterType.Mixed with Double = js.native
    /* 1 */ val Number: typings.typedoc.optionsDeclarationMod.ParameterType.Number with Double = js.native
    /* 0 */ val String: typings.typedoc.optionsDeclarationMod.ParameterType.String with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.optionsDeclarationMod.ParameterType with Double] = js.native
  }
  
  @js.native
  object SourceFileMode extends js.Object {
    /* 0 */ val File: typings.typedoc.optionsDeclarationMod.SourceFileMode.File with Double = js.native
    /* 1 */ val Modules: typings.typedoc.optionsDeclarationMod.SourceFileMode.Modules with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.optionsDeclarationMod.SourceFileMode with Double] = js.native
  }
  
}

