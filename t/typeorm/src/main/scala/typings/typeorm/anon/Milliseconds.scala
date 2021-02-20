package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Milliseconds extends StObject {
  
  var id: js.Any = js.native
  
  var milliseconds: Double = js.native
}
object Milliseconds {
  
  @scala.inline
  def apply(id: js.Any, milliseconds: Double): Milliseconds = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Milliseconds]
  }
  
  @scala.inline
  implicit class MillisecondsMutableBuilder[Self <: Milliseconds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
  }
}
