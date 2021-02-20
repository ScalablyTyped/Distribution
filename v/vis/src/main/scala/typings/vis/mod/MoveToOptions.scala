package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveToOptions extends ViewPortOptions {
  
  /**
    * The position (in canvas units!) is the position of the central focus point of the camera.
    */
  var position: js.UndefOr[Position] = js.native
}
object MoveToOptions {
  
  @scala.inline
  def apply(): MoveToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToOptions]
  }
  
  @scala.inline
  implicit class MoveToOptionsMutableBuilder[Self <: MoveToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
