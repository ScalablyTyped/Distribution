package typings.twitterCldr.anon

import typings.twitterCldr.mod.BidiString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fromstring extends StObject {
  
  def from_string(str: String, options: `4`): BidiString
}
object Fromstring {
  
  inline def apply(from_string: (String, `4`) => BidiString): Fromstring = {
    val __obj = js.Dynamic.literal(from_string = js.Any.fromFunction2(from_string))
    __obj.asInstanceOf[Fromstring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fromstring] (val x: Self) extends AnyVal {
    
    inline def setFrom_string(value: (String, `4`) => BidiString): Self = StObject.set(x, "from_string", js.Any.fromFunction2(value))
  }
}
