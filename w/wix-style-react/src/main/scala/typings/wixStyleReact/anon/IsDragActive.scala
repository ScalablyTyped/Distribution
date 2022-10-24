package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDragActive extends StObject {
  
  var isDragActive: Boolean
}
object IsDragActive {
  
  inline def apply(isDragActive: Boolean): IsDragActive = {
    val __obj = js.Dynamic.literal(isDragActive = isDragActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDragActive]
  }
  
  extension [Self <: IsDragActive](x: Self) {
    
    inline def setIsDragActive(value: Boolean): Self = StObject.set(x, "isDragActive", value.asInstanceOf[js.Any])
  }
}
