package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtendedConfigCacheEntry extends js.Object {
  
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
  implicit class ExtendedConfigCacheEntryOps[Self <: ExtendedConfigCacheEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtendedResult(value: TsConfigSourceFile): Self = this.set("extendedResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedConfig(value: ParsedTsconfig): Self = this.set("extendedConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedConfig: Self = this.set("extendedConfig", js.undefined)
  }
}
