package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedConfigCacheEntry extends StObject {
  
  var extendedConfig: js.UndefOr[ParsedTsconfig] = js.native
  
  var extendedResult: TsConfigSourceFile = js.native
}
object ExtendedConfigCacheEntry {
  
  @scala.inline
  def apply(extendedResult: TsConfigSourceFile): ExtendedConfigCacheEntry = {
    val __obj = js.Dynamic.literal(extendedResult = extendedResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedConfigCacheEntry]
  }
  
  @scala.inline
  implicit class ExtendedConfigCacheEntryMutableBuilder[Self <: ExtendedConfigCacheEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedConfig(value: ParsedTsconfig): Self = StObject.set(x, "extendedConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedConfigUndefined: Self = StObject.set(x, "extendedConfig", js.undefined)
    
    @scala.inline
    def setExtendedResult(value: TsConfigSourceFile): Self = StObject.set(x, "extendedResult", value.asInstanceOf[js.Any])
  }
}
