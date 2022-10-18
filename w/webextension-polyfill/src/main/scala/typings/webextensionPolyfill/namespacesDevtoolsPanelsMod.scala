package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.std.Window
import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import typings.webextensionPolyfill.namespacesManifestMod.Manifest.ExtensionURL
import typings.webextensionPolyfill.webextensionPolyfillStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesDevtoolsPanelsMod {
  
  object DevtoolsPanels {
    
    /**
      * A button created by the extension.
      */
    type Button = StringDictionary[Any]
    
    /**
      * Represents the Elements panel.
      */
    trait ElementsPanel extends StObject {
      
      /**
        * Creates a pane within panel's sidebar.
        *
        * @param title Text that is displayed in sidebar caption.
        * @returns A callback invoked when the sidebar is created.
        */
      def createSidebarPane(title: String): js.Promise[ExtensionSidebarPane]
      
      /**
        * Fired when an object is selected in the panel.
        */
      var onSelectionChanged: Event[js.Function0[Unit]]
    }
    object ElementsPanel {
      
      inline def apply(
        createSidebarPane: String => js.Promise[ExtensionSidebarPane],
        onSelectionChanged: Event[js.Function0[Unit]]
      ): ElementsPanel = {
        val __obj = js.Dynamic.literal(createSidebarPane = js.Any.fromFunction1(createSidebarPane), onSelectionChanged = onSelectionChanged.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementsPanel]
      }
      
      extension [Self <: ElementsPanel](x: Self) {
        
        inline def setCreateSidebarPane(value: String => js.Promise[ExtensionSidebarPane]): Self = StObject.set(x, "createSidebarPane", js.Any.fromFunction1(value))
        
        inline def setOnSelectionChanged(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onSelectionChanged", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Represents a panel created by extension.
      */
    trait ExtensionPanel extends StObject {
      
      /**
        * Fired when the user switches away from the panel.
        */
      var onHidden: Event[js.Function0[Unit]]
      
      /**
        * Fired when the user switches to the panel.
        *
        * @param window The JavaScript <code>window</code> object of panel's page.
        */
      var onShown: Event[js.Function1[/* window */ Window, Unit]]
    }
    object ExtensionPanel {
      
      inline def apply(onHidden: Event[js.Function0[Unit]], onShown: Event[js.Function1[/* window */ Window, Unit]]): ExtensionPanel = {
        val __obj = js.Dynamic.literal(onHidden = onHidden.asInstanceOf[js.Any], onShown = onShown.asInstanceOf[js.Any])
        __obj.asInstanceOf[ExtensionPanel]
      }
      
      extension [Self <: ExtensionPanel](x: Self) {
        
        inline def setOnHidden(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onHidden", value.asInstanceOf[js.Any])
        
        inline def setOnShown(value: Event[js.Function1[/* window */ Window, Unit]]): Self = StObject.set(x, "onShown", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A sidebar created by the extension.
      */
    @js.native
    trait ExtensionSidebarPane extends StObject {
      
      /**
        * Fired when the sidebar pane becomes hidden as a result of the user switching away from the panel that hosts the sidebar
        * pane.
        */
      var onHidden: Event[js.Function0[Unit]] = js.native
      
      /**
        * Fired when the sidebar pane becomes visible as a result of user switching to the panel that hosts it.
        *
        * @param window The JavaScript <code>window</code> object of the sidebar page, if one was set with the <code>setPage()
        * </code> method.
        */
      var onShown: Event[js.Function1[/* window */ Window, Unit]] = js.native
      
      /**
        * Sets an expression that is evaluated within the inspected page. The result is displayed in the sidebar pane.
        *
        * @param expression An expression to be evaluated in context of the inspected page. JavaScript objects and DOM nodes are
        * displayed in an expandable tree similar to the console/watch.
        * @param rootTitle Optional. An optional title for the root of the expression tree.
        * @returns A callback invoked after the sidebar pane is updated with the expression evaluation results.
        */
      def setExpression(expression: String): js.Promise[Unit] = js.native
      def setExpression(expression: String, rootTitle: String): js.Promise[Unit] = js.native
      
      /**
        * Sets a JSON-compliant object to be displayed in the sidebar pane.
        *
        * @param jsonObject An object to be displayed in context of the inspected page. Evaluated in the context of the caller
        * (API client).
        * @param rootTitle Optional. An optional title for the root of the expression tree.
        * @returns A callback invoked after the sidebar is updated with the object.
        */
      def setObject(jsonObject: String): js.Promise[Unit] = js.native
      def setObject(jsonObject: String, rootTitle: String): js.Promise[Unit] = js.native
      def setObject(jsonObject: js.Array[Any]): js.Promise[Unit] = js.native
      def setObject(jsonObject: js.Array[Any], rootTitle: String): js.Promise[Unit] = js.native
      def setObject(jsonObject: Record[String, Any]): js.Promise[Unit] = js.native
      def setObject(jsonObject: Record[String, Any], rootTitle: String): js.Promise[Unit] = js.native
      
      /**
        * Sets an HTML page to be displayed in the sidebar pane.
        *
        * @param path Relative path of an extension page to display within the sidebar.
        */
      def setPage(path: ExtensionURL): Unit = js.native
    }
    
    /**
      * Represents the Sources panel.
      */
    type SourcesPanel = StringDictionary[Any]
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Creates an extension panel.
        *
        * @param title Title that is displayed next to the extension icon in the Developer Tools toolbar.
        * @param iconPath Path of the panel's icon relative to the extension directory, or an empty string to use the default
        * extension icon as the panel icon.
        * @param pagePath Path of the panel's HTML page relative to the extension directory.
        * @returns A function that is called when the panel is created.
        */
      def create(title: String, iconPath: ExtensionURL, pagePath: ExtensionURL): js.Promise[ExtensionPanel] = js.native
      def create(title: String, iconPath: _empty, pagePath: ExtensionURL): js.Promise[ExtensionPanel] = js.native
      
      /**
        * Elements panel.
        */
      var elements: ElementsPanel = js.native
      
      /**
        * Fired when the devtools theme changes.
        *
        * @param themeName The name of the current devtools theme.
        */
      var onThemeChanged: Event[js.Function1[/* themeName */ String, Unit]] = js.native
      
      /**
        * Sources panel.
        */
      var sources: SourcesPanel = js.native
      
      /**
        * The name of the current devtools theme.
        */
      var themeName: String = js.native
    }
  }
}
