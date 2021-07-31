package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Strings extends StObject {
  
  var strings: js.UndefOr[Am] = js.undefined
  
  var value: js.Any
}
object Strings {
  
  @scala.inline
  def apply(value: js.Any): Strings = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strings]
  }
  
  @scala.inline
  implicit class StringsMutableBuilder[Self <: Strings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrings(value: Am): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
