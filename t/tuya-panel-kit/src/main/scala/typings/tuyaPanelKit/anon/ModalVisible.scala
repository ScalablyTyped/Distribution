package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalVisible extends StObject {
  
  var modalVisible: Boolean
}
object ModalVisible {
  
  inline def apply(modalVisible: Boolean): ModalVisible = {
    val __obj = js.Dynamic.literal(modalVisible = modalVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalVisible]
  }
  
  extension [Self <: ModalVisible](x: Self) {
    
    inline def setModalVisible(value: Boolean): Self = StObject.set(x, "modalVisible", value.asInstanceOf[js.Any])
  }
}
