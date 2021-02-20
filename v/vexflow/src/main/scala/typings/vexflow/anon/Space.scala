package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Space extends StObject {
  
  var space: Double = js.native
}
object Space {
  
  @scala.inline
  def apply(space: Double): Space = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Space]
  }
  
  @scala.inline
  implicit class SpaceMutableBuilder[Self <: Space] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
