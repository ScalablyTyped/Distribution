package typings.typedoc

import org.scalablytyped.runtime.TopLevel
import typings.shiki.mod.Theme
import typings.std.PropertyKey
import typings.std.Record
import typings.typedoc.anon.Application
import typings.typedoc.generalMod.NeverIfInternal
import typings.typedoc.loggersMod.Logger
import typings.typedoc.optionsDeclarationMod.ManuallyValidatedOption
import typings.typedoc.optionsDeclarationMod.ValidationOptions
import typings.typedoc.sortMod.SortStrategy
import typings.typedoc.typedocStrings.All
import typings.typedoc.typedocStrings.BindOption
import typings.typedoc.typedocStrings.ClassMember
import typings.typedoc.typedocStrings.ClassOrInterface
import typings.typedoc.typedocStrings.ContainsCallSignatures
import typings.typedoc.typedocStrings.ExportContainer
import typings.typedoc.typedocStrings.FunctionOrMethod
import typings.typedoc.typedocStrings.Inheritable
import typings.typedoc.typedocStrings.SignatureContainer
import typings.typedoc.typedocStrings.SomeExport
import typings.typedoc.typedocStrings.SomeMember
import typings.typedoc.typedocStrings.SomeModule
import typings.typedoc.typedocStrings.SomeSignature
import typings.typedoc.typedocStrings.SomeType
import typings.typedoc.typedocStrings.SomeValue
import typings.typedoc.typedocStrings.VariableOrProperty
import typings.typedoc.typedocStrings.all_
import typings.typedoc.typedocStrings.basePath
import typings.typedoc.typedocStrings.block
import typings.typedoc.typedocStrings.blockTags
import typings.typedoc.typedocStrings.categorizeByGroup
import typings.typedoc.typedocStrings.categoryOrder
import typings.typedoc.typedocStrings.cleanOutputDir
import typings.typedoc.typedocStrings.cname
import typings.typedoc.typedocStrings.commentStyle
import typings.typedoc.typedocStrings.compilerOptions
import typings.typedoc.typedocStrings.customCss
import typings.typedoc.typedocStrings.darkHighlightTheme
import typings.typedoc.typedocStrings.defaultCategory
import typings.typedoc.typedocStrings.disableSources
import typings.typedoc.typedocStrings.emit
import typings.typedoc.typedocStrings.entryPointStrategy
import typings.typedoc.typedocStrings.entryPoints
import typings.typedoc.typedocStrings.exclude
import typings.typedoc.typedocStrings.excludeExternals
import typings.typedoc.typedocStrings.excludeInternal
import typings.typedoc.typedocStrings.excludeNotDocumented
import typings.typedoc.typedocStrings.excludePrivate
import typings.typedoc.typedocStrings.excludeProtected
import typings.typedoc.typedocStrings.excludeTags
import typings.typedoc.typedocStrings.externalPattern
import typings.typedoc.typedocStrings.externalSymbolLinkMappings
import typings.typedoc.typedocStrings.gaID
import typings.typedoc.typedocStrings.gitRemote
import typings.typedoc.typedocStrings.gitRevision
import typings.typedoc.typedocStrings.githubPages
import typings.typedoc.typedocStrings.help
import typings.typedoc.typedocStrings.hideGenerator
import typings.typedoc.typedocStrings.htmlLang
import typings.typedoc.typedocStrings.includeVersion
import typings.typedoc.typedocStrings.includes
import typings.typedoc.typedocStrings.inlineTags
import typings.typedoc.typedocStrings.intentionallyNotExported
import typings.typedoc.typedocStrings.jsdoc
import typings.typedoc.typedocStrings.json
import typings.typedoc.typedocStrings.lightHighlightTheme
import typings.typedoc.typedocStrings.line
import typings.typedoc.typedocStrings.logLevel
import typings.typedoc.typedocStrings.logger
import typings.typedoc.typedocStrings.markedOptions
import typings.typedoc.typedocStrings.media
import typings.typedoc.typedocStrings.modifierTags
import typings.typedoc.typedocStrings.name
import typings.typedoc.typedocStrings.options
import typings.typedoc.typedocStrings.out
import typings.typedoc.typedocStrings.plugin
import typings.typedoc.typedocStrings.preserveWatchOutput
import typings.typedoc.typedocStrings.pretty
import typings.typedoc.typedocStrings.readme
import typings.typedoc.typedocStrings.requiredToBeDocumented
import typings.typedoc.typedocStrings.searchCategoryBoosts
import typings.typedoc.typedocStrings.searchGroupBoosts
import typings.typedoc.typedocStrings.searchInComments
import typings.typedoc.typedocStrings.showConfig
import typings.typedoc.typedocStrings.skipErrorChecking
import typings.typedoc.typedocStrings.sort
import typings.typedoc.typedocStrings.theme
import typings.typedoc.typedocStrings.treatWarningsAsErrors
import typings.typedoc.typedocStrings.tsconfig
import typings.typedoc.typedocStrings.validation
import typings.typedoc.typedocStrings.version
import typings.typedoc.typedocStrings.visibilityFilters
import typings.typedoc.typedocStrings.watch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("typedoc/dist/lib/utils/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/utils/options", "ArgumentsReader")
  @js.native
  open class ArgumentsReader protected ()
    extends typings.typedoc.readersMod.ArgumentsReader {
    def this(priority: Double) = this()
    def this(priority: Double, args: js.Array[String]) = this()
  }
  
  inline def BindOption(name: NeverIfInternal[String]): js.Function2[/* target */ Application | typings.typedoc.anon.Options, /* key */ PropertyKey, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Application | typings.typedoc.anon.Options, /* key */ PropertyKey, Unit]]
  
  inline def BindOption_basePath(name: basePath): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_blockTags(name: blockTags): js.Function2[
    /* target */ (Application & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_categorizeByGroup(name: categorizeByGroup): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_categoryOrder(name: categoryOrder): js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_cleanOutputDir(name: cleanOutputDir): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_cname(name: cname): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_commentStyle(name: commentStyle): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_compilerOptions(name: compilerOptions): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_customCss(name: customCss): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_darkHighlightTheme(name: darkHighlightTheme): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Theme]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Theme]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Theme]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Theme]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_defaultCategory(name: defaultCategory): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_disableSources(name: disableSources): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_emit(name: emit): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_entryPointStrategy(name: entryPointStrategy): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_entryPoints(name: entryPoints): js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_exclude(name: exclude): js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeExternals(name: excludeExternals): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeInternal(name: excludeInternal): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeNotDocumented(name: excludeNotDocumented): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludePrivate(name: excludePrivate): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeProtected(name: excludeProtected): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeTags(name: excludeTags): js.Function2[
    /* target */ (Application & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_externalPattern(name: externalPattern): js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_externalSymbolLinkMappings(name: externalSymbolLinkMappings): js.Function2[
    /* target */ (Application & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Record[String, String]]]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Record[String, String]]]])), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Record[String, String]]]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Record[String, String]]]])), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_gaID(name: gaID): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_gitRemote(name: gitRemote): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_gitRevision(name: gitRevision): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_githubPages(name: githubPages): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_help(name: help): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_hideGenerator(name: hideGenerator): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_htmlLang(name: htmlLang): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_includeVersion(name: includeVersion): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_includes(name: includes): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_inlineTags(name: inlineTags): js.Function2[
    /* target */ (Application & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_intentionallyNotExported(name: intentionallyNotExported): js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_json(name: json): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_lightHighlightTheme(name: lightHighlightTheme): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Theme]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Theme]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Theme]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Theme]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_logLevel(name: logLevel): js.Function2[
    /* target */ (Application & BindOption & (TopLevel[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any
    ])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any
    ])), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & (TopLevel[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any
    ])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any
    ])), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_logger(name: logger): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_markedOptions(name: markedOptions): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Any]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Any]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_media(name: media): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_modifierTags(name: modifierTags): js.Function2[
    /* target */ (Application & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[js.Array[/* template literal string: @${string} */ String]])), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_name(name: name): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_options(name: options): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_out(name: out): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_plugin(name: plugin): js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[String]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[String]]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_preserveWatchOutput(name: preserveWatchOutput): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_pretty(name: pretty): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_readme(name: readme): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_requiredToBeDocumented(name: requiredToBeDocumented): js.Function2[
    /* target */ (Application & BindOption & (TopLevel[
      js.Array[
        /* keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number} */ All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[
      js.Array[
        /* keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number} */ All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ])), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & (TopLevel[
      js.Array[
        /* keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number} */ All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[
      js.Array[
        /* keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number} */ All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]
    ])), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_searchCategoryBoosts(name: searchCategoryBoosts): js.Function2[
    /* target */ (Application & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Double]]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Double]]])), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Double]]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Double]]])), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_searchGroupBoosts(name: searchGroupBoosts): js.Function2[
    /* target */ (Application & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Double]]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Double]]])), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Double]]])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[ManuallyValidatedOption[Record[String, Double]]])), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_searchInComments(name: searchInComments): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_showConfig(name: showConfig): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_skipErrorChecking(name: skipErrorChecking): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_sort(name: sort): js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[SortStrategy]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[SortStrategy]]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[SortStrategy]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[SortStrategy]]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_theme(name: theme): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_treatWarningsAsErrors(name: treatWarningsAsErrors): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_tsconfig(name: tsconfig): js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[String]) | (typings.typedoc.anon.Options & BindOption & TopLevel[String]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_validation(name: validation): js.Function2[
    /* target */ (Application & BindOption & TopLevel[ValidationOptions]) | (typings.typedoc.anon.Options & BindOption & TopLevel[ValidationOptions]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[ValidationOptions]) | (typings.typedoc.anon.Options & BindOption & TopLevel[ValidationOptions]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_version(name: version): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_visibilityFilters(name: visibilityFilters): js.Function2[
    /* target */ (Application & BindOption & (TopLevel[
      ManuallyValidatedOption[
        /* import warning: importer.ImportType#apply Failed type conversion: {  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean} */ js.Any
      ]
    ])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[
      ManuallyValidatedOption[
        /* import warning: importer.ImportType#apply Failed type conversion: {  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean} */ js.Any
      ]
    ])), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & (TopLevel[
      ManuallyValidatedOption[
        /* import warning: importer.ImportType#apply Failed type conversion: {  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean} */ js.Any
      ]
    ])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[
      ManuallyValidatedOption[
        /* import warning: importer.ImportType#apply Failed type conversion: {  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean} */ js.Any
      ]
    ])), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_watch(name: watch): js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[Boolean]) | (typings.typedoc.anon.Options & BindOption & TopLevel[Boolean]), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  object CommentStyle {
    
    @JSImport("typedoc/dist/lib/utils/options", "CommentStyle.All")
    @js.native
    val All: all_ = js.native
    
    @JSImport("typedoc/dist/lib/utils/options", "CommentStyle.Block")
    @js.native
    val Block: block = js.native
    
    @JSImport("typedoc/dist/lib/utils/options", "CommentStyle.JSDoc")
    @js.native
    val JSDoc: jsdoc = js.native
    
    @JSImport("typedoc/dist/lib/utils/options", "CommentStyle.Line")
    @js.native
    val Line: line = js.native
  }
  
  object EmitStrategy {
    
    @JSImport("typedoc/dist/lib/utils/options", "EmitStrategy.both")
    @js.native
    val both: typings.typedoc.typedocStrings.both = js.native
    
    @JSImport("typedoc/dist/lib/utils/options", "EmitStrategy.docs")
    @js.native
    val docs: typings.typedoc.typedocStrings.docs = js.native
    
    @JSImport("typedoc/dist/lib/utils/options", "EmitStrategy.none")
    @js.native
    val none: typings.typedoc.typedocStrings.none = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/options", "Options")
  @js.native
  open class Options protected ()
    extends typings.typedoc.optionsOptionsMod.Options {
    def this(logger: Logger) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils/options", "ParameterHint")
  @js.native
  object ParameterHint extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.optionsDeclarationMod.ParameterHint & Double] = js.native
    
    /* 1 */ val Directory: typings.typedoc.optionsDeclarationMod.ParameterHint.Directory & Double = js.native
    
    /* 0 */ val File: typings.typedoc.optionsDeclarationMod.ParameterHint.File & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/options", "ParameterType")
  @js.native
  object ParameterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.optionsDeclarationMod.ParameterType & Double] = js.native
    
    /* 6 */ val Array: typings.typedoc.optionsDeclarationMod.ParameterType.Array & Double = js.native
    
    /* 3 */ val Boolean: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean & Double = js.native
    
    /* 11 */ val Flags: typings.typedoc.optionsDeclarationMod.ParameterType.Flags & Double = js.native
    
    /* 9 */ val GlobArray: typings.typedoc.optionsDeclarationMod.ParameterType.GlobArray & Double = js.native
    
    /* 4 */ val Map: typings.typedoc.optionsDeclarationMod.ParameterType.Map & Double = js.native
    
    /* 5 */ val Mixed: typings.typedoc.optionsDeclarationMod.ParameterType.Mixed & Double = js.native
    
    /* 8 */ val ModuleArray: typings.typedoc.optionsDeclarationMod.ParameterType.ModuleArray & Double = js.native
    
    /* 2 */ val Number: typings.typedoc.optionsDeclarationMod.ParameterType.Number & Double = js.native
    
    /* 10 */ val Object: typings.typedoc.optionsDeclarationMod.ParameterType.Object & Double = js.native
    
    /* 1 */ val Path: typings.typedoc.optionsDeclarationMod.ParameterType.Path & Double = js.native
    
    /* 7 */ val PathArray: typings.typedoc.optionsDeclarationMod.ParameterType.PathArray & Double = js.native
    
    /* 0 */ val String: typings.typedoc.optionsDeclarationMod.ParameterType.String & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/options", "TSConfigReader")
  @js.native
  open class TSConfigReader ()
    extends typings.typedoc.readersMod.TSConfigReader
  /* static members */
  object TSConfigReader {
    
    @JSImport("typedoc/dist/lib/utils/options", "TSConfigReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Not considered part of the public API. You can use it, but it might break.
      * @internal
      */
    inline def findConfigFile(file: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfigFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  }
  
  @JSImport("typedoc/dist/lib/utils/options", "TypeDocReader")
  @js.native
  open class TypeDocReader ()
    extends typings.typedoc.readersMod.TypeDocReader
}
