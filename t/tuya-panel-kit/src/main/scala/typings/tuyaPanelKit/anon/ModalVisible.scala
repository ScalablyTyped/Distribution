package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModalVisible extends StObject {
  
  var modalVisible: Boolean = js.native
}
object ModalVisible {
  
  @scala.inline
  def apply(modalVisible: Boolean): ModalVisible = {
    val __obj = js.Dynamic.literal(modalVisible = modalVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalVisible]
  }
  
  @scala.inline
  implicit class ModalVisibleMutableBuilder[Self <: ModalVisible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModalVisible(value: Boolean): Self = StObject.set(x, "modalVisible", value.asInstanceOf[js.Any])
  }
}
