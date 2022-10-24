package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.MarginInlineStart
import typings.wixStyleReact.anon.MarginInlineStartMarginTop
import typings.wixStyleReact.anon.MarginTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRadioGroupRadioGroupMod {
  
  /**
    * component for easy radio group creation.
    *
    * similar to HTML `<input type="radio"/>` except you don't need to handle `name` or click handlers
    */
  @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", JSImport.Default)
  @js.native
  open class default protected () extends RadioGroup {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.defaultProps.disabledRadios_1")
      @js.native
      val disabledRadios1: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.defaultProps.display_1")
      @js.native
      val display1: String = js.native
      
      inline def onChange1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange_1")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.defaultProps.selectionArea_1")
      @js.native
      val selectionArea1: String = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.defaultProps.selectionAreaSkin_1")
      @js.native
      val selectionAreaSkin1: String = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.defaultProps.vAlign_1")
      @js.native
      val vAlign1: String = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.defaultProps.value_1")
      @js.native
      val value1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.disabledRadios")
      @js.native
      val disabledRadios: Requireable[js.Array[js.UndefOr[String | Double | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.display")
      @js.native
      val display: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.name")
      @js.native
      val name: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.selectionArea")
      @js.native
      val selectionArea: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.selectionAreaPadding")
      @js.native
      val selectionAreaPadding: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.selectionAreaSkin")
      @js.native
      val selectionAreaSkin: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.spacing")
      @js.native
      val spacing: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.vAlign")
      @js.native
      val vAlign: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/RadioGroup/RadioGroup", "default.propTypes.value")
      @js.native
      val value: Requireable[String | Double] = js.native
    }
  }
  
  /**
    * component for easy radio group creation.
    *
    * similar to HTML `<input type="radio"/>` except you don't need to handle `name` or click handlers
    */
  @js.native
  trait RadioGroup extends PureComponent[Any, Any, Any] {
    
    def _getSpacing(index: Any): MarginInlineStart | MarginTop | MarginInlineStartMarginTop = js.native
  }
}
