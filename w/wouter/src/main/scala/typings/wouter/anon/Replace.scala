package typings.wouter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replace extends StObject {
  
  var replace: js.UndefOr[Boolean] = js.undefined
}
object Replace {
  
  @scala.inline
  def apply(): Replace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replace]
  }
  
  @scala.inline
  implicit class ReplaceMutableBuilder[Self <: Replace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}
