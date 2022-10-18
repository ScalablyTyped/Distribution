package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverwriteBoolean extends StObject {
  
  val overwrite: Boolean
}
object OverwriteBoolean {
  
  inline def apply(overwrite: Boolean): OverwriteBoolean = {
    val __obj = js.Dynamic.literal(overwrite = overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverwriteBoolean]
  }
  
  extension [Self <: OverwriteBoolean](x: Self) {
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
  }
}
