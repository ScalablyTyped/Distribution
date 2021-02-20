package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsAnonymous extends StObject {
  
  var options: Anonymous = js.native
}
object OptionsAnonymous {
  
  @scala.inline
  def apply(options: Anonymous): OptionsAnonymous = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsAnonymous]
  }
  
  @scala.inline
  implicit class OptionsAnonymousMutableBuilder[Self <: OptionsAnonymous] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Anonymous): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
