package typings.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeAcquisition
  extends StObject
     with /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  
  var disableFilenameBasedTypeAcquisition: js.UndefOr[Boolean] = js.undefined
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated typingOptions.enableAutoDiscovery
    * Use typeAcquisition.enable instead.
    */
  var enableAutoDiscovery: js.UndefOr[Boolean] = js.undefined
  
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}
object TypeAcquisition {
  
  @scala.inline
  def apply(): TypeAcquisition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeAcquisition]
  }
  
  @scala.inline
  implicit class TypeAcquisitionMutableBuilder[Self <: TypeAcquisition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableFilenameBasedTypeAcquisition(value: Boolean): Self = StObject.set(x, "disableFilenameBasedTypeAcquisition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFilenameBasedTypeAcquisitionUndefined: Self = StObject.set(x, "disableFilenameBasedTypeAcquisition", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoDiscovery(value: Boolean): Self = StObject.set(x, "enableAutoDiscovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoDiscoveryUndefined: Self = StObject.set(x, "enableAutoDiscovery", js.undefined)
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    @scala.inline
    def setExclude(value: js.Array[java.lang.String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: java.lang.String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[java.lang.String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: java.lang.String*): Self = StObject.set(x, "include", js.Array(value :_*))
  }
}
