package typings.terminalKit.anon

import typings.terminalKit.screenBufferHDMod.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var attr: Attributes | Double = js.native
  
  var char: js.UndefOr[String] = js.native
}
object `1` {
  
  @scala.inline
  def apply(attr: Attributes | Double): `1` = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr(value: Attributes | Double): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharUndefined: Self = StObject.set(x, "char", js.undefined)
  }
}
