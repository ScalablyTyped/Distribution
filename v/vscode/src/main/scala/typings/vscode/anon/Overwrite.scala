package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overwrite extends StObject {
  
  var overwrite: Boolean = js.native
}
object Overwrite {
  
  @scala.inline
  def apply(overwrite: Boolean): Overwrite = {
    val __obj = js.Dynamic.literal(overwrite = overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overwrite]
  }
  
  @scala.inline
  implicit class OverwriteMutableBuilder[Self <: Overwrite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
  }
}
