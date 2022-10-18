package typings.sucrase

import typings.std.Set
import typings.sucrase.distTypesHelperManagerMod.HelperManager
import typings.sucrase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCjsimportprocessorMod {
  
  @JSImport("sucrase/dist/types/CJSImportProcessor", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CJSImportProcessor {
    def this(
      nameManager: typings.sucrase.distTypesNameManagerMod.default,
      tokens: typings.sucrase.distTypesTokenProcessorMod.default,
      enableLegacyTypeScriptModuleInterop: Boolean,
      options: Options,
      isTypeScriptTransformEnabled: Boolean,
      helperManager: HelperManager
    ) = this()
    
    /* private */ /* CompleteClass */
    var addExportBinding: Any = js.native
    
    /**
      * Return the code to use for the import for this path, or the empty string if
      * the code has already been "claimed" by a previous import.
      */
    /* CompleteClass */
    override def claimImportCode(importPath: String): String = js.native
    
    /* CompleteClass */
    override val enableLegacyTypeScriptModuleInterop: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var exportBindingsByLocalName: Any = js.native
    
    /* private */ /* CompleteClass */
    var generateImportReplacements: Any = js.native
    
    /* CompleteClass */
    override def getFreeIdentifierForPath(path: String): String = js.native
    
    /**
      * Return all imported/exported names where we might be interested in whether usages of those
      * names are shadowed.
      */
    /* CompleteClass */
    override def getGlobalNames(): Set[String] = js.native
    
    /* CompleteClass */
    override def getIdentifierReplacement(identifierName: String): String | Null = js.native
    
    /**
      * Get a mutable import info object for this path, creating one if it doesn't
      * exist yet.
      */
    /* private */ /* CompleteClass */
    var getImportInfo: Any = js.native
    
    /* private */ /* CompleteClass */
    var getNamedImports: Any = js.native
    
    /* CompleteClass */
    override val helperManager: HelperManager = js.native
    
    /* private */ /* CompleteClass */
    var identifierReplacements: Any = js.native
    
    /* private */ /* CompleteClass */
    var importInfoByPath: Any = js.native
    
    /* private */ /* CompleteClass */
    var importsToReplace: Any = js.native
    
    /* CompleteClass */
    override def isTypeName(name: String): Boolean = js.native
    
    /* CompleteClass */
    override val isTypeScriptTransformEnabled: Boolean = js.native
    
    /* CompleteClass */
    override val nameManager: typings.sucrase.distTypesNameManagerMod.default = js.native
    
    /* private */ /* CompleteClass */
    var nonTypeIdentifiers: Any = js.native
    
    /* CompleteClass */
    override val options: Options = js.native
    
    /* private */ /* CompleteClass */
    var preprocessExportAtIndex: Any = js.native
    
    /* private */ /* CompleteClass */
    var preprocessExportStarAtIndex: Any = js.native
    
    /* private */ /* CompleteClass */
    var preprocessImportAtIndex: Any = js.native
    
    /**
      * Walk this export statement just in case it's an export...from statement.
      * If it is, combine it into the import info for that path. Otherwise, just
      * bail out; it'll be handled later.
      */
    /* private */ /* CompleteClass */
    var preprocessNamedExportAtIndex: Any = js.native
    
    /* CompleteClass */
    override def preprocessTokens(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var preprocessVarExportAtIndex: Any = js.native
    
    /**
      * In TypeScript, import statements that only import types should be removed. This does not count
      * bare imports.
      */
    /* CompleteClass */
    override def pruneTypeOnlyImports(): Unit = js.native
    
    /**
      * Return a string like `exports.foo = exports.bar`.
      */
    /* CompleteClass */
    override def resolveExportBinding(assignedName: String): String | Null = js.native
    
    /* CompleteClass */
    override val tokens: typings.sucrase.distTypesTokenProcessorMod.default = js.native
  }
  
  trait CJSImportProcessor extends StObject {
    
    /* private */ var addExportBinding: Any
    
    /**
      * Return the code to use for the import for this path, or the empty string if
      * the code has already been "claimed" by a previous import.
      */
    def claimImportCode(importPath: String): String
    
    val enableLegacyTypeScriptModuleInterop: Boolean
    
    /* private */ var exportBindingsByLocalName: Any
    
    /* private */ var generateImportReplacements: Any
    
    def getFreeIdentifierForPath(path: String): String
    
    /**
      * Return all imported/exported names where we might be interested in whether usages of those
      * names are shadowed.
      */
    def getGlobalNames(): Set[String]
    
    def getIdentifierReplacement(identifierName: String): String | Null
    
    /**
      * Get a mutable import info object for this path, creating one if it doesn't
      * exist yet.
      */
    /* private */ var getImportInfo: Any
    
    /* private */ var getNamedImports: Any
    
    val helperManager: HelperManager
    
    /* private */ var identifierReplacements: Any
    
    /* private */ var importInfoByPath: Any
    
    /* private */ var importsToReplace: Any
    
    def isTypeName(name: String): Boolean
    
    val isTypeScriptTransformEnabled: Boolean
    
    val nameManager: typings.sucrase.distTypesNameManagerMod.default
    
    /* private */ var nonTypeIdentifiers: Any
    
    val options: Options
    
    /* private */ var preprocessExportAtIndex: Any
    
    /* private */ var preprocessExportStarAtIndex: Any
    
    /* private */ var preprocessImportAtIndex: Any
    
    /**
      * Walk this export statement just in case it's an export...from statement.
      * If it is, combine it into the import info for that path. Otherwise, just
      * bail out; it'll be handled later.
      */
    /* private */ var preprocessNamedExportAtIndex: Any
    
    def preprocessTokens(): Unit
    
    /* private */ var preprocessVarExportAtIndex: Any
    
    /**
      * In TypeScript, import statements that only import types should be removed. This does not count
      * bare imports.
      */
    def pruneTypeOnlyImports(): Unit
    
    /**
      * Return a string like `exports.foo = exports.bar`.
      */
    def resolveExportBinding(assignedName: String): String | Null
    
    val tokens: typings.sucrase.distTypesTokenProcessorMod.default
  }
  object CJSImportProcessor {
    
    inline def apply(
      addExportBinding: Any,
      claimImportCode: String => String,
      enableLegacyTypeScriptModuleInterop: Boolean,
      exportBindingsByLocalName: Any,
      generateImportReplacements: Any,
      getFreeIdentifierForPath: String => String,
      getGlobalNames: () => Set[String],
      getIdentifierReplacement: String => String | Null,
      getImportInfo: Any,
      getNamedImports: Any,
      helperManager: HelperManager,
      identifierReplacements: Any,
      importInfoByPath: Any,
      importsToReplace: Any,
      isTypeName: String => Boolean,
      isTypeScriptTransformEnabled: Boolean,
      nameManager: typings.sucrase.distTypesNameManagerMod.default,
      nonTypeIdentifiers: Any,
      options: Options,
      preprocessExportAtIndex: Any,
      preprocessExportStarAtIndex: Any,
      preprocessImportAtIndex: Any,
      preprocessNamedExportAtIndex: Any,
      preprocessTokens: () => Unit,
      preprocessVarExportAtIndex: Any,
      pruneTypeOnlyImports: () => Unit,
      resolveExportBinding: String => String | Null,
      tokens: typings.sucrase.distTypesTokenProcessorMod.default
    ): CJSImportProcessor = {
      val __obj = js.Dynamic.literal(addExportBinding = addExportBinding.asInstanceOf[js.Any], claimImportCode = js.Any.fromFunction1(claimImportCode), enableLegacyTypeScriptModuleInterop = enableLegacyTypeScriptModuleInterop.asInstanceOf[js.Any], exportBindingsByLocalName = exportBindingsByLocalName.asInstanceOf[js.Any], generateImportReplacements = generateImportReplacements.asInstanceOf[js.Any], getFreeIdentifierForPath = js.Any.fromFunction1(getFreeIdentifierForPath), getGlobalNames = js.Any.fromFunction0(getGlobalNames), getIdentifierReplacement = js.Any.fromFunction1(getIdentifierReplacement), getImportInfo = getImportInfo.asInstanceOf[js.Any], getNamedImports = getNamedImports.asInstanceOf[js.Any], helperManager = helperManager.asInstanceOf[js.Any], identifierReplacements = identifierReplacements.asInstanceOf[js.Any], importInfoByPath = importInfoByPath.asInstanceOf[js.Any], importsToReplace = importsToReplace.asInstanceOf[js.Any], isTypeName = js.Any.fromFunction1(isTypeName), isTypeScriptTransformEnabled = isTypeScriptTransformEnabled.asInstanceOf[js.Any], nameManager = nameManager.asInstanceOf[js.Any], nonTypeIdentifiers = nonTypeIdentifiers.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], preprocessExportAtIndex = preprocessExportAtIndex.asInstanceOf[js.Any], preprocessExportStarAtIndex = preprocessExportStarAtIndex.asInstanceOf[js.Any], preprocessImportAtIndex = preprocessImportAtIndex.asInstanceOf[js.Any], preprocessNamedExportAtIndex = preprocessNamedExportAtIndex.asInstanceOf[js.Any], preprocessTokens = js.Any.fromFunction0(preprocessTokens), preprocessVarExportAtIndex = preprocessVarExportAtIndex.asInstanceOf[js.Any], pruneTypeOnlyImports = js.Any.fromFunction0(pruneTypeOnlyImports), resolveExportBinding = js.Any.fromFunction1(resolveExportBinding), tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[CJSImportProcessor]
    }
    
    extension [Self <: CJSImportProcessor](x: Self) {
      
      inline def setAddExportBinding(value: Any): Self = StObject.set(x, "addExportBinding", value.asInstanceOf[js.Any])
      
      inline def setClaimImportCode(value: String => String): Self = StObject.set(x, "claimImportCode", js.Any.fromFunction1(value))
      
      inline def setEnableLegacyTypeScriptModuleInterop(value: Boolean): Self = StObject.set(x, "enableLegacyTypeScriptModuleInterop", value.asInstanceOf[js.Any])
      
      inline def setExportBindingsByLocalName(value: Any): Self = StObject.set(x, "exportBindingsByLocalName", value.asInstanceOf[js.Any])
      
      inline def setGenerateImportReplacements(value: Any): Self = StObject.set(x, "generateImportReplacements", value.asInstanceOf[js.Any])
      
      inline def setGetFreeIdentifierForPath(value: String => String): Self = StObject.set(x, "getFreeIdentifierForPath", js.Any.fromFunction1(value))
      
      inline def setGetGlobalNames(value: () => Set[String]): Self = StObject.set(x, "getGlobalNames", js.Any.fromFunction0(value))
      
      inline def setGetIdentifierReplacement(value: String => String | Null): Self = StObject.set(x, "getIdentifierReplacement", js.Any.fromFunction1(value))
      
      inline def setGetImportInfo(value: Any): Self = StObject.set(x, "getImportInfo", value.asInstanceOf[js.Any])
      
      inline def setGetNamedImports(value: Any): Self = StObject.set(x, "getNamedImports", value.asInstanceOf[js.Any])
      
      inline def setHelperManager(value: HelperManager): Self = StObject.set(x, "helperManager", value.asInstanceOf[js.Any])
      
      inline def setIdentifierReplacements(value: Any): Self = StObject.set(x, "identifierReplacements", value.asInstanceOf[js.Any])
      
      inline def setImportInfoByPath(value: Any): Self = StObject.set(x, "importInfoByPath", value.asInstanceOf[js.Any])
      
      inline def setImportsToReplace(value: Any): Self = StObject.set(x, "importsToReplace", value.asInstanceOf[js.Any])
      
      inline def setIsTypeName(value: String => Boolean): Self = StObject.set(x, "isTypeName", js.Any.fromFunction1(value))
      
      inline def setIsTypeScriptTransformEnabled(value: Boolean): Self = StObject.set(x, "isTypeScriptTransformEnabled", value.asInstanceOf[js.Any])
      
      inline def setNameManager(value: typings.sucrase.distTypesNameManagerMod.default): Self = StObject.set(x, "nameManager", value.asInstanceOf[js.Any])
      
      inline def setNonTypeIdentifiers(value: Any): Self = StObject.set(x, "nonTypeIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPreprocessExportAtIndex(value: Any): Self = StObject.set(x, "preprocessExportAtIndex", value.asInstanceOf[js.Any])
      
      inline def setPreprocessExportStarAtIndex(value: Any): Self = StObject.set(x, "preprocessExportStarAtIndex", value.asInstanceOf[js.Any])
      
      inline def setPreprocessImportAtIndex(value: Any): Self = StObject.set(x, "preprocessImportAtIndex", value.asInstanceOf[js.Any])
      
      inline def setPreprocessNamedExportAtIndex(value: Any): Self = StObject.set(x, "preprocessNamedExportAtIndex", value.asInstanceOf[js.Any])
      
      inline def setPreprocessTokens(value: () => Unit): Self = StObject.set(x, "preprocessTokens", js.Any.fromFunction0(value))
      
      inline def setPreprocessVarExportAtIndex(value: Any): Self = StObject.set(x, "preprocessVarExportAtIndex", value.asInstanceOf[js.Any])
      
      inline def setPruneTypeOnlyImports(value: () => Unit): Self = StObject.set(x, "pruneTypeOnlyImports", js.Any.fromFunction0(value))
      
      inline def setResolveExportBinding(value: String => String | Null): Self = StObject.set(x, "resolveExportBinding", js.Any.fromFunction1(value))
      
      inline def setTokens(value: typings.sucrase.distTypesTokenProcessorMod.default): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
}
