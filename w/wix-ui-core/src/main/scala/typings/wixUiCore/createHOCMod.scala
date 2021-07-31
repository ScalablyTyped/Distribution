package typings.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHOCMod {
  
  @JSImport("wix-ui-core/dist/src/createHOC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createHOC(Component: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createHOC")(Component.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait WixComponentProps extends StObject {
    
    var dataClass: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object WixComponentProps {
    
    @scala.inline
    def apply(): WixComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixComponentProps]
    }
    
    @scala.inline
    implicit class WixComponentPropsMutableBuilder[Self <: WixComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataClass(value: String): Self = StObject.set(x, "dataClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataClassUndefined: Self = StObject.set(x, "dataClass", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
}
