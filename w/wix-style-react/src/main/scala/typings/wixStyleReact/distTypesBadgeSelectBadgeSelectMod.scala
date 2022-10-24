package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.wixStyleReact.anon.DynamicWidth
import typings.wixStyleReact.anon.Ellipsis
import typings.wixStyleReact.anon.IdAny
import typings.wixStyleReact.anon.OverrideOptionStyle
import typings.wixStyleReact.anon.SelectedBadge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeSelectBadgeSelectMod {
  
  @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", JSImport.Default)
  @js.native
  open class default protected () extends BadgeSelect {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.defaultProps.type_1")
      @js.native
      val type1: String = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.defaultProps.uppercase_1")
      @js.native
      val uppercase1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.propTypes.onSelect")
      @js.native
      val onSelect: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.propTypes.options")
      @js.native
      val options: Validator[js.Array[js.UndefOr[InferProps[Ellipsis] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.propTypes.popoverProps")
      @js.native
      val popoverProps: Requireable[InferProps[DynamicWidth]] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.propTypes.selectedId")
      @js.native
      val selectedId: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/BadgeSelect/BadgeSelect", "default.propTypes.uppercase")
      @js.native
      val uppercase: Requireable[Boolean] = js.native
    }
  }
  
  @js.native
  trait BadgeSelect extends Component[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MBadgeSelect(nextProps: Any): Unit = js.native
    
    def _getBadgeOptionById(options: Any, wantedId: Any): Any = js.native
    
    def _handleSelect(param0: IdAny): Unit = js.native
    
    def _isControlled(): Boolean = js.native
    
    /**
      * Determine if a certain key should open the DropdownLayout
      *
      * @param {KeyboardEvent.key} key - The key name
      * @return {boolean} - Whether the key should cause the DropdownLayout to open
      */
    def _isOpenKey(
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyboardEvent.key */ Any
    ): Boolean = js.native
    
    def _onKeyDown(event: Any): Unit = js.native
    
    var badge: js.UndefOr[typings.wixStyleReact.distTypesBadgeMod.default | Null] = js.native
    
    var dropdownLayout: js.UndefOr[typings.wixStyleReact.distTypesDropdownLayoutMod.default | Null] = js.native
    
    def getSelectedOption(props: Any): Any = js.native
    
    def hideDropdown(): Unit = js.native
    
    def options: js.Array[OverrideOptionStyle] = js.native
    
    def showDropdown(): Unit = js.native
    
    @JSName("state")
    var state_BadgeSelect: SelectedBadge = js.native
    
    def toggleDropdown(): Unit = js.native
  }
}
