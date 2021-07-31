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
  trait Customize
    extends Values[Setting[js.Any]] {
    
    def _handleSettingValidities(args: HandleSettingValiditiesArgs): Unit = js.native
    
    var _lastSavedRevision: Double = js.native
    
    var _latestRevision: Double = js.native
    
    var _latestSettingRevision: Record[String, Double] = js.native
    
    var control: Values[Control] = js.native
    
    var controlConstructor: ControlConstructor = js.native
    
    @JSName("defaultConstructor")
    var defaultConstructor_Customize: Setting[Class] = js.native
    
    def dirtyValues(): Record[String, js.Any] = js.native
    def dirtyValues(options: DirtyValuesOptions): Record[String, js.Any] = js.native
    
    def ensure(element: String): JQuery[HTMLElement] = js.native
    def ensure(element: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
    
    def findControlsForSettings(settingIds: js.Array[String]): Record[String, Control] = js.native
    
    def get(): Record[String, js.Any] = js.native
    
    // TODO
    var l10n: Record[String, String] = js.native
    
    var notifications: Notifications = js.native
    
    var panel: Values[Panel] = js.native
    
    var panelConstructor: PanelConstructor = js.native
    
    var previewer: Previewer[String] = js.native
    
    def reflowPaneContents(): Unit = js.native
    
    def requestChangesetUpdate(): Promise[js.Any, js.Any, js.Any] = js.native
    def requestChangesetUpdate(changes: Unit, args: RequestChangesetUpdateOptions): Promise[js.Any, js.Any, js.Any] = js.native
    def requestChangesetUpdate(changes: Record[String, js.Any]): Promise[js.Any, js.Any, js.Any] = js.native
    def requestChangesetUpdate(changes: Record[String, js.Any], args: RequestChangesetUpdateOptions): Promise[js.Any, js.Any, js.Any] = js.native
    
    var section: Values[Section] = js.native
    
    var sectionConstructor: SectionConstructor = js.native
    
    def setDocumentTitle(documentTitle: String): Unit = js.native
    
    var settingConstructor: SettingConstructor = js.native
    
    var settings: js.Any = js.native
    
    var state: Values[Class] = js.native
    
    // (a: any, b?: any): any; // TODO
    var utils: Utils = js.native
  }
  
  trait DirtyValuesOptions extends StObject {
    
    var unsaved: js.UndefOr[Boolean] = js.undefined
  }
  object DirtyValuesOptions {
    
    @scala.inline
    def apply(): DirtyValuesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirtyValuesOptions]
    }
    
    @scala.inline
    implicit class DirtyValuesOptionsMutableBuilder[Self <: DirtyValuesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsaved(value: Boolean): Self = StObject.set(x, "unsaved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsavedUndefined: Self = StObject.set(x, "unsaved", js.undefined)
    }
  }
  
  trait HandleSettingValiditiesArgs extends StObject {
    
    // TODO
    var focusInvalidControl: js.UndefOr[Boolean] = js.undefined
    
    var settingValidities: Record[String, js.Any]
  }
  object HandleSettingValiditiesArgs {
    
    @scala.inline
    def apply(settingValidities: Record[String, js.Any]): HandleSettingValiditiesArgs = {
      val __obj = js.Dynamic.literal(settingValidities = settingValidities.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleSettingValiditiesArgs]
    }
    
    @scala.inline
    implicit class HandleSettingValiditiesArgsMutableBuilder[Self <: HandleSettingValiditiesArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusInvalidControl(value: Boolean): Self = StObject.set(x, "focusInvalidControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusInvalidControlUndefined: Self = StObject.set(x, "focusInvalidControl", js.undefined)
      
      @scala.inline
      def setSettingValidities(value: Record[String, js.Any]): Self = StObject.set(x, "settingValidities", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestChangesetUpdateOptions extends StObject {
    
    var autosave: js.UndefOr[Boolean] = js.undefined
    
    var date: js.UndefOr[String] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object RequestChangesetUpdateOptions {
    
    @scala.inline
    def apply(): RequestChangesetUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestChangesetUpdateOptions]
    }
    
    @scala.inline
    implicit class RequestChangesetUpdateOptionsMutableBuilder[Self <: RequestChangesetUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutosave(value: Boolean): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
