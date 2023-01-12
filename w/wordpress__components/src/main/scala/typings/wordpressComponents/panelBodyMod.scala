package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressComponents.iconMod.Icon.IconType
import typings.wordpressComponents.panelBodyMod.PanelBody.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelBodyMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/panel/body", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PanelBody {
    
    trait Props extends StObject {
      
      var children: ReactNode
      
      /**
        * The class that will be added with `components-panel__body`, if the
        * panel is currently open, the `is-opened` class will also be passed
        * to the classes of the wrapper div. If no `className` is passed then
        * only `components-panel__body` and `is-opened` is used.
        */
      var className: js.UndefOr[Any] = js.undefined
      
      /**
        * An icon to be shown next to the `PanelBody` title.
        */
      var icon: js.UndefOr[IconType[js.Object]] = js.undefined
      
      /**
        * Whether or not the panel will start open.
        * @defaultValue true
        */
      var initialOpen: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A function that is called when the user clicks on the `PanelBody`
        * title after the open state is changed.
        */
      var onToggle: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * If opened is true then the `Panel` will remain open regardless of
        * the `initialOpen` prop and the panel will be prevented from being
        * closed.
        */
      var opened: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Title of the `PanelBody`. This shows even when it is closed.
        */
      var title: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setIcon(value: IconType[js.Object]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setInitialOpen(value: Boolean): Self = StObject.set(x, "initialOpen", value.asInstanceOf[js.Any])
        
        inline def setInitialOpenUndefined: Self = StObject.set(x, "initialOpen", js.undefined)
        
        inline def setOnToggle(value: () => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction0(value))
        
        inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
        
        inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
        
        inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
