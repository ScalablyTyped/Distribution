package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery
import typings.jquery.JQuery.Promise
import typings.std.HTMLElement
import typings.std.Record
import typings.wordpressCustomizeBrowser.classMod.Class
import typings.wordpressCustomizeBrowser.controlConstructorMod.ControlConstructor
import typings.wordpressCustomizeBrowser.controlMod.Control
import typings.wordpressCustomizeBrowser.notificationsMod.Notifications
import typings.wordpressCustomizeBrowser.panelConstructorMod.PanelConstructor
import typings.wordpressCustomizeBrowser.panelMod.Panel
import typings.wordpressCustomizeBrowser.previewerMod.Previewer
import typings.wordpressCustomizeBrowser.sectionConstructorMod.SectionConstructor
import typings.wordpressCustomizeBrowser.sectionMod.Section
import typings.wordpressCustomizeBrowser.settingConstructorMod.SettingConstructor
import typings.wordpressCustomizeBrowser.settingMod.Setting
import typings.wordpressCustomizeBrowser.utilsMod.Utils
import typings.wordpressCustomizeBrowser.valuesMod.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customizeMod {
  
  @js.native
  trait Customize extends Values[Setting[Any]] {
    
    def _handleSettingValidities(args: HandleSettingValiditiesArgs): Unit = js.native
    
    var _lastSavedRevision: Double = js.native
    
    var _latestRevision: Double = js.native
    
    var _latestSettingRevision: Record[String, Double] = js.native
    
    var control: Values[Control] = js.native
    
    var controlConstructor: ControlConstructor = js.native
    
    @JSName("defaultConstructor")
    var defaultConstructor_Customize: Setting[Class] = js.native
    
    def dirtyValues(): Record[String, Any] = js.native
    def dirtyValues(options: DirtyValuesOptions): Record[String, Any] = js.native
    
    def ensure(element: String): JQuery[HTMLElement] = js.native
    def ensure(element: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
    
    def findControlsForSettings(settingIds: js.Array[String]): Record[String, Control] = js.native
    
    def get(): Record[String, Any] = js.native
    
    // TODO
    var l10n: Record[String, String] = js.native
    
    var notifications: Notifications = js.native
    
    var panel: Values[Panel] = js.native
    
    var panelConstructor: PanelConstructor = js.native
    
    var previewer: Previewer[String] = js.native
    
    def reflowPaneContents(): Unit = js.native
    
    def requestChangesetUpdate(): Promise[Any, Any, Any] = js.native
    def requestChangesetUpdate(changes: Unit, args: RequestChangesetUpdateOptions): Promise[Any, Any, Any] = js.native
    def requestChangesetUpdate(changes: Record[String, Any]): Promise[Any, Any, Any] = js.native
    def requestChangesetUpdate(changes: Record[String, Any], args: RequestChangesetUpdateOptions): Promise[Any, Any, Any] = js.native
    
    var section: Values[Section] = js.native
    
    var sectionConstructor: SectionConstructor = js.native
    
    def setDocumentTitle(documentTitle: String): Unit = js.native
    
    var settingConstructor: SettingConstructor = js.native
    
    var settings: Any = js.native
    
    var state: Values[Class] = js.native
    
    // (a: any, b?: any): any; // TODO
    var utils: Utils = js.native
  }
  
  trait DirtyValuesOptions extends StObject {
    
    var unsaved: js.UndefOr[Boolean] = js.undefined
  }
  object DirtyValuesOptions {
    
    inline def apply(): DirtyValuesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirtyValuesOptions]
    }
    
    extension [Self <: DirtyValuesOptions](x: Self) {
      
      inline def setUnsaved(value: Boolean): Self = StObject.set(x, "unsaved", value.asInstanceOf[js.Any])
      
      inline def setUnsavedUndefined: Self = StObject.set(x, "unsaved", js.undefined)
    }
  }
  
  trait HandleSettingValiditiesArgs extends StObject {
    
    // TODO
    var focusInvalidControl: js.UndefOr[Boolean] = js.undefined
    
    var settingValidities: Record[String, Any]
  }
  object HandleSettingValiditiesArgs {
    
    inline def apply(settingValidities: Record[String, Any]): HandleSettingValiditiesArgs = {
      val __obj = js.Dynamic.literal(settingValidities = settingValidities.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleSettingValiditiesArgs]
    }
    
    extension [Self <: HandleSettingValiditiesArgs](x: Self) {
      
      inline def setFocusInvalidControl(value: Boolean): Self = StObject.set(x, "focusInvalidControl", value.asInstanceOf[js.Any])
      
      inline def setFocusInvalidControlUndefined: Self = StObject.set(x, "focusInvalidControl", js.undefined)
      
      inline def setSettingValidities(value: Record[String, Any]): Self = StObject.set(x, "settingValidities", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestChangesetUpdateOptions extends StObject {
    
    var autosave: js.UndefOr[Boolean] = js.undefined
    
    var date: js.UndefOr[String] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object RequestChangesetUpdateOptions {
    
    inline def apply(): RequestChangesetUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestChangesetUpdateOptions]
    }
    
    extension [Self <: RequestChangesetUpdateOptions](x: Self) {
      
      inline def setAutosave(value: Boolean): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
      
      inline def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
