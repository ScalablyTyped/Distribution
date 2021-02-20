package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attr extends StObject {
  
  var attr: Double | Attributes = js.native
  
  var transparencyChar: String = js.native
  
  var transparencyType: Double = js.native
}
object Attr {
  
  @scala.inline
  def apply(attr: Double | Attributes, transparencyChar: String, transparencyType: Double): Attr = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], transparencyChar = transparencyChar.asInstanceOf[js.Any], transparencyType = transparencyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attr]
  }
  
  @scala.inline
  implicit class AttrMutableBuilder[Self <: Attr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr(value: Double | Attributes): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparencyChar(value: String): Self = StObject.set(x, "transparencyChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparencyType(value: Double): Self = StObject.set(x, "transparencyType", value.asInstanceOf[js.Any])
  }
}
