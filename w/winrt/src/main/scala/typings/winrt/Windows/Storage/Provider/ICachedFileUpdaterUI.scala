package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICachedFileUpdaterUI extends StObject {
  
  var onfileupdaterequested: js.Any
  
  var onuirequested: js.Any
  
  var title: String
  
  var uIStatus: UIStatus
  
  var updateTarget: CachedFileTarget
}
object ICachedFileUpdaterUI {
  
  inline def apply(
    onfileupdaterequested: js.Any,
    onuirequested: js.Any,
    title: String,
    uIStatus: UIStatus,
    updateTarget: CachedFileTarget
  ): ICachedFileUpdaterUI = {
    val __obj = js.Dynamic.literal(onfileupdaterequested = onfileupdaterequested.asInstanceOf[js.Any], onuirequested = onuirequested.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uIStatus = uIStatus.asInstanceOf[js.Any], updateTarget = updateTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICachedFileUpdaterUI]
  }
  
  extension [Self <: ICachedFileUpdaterUI](x: Self) {
    
    inline def setOnfileupdaterequested(value: js.Any): Self = StObject.set(x, "onfileupdaterequested", value.asInstanceOf[js.Any])
    
    inline def setOnuirequested(value: js.Any): Self = StObject.set(x, "onuirequested", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUIStatus(value: UIStatus): Self = StObject.set(x, "uIStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateTarget(value: CachedFileTarget): Self = StObject.set(x, "updateTarget", value.asInstanceOf[js.Any])
  }
}
