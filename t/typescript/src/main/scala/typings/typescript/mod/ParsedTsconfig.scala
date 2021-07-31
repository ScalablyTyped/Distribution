package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedTsconfig extends StObject {
  
  /**
    * Note that the case of the config path has not yet been normalized, as no files have been imported into the project yet
    */
  var extendedConfigPath: js.UndefOr[java.lang.String] = js.undefined
  
  var options: js.UndefOr[CompilerOptions] = js.undefined
  
  var raw: js.Any
  
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.undefined
  
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
}
object ParsedTsconfig {
  
  @scala.inline
  def apply(raw: js.Any): ParsedTsconfig = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedTsconfig]
  }
  
  @scala.inline
  implicit class ParsedTsconfigMutableBuilder[Self <: ParsedTsconfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedConfigPath(value: java.lang.String): Self = StObject.set(x, "extendedConfigPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedConfigPathUndefined: Self = StObject.set(x, "extendedConfigPath", js.undefined)
    
    @scala.inline
    def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setRaw(value: js.Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAcquisitionUndefined: Self = StObject.set(x, "typeAcquisition", js.undefined)
    
    @scala.inline
    def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
  }
}
