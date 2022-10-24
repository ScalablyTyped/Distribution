package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.ApproveButtonTooltipContent
import typings.wixStyleReact.anon.DisabledBoolean
import typings.wixStyleReact.anon.ValueString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemEditableListItemEditableMod {
  
  @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** ListItemEditable */
  @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", JSImport.Default)
  @js.native
  open class default protected () extends ListItemEditable {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.defaultProps.margins_1")
      @js.native
      val margins1: String = js.native
      
      inline def onApprove1(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("onApprove_1")().asInstanceOf[js.Object]
      
      inline def onCancel1(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("onCancel_1")().asInstanceOf[js.Object]
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.approveButtonTooltipContent")
      @js.native
      val approveButtonTooltipContent: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.approveButtonTooltipProps")
      @js.native
      val approveButtonTooltipProps: Requireable[InferProps[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.cancelButtonTooltipContent")
      @js.native
      val cancelButtonTooltipContent: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.cancelButtonTooltipProps")
      @js.native
      val cancelButtonTooltipProps: Requireable[InferProps[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.margins")
      @js.native
      val margins: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.onApprove")
      @js.native
      val onApprove: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.onCancel")
      @js.native
      val onCancel: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.placeholder")
      @js.native
      val placeholder: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/ListItemEditable/ListItemEditable", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[ReactNodeLike] = js.native
    }
  }
  
  inline def listItemEditableBuilder(param0: ApproveButtonTooltipContent): DisabledBoolean = ^.asInstanceOf[js.Dynamic].applyDynamic("listItemEditableBuilder")(param0.asInstanceOf[js.Any]).asInstanceOf[DisabledBoolean]
  
  /** ListItemEditable */
  @js.native
  trait ListItemEditable extends PureComponent[Any, Any, Any] {
    
    /**
      * Callback triggered when approved button is clicked
      * @private
      */
    /* private */ var _onApproveClicked: Any = js.native
    
    /**
      * Callback triggered when input value is changed
      * @param event (Event)
      * @private
      */
    /* private */ var _onInputChange: Any = js.native
    
    def _renderApproveButton(): Element = js.native
    
    def _renderCancelButton(): Element = js.native
    
    def _renderInput(): Element = js.native
    
    @JSName("state")
    var state_ListItemEditable: ValueString = js.native
  }
}
