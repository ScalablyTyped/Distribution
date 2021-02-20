package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccidentalRoot extends StObject {
  
  var accidental: String = js.native
  
  var root: String = js.native
  
  var `type`: String = js.native
}
object AccidentalRoot {
  
  @scala.inline
  def apply(accidental: String, root: String, `type`: String): AccidentalRoot = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccidentalRoot]
  }
  
  @scala.inline
  implicit class AccidentalRootMutableBuilder[Self <: AccidentalRoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccidental(value: String): Self = StObject.set(x, "accidental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
