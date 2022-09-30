package typings.swcWasm.mod

import typings.swcWasm.swcWasmStrings.babel
import typings.swcWasm.swcWasmStrings.node
import typings.swcWasm.swcWasmStrings.none
import typings.swcWasm.swcWasmStrings.swc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseModuleConfig extends StObject {
  
  /**
    * If set to true, dynamic imports will be preserved.
    */
  var ignoreDynamic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to `swc`.
    *
    * CommonJS modules and ECMAScript modules are not fully compatible.
    * However, compilers, bundlers and JavaScript runtimes developed different strategies
    * to make them work together as well as possible.
    *
    * - `swc` (alias: `babel`)
    *
    * When using exports with `swc` a non-enumerable `__esModule` property is exported
    * This property is then used to determine if the import is the default export
    * or if it contains the default export.
    *
    * ```javascript
    * import foo from "foo";
    * import { bar } from "bar";
    * foo;
    * bar;
    *
    * // Is compiled to ...
    *
    * "use strict";
    *
    * function _interopRequireDefault(obj) {
    *   return obj && obj.__esModule ? obj : { default: obj };
    * }
    *
    * var _foo = _interopRequireDefault(require("foo"));
    * var _bar = require("bar");
    *
    * _foo.default;
    * _bar.bar;
    * ```
    *
    * When this import interop is used, if both the imported and the importer module are compiled
    * with swc they behave as if none of them was compiled.
    *
    * This is the default behavior.
    *
    * - `node`
    *
    * When importing CommonJS files (either directly written in CommonJS, or generated with a compiler)
    * Node.js always binds the `default` export to the value of `module.exports`.
    *
    * ```javascript
    * import foo from "foo";
    * import { bar } from "bar";
    * foo;
    * bar;
    *
    * // Is compiled to ...
    *
    * "use strict";
    *
    * var _foo = require("foo");
    * var _bar = require("bar");
    *
    * _foo;
    * _bar.bar;
    * ```
    * This is not exactly the same as what Node.js does since swc allows accessing any property of `module.exports`
    * as a named export, while Node.js only allows importing statically analyzable properties of `module.exports`.
    * However, any import working in Node.js will also work when compiled with swc using `importInterop: "node"`.
    *
    * - `none`
    *
    * If you know that the imported file has been transformed with a compiler that stores the `default` export on
    * `exports.default` (such as swc or Babel), you can safely omit the `_interopRequireDefault` helper.
    *
    * ```javascript
    * import foo from "foo";
    * import { bar } from "bar";
    * foo;
    * bar;
    *
    * // Is compiled to ...
    *
    * "use strict";
    *
    * var _foo = require("foo");
    * var _bar = require("bar");
    *
    * _foo.default;
    * _bar.bar;
    * ```
    */
  var importInterop: js.UndefOr[swc | babel | node | none] = js.undefined
  
  /**
    * Changes Babel's compiled import statements to be lazily evaluated when their imported bindings are used for the first time.
    *
    * This can improve initial load time of your module because evaluating dependencies up
    *  front is sometimes entirely un-necessary. This is especially the case when implementing
    *  a library module.
    *
    *
    * The value of `lazy` has a few possible effects:
    *
    *  - `false` - No lazy initialization of any imported module.
    *  - `true` - Do not lazy-initialize local `./foo` imports, but lazy-init `foo` dependencies.
    *
    * Local paths are much more likely to have circular dependencies, which may break if loaded lazily,
    * so they are not lazy by default, whereas dependencies between independent modules are rarely cyclical.
    *
    *  - `Array<string>` - Lazy-initialize all imports with source matching one of the given strings.
    *
    * -----
    *
    * The two cases where imports can never be lazy are:
    *
    *  - `import "foo";`
    *
    * Side-effect imports are automatically non-lazy since their very existence means
    *  that there is no binding to later kick off initialization.
    *
    *  - `export * from "foo"`
    *
    * Re-exporting all names requires up-front execution because otherwise there is no
    * way to know what names need to be exported.
    *
    * Defaults to `false`.
    */
  var `lazy`: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  /**
    * @deprecated  Use the `importInterop` option instead.
    *
    * By default, when using exports with swc a non-enumerable __esModule property is exported.
    * This property is then used to determine if the import is the default export or if
    *  it contains the default export.
    *
    * In cases where the auto-unwrapping of default is not needed, you can set the noInterop option
    *  to true to avoid the usage of the interopRequireDefault helper (shown in inline form above).
    *
    * Defaults to `false`.
    */
  var noInterop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, when using exports with babel a non-enumerable `__esModule`
    * property is exported. In some cases this property is used to determine
    * if the import is the default export or if it contains the default export.
    *
    * In order to prevent the __esModule property from being exported, you
    *  can set the strict option to true.
    *
    * Defaults to `false`.
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Emits 'use strict' directive.
    *
    * Defaults to `true`.
    */
  var strictMode: js.UndefOr[Boolean] = js.undefined
}
object BaseModuleConfig {
  
  inline def apply(): BaseModuleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModuleConfig]
  }
  
  extension [Self <: BaseModuleConfig](x: Self) {
    
    inline def setIgnoreDynamic(value: Boolean): Self = StObject.set(x, "ignoreDynamic", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDynamicUndefined: Self = StObject.set(x, "ignoreDynamic", js.undefined)
    
    inline def setImportInterop(value: swc | babel | node | none): Self = StObject.set(x, "importInterop", value.asInstanceOf[js.Any])
    
    inline def setImportInteropUndefined: Self = StObject.set(x, "importInterop", js.undefined)
    
    inline def setLazy(value: Boolean | js.Array[String]): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
    
    inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
    
    inline def setLazyVarargs(value: String*): Self = StObject.set(x, "lazy", js.Array(value*))
    
    inline def setNoInterop(value: Boolean): Self = StObject.set(x, "noInterop", value.asInstanceOf[js.Any])
    
    inline def setNoInteropUndefined: Self = StObject.set(x, "noInterop", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    
    inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
