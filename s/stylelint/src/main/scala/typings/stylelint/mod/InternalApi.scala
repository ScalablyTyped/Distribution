package typings.stylelint.mod

import typings.postcss.mod.Result
import typings.std.Map
import typings.std.ReturnType
import typings.stylelint.anon.FnCall
import typings.stylelint.anon.LinterOptionscwdstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalApi extends StObject {
  
  var _extendExplorer: ReturnType[FnCall]
  
  var _fileCache: FileCache
  
  var _options: LinterOptionscwdstring
  
  var _postcssResultCache: Map[String, Result]
  
  var _specifiedConfigCache: Map[Config, js.Promise[CosmiconfigResult]]
}
object InternalApi {
  
  inline def apply(
    _extendExplorer: ReturnType[FnCall],
    _fileCache: FileCache,
    _options: LinterOptionscwdstring,
    _postcssResultCache: Map[String, Result],
    _specifiedConfigCache: Map[Config, js.Promise[CosmiconfigResult]]
  ): InternalApi = {
    val __obj = js.Dynamic.literal(_extendExplorer = _extendExplorer.asInstanceOf[js.Any], _fileCache = _fileCache.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _postcssResultCache = _postcssResultCache.asInstanceOf[js.Any], _specifiedConfigCache = _specifiedConfigCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalApi]
  }
  
  extension [Self <: InternalApi](x: Self) {
    
    inline def set_extendExplorer(value: ReturnType[FnCall]): Self = StObject.set(x, "_extendExplorer", value.asInstanceOf[js.Any])
    
    inline def set_fileCache(value: FileCache): Self = StObject.set(x, "_fileCache", value.asInstanceOf[js.Any])
    
    inline def set_options(value: LinterOptionscwdstring): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    
    inline def set_postcssResultCache(value: Map[String, Result]): Self = StObject.set(x, "_postcssResultCache", value.asInstanceOf[js.Any])
    
    inline def set_specifiedConfigCache(value: Map[Config, js.Promise[CosmiconfigResult]]): Self = StObject.set(x, "_specifiedConfigCache", value.asInstanceOf[js.Any])
  }
}
