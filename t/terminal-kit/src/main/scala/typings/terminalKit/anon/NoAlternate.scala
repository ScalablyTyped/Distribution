package typings.terminalKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoAlternate extends StObject {
  
  var noAlternate: Boolean = js.native
}
object NoAlternate {
  
  @scala.inline
  def apply(noAlternate: Boolean): NoAlternate = {
    val __obj = js.Dynamic.literal(noAlternate = noAlternate.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoAlternate]
  }
  
  @scala.inline
  implicit class NoAlternateMutableBuilder[Self <: NoAlternate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoAlternate(value: Boolean): Self = StObject.set(x, "noAlternate", value.asInstanceOf[js.Any])
  }
}
