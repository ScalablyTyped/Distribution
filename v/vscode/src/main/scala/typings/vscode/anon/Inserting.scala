package typings.vscode.anon

import typings.vscode.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inserting extends StObject {
  
  var inserting: Range = js.native
  
  var replacing: Range = js.native
}
object Inserting {
  
  @scala.inline
  def apply(inserting: Range, replacing: Range): Inserting = {
    val __obj = js.Dynamic.literal(inserting = inserting.asInstanceOf[js.Any], replacing = replacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inserting]
  }
  
  @scala.inline
  implicit class InsertingMutableBuilder[Self <: Inserting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInserting(value: Range): Self = StObject.set(x, "inserting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacing(value: Range): Self = StObject.set(x, "replacing", value.asInstanceOf[js.Any])
  }
}
