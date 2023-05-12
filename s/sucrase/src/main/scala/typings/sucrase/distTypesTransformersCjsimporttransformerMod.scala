package typings.sucrase

import typings.sucrase.distTypesHelperManagerMod.HelperManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransformersCjsimporttransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/CJSImportTransformer", JSImport.Default)
  @js.native
  open class default protected () extends CJSImportTransformer {
    def this(
      rootTransformer: typings.sucrase.distTypesTransformersRootTransformerMod.default,
      tokens: typings.sucrase.distTypesTokenProcessorMod.default,
      importProcessor: typings.sucrase.distTypesCjsimportprocessorMod.default,
      nameManager: typings.sucrase.distTypesNameManagerMod.default,
      helperManager: HelperManager,
      reactHotLoaderTransformer: Null,
      enableLegacyBabel5ModuleInterop: Boolean,
      enableLegacyTypeScriptModuleInterop: Boolean,
      isTypeScriptTransformEnabled: Boolean,
      preserveDynamicImport: Boolean
    ) = this()
    def this(
      rootTransformer: typings.sucrase.distTypesTransformersRootTransformerMod.default,
      tokens: typings.sucrase.distTypesTokenProcessorMod.default,
      importProcessor: typings.sucrase.distTypesCjsimportprocessorMod.default,
      nameManager: typings.sucrase.distTypesNameManagerMod.default,
      helperManager: HelperManager,
      reactHotLoaderTransformer: typings.sucrase.distTypesTransformersReactHotLoaderTransformerMod.default,
      enableLegacyBabel5ModuleInterop: Boolean,
      enableLegacyTypeScriptModuleInterop: Boolean,
      isTypeScriptTransformEnabled: Boolean,
      preserveDynamicImport: Boolean
    ) = this()
  }
  
  @js.native
  trait CJSImportTransformer
    extends typings.sucrase.distTypesTransformersTransformerMod.default {
    
    /* private */ var copyDecorators: Any = js.native
    
    /* private */ var declarationInfo: Any = js.native
    
    val enableLegacyBabel5ModuleInterop: Boolean = js.native
    
    val enableLegacyTypeScriptModuleInterop: Boolean = js.native
    
    /* private */ var hadDefaultExport: Any = js.native
    
    /* private */ var hadExport: Any = js.native
    
    /* private */ var hadNamedExport: Any = js.native
    
    val helperManager: HelperManager = js.native
    
    val importProcessor: typings.sucrase.distTypesCjsimportprocessorMod.default = js.native
    
    /**
      * Determine if the export is of the form:
      * export var/let/const [varName] = [expr];
      * In other words, determine if function name inference might apply.
      */
    /* private */ var isSimpleExportVar: Any = js.native
    
    val isTypeScriptTransformEnabled: Boolean = js.native
    
    val nameManager: typings.sucrase.distTypesNameManagerMod.default = js.native
    
    val preserveDynamicImport: Boolean = js.native
    
    /* private */ var processAssignment: Any = js.native
    
    /**
      * Process something like `a += 3`, where `a` might be an exported value.
      */
    /* private */ var processComplexAssignment: Any = js.native
    
    /**
      * Transform normal declaration exports, including handling destructuring.
      * For example, this:
      * export const {x: [a = 2, b], c} = d;
      * becomes this:
      * ({x: [exports.a = 2, exports.b], c: exports.c} = d;)
      */
    /* private */ var processComplexExportVar: Any = js.native
    
    def processExport(): Boolean = js.native
    
    /**
      * Transform this:
      * export {a, b as c};
      * into this:
      * exports.a = a; exports.c = b;
      *
      * OR
      *
      * Transform this:
      * export {a, b as c} from './foo';
      * into the pre-generated Object.defineProperty code from the ImportProcessor.
      *
      * For the first case, if the TypeScript transform is enabled, we need to skip
      * exports that are only defined as types.
      */
    /* private */ var processExportBindings: Any = js.native
    
    /**
      * Transform this:
      * export class A {}
      * into this:
      * class A {} exports.A = A;
      */
    /* private */ var processExportClass: Any = js.native
    
    /* private */ var processExportDefault: Any = js.native
    
    /**
      * Transform this:
      * export function foo() {}
      * into this:
      * function foo() {} exports.foo = foo;
      */
    /* private */ var processExportFunction: Any = js.native
    
    /* private */ var processExportStar: Any = js.native
    
    /**
      * Transform a declaration like `export var`, `export let`, or `export const`.
      */
    /* private */ var processExportVar: Any = js.native
    
    /* private */ var processIdentifier: Any = js.native
    
    /**
      * Transform this:
      * import foo, {bar} from 'baz';
      * into
      * var _baz = require('baz'); var _baz2 = _interopRequireDefault(_baz);
      *
      * The import code was already generated in the import preprocessing step, so
      * we just need to look it up.
      */
    /* private */ var processImport: Any = js.native
    
    /* private */ var processImportEquals: Any = js.native
    
    /**
      * Skip past a function with a name and return that name.
      */
    /* private */ var processNamedFunction: Any = js.native
    
    def processObjectShorthand(): Boolean = js.native
    
    /**
      * Process something like `a++`, where `a` might be an exported value.
      * This starts at the `a`, not at the `++`.
      */
    /* private */ var processPostIncDec: Any = js.native
    
    /**
      * Process something like `++a`, where `a` might be an exported value.
      */
    /* private */ var processPreIncDec: Any = js.native
    
    /**
      * Transform an `export var` declaration initializing a single variable.
      *
      * For example, this:
      * export const f = () => {};
      * becomes this:
      * const f = () => {}; exports.f = f;
      *
      * The variable is unused (e.g. exports.f has the true value of the export).
      * We need to produce an assignment of this form so that the function will
      * have an inferred name of "f", which wouldn't happen in the more general
      * case below.
      */
    /* private */ var processSimpleExportVar: Any = js.native
    
    val reactHotLoaderTransformer: typings.sucrase.distTypesTransformersReactHotLoaderTransformerMod.default | Null = js.native
    
    /**
      * Erase this import, and return true if it was either of the form "import type" or contained only
      * "type" named imports. Such imports should not even do a side-effect import.
      *
      * The position should end at the import string.
      */
    /* private */ var removeImportAndDetectIfType: Any = js.native
    
    /* private */ var removeRemainingImport: Any = js.native
    
    val rootTransformer: typings.sucrase.distTypesTransformersRootTransformerMod.default = js.native
    
    /* private */ var shouldElideExportedIdentifier: Any = js.native
    
    val tokens: typings.sucrase.distTypesTokenProcessorMod.default = js.native
  }
}
