package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.CustomElement
import typings.wixStyleReact.anon.Datahook
import typings.wixStyleReact.anon.IsActive
import typings.wixStyleReact.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBreadcrumbsBreadcrumbsMod {
  
  /**
    * a way to visualise current navigation path
    */
  @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", JSImport.Default)
  @js.native
  open class default protected () extends Breadcrumbs {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.defaultProps.itemMaxWidth")
      @js.native
      def itemMaxWidth: String = js.native
      inline def itemMaxWidth_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemMaxWidth")(x.asInstanceOf[js.Any])
      
      inline def onClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClick")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.defaultProps.theme")
      @js.native
      def theme: String = js.native
      inline def theme_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.propTypes.activeId")
      @js.native
      def activeId: Requireable[String | Double] = js.native
      inline def activeId_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeId")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used to create driver in testing */
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** The maximum width of Breadcrumb item */
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.propTypes.itemMaxWidth")
      @js.native
      def itemMaxWidth: Requireable[String | Double] = js.native
      inline def itemMaxWidth_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemMaxWidth")(x.asInstanceOf[js.Any])
      
      /**
        * * __id__ - Specifies the item id
        * * __link__ - Optional link to be called on click
        * * __value__ - Value to be shown on breadcrumb
        * * __disabled__ - if this value is disabled
        * * __customElement__ - A custom item which will be rendered
        */
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.propTypes.items")
      @js.native
      def items: Validator[js.Array[js.UndefOr[InferProps[CustomElement] | Null]]] = js.native
      inline def items_=(x: Validator[js.Array[js.UndefOr[InferProps[CustomElement] | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Breadcrumbs/Breadcrumbs", "default.propTypes.theme")
      @js.native
      def theme: Requireable[String] = js.native
      inline def theme_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * a way to visualise current navigation path
    */
  @js.native
  trait Breadcrumbs extends PureComponent[Any, Any, Any] {
    
    def _createItem(param0: IsActive): Element = js.native
    
    def _getIsActive(item: Any): Boolean = js.native
    
    def _getItemWrapperDataAttributes(param0: Item): Datahook = js.native
    
    def _handleItemClick(item: Any): js.Function0[Any] = js.native
  }
}
