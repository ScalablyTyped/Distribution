package typings.typedoc.anon

import typings.typedoc.typedocStrings.media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var name: media
}
object `17` {
  
  @scala.inline
  def apply(): `17` = {
    val __obj = js.Dynamic.literal(name = "media")
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit class `17MutableBuilder`[Self <: `17`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: media): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
