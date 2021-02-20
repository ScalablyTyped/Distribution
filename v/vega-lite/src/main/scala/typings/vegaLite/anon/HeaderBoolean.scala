package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderBoolean extends StObject {
  
  var header: Boolean = js.native
}
object HeaderBoolean {
  
  @scala.inline
  def apply(header: Boolean): HeaderBoolean = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderBoolean]
  }
  
  @scala.inline
  implicit class HeaderBooleanMutableBuilder[Self <: HeaderBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
