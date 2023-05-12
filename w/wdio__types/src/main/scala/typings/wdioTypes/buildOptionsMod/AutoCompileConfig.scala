package typings.wdioTypes.buildOptionsMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCompileConfig extends StObject {
  
  var autoCompile: js.UndefOr[Boolean] = js.undefined
  
  var babelOpts: js.UndefOr[Record[String, Any]] = js.undefined
  
  var tsNodeOpts: js.UndefOr[TSNodeOptions] = js.undefined
}
object AutoCompileConfig {
  
  inline def apply(): AutoCompileConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompileConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoCompileConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoCompile(value: Boolean): Self = StObject.set(x, "autoCompile", value.asInstanceOf[js.Any])
    
    inline def setAutoCompileUndefined: Self = StObject.set(x, "autoCompile", js.undefined)
    
    inline def setBabelOpts(value: Record[String, Any]): Self = StObject.set(x, "babelOpts", value.asInstanceOf[js.Any])
    
    inline def setBabelOptsUndefined: Self = StObject.set(x, "babelOpts", js.undefined)
    
    inline def setTsNodeOpts(value: TSNodeOptions): Self = StObject.set(x, "tsNodeOpts", value.asInstanceOf[js.Any])
    
    inline def setTsNodeOptsUndefined: Self = StObject.set(x, "tsNodeOpts", js.undefined)
  }
}
