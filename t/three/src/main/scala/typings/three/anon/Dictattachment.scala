package typings.three.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictattachment
  extends /* attachment */ StringDictionary[js.Any] {
  
  var `type`: String = js.native
}
object Dictattachment {
  
  @scala.inline
  def apply(`type`: String): Dictattachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictattachment]
  }
  
  @scala.inline
  implicit class DictattachmentMutableBuilder[Self <: Dictattachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
