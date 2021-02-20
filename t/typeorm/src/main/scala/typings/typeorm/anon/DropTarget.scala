package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropTarget extends StObject {
  
  var dropTarget: js.UndefOr[Boolean] = js.native
}
object DropTarget {
  
  @scala.inline
  def apply(): DropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTarget]
  }
  
  @scala.inline
  implicit class DropTargetMutableBuilder[Self <: DropTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropTarget(value: Boolean): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
  }
}
