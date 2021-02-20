package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrChar extends StObject {
  
  var attr: Attributes = js.native
  
  var char: String = js.native
}
object AttrChar {
  
  @scala.inline
  def apply(attr: Attributes, char: String): AttrChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrChar]
  }
  
  @scala.inline
  implicit class AttrCharMutableBuilder[Self <: AttrChar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr(value: Attributes): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
  }
}
