package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.ClassName
import typings.wixStyleReact.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddressInputItemAddressInputItemMod {
  
  @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** This component is used to display an address item mainly in <AddressInput/> component. */
  @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", JSImport.Default)
  @js.native
  open class default protected () extends AddressInputItem {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.defaultProps.optionLayout_1")
      @js.native
      val optionLayout1: String = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.defaultProps.prefix_1")
      @js.native
      val prefix1: Element = js.native
    }
    
    @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.propTypes.highlighted")
      @js.native
      val highlighted: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.propTypes.mainLabel")
      @js.native
      val mainLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.propTypes.onClick")
      @js.native
      val onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.propTypes.optionLayout")
      @js.native
      val optionLayout: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.propTypes.prefix")
      @js.native
      val prefix: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.propTypes.secondaryLabel")
      @js.native
      val secondaryLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.propTypes.selected")
      @js.native
      val selected: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/AddressInputItem/AddressInputItem", "default.propTypes.suffix")
      @js.native
      val suffix: Requireable[ReactNodeLike] = js.native
    }
  }
  
  inline def addressInputItemBuilder(param0: ClassName): Label = ^.asInstanceOf[js.Dynamic].applyDynamic("addressInputItemBuilder")(param0.asInstanceOf[js.Any]).asInstanceOf[Label]
  
  /** This component is used to display an address item mainly in <AddressInput/> component. */
  @js.native
  trait AddressInputItem extends PureComponent[Any, Any, Any]
}
