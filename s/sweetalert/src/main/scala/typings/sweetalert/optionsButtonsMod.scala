package typings.sweetalert

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsButtonsMod {
  
  @JSImport("sweetalert/typings/modules/options/buttons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sweetalert/typings/modules/options/buttons", "CANCEL_KEY")
  @js.native
  val CANCEL_KEY: /* "cancel" */ String = js.native
  
  @JSImport("sweetalert/typings/modules/options/buttons", "CONFIRM_KEY")
  @js.native
  val CONFIRM_KEY: /* "confirm" */ String = js.native
  
  @JSImport("sweetalert/typings/modules/options/buttons", "defaultButtonList")
  @js.native
  val defaultButtonList: ButtonList = js.native
  
  @scala.inline
  def getButtonListOpts(opts: String): ButtonList = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonListOpts")(opts.asInstanceOf[js.Any]).asInstanceOf[ButtonList]
  @scala.inline
  def getButtonListOpts(opts: js.Object): ButtonList = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonListOpts")(opts.asInstanceOf[js.Any]).asInstanceOf[ButtonList]
  @scala.inline
  def getButtonListOpts(opts: Boolean): ButtonList = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonListOpts")(opts.asInstanceOf[js.Any]).asInstanceOf[ButtonList]
  
  type ButtonList = StringDictionary[ButtonOptions | Boolean]
  
  trait ButtonOptions extends StObject {
    
    var className: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var closeModal: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[js.Any] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ButtonOptions {
    
    @scala.inline
    def apply(): ButtonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonOptions]
    }
    
    @scala.inline
    implicit class ButtonOptionsMutableBuilder[Self <: ButtonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value :_*))
      
      @scala.inline
      def setCloseModal(value: Boolean): Self = StObject.set(x, "closeModal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseModalUndefined: Self = StObject.set(x, "closeModal", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
