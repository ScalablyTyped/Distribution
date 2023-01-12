package typings.vscode.anon

import typings.vscode.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inserting extends StObject {
  
  var inserting: Range
  
  var replacing: Range
}
object Inserting {
  
  inline def apply(inserting: Range, replacing: Range): Inserting = {
    val __obj = js.Dynamic.literal(inserting = inserting.asInstanceOf[js.Any], replacing = replacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inserting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Inserting] (val x: Self) extends AnyVal {
    
    inline def setInserting(value: Range): Self = StObject.set(x, "inserting", value.asInstanceOf[js.Any])
    
    inline def setReplacing(value: Range): Self = StObject.set(x, "replacing", value.asInstanceOf[js.Any])
  }
}
