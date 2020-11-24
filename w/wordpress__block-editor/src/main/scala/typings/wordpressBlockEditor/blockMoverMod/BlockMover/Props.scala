package typings.wordpressBlockEditor.blockMoverMod.BlockMover

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var blockElementId: js.UndefOr[String] = js.native
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  var clientIds: js.Array[String] = js.native
  
  var instanceId: js.UndefOr[String] = js.native
  
  var isDraggable: js.UndefOr[Boolean] = js.native
  
  var isHidden: js.UndefOr[Boolean] = js.native
  
  var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.native
}
object Props {
  
  @scala.inline
  def apply(clientIds: js.Array[String]): Props = {
    val __obj = js.Dynamic.literal(clientIds = clientIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientIdsVarargs(value: String*): Self = this.set("clientIds", js.Array(value :_*))
    
    @scala.inline
    def setClientIds(value: js.Array[String]): Self = this.set("clientIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockElementId(value: String): Self = this.set("blockElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockElementId: Self = this.set("blockElementId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setIsDraggable(value: Boolean): Self = this.set("isDraggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDraggable: Self = this.set("isDraggable", js.undefined)
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHidden: Self = this.set("isHidden", js.undefined)
    
    @scala.inline
    def setOnDragEnd(value: () => Unit): Self = this.set("onDragEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: () => Unit): Self = this.set("onDragStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
  }
}
