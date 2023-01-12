package typings.xrm.Xrm

import typings.xrm.Xrm.App.Notifcation
import typings.xrm.Xrm.Async.PromiseLike
import typings.xrm.Xrm.Navigation.CustomPage
import typings.xrm.Xrm.Navigation.Dashboard
import typings.xrm.Xrm.Navigation.NavigationOptions
import typings.xrm.Xrm.Navigation.PageInputEntityList
import typings.xrm.Xrm.Navigation.PageInputEntityRecord
import typings.xrm.Xrm.Navigation.PageInputHtmlWebResource
import typings.xrm.anon.CreatePane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for Xrm.App API
  * @see {@link https://docs.microsoft.com/en-us/powerapps/developer/model-driven-apps/clientapi/reference/xrm-app External Link: Xrm.App (Client API reference)}
  */
trait App extends StObject {
  
  /**
    * Displays an error, information, warning, or success notification for an app, and lets you specify actions to execute based on the notification.
    * @param notification The notification to add.
    * @returns On success, returns a promise object containing a GUID value to uniquely identify the notification as described earlier in the description of the successCallback parameter.
    */
  def addGlobalNotification(notification: Notifcation): PromiseLike[String]
  
  /**
    * Clears a notification in the app.
    * @param uniqueId The ID to use to clear a specific notification that was set using addGlobalNotification.
    * @returns On success, returns a promise object.
    */
  def clearGlobalNotification(uniqueId: String): PromiseLike[String]
  
  /**
    * Provides methods for managing side panes.
    * @see {@link https://docs.microsoft.com/en-us/powerapps/developer/model-driven-apps/clientapi/reference/xrm-app-sidepanes External Link: sidePanes (Client API reference)}
    */
  var sidePanes: CreatePane
}
/**
  * Namespace to hold Xrm.App related types
  * @see {@link https://docs.microsoft.com/en-us/powerapps/developer/model-driven-apps/clientapi/reference/xrm-app External Link: Xrm.App (Client API reference)}
  */
object App {
  
  inline def apply(
    addGlobalNotification: Notifcation => PromiseLike[String],
    clearGlobalNotification: String => PromiseLike[String],
    sidePanes: CreatePane
  ): App = {
    val __obj = js.Dynamic.literal(addGlobalNotification = js.Any.fromFunction1(addGlobalNotification), clearGlobalNotification = js.Any.fromFunction1(clearGlobalNotification), sidePanes = sidePanes.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  /**
    * Defines the action of notification
    * @see {@link Xmr.App.Notification}
    */
  trait Action extends StObject {
    
    /**
      * The label for the action in the message.
      */
    var actionLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The function to execute when the action label is clicked.
      */
    var eventHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Action {
    
    inline def apply(): Action = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setActionLabel(value: String): Self = StObject.set(x, "actionLabel", value.asInstanceOf[js.Any])
      
      inline def setActionLabelUndefined: Self = StObject.set(x, "actionLabel", js.undefined)
      
      inline def setEventHandler(value: () => Unit): Self = StObject.set(x, "eventHandler", js.Any.fromFunction0(value))
      
      inline def setEventHandlerUndefined: Self = StObject.set(x, "eventHandler", js.undefined)
    }
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    inline def setAddGlobalNotification(value: Notifcation => PromiseLike[String]): Self = StObject.set(x, "addGlobalNotification", js.Any.fromFunction1(value))
    
    inline def setClearGlobalNotification(value: String => PromiseLike[String]): Self = StObject.set(x, "clearGlobalNotification", js.Any.fromFunction1(value))
    
    inline def setSidePanes(value: CreatePane): Self = StObject.set(x, "sidePanes", value.asInstanceOf[js.Any])
  }
  
  /**
    * Defines the notification object for Xrm.App.addGlobalNotification
    * @see {@link Xmr.App.addGlobalNotification}
    */
  trait Notifcation extends StObject {
    
    /**
      * @see {@link Xrm.App.Action}
      */
    var action: js.UndefOr[Action] = js.undefined
    
    /**
      * Defines the level of notification.
      */
    var level: Double
    
    /**
      * The message to display in the notification.
      */
    var message: String
    
    /**
      * Indicates whether or not the user can close or dismiss the notification. If you don't specify this parameter, users can't close or dismiss the notification by default.
      */
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the type of notification. Currently, only a value of 2 is supported, which displays a message bar at the top of the app.
      */
    var `type`: Double
  }
  object Notifcation {
    
    inline def apply(level: Double, message: String, `type`: Double): Notifcation = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notifcation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Notifcation] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Defines methods single side pane.
    */
  /* Inlined parent std.Omit<xrm.Xrm.App.PaneOptions, 'isSelected' | 'hideHeader'> */
  @js.native
  trait PaneObject extends StObject {
    
    var alwaysRender: js.UndefOr[Boolean] = js.native
    
    var canClose: js.UndefOr[Boolean] = js.native
    
    /**
      * Closes the side pane and removes it from the side bar.
      */
    def close(): Unit = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var imageSrc: js.UndefOr[String] = js.native
    
    var keepBadgeOnSelect: js.UndefOr[Boolean] = js.native
    
    def navigate(pageInput: CustomPage): PromiseLike[Any] = js.native
    def navigate(pageInput: CustomPage, navigationOptions: NavigationOptions): PromiseLike[Any] = js.native
    def navigate(pageInput: Dashboard): PromiseLike[Any] = js.native
    def navigate(pageInput: Dashboard, navigationOptions: NavigationOptions): PromiseLike[Any] = js.native
    def navigate(pageInput: PageInputEntityList): PromiseLike[Any] = js.native
    def navigate(pageInput: PageInputEntityList, navigationOptions: NavigationOptions): PromiseLike[Any] = js.native
    /**
      * Opens a page within the selected pane. This is similar to the navigateTo method.
      */
    def navigate(pageInput: PageInputEntityRecord): PromiseLike[Any] = js.native
    def navigate(pageInput: PageInputEntityRecord, navigationOptions: NavigationOptions): PromiseLike[Any] = js.native
    def navigate(pageInput: PageInputHtmlWebResource): PromiseLike[Any] = js.native
    def navigate(pageInput: PageInputHtmlWebResource, navigationOptions: NavigationOptions): PromiseLike[Any] = js.native
    
    var paneId: js.UndefOr[String] = js.native
    
    /**
      * Specify whether the pane should be selected or expanded.
      */
    def select(): Unit = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  
  /**
    * Defines single side pane.
    * @see {@link Xrm.App.sidePanes.createPane}
    */
  trait PaneOptions extends StObject {
    
    /**
      * Prevents the pane from unmounting when it is hidden.
      */
    var alwaysRender: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the pane header will show a close button or not.
      */
    var canClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hides the pane and tab.
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hides the header pane, including the title and close button. Default value is false.
      */
    var hideHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The path of the icon to show in the panel switcher control.
      */
    var imageSrc: js.UndefOr[String] = js.undefined
    
    /**
      * When set to false, the created pane is not selected and leaves the existing pane selected. It also does not expand the pane if collapsed.
      */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Prevents the badge from getting cleared when the pane becomes selected.
      */
    var keepBadgeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The ID of the new pane. If the value is not passed, the ID value is auto-generated.
      */
    var paneId: js.UndefOr[String] = js.undefined
    
    /**
      * The title of the pane. Used in pane header and for tooltip.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The width of the pane in pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PaneOptions {
    
    inline def apply(): PaneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaneOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaneOptions] (val x: Self) extends AnyVal {
      
      inline def setAlwaysRender(value: Boolean): Self = StObject.set(x, "alwaysRender", value.asInstanceOf[js.Any])
      
      inline def setAlwaysRenderUndefined: Self = StObject.set(x, "alwaysRender", js.undefined)
      
      inline def setCanClose(value: Boolean): Self = StObject.set(x, "canClose", value.asInstanceOf[js.Any])
      
      inline def setCanCloseUndefined: Self = StObject.set(x, "canClose", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      inline def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      inline def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      inline def setImageSrcUndefined: Self = StObject.set(x, "imageSrc", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKeepBadgeOnSelect(value: Boolean): Self = StObject.set(x, "keepBadgeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setKeepBadgeOnSelectUndefined: Self = StObject.set(x, "keepBadgeOnSelect", js.undefined)
      
      inline def setPaneId(value: String): Self = StObject.set(x, "paneId", value.asInstanceOf[js.Any])
      
      inline def setPaneIdUndefined: Self = StObject.set(x, "paneId", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
