package typings.vite.mod

import typings.vite.anon.OmitBuildOptionsbundleent
import typings.vite.viteStrings.dev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepOptimizationConfig extends StObject {
  
  /**
    * Disables dependencies optimizations, true disables the optimizer during
    * build and dev. Pass 'build' or 'dev' to only disable the optimizer in
    * one of the modes. Deps optimization is enabled by default in dev only.
    * @default 'build'
    * @experimental
    */
  var disabled: js.UndefOr[Boolean | typings.vite.viteStrings.build | dev] = js.undefined
  
  /**
    * Options to pass to esbuild during the dep scanning and optimization
    *
    * Certain options are omitted since changing them would not be compatible
    * with Vite's dep optimization.
    *
    * - `external` is also omitted, use Vite's `optimizeDeps.exclude` option
    * - `plugins` are merged with Vite's dep plugin
    *
    * https://esbuild.github.io/api
    */
  var esbuildOptions: js.UndefOr[OmitBuildOptionsbundleent] = js.undefined
  
  /**
    * Do not optimize these dependencies (must be resolvable import paths,
    * cannot be globs).
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of file extensions that can be optimized. A corresponding esbuild
    * plugin must exist to handle the specific extension.
    *
    * By default, Vite can optimize `.mjs`, `.js`, `.ts`, and `.mts` files. This option
    * allows specifying additional extensions.
    *
    * @experimental
    */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Force optimize listed dependencies (must be resolvable import paths,
    * cannot be globs).
    */
  var include: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Force ESM interop when importing for these dependencies. Some legacy
    * packages advertise themselves as ESM but use `require` internally
    * @experimental
    */
  var needsInterop: js.UndefOr[js.Array[String]] = js.undefined
}
object DepOptimizationConfig {
  
  inline def apply(): DepOptimizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepOptimizationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DepOptimizationConfig] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean | typings.vite.viteStrings.build | dev): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEsbuildOptions(value: OmitBuildOptionsbundleent): Self = StObject.set(x, "esbuildOptions", value.asInstanceOf[js.Any])
    
    inline def setEsbuildOptionsUndefined: Self = StObject.set(x, "esbuildOptions", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setNeedsInterop(value: js.Array[String]): Self = StObject.set(x, "needsInterop", value.asInstanceOf[js.Any])
    
    inline def setNeedsInteropUndefined: Self = StObject.set(x, "needsInterop", js.undefined)
    
    inline def setNeedsInteropVarargs(value: String*): Self = StObject.set(x, "needsInterop", js.Array(value*))
  }
}
