package typings.typedoc

import org.scalablytyped.runtime.TopLevel
import typings.shiki.mod.Theme
import typings.std.Partial
import typings.std.PropertyKey
import typings.std.Record
import typings.typedoc.anon.Application
import typings.typedoc.anon.Both
import typings.typedoc.anon.Dicttag
import typings.typedoc.anon.Expand
import typings.typedoc.anon.Name
import typings.typedoc.anon.PartialArraySortStrategy
import typings.typedoc.anon.PartialArraykeyofreadonly
import typings.typedoc.anon.PartialArraystring
import typings.typedoc.anon.PartialArraystringAt
import typings.typedoc.anon.PartialManuallyValidatedO
import typings.typedoc.anon.PartialManuallyValidatedO0
import typings.typedoc.anon.PartialManuallyValidatedOValidated
import typings.typedoc.anon.PartialValidationOptions
import typings.typedoc.anon.PartialreadonlyJSDocjsdoc
import typings.typedoc.anon.PartialreadonlyResolveres
import typings.typedoc.anon.Partialreadonlybothbothre
import typings.typedoc.anon.ReadonlyCompilerOptions
import typings.typedoc.anon.ReadonlyPartialTypeDocOpt
import typings.typedoc.anon.`0`
import typings.typedoc.anon.`10`
import typings.typedoc.anon.`11`
import typings.typedoc.anon.`12`
import typings.typedoc.anon.`13`
import typings.typedoc.anon.`14`
import typings.typedoc.anon.`15`
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
import typings.typedoc.anon.`35`
import typings.typedoc.anon.`36`
import typings.typedoc.anon.`37`
import typings.typedoc.anon.`38`
import typings.typedoc.anon.`39`
import typings.typedoc.anon.`3`
import typings.typedoc.anon.`40`
import typings.typedoc.anon.`41`
import typings.typedoc.anon.`42`
import typings.typedoc.anon.`43`
import typings.typedoc.anon.`44`
import typings.typedoc.anon.`45`
import typings.typedoc.anon.`46`
import typings.typedoc.anon.`47`
import typings.typedoc.anon.`48`
import typings.typedoc.anon.`49`
import typings.typedoc.anon.`4`
import typings.typedoc.anon.`50`
import typings.typedoc.anon.`51`
import typings.typedoc.anon.`52`
import typings.typedoc.anon.`53`
import typings.typedoc.anon.`54`
import typings.typedoc.anon.`55`
import typings.typedoc.anon.`56`
import typings.typedoc.anon.`57`
import typings.typedoc.anon.`58`
import typings.typedoc.anon.`59`
import typings.typedoc.anon.`5`
import typings.typedoc.anon.`60`
import typings.typedoc.anon.`61`
import typings.typedoc.anon.`62`
import typings.typedoc.anon.`6`
import typings.typedoc.anon.`7`
import typings.typedoc.anon.`8`
import typings.typedoc.anon.`9`
import typings.typedoc.generalMod.NeverIfInternal
import typings.typedoc.loggersMod.Logger
import typings.typedoc.optionsDeclarationMod.DeclarationOption
import typings.typedoc.optionsDeclarationMod.KeyToDeclaration
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
import typings.typedoc.typedocStrings.`@$LeftcurlybracketstringRightcurlybracket`
import typings.typedoc.typedocStrings.basePath
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
import typings.typedoc.typedocStrings.json
import typings.typedoc.typedocStrings.lightHighlightTheme
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
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsOptionsMod {
  
  @JSImport("typedoc/dist/lib/utils/options/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    /* target */ (Application & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]), 
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
    /* target */ (Application & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]), 
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
    /* target */ (Application & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]), 
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
    /* target */ (Application & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]) | (typings.typedoc.anon.Options & BindOption & TopLevel[js.Array[`@$LeftcurlybracketstringRightcurlybracket`]]), 
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
        /* import warning: importer.ImportType#apply Failed type conversion: {  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: '@${string}'] : boolean} */ js.Any
      ]
    ])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[
      ManuallyValidatedOption[
        /* import warning: importer.ImportType#apply Failed type conversion: {  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: '@${string}'] : boolean} */ js.Any
      ]
    ])), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & BindOption & (TopLevel[
      ManuallyValidatedOption[
        /* import warning: importer.ImportType#apply Failed type conversion: {  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: '@${string}'] : boolean} */ js.Any
      ]
    ])) | (typings.typedoc.anon.Options & BindOption & (TopLevel[
      ManuallyValidatedOption[
        /* import warning: importer.ImportType#apply Failed type conversion: {  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: '@${string}'] : boolean} */ js.Any
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
  
  @JSImport("typedoc/dist/lib/utils/options/options", "Options")
  @js.native
  open class Options protected () extends StObject {
    def this(logger: Logger) = this()
    
    /* private */ var _compilerOptions: Any = js.native
    
    /* private */ var _declarations: Any = js.native
    
    /* private */ var _fileNames: Any = js.native
    
    /* private */ var _logger: Any = js.native
    
    /* private */ var _projectReferences: Any = js.native
    
    /* private */ var _readers: Any = js.native
    
    /* private */ var _setOptions: Any = js.native
    
    /* private */ var _values: Any = js.native
    
    /**
      * Adds an option declaration to the container.
      * @param declaration The option declaration that should be added.
      */
    def addDeclaration(declaration: NeverIfInternal[DeclarationOption]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_basePath(declaration: `50` & KeyToDeclaration[basePath]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_blockTags(declaration: `47` & KeyToDeclaration[blockTags]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_categorizeByGroup(declaration: `57` & KeyToDeclaration[categorizeByGroup]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_categoryOrder(declaration: `49` & KeyToDeclaration[categoryOrder]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_cleanOutputDir(declaration: `36` & KeyToDeclaration[cleanOutputDir]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_cname(declaration: `37` & KeyToDeclaration[cname]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_commentStyle(declaration: `53` & KeyToDeclaration[commentStyle]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_compilerOptions(declaration: `2` & KeyToDeclaration[compilerOptions]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_customCss(declaration: `34` & KeyToDeclaration[customCss]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_darkHighlightTheme(declaration: `28` & KeyToDeclaration[darkHighlightTheme]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_defaultCategory(declaration: `19` & KeyToDeclaration[defaultCategory]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_disableSources(declaration: `40` & KeyToDeclaration[disableSources]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_emit(declaration: `17` & KeyToDeclaration[emit]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_entryPointStrategy(declaration: `13` & KeyToDeclaration[entryPointStrategy]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_entryPoints(declaration: `20` & KeyToDeclaration[entryPoints]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_exclude(declaration: `18` & KeyToDeclaration[exclude]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludeExternals(declaration: `60` & KeyToDeclaration[excludeExternals]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludeInternal(declaration: `23` & KeyToDeclaration[excludeInternal]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludeNotDocumented(declaration: `32` & KeyToDeclaration[excludeNotDocumented]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludePrivate(declaration: `46` & KeyToDeclaration[excludePrivate]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludeProtected(declaration: `29` & KeyToDeclaration[excludeProtected]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_excludeTags(declaration: `48` & KeyToDeclaration[excludeTags]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_externalPattern(declaration: `59` & KeyToDeclaration[externalPattern]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_externalSymbolLinkMappings(declaration: `39` & KeyToDeclaration[externalSymbolLinkMappings]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_gaID(declaration: `4` & KeyToDeclaration[gaID]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_gitRemote(declaration: `9` & KeyToDeclaration[gitRemote]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_gitRevision(declaration: `52` & KeyToDeclaration[gitRevision]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_githubPages(declaration: `14` & KeyToDeclaration[githubPages]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_help(declaration: `45` & KeyToDeclaration[help]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_hideGenerator(declaration: `7` & KeyToDeclaration[hideGenerator]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_htmlLang(declaration: `54` & KeyToDeclaration[htmlLang]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_includeVersion(declaration: `15` & KeyToDeclaration[includeVersion]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_includes(declaration: `22` & KeyToDeclaration[includes]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_inlineTags(declaration: `5` & KeyToDeclaration[inlineTags]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_intentionallyNotExported(declaration: `41` & KeyToDeclaration[intentionallyNotExported]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_json(declaration: `12` & KeyToDeclaration[json]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_lightHighlightTheme(declaration: `38` & KeyToDeclaration[lightHighlightTheme]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_logLevel(declaration: `3` & KeyToDeclaration[logLevel]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_logger(declaration: `8` & KeyToDeclaration[typings.typedoc.typedocStrings.logger]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_markedOptions(declaration: `10` & KeyToDeclaration[markedOptions]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_media(declaration: `33` & KeyToDeclaration[media]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_modifierTags(declaration: `35` & KeyToDeclaration[modifierTags]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_name(declaration: `58` & KeyToDeclaration[name]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_options(declaration: `56` & KeyToDeclaration[options]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_out(declaration: `1` & KeyToDeclaration[out]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_plugin(declaration: `27` & KeyToDeclaration[plugin]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_preserveWatchOutput(declaration: `55` & KeyToDeclaration[preserveWatchOutput]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_pretty(declaration: `6` & KeyToDeclaration[pretty]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_readme(declaration: `61` & KeyToDeclaration[readme]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_requiredToBeDocumented(declaration: `62` & KeyToDeclaration[requiredToBeDocumented]): Unit = js.native
    /**
      * Adds an option declaration to the container with extra type checking to ensure that
      * the runtime type is consistent with the declared type.
      * @param declaration The option declaration that should be added.
      */
    @JSName("addDeclaration")
    def addDeclaration_searchCategoryBoosts(declaration: Name & KeyToDeclaration[searchCategoryBoosts]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_searchGroupBoosts(declaration: `31` & KeyToDeclaration[searchGroupBoosts]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_searchInComments(declaration: `51` & KeyToDeclaration[searchInComments]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_showConfig(declaration: `30` & KeyToDeclaration[showConfig]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_skipErrorChecking(declaration: `24` & KeyToDeclaration[skipErrorChecking]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_sort(declaration: `21` & KeyToDeclaration[sort]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_theme(declaration: `26` & KeyToDeclaration[theme]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_treatWarningsAsErrors(declaration: `44` & KeyToDeclaration[treatWarningsAsErrors]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_tsconfig(declaration: `42` & KeyToDeclaration[tsconfig]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_validation(declaration: `43` & KeyToDeclaration[validation]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_version(declaration: `0` & KeyToDeclaration[version]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_visibilityFilters(declaration: `11` & KeyToDeclaration[visibilityFilters]): Unit = js.native
    @JSName("addDeclaration")
    def addDeclaration_watch(declaration: `25` & KeyToDeclaration[watch]): Unit = js.native
    
    /**
      * Adds the option declarations declared by the TypeDoc and all supported TypeScript declarations.
      */
    def addDefaultDeclarations(): Unit = js.native
    
    /**
      * Adds an option reader that will be used to read configuration values
      * from the command line, configuration files, or other locations.
      * @param reader
      */
    def addReader(reader: OptionsReader): Unit = js.native
    
    /** @internal */
    def fixCompilerOptions(options: ReadonlyCompilerOptions): CompilerOptions = js.native
    
    /**
      * Marks the options as readonly, enables caching when fetching options, which improves performance.
      */
    def freeze(): Unit = js.native
    
    /**
      * Gets the set compiler options.
      */
    def getCompilerOptions(): CompilerOptions = js.native
    
    /**
      * Gets a declaration by one of its names.
      * @param name
      */
    def getDeclaration(name: String): js.UndefOr[DeclarationOption] = js.native
    
    /**
      * Gets all declared options.
      */
    def getDeclarations(): js.Array[DeclarationOption] = js.native
    
    /**
      * Gets the file names discovered through reading a tsconfig file.
      */
    def getFileNames(): js.Array[String] = js.native
    
    /**
      * Gets the project references - used in solution style tsconfig setups.
      */
    def getProjectReferences(): js.Array[ProjectReference] = js.native
    
    /**
      * Gets all of the TypeDoc option values defined in this option container.
      */
    def getRawValues(): ReadonlyPartialTypeDocOpt = js.native
    
    def getValue(name: NeverIfInternal[String]): Any = js.native
    @JSName("getValue")
    def getValue_basePath(name: basePath): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_blockTags(name: blockTags): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | js.Array[`@$LeftcurlybracketstringRightcurlybracket`] | Any = js.native
    @JSName("getValue")
    def getValue_categorizeByGroup(name: categorizeByGroup): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_categoryOrder(name: categoryOrder): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any = js.native
    @JSName("getValue")
    def getValue_cleanOutputDir(name: cleanOutputDir): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_cname(name: cname): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_commentStyle(name: commentStyle): (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.All[any | undefined] */ js.Any) | typings.typedoc.anon.All | Any = js.native
    @JSName("getValue")
    def getValue_compilerOptions(name: compilerOptions): (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any = js.native
    @JSName("getValue")
    def getValue_customCss(name: customCss): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_darkHighlightTheme(name: darkHighlightTheme): (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Theme | Any = js.native
    @JSName("getValue")
    def getValue_defaultCategory(name: defaultCategory): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_disableSources(name: disableSources): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_emit(name: emit): (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Both[any | undefined] */ js.Any) | Both | Any = js.native
    @JSName("getValue")
    def getValue_entryPointStrategy(name: entryPointStrategy): (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Expand[any | undefined] */ js.Any) | Expand | Any = js.native
    @JSName("getValue")
    def getValue_entryPoints(name: entryPoints): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any = js.native
    @JSName("getValue")
    def getValue_exclude(name: exclude): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any = js.native
    @JSName("getValue")
    def getValue_excludeExternals(name: excludeExternals): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_excludeInternal(name: excludeInternal): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_excludeNotDocumented(name: excludeNotDocumented): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_excludePrivate(name: excludePrivate): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_excludeProtected(name: excludeProtected): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_excludeTags(name: excludeTags): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | js.Array[`@$LeftcurlybracketstringRightcurlybracket`] | Any = js.native
    @JSName("getValue")
    def getValue_externalPattern(name: externalPattern): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any = js.native
    @JSName("getValue")
    def getValue_externalSymbolLinkMappings(name: externalSymbolLinkMappings): (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Record[String, String]]]) | Any = js.native
    @JSName("getValue")
    def getValue_gaID(name: gaID): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_gitRemote(name: gitRemote): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_gitRevision(name: gitRevision): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_githubPages(name: githubPages): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_help(name: help): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_hideGenerator(name: hideGenerator): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_htmlLang(name: htmlLang): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_includeVersion(name: includeVersion): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_includes(name: includes): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_inlineTags(name: inlineTags): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | js.Array[`@$LeftcurlybracketstringRightcurlybracket`] | Any = js.native
    @JSName("getValue")
    def getValue_intentionallyNotExported(name: intentionallyNotExported): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any = js.native
    @JSName("getValue")
    def getValue_json(name: json): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_lightHighlightTheme(name: lightHighlightTheme): (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Theme | Any = js.native
    @JSName("getValue")
    def getValue_logLevel(name: logLevel): (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined] */ js.Any) | Any = js.native
    @JSName("getValue")
    def getValue_logger(name: typings.typedoc.typedocStrings.logger): (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any = js.native
    @JSName("getValue")
    def getValue_markedOptions(name: markedOptions): (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Any = js.native
    @JSName("getValue")
    def getValue_media(name: media): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_modifierTags(name: modifierTags): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | js.Array[`@$LeftcurlybracketstringRightcurlybracket`] | Any = js.native
    @JSName("getValue")
    def getValue_name(name: name): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_options(name: options): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_out(name: out): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_plugin(name: plugin): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | js.Array[String] | Any = js.native
    @JSName("getValue")
    def getValue_preserveWatchOutput(name: preserveWatchOutput): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_pretty(name: pretty): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_readme(name: readme): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_requiredToBeDocumented(name: requiredToBeDocumented): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<keyof typedoc.anon.TypeofReflectionKind>[any | undefined] */ js.Any) | (js.Array[
        /* keyof typedoc.anon.TypeofReflectionKind */ All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
      ]) | Any = js.native
    /**
      * Gets a value for the given option key, throwing if the option has not been declared.
      * @param name
      */
    @JSName("getValue")
    def getValue_searchCategoryBoosts(name: searchCategoryBoosts): (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Double]]) | Any = js.native
    @JSName("getValue")
    def getValue_searchGroupBoosts(name: searchGroupBoosts): (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | (ManuallyValidatedOption[Record[String, Double]]) | Any = js.native
    @JSName("getValue")
    def getValue_searchInComments(name: searchInComments): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_showConfig(name: showConfig): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_skipErrorChecking(name: skipErrorChecking): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_sort(name: sort): (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined] */ js.Any) | js.Array[SortStrategy] | Any = js.native
    @JSName("getValue")
    def getValue_theme(name: theme): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_treatWarningsAsErrors(name: treatWarningsAsErrors): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_tsconfig(name: tsconfig): (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | String | Any = js.native
    @JSName("getValue")
    def getValue_validation(name: validation): (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined] */ js.Any) | ValidationOptions | Any = js.native
    @JSName("getValue")
    def getValue_version(name: version): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    @JSName("getValue")
    def getValue_visibilityFilters(name: visibilityFilters): (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<typedoc.anon.Dicttag>[any | undefined] */ js.Any) | ManuallyValidatedOption[Dicttag] | Any = js.native
    @JSName("getValue")
    def getValue_watch(name: watch): (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Boolean | Any = js.native
    
    /**
      * Checks if the options object has been frozen, preventing future changes to option values.
      */
    def isFrozen(): Boolean = js.native
    
    /**
      * Checks if the given option's value is deeply strict equal to the default.
      * @param name
      */
    def isSet(
      name: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ Any) | NeverIfInternal[String]
    ): Boolean = js.native
    
    def read(logger: Logger): Unit = js.native
    
    /**
      * Resets the option bag to all default values.
      * If a name is provided, will only reset that name.
      */
    def reset(): Unit = js.native
    def reset(
      name: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ Any) | NeverIfInternal[String]
    ): Unit = js.native
    
    /**
      * Take a snapshot of option values now, used in tests only.
      * @internal
      */
    def restore(snapshot: js.Object): Unit = js.native
    
    /**
      * Sets the compiler options that will be used to get a TS program.
      */
    def setCompilerOptions(fileNames: js.Array[String], options: CompilerOptions): Unit = js.native
    def setCompilerOptions(
      fileNames: js.Array[String],
      options: CompilerOptions,
      projectReferences: js.Array[ProjectReference]
    ): Unit = js.native
    
    /**
      * Sets the logger used when an option declaration fails to be added.
      * @param logger
      */
    def setLogger(logger: Logger): Unit = js.native
    
    def setValue(name: NeverIfInternal[String], value: NeverIfInternal[Any]): Unit = js.native
    def setValue(name: NeverIfInternal[String], value: NeverIfInternal[Any], configPath: NeverIfInternal[String]): Unit = js.native
    def setValue(
      name: blockTags,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
        ]
    ): Unit = js.native
    def setValue(
      name: blockTags,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
        ],
      configPath: String
    ): Unit = js.native
    def setValue(
      name: excludeTags,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
        ]
    ): Unit = js.native
    def setValue(
      name: excludeTags,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
        ],
      configPath: String
    ): Unit = js.native
    def setValue(
      name: inlineTags,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
        ]
    ): Unit = js.native
    def setValue(
      name: inlineTags,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
        ],
      configPath: String
    ): Unit = js.native
    def setValue(
      name: modifierTags,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
        ]
    ): Unit = js.native
    def setValue(
      name: modifierTags,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<'@${string}'>[any | undefined] */ js.Any) | PartialArraystring | Boolean | js.Array[`@$LeftcurlybracketstringRightcurlybracket`]
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_basePath(
      name: basePath,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_basePath(
      name: basePath,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_categorizeByGroup(
      name: categorizeByGroup,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_categorizeByGroup(
      name: categorizeByGroup,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_categoryOrder(
      name: categoryOrder,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_categoryOrder(
      name: categoryOrder,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_cleanOutputDir(
      name: cleanOutputDir,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_cleanOutputDir(
      name: cleanOutputDir,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_cname(
      name: cname,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_cname(
      name: cname,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_commentStyle(
      name: commentStyle,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.All[any | undefined] */ js.Any) | PartialreadonlyJSDocjsdoc | Boolean | typings.typedoc.anon.All
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_commentStyle(
      name: commentStyle,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.All[any | undefined] */ js.Any) | PartialreadonlyJSDocjsdoc | Boolean | typings.typedoc.anon.All
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_compilerOptions(
      name: compilerOptions,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_compilerOptions(
      name: compilerOptions,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_customCss(
      name: customCss,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_customCss(
      name: customCss,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_darkHighlightTheme(
      name: darkHighlightTheme,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Partial[Theme] | Boolean | Theme
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_darkHighlightTheme(
      name: darkHighlightTheme,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Partial[Theme] | Boolean | Theme
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_defaultCategory(
      name: defaultCategory,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_defaultCategory(
      name: defaultCategory,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_disableSources(
      name: disableSources,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_disableSources(
      name: disableSources,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_emit(
      name: emit,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Both[any | undefined] */ js.Any) | Partialreadonlybothbothre | Boolean | Both
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_emit(
      name: emit,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Both[any | undefined] */ js.Any) | Partialreadonlybothbothre | Boolean | Both
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_entryPointStrategy(
      name: entryPointStrategy,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Expand[any | undefined] */ js.Any) | PartialreadonlyResolveres | Boolean | Expand
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_entryPointStrategy(
      name: entryPointStrategy,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.anon.Expand[any | undefined] */ js.Any) | PartialreadonlyResolveres | Boolean | Expand
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_entryPoints(
      name: entryPoints,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_entryPoints(
      name: entryPoints,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_exclude(
      name: exclude,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_exclude(
      name: exclude,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_excludeExternals(
      name: excludeExternals,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_excludeExternals(
      name: excludeExternals,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_excludeInternal(
      name: excludeInternal,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_excludeInternal(
      name: excludeInternal,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_excludeNotDocumented(
      name: excludeNotDocumented,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_excludeNotDocumented(
      name: excludeNotDocumented,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_excludePrivate(
      name: excludePrivate,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_excludePrivate(
      name: excludePrivate,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_excludeProtected(
      name: excludeProtected,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_excludeProtected(
      name: excludeProtected,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_externalPattern(
      name: externalPattern,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_externalPattern(
      name: externalPattern,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_externalSymbolLinkMappings(
      name: externalSymbolLinkMappings,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined] */ js.Any) | PartialManuallyValidatedO0 | Boolean | (ManuallyValidatedOption[Record[String, Record[String, String]]])
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_externalSymbolLinkMappings(
      name: externalSymbolLinkMappings,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined] */ js.Any) | PartialManuallyValidatedO0 | Boolean | (ManuallyValidatedOption[Record[String, Record[String, String]]])
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_gaID(
      name: gaID,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_gaID(
      name: gaID,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_gitRemote(
      name: gitRemote,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_gitRemote(
      name: gitRemote,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_gitRevision(
      name: gitRevision,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_gitRevision(
      name: gitRevision,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_githubPages(
      name: githubPages,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_githubPages(
      name: githubPages,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_help(
      name: help,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_help(
      name: help,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_hideGenerator(
      name: hideGenerator,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_hideGenerator(
      name: hideGenerator,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_htmlLang(
      name: htmlLang,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_htmlLang(
      name: htmlLang,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_includeVersion(
      name: includeVersion,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_includeVersion(
      name: includeVersion,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_includes(
      name: includes,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_includes(
      name: includes,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_intentionallyNotExported(
      name: intentionallyNotExported,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_intentionallyNotExported(
      name: intentionallyNotExported,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_json(
      name: json,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_json(
      name: json,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_lightHighlightTheme(
      name: lightHighlightTheme,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Partial[Theme] | Boolean | Theme
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_lightHighlightTheme(
      name: lightHighlightTheme,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: shiki.shiki.Theme[any | undefined] */ js.Any) | Partial[Theme] | Boolean | Theme
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_logLevel(
      name: logLevel,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined] */ js.Any) | (Partial[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any
          ]) | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_logLevel(
      name: logLevel,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined] */ js.Any) | (Partial[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ Any
          ]) | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_logger(
      name: typings.typedoc.typedocStrings.logger,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_logger(
      name: typings.typedoc.typedocStrings.logger,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_markedOptions(
      name: markedOptions,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_markedOptions(
      name: markedOptions,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: unknown[any | undefined] */ js.Any) | Partial[Any] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_media(
      name: media,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_media(
      name: media,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_name(
      name: name,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_name(
      name: name,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_options(
      name: options,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_options(
      name: options,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_out(
      name: out,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_out(
      name: out,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_plugin(
      name: plugin,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_plugin(
      name: plugin,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[any | undefined] */ js.Any) | PartialArraystringAt | Boolean | js.Array[String]
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_preserveWatchOutput(
      name: preserveWatchOutput,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_preserveWatchOutput(
      name: preserveWatchOutput,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_pretty(
      name: pretty,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_pretty(
      name: pretty,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_readme(
      name: readme,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_readme(
      name: readme,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_requiredToBeDocumented(
      name: requiredToBeDocumented,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<keyof typedoc.anon.TypeofReflectionKind>[any | undefined] */ js.Any) | PartialArraykeyofreadonly | Boolean | (js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ])
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_requiredToBeDocumented(
      name: requiredToBeDocumented,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<keyof typedoc.anon.TypeofReflectionKind>[any | undefined] */ js.Any) | PartialArraykeyofreadonly | Boolean | (js.Array[
            /* keyof typedoc.anon.TypeofReflectionKind */ All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
          ])
        ],
      configPath: String
    ): Unit = js.native
    /**
      * Sets the given declared option. Throws if setting the option fails.
      * @param name
      * @param value
      * @param configPath the directory to resolve Path type values against
      */
    @JSName("setValue")
    def setValue_searchCategoryBoosts(
      name: searchCategoryBoosts,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | PartialManuallyValidatedO | Boolean | (ManuallyValidatedOption[Record[String, Double]])
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_searchCategoryBoosts(
      name: searchCategoryBoosts,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | PartialManuallyValidatedO | Boolean | (ManuallyValidatedOption[Record[String, Double]])
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_searchGroupBoosts(
      name: searchGroupBoosts,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | PartialManuallyValidatedO | Boolean | (ManuallyValidatedOption[Record[String, Double]])
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_searchGroupBoosts(
      name: searchGroupBoosts,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined] */ js.Any) | PartialManuallyValidatedO | Boolean | (ManuallyValidatedOption[Record[String, Double]])
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_searchInComments(
      name: searchInComments,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_searchInComments(
      name: searchInComments,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_showConfig(
      name: showConfig,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_showConfig(
      name: showConfig,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_skipErrorChecking(
      name: skipErrorChecking,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_skipErrorChecking(
      name: skipErrorChecking,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_sort(
      name: sort,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined] */ js.Any) | PartialArraySortStrategy | Boolean | js.Array[SortStrategy]
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_sort(
      name: sort,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined] */ js.Any) | PartialArraySortStrategy | Boolean | js.Array[SortStrategy]
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_theme(
      name: theme,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_theme(
      name: theme,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_treatWarningsAsErrors(
      name: treatWarningsAsErrors,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_treatWarningsAsErrors(
      name: treatWarningsAsErrors,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_tsconfig(
      name: tsconfig,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_tsconfig(
      name: tsconfig,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: string[any | undefined] */ js.Any) | Partial[String] | Boolean | String
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_validation(
      name: validation,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined] */ js.Any) | PartialValidationOptions | Boolean | ValidationOptions
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_validation(
      name: validation,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined] */ js.Any) | PartialValidationOptions | Boolean | ValidationOptions
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_version(
      name: version,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_version(
      name: version,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_visibilityFilters(
      name: visibilityFilters,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<typedoc.anon.Dicttag>[any | undefined] */ js.Any) | PartialManuallyValidatedOValidated | Boolean | ManuallyValidatedOption[Dicttag]
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_visibilityFilters(
      name: visibilityFilters,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<typedoc.anon.Dicttag>[any | undefined] */ js.Any) | PartialManuallyValidatedOValidated | Boolean | ManuallyValidatedOption[Dicttag]
        ],
      configPath: String
    ): Unit = js.native
    @JSName("setValue")
    def setValue_watch(
      name: watch,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ]
    ): Unit = js.native
    @JSName("setValue")
    def setValue_watch(
      name: watch,
      value: js.UndefOr[
          Any | (/* import warning: importer.ImportType#apply Failed type conversion: boolean[any | undefined] */ js.Any) | Partial[Boolean] | Boolean
        ],
      configPath: String
    ): Unit = js.native
    
    /**
      * Take a snapshot of option values now, used in tests only.
      * @internal
      */
    def snapshot(): js.Object = js.native
  }
  
  trait OptionsReader extends StObject {
    
    /**
      * The name of this reader so that it may be removed by plugins without the plugin
      * accessing the instance performing the read. Multiple readers may have the same
      * name.
      */
    var name: String
    
    /**
      * Readers will be processed according to their priority.
      * A higher priority indicates that the reader should be called *later* so that
      * it can override options set by lower priority readers.
      *
      * Note that to preserve expected behavior, the argv reader must have both the lowest
      * priority so that it may set the location of config files used by other readers and
      * the highest priority so that it can override settings from lower priority readers.
      *
      * Note: In 0.23. `priority` will be renamed to `order`, with the same meaning
      */
    var priority: Double
    
    /**
      * Read options from the reader's source and place them in the options parameter.
      * Options without a declared name may be treated as if they were declared with type
      * {@link ParameterType.Mixed}. Options which have been declared must be converted to the
      * correct type. As an alternative to doing this conversion in the reader,
      * the reader may use {@link Options.setValue}, which will correctly convert values.
      * @param options
      * @param compilerOptions
      * @param container the options container that provides declarations
      * @param logger
      */
    def read(container: Options, logger: Logger): Unit
  }
  object OptionsReader {
    
    inline def apply(name: String, priority: Double, read: (Options, Logger) => Unit): OptionsReader = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], read = js.Any.fromFunction2(read))
      __obj.asInstanceOf[OptionsReader]
    }
    
    extension [Self <: OptionsReader](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setRead(value: (Options, Logger) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
    }
  }
}
