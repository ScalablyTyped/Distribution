package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupCustomProps
  extends StObject
     with PopupProps {
  
  /**
    * @language zh-CN
    * @description 自定义内容
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Custom content
    * @defaultValue null
    */
  var content: ReactNode
}
object PopupCustomProps {
  
  inline def apply(): PopupCustomProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupCustomProps]
  }
  
  extension [Self <: PopupCustomProps](x: Self) {
    
    inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
