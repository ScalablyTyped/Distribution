package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overwrite extends StObject {
  
  val overwrite: Boolean
}
object Overwrite {
  
  inline def apply(overwrite: Boolean): Overwrite = {
    val __obj = js.Dynamic.literal(overwrite = overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overwrite]
  }
  
  extension [Self <: Overwrite](x: Self) {
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
  }
}
