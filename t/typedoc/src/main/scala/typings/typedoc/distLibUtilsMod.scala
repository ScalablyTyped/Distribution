package typings.typedoc

import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.ClassDecorator
import typings.std.NumberConstructor
import typings.std.PropertyKey
import typings.std.Record
import typings.std.StringConstructor
import typings.typedoc.anon.Application
import typings.typedoc.anon.Dictk
import typings.typedoc.anon.Html
import typings.typedoc.anon.Priority
import typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import typings.typedoc.distLibUtilsComponentMod.Component
import typings.typedoc.distLibUtilsComponentMod.ComponentHost
import typings.typedoc.distLibUtilsComponentMod.ComponentOptions
import typings.typedoc.distLibUtilsEntryPointMod.DocumentationEntryPoint
import typings.typedoc.distLibUtilsGeneralMod.NeverIfInternal
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxChildren
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxComponent
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import typings.typedoc.distLibUtilsSortMod.SortStrategy
import typings.typedoc.distLibUtilsValidationMod.Optional_
import typings.typedoc.distLibUtilsValidationMod.Schema
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
import typings.typedoc.typedocStrings.expand
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
import typings.typedoc.typedocStrings.navigationLinks
import typings.typedoc.typedocStrings.options
import typings.typedoc.typedocStrings.out
import typings.typedoc.typedocStrings.packages
import typings.typedoc.typedocStrings.plugin
import typings.typedoc.typedocStrings.preserveWatchOutput
import typings.typedoc.typedocStrings.pretty
import typings.typedoc.typedocStrings.readme
import typings.typedoc.typedocStrings.requiredToBeDocumented
import typings.typedoc.typedocStrings.resolve
import typings.typedoc.typedocStrings.searchCategoryBoosts
import typings.typedoc.typedocStrings.searchGroupBoosts
import typings.typedoc.typedocStrings.searchInComments
import typings.typedoc.typedocStrings.showConfig
import typings.typedoc.typedocStrings.sidebarLinks
import typings.typedoc.typedocStrings.skipErrorChecking
import typings.typedoc.typedocStrings.sort
import typings.typedoc.typedocStrings.sourceLinkTemplate
import typings.typedoc.typedocStrings.theme
import typings.typedoc.typedocStrings.titleLink
import typings.typedoc.typedocStrings.treatWarningsAsErrors
import typings.typedoc.typedocStrings.tsconfig
import typings.typedoc.typedocStrings.validation
import typings.typedoc.typedocStrings.version
import typings.typedoc.typedocStrings.visibilityFilters
import typings.typedoc.typedocStrings.watch
import typings.typescript.mod.Program
import typings.typescript.mod.Symbol
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsMod {
  
  @JSImport("typedoc/dist/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/utils", "AbstractComponent")
  @js.native
  open class AbstractComponent[O /* <: ComponentHost */] protected ()
    extends typings.typedoc.distLibUtilsComponentMod.AbstractComponent[O] {
    /**
      * Create new Component instance.
      */
    def this(owner: O) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "ArgumentsReader")
  @js.native
  open class ArgumentsReader protected ()
    extends typings.typedoc.distLibUtilsOptionsMod.ArgumentsReader {
    def this(priority: Double) = this()
    def this(priority: Double, args: js.Array[String]) = this()
  }
  
  inline def BindOption(name: NeverIfInternal[String]): js.Function2[/* target */ Application | typings.typedoc.anon.Options, /* key */ PropertyKey, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Application | typings.typedoc.anon.Options, /* key */ PropertyKey, Unit]]
  
  inline def BindOption_basePath(name: basePath): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_blockTags(name: blockTags): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_categorizeByGroup(name: categorizeByGroup): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_categoryOrder(name: categoryOrder): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_cleanOutputDir(name: cleanOutputDir): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_cname(name: cname): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_commentStyle(name: commentStyle): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}? unknown : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}? unknown : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}? unknown : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}? unknown : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'} : { readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_compilerOptions(name: compilerOptions): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_customCss(name: customCss): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_darkHighlightTheme(name: darkHighlightTheme): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_defaultCategory(name: defaultCategory): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_disableSources(name: disableSources): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_emit(name: emit): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}? unknown : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}? unknown : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}? unknown : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}? unknown : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly both :'both',  readonly docs :'docs',  readonly none :'none'} : { readonly both :'both',  readonly docs :'docs',  readonly none :'none'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_entryPointStrategy(name: entryPointStrategy): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}? unknown : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}? unknown : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}? unknown : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}? unknown : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'} : { readonly Resolve :'resolve',  readonly Expand :'expand',  readonly Packages :'packages'}[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_entryPoints(name: entryPoints): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_exclude(name: exclude): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeExternals(name: excludeExternals): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeInternal(name: excludeInternal): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeNotDocumented(name: excludeNotDocumented): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludePrivate(name: excludePrivate): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeProtected(name: excludeProtected): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_excludeTags(name: excludeTags): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_externalPattern(name: externalPattern): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_externalSymbolLinkMappings(name: externalSymbolLinkMappings): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, std.Record<string, string>>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_gaID(name: gaID): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_gitRemote(name: gitRemote): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_gitRevision(name: gitRevision): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_githubPages(name: githubPages): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_help(name: help): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_hideGenerator(name: hideGenerator): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_htmlLang(name: htmlLang): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_includeVersion(name: includeVersion): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_includes(name: includes): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_inlineTags(name: inlineTags): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_intentionallyNotExported(name: intentionallyNotExported): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_json(name: json): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_lightHighlightTheme(name: lightHighlightTheme): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends shiki.shiki.Theme? unknown : shiki.shiki.Theme extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : shiki.shiki.Theme extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? shiki.shiki.Theme : shiki.shiki.Theme[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_logLevel(name: logLevel): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any? unknown : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any? unknown : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any? unknown : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any? unknown : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel * / any[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_logger(name: logger): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_markedOptions(name: markedOptions): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends unknown? unknown : unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : unknown extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? unknown : unknown[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_media(name: media): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_modifierTags(name: modifierTags): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array</ * template literal string: @${string} * / string>? unknown : std.Array</ * template literal string: @${string} * / string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array</ * template literal string: @${string} * / string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array</ * template literal string: @${string} * / string> : std.Array</ * template literal string: @${string} * / string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_name(name: name): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_navigationLinks(name: navigationLinks): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_options(name: options): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_out(name: out): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_plugin(name: plugin): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<string>? unknown : std.Array<string> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<string> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<string> : std.Array<string>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_preserveWatchOutput(name: preserveWatchOutput): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_pretty(name: pretty): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_readme(name: readme): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_requiredToBeDocumented(name: requiredToBeDocumented): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>? unknown : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>? unknown : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>? unknown : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>? unknown : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}> : std.Array<keyof { readonly All :number,  readonly ClassOrInterface :number,  readonly VariableOrProperty :number,  readonly FunctionOrMethod :number,  readonly ClassMember :number,  readonly SomeSignature :number,  readonly SomeModule :number,  readonly SomeType :number,  readonly SomeValue :number,  readonly SomeMember :number,  readonly SomeExport :number,  readonly ExportContainer :number,  readonly Inheritable :number,  readonly ContainsCallSignatures :number,  readonly SignatureContainer :number}>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_searchCategoryBoosts(name: searchCategoryBoosts): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_searchGroupBoosts(name: searchGroupBoosts): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, number>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_searchInComments(name: searchInComments): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_showConfig(name: showConfig): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_sidebarLinks(name: sidebarLinks): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<std.Record<string, string>>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_skipErrorChecking(name: skipErrorChecking): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_sort(name: sort): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>? unknown : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>? unknown : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>? unknown : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>? unknown : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy> : std.Array<typedoc.typedoc/dist/lib/utils/sort.SortStrategy>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_sourceLinkTemplate(name: sourceLinkTemplate): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_theme(name: theme): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_titleLink(name: titleLink): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_treatWarningsAsErrors(name: treatWarningsAsErrors): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_tsconfig(name: tsconfig): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends string? unknown : string extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : string extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? string : string[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_validation(name: validation): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions : typedoc.typedoc/dist/lib/utils/options/declaration.ValidationOptions[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_version(name: version): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_visibilityFilters(name: visibilityFilters): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>? unknown : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}> : typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<{  protected :boolean | undefined,   private :boolean | undefined,   inherited :boolean | undefined,   external :boolean | undefined, [tag: / * template literal string: @${string} * / string] : boolean}>[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  inline def BindOption_watch(name: watch): js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("BindOption")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ (Application & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)) | (typings.typedoc.anon.Options & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K2 in std.PropertyKey ]: unknown extends boolean? unknown : boolean extends typedoc.typedoc/dist/lib/utils/options/declaration.ManuallyValidatedOption<infer ManuallyValidated>? ManuallyValidated : boolean extends string | std.Array<string> | number | boolean | std.Record<string, boolean>? boolean : boolean[any | undefined]} */ js.Any)), 
    /* key */ PropertyKey, 
    Unit
  ]]
  
  @JSImport("typedoc/dist/lib/utils", "CallbackLogger")
  @js.native
  open class CallbackLogger protected ()
    extends typings.typedoc.distLibUtilsLoggersMod.CallbackLogger {
    /**
      * Create a new CallbackLogger instance.
      *
      * @param callback  The callback that should be used to log messages.
      */
    def this(callback: js.Function) = this()
  }
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/utils", "ChildableComponent")
  @js.native
  open class ChildableComponent[O /* <: ComponentHost */, C /* <: Component */] protected ()
    extends typings.typedoc.distLibUtilsComponentMod.ChildableComponent[O, C] {
    /**
      * Create new Component instance.
      */
    def this(owner: O) = this()
  }
  
  object CommentStyle {
    
    @JSImport("typedoc/dist/lib/utils", "CommentStyle.All")
    @js.native
    val All: all_ = js.native
    
    @JSImport("typedoc/dist/lib/utils", "CommentStyle.Block")
    @js.native
    val Block: block = js.native
    
    @JSImport("typedoc/dist/lib/utils", "CommentStyle.JSDoc")
    @js.native
    val JSDoc: jsdoc = js.native
    
    @JSImport("typedoc/dist/lib/utils", "CommentStyle.Line")
    @js.native
    val Line: line = js.native
  }
  
  inline def Component(options: ComponentOptions): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Component")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  @JSImport("typedoc/dist/lib/utils", "ConsoleLogger")
  @js.native
  /**
    * Create a new ConsoleLogger instance.
    */
  open class ConsoleLogger ()
    extends typings.typedoc.distLibUtilsLoggersMod.ConsoleLogger
  
  @JSImport("typedoc/dist/lib/utils", "DefaultMap")
  @js.native
  open class DefaultMap[K, V] protected ()
    extends typings.typedoc.distLibUtilsMapMod.DefaultMap[K, V] {
    def this(creator: js.Function0[V]) = this()
  }
  
  object EntryPointStrategy {
    
    /**
      * The default behavior in v0.21 and earlier. Behaves like the resolve behavior, but will recursively
      * expand directories into an entry point for each file within the directory.
      */
    @JSImport("typedoc/dist/lib/utils", "EntryPointStrategy.Expand")
    @js.native
    val Expand: expand = js.native
    
    /**
      * Alternative resolution mode useful for monorepos. With this mode, TypeDoc will look for a package.json
      * and tsconfig.json under each provided entry point. The `main` field of each package will be documented.
      */
    @JSImport("typedoc/dist/lib/utils", "EntryPointStrategy.Packages")
    @js.native
    val Packages: packages = js.native
    
    /**
      * The default behavior in v0.22+, expects all provided entry points as being part of a single program.
      * Any directories included in the entry point list will result in `dir/index.([cm][tj]s|[tj]sx?)` being used.
      */
    @JSImport("typedoc/dist/lib/utils", "EntryPointStrategy.Resolve")
    @js.native
    val Resolve: resolve = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils", "Event")
  @js.native
  open class Event protected ()
    extends typings.typedoc.distLibUtilsEventsMod.Event {
    /**
      * Create a new Event instance.
      */
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "EventDispatcher")
  @js.native
  open class EventDispatcher ()
    extends typings.typedoc.distLibUtilsEventsMod.EventDispatcher
  
  @JSImport("typedoc/dist/lib/utils", "EventHooks")
  @js.native
  open class EventHooks[T /* <: Record[/* keyof T */ String, js.Array[Any]] */, R] ()
    extends typings.typedoc.distLibUtilsHooksMod.EventHooks[T, R]
  
  @JSImport("typedoc/dist/lib/utils", "Fragment")
  @js.native
  val Fragment: js.Symbol = js.native
  
  object JSX {
    
    @JSImport("typedoc/dist/lib/utils", "JSX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/utils", "JSX.Fragment")
    @js.native
    val Fragment: js.Symbol = js.native
    
    inline def Raw(_props: Html): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Raw")(_props.asInstanceOf[js.Any]).asInstanceOf[Null]
    
    inline def createElement(tag: String, props: js.Object, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    inline def createElement(tag: String, props: Null, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    inline def createElement(tag: js.Symbol, props: js.Object, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    inline def createElement(tag: js.Symbol, props: Null, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    inline def createElement(tag: JsxComponent[Any], props: js.Object, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    inline def createElement(tag: JsxComponent[Any], props: Null, children: JsxChildren*): JsxElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(tag.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[JsxElement]
    
    inline def renderElement(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")().asInstanceOf[String]
    inline def renderElement(element: JsxElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("typedoc/dist/lib/utils", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibUtilsLoggersMod.LogLevel & Double] = js.native
    
    /* 3 */ val Error: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Error & Double = js.native
    
    /* 1 */ val Info: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Info & Double = js.native
    
    /* 0 */ val Verbose: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Verbose & Double = js.native
    
    /* 2 */ val Warn: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Warn & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils", "Logger")
  @js.native
  open class Logger ()
    extends typings.typedoc.distLibUtilsLoggersMod.Logger
  
  @JSImport("typedoc/dist/lib/utils", "MinimalSourceFile")
  @js.native
  open class MinimalSourceFile protected ()
    extends typings.typedoc.distLibUtilsMinimalSourceFileMod.MinimalSourceFile {
    def this(text: String, fileName: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "Options")
  @js.native
  open class Options protected ()
    extends typings.typedoc.distLibUtilsOptionsMod.Options {
    def this(logger: typings.typedoc.distLibUtilsLoggersMod.Logger) = this()
  }
  
  @JSImport("typedoc/dist/lib/utils", "ParameterHint")
  @js.native
  object ParameterHint extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterHint & Double] = js.native
    
    /* 1 */ val Directory: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterHint.Directory & Double = js.native
    
    /* 0 */ val File: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterHint.File & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils", "ParameterType")
  @js.native
  object ParameterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType & Double] = js.native
    
    /* 6 */ val Array: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Array & Double = js.native
    
    /* 3 */ val Boolean: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Boolean & Double = js.native
    
    /* 11 */ val Flags: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Flags & Double = js.native
    
    /* 9 */ val GlobArray: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.GlobArray & Double = js.native
    
    /* 4 */ val Map: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Map & Double = js.native
    
    /* 5 */ val Mixed: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Mixed & Double = js.native
    
    /* 8 */ val ModuleArray: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.ModuleArray & Double = js.native
    
    /* 2 */ val Number: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Number & Double = js.native
    
    /* 10 */ val Object: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Object & Double = js.native
    
    /* 1 */ val Path: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Path & Double = js.native
    
    /* 7 */ val PathArray: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.PathArray & Double = js.native
    
    /* 0 */ val String: typings.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.String & Double = js.native
  }
  
  inline def Raw(_props: Html): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Raw")(_props.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("typedoc/dist/lib/utils", "TSConfigReader")
  @js.native
  open class TSConfigReader ()
    extends typings.typedoc.distLibUtilsOptionsMod.TSConfigReader
  /* static members */
  object TSConfigReader {
    
    @JSImport("typedoc/dist/lib/utils", "TSConfigReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Not considered part of the public API. You can use it, but it might break.
      * @internal
      */
    inline def findConfigFile(file: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfigFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  }
  
  @JSImport("typedoc/dist/lib/utils", "TypeDocReader")
  @js.native
  open class TypeDocReader ()
    extends typings.typedoc.distLibUtilsOptionsMod.TypeDocReader
  
  object Validation {
    
    @JSImport("typedoc/dist/lib/utils", "Validation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/utils", "Validation.additionalProperties")
    @js.native
    val additionalProperties: js.Symbol = js.native
    
    inline def isTagString(x: Any): /* is / * template literal string: @${string} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTagString")(x.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: @${string} * / string */ Boolean]
    
    inline def optional(x: js.Array[String]): Optional_[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[js.Array[String]]]
    inline def optional(x: BooleanConstructor): Optional_[BooleanConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[BooleanConstructor]]
    inline def optional(x: NumberConstructor): Optional_[NumberConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[NumberConstructor]]
    inline def optional(x: StringConstructor): Optional_[StringConstructor] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[StringConstructor]]
    inline def optional[T /* <: (js.Tuple2[ArrayConstructor, Schema]) | Dictk | (js.Function1[/* x */ Any, /* is unknown */ Boolean]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in symbol ]: std.StringConstructor} */ js.Any) */](x: T): Optional_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(x.asInstanceOf[js.Any]).asInstanceOf[Optional_[T]]
    
    inline def validate(schema: js.Array[String], obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.Array<string>> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.Array<string>> */ Boolean]
    inline def validate(schema: BooleanConstructor, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.BooleanConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.BooleanConstructor> */ Boolean]
    inline def validate(schema: NumberConstructor, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.NumberConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.NumberConstructor> */ Boolean]
    inline def validate(schema: StringConstructor, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.StringConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<std.StringConstructor> */ Boolean]
    inline def validate[T /* <: (js.Tuple2[ArrayConstructor, Schema]) | Dictk | (js.Function1[/* x */ Any, /* is unknown */ Boolean]) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in symbol ]: std.StringConstructor} */ js.Any) */](schema: T, obj: Any): /* is typedoc.typedoc/dist/lib/utils/validation.Infer<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(schema.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[/* is typedoc.typedoc/dist/lib/utils/validation.Infer<T> */ Boolean]
  }
  
  inline def assertNever(x: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNever")(x.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def copy(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def copySync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def discoverPlugins(app: typings.typedoc.distLibApplicationMod.Application): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("discoverPlugins")(app.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def filterMap[T, U](iter: js.Iterable[T], fn: js.Function1[/* item */ T, js.UndefOr[U]]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(iter.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  
  inline def getCommonDirectory(files: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommonDirectory")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getEntryPoints(
    logger: typings.typedoc.distLibUtilsLoggersMod.Logger,
    options: typings.typedoc.distLibUtilsOptionsMod.Options
  ): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntryPoints")(logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  
  inline def getExpandedEntryPointsForPaths(
    logger: typings.typedoc.distLibUtilsLoggersMod.Logger,
    inputFiles: js.Array[String],
    options: typings.typedoc.distLibUtilsOptionsMod.Options
  ): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpandedEntryPointsForPaths")(logger.asInstanceOf[js.Any], inputFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  inline def getExpandedEntryPointsForPaths(
    logger: typings.typedoc.distLibUtilsLoggersMod.Logger,
    inputFiles: js.Array[String],
    options: typings.typedoc.distLibUtilsOptionsMod.Options,
    programs: js.Array[Program]
  ): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpandedEntryPointsForPaths")(logger.asInstanceOf[js.Any], inputFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], programs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  
  inline def getQualifiedName(checker: TypeChecker, symbol: Symbol): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getQualifiedName")(checker.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWatchEntryPoints(
    logger: typings.typedoc.distLibUtilsLoggersMod.Logger,
    options: typings.typedoc.distLibUtilsOptionsMod.Options,
    program: Program
  ): js.UndefOr[js.Array[DocumentationEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWatchEntryPoints")(logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any], program.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[DocumentationEntryPoint]]]
  
  inline def insertPrioritySorted[T /* <: Priority */](arr: js.Array[T], item: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertPrioritySorted")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def loadPlugins(app: typings.typedoc.distLibApplicationMod.Application, plugins: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugins")(app.asInstanceOf[js.Any], plugins.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def partition[T](iter: js.Iterable[T], predicate: js.Function1[/* item */ T, Boolean]): js.Tuple2[js.Array[T], js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(iter.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[T], js.Array[T]]]
  
  inline def readFile(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeIf[T](arr: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIf")(arr.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeIfPresent[T](arr: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIfPresent")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeIfPresent[T](arr: Unit, item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIfPresent")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderElement(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")().asInstanceOf[String]
  inline def renderElement(element: JsxElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderElement")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sortReflections(reflections: js.Array[DeclarationReflection], strategies: js.Array[SortStrategy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortReflections")(reflections.asInstanceOf[js.Any], strategies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unique[T](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")().asInstanceOf[js.Array[T]]
  inline def unique[T](arr: js.Iterable[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def writeFile(fileName: String, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(fileName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeFileSync(fileName: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(fileName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
