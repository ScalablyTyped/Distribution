package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Char extends StObject {
  
  var attr: Attributes | Double = js.native
  
  var char: js.UndefOr[String] = js.native
}
object Char {
  
  @scala.inline
  def apply(attr: Attributes | Double): Char = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Char]
  }
  
  @scala.inline
  implicit class CharMutableBuilder[Self <: Char] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr(value: Attributes | Double): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharUndefined: Self = StObject.set(x, "char", js.undefined)
  }
}
