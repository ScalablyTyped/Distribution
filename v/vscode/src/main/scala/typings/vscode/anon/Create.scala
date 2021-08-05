package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create extends StObject {
  
  var create: Boolean
  
  var overwrite: Boolean
}
object Create {
  
  inline def apply(create: Boolean, overwrite: Boolean): Create = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
  
  extension [Self <: Create](x: Self) {
    
    inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
  }
}
