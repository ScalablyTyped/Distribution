package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Absolute extends StObject {
  
  var absolute: Boolean = js.native
}
object Absolute {
  
  @scala.inline
  def apply(absolute: Boolean): Absolute = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Absolute]
  }
  
  @scala.inline
  implicit class AbsoluteMutableBuilder[Self <: Absolute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
  }
}
