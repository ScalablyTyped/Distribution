package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.tabPanelMod.TabPanel.Props
import typings.wordpressComponents.wordpressComponentsStrings.horizontal
import typings.wordpressComponents.wordpressComponentsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPanelMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/tab-panel", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object TabPanel {
    
    trait Props extends StObject {
      
      /**
        * The class to add to the active tab.
        * @defaultValue "is-active"
        */
      var activeClass: js.UndefOr[String] = js.undefined
      
      /**
        * A function which renders the tabviews given the selected tab. The
        * function is passed the active tab object as an argument as defined
        * the the tabs prop. The element to which the tooltip should anchor.
        */
      def children(tab: Tab): Element
      
      /**
        * The class to give to the outer container for the `TabPanel`.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * Optionally provide a tab name for a tab to be selected upon mounting
        * of component. If this prop is not set, the first tab will be
        * selected by default.
        */
      var initialTabName: js.UndefOr[String] = js.undefined
      
      /**
        * The function called when a tab has been selected. It is passed the
        * `tabName` as an argument.
        */
      var onSelect: js.UndefOr[js.Function1[/* tabName */ String, Unit]] = js.undefined
      
      /**
        * The orientation of the tablist.
        * @defaultValue "horizontal"
        */
      var orientation: js.UndefOr[horizontal | vertical] = js.undefined
      
      var tabs: js.Array[Tab]
    }
    object Props {
      
      inline def apply(children: Tab => Element, tabs: js.Array[Tab]): Props = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), tabs = tabs.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
        
        inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
        
        inline def setChildren(value: Tab => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setInitialTabName(value: String): Self = StObject.set(x, "initialTabName", value.asInstanceOf[js.Any])
        
        inline def setInitialTabNameUndefined: Self = StObject.set(x, "initialTabName", js.undefined)
        
        inline def setOnSelect(value: /* tabName */ String => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
        
        inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
        
        inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
        
        inline def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
        
        inline def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
      }
    }
    
    trait Tab
      extends StObject
         with /**
      * Other fields may be added to the object and accessed from the child
      * function if desired.
      */
    /* k */ StringDictionary[js.Any] {
      
      /**
        * Defines the class to put on the tab.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * Defines the key for the tab.
        */
      var name: String
      
      /**
        * Defines the translated text for the tab.
        */
      var title: String
    }
    object Tab {
      
      inline def apply(name: String, title: String): Tab = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Tab]
      }
      
      extension [Self <: Tab](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
  }
}
