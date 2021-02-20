package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictk
  extends /* k */ StringDictionary[js.Any] {
  
  var id: Double = js.native
}
object Dictk {
  
  @scala.inline
  def apply(id: Double): Dictk = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictk]
  }
  
  @scala.inline
  implicit class DictkMutableBuilder[Self <: Dictk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
