package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedFileName extends StObject {
  
  var selectedFileName: Any
}
object SelectedFileName {
  
  inline def apply(selectedFileName: Any): SelectedFileName = {
    val __obj = js.Dynamic.literal(selectedFileName = selectedFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedFileName]
  }
  
  extension [Self <: SelectedFileName](x: Self) {
    
    inline def setSelectedFileName(value: Any): Self = StObject.set(x, "selectedFileName", value.asInstanceOf[js.Any])
  }
}
