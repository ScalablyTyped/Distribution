package typings.xrm.Xrm

import typings.xrm.XrmEnum.ViewType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An definition module for URL-based, CRM component parameters.
  * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
  */
object Url {
  
  /**
    * Command Bar Display options for Xrm.Url.FormOpenParameters.cmdbar, Xrm.Url.ViewOpenParameters.cmdbar, and Xrm.Utility.FormOpenParameters.cmdbar.
    * @see {@link XrmEnum.CmdBarDisplay}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.`true`
    - typings.xrm.xrmStrings.`false`
  */
  trait CmdBarDisplay extends StObject
  object CmdBarDisplay {
    
    @scala.inline
    def `false`: typings.xrm.xrmStrings.`false` = "false".asInstanceOf[typings.xrm.xrmStrings.`false`]
    
    @scala.inline
    def `true`: typings.xrm.xrmStrings.`true` = "true".asInstanceOf[typings.xrm.xrmStrings.`true`]
  }
  
  /**
    * Interface for defining parameters of a request to open a dialog with rundialog.aspx (as with
    * window.open).  Useful for parsing the keys and values into a string of the format:
    * "&key=value".
    * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
    */
  @js.native
  trait DialogOpenParameters extends StObject {
    
    /**
      * The unique identifier of the dialog, in Guid format, which is valid for the entity described
      * by: {@link EntityName}
      */
    var DialogId: String = js.native
    
    /**
      * The logical name of the entity.
      */
    var EntityName: String = js.native
    
    /**
      * The unique identifier for the targeted record.
      */
    var ObjectId: String = js.native
  }
  object DialogOpenParameters {
    
    @scala.inline
    def apply(DialogId: String, EntityName: String, ObjectId: String): DialogOpenParameters = {
      val __obj = js.Dynamic.literal(DialogId = DialogId.asInstanceOf[js.Any], EntityName = EntityName.asInstanceOf[js.Any], ObjectId = ObjectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogOpenParameters]
    }
    
    @scala.inline
    implicit class DialogOpenParametersMutableBuilder[Self <: DialogOpenParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDialogId(value: String): Self = StObject.set(x, "DialogId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityName(value: String): Self = StObject.set(x, "EntityName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectId(value: String): Self = StObject.set(x, "ObjectId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface for defining parameters on a request to open a form with main.aspx (as with
    * window.open). Useful for parsing the keys and values into a string of the format:
    * "&key=value".
    * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
    * @remarks  A member for "pagetype" is not provided.  The value "entityrecord" is required in
    *           the URL, for forms. Example:  "pagetype=entityrecord"
    */
  @js.native
  trait FormOpenParameters extends StObject {
    
    /**
      * Controls whether the command bar is displayed.
      * @remarks **Accepted values are**:
      * * "true"    (The command bar is displayed.)
      * * "false"   (The command bar is not displayed.)
      */
    var cmdbar: js.UndefOr[CmdBarDisplay] = js.native
    
    /**
      * The logical name of the entity.
      */
    var etn: String = js.native
    
    /**
      * Additional parameters can be provided to the request. This can only be used to provide
      * default field values for the form, or pass data to custom parameters that have been
      * customized for the form.  See example below for setting the selected form.
      * @example Example:  encodeURIComponent("formid={8c9f3e6f-7839-e211-831e-00155db7d98f}");
      */
    var extraqs: js.UndefOr[String] = js.native
    
    /**
      * Controls whether the Navigation bar is displayed on the form.
      * @remarks **Accepted values are**:
      * * "on"      (The navigation bar is displayed.)
      * * "off"     (The navigation bar is not displayed.)
      * * "entity"  (On an entity form, only the navigation options for related entities are available.)
      */
    var navbar: js.UndefOr[NavBarDisplay] = js.native
  }
  object FormOpenParameters {
    
    @scala.inline
    def apply(etn: String): FormOpenParameters = {
      val __obj = js.Dynamic.literal(etn = etn.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormOpenParameters]
    }
    
    @scala.inline
    implicit class FormOpenParametersMutableBuilder[Self <: FormOpenParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmdbar(value: CmdBarDisplay): Self = StObject.set(x, "cmdbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmdbarUndefined: Self = StObject.set(x, "cmdbar", js.undefined)
      
      @scala.inline
      def setEtn(value: String): Self = StObject.set(x, "etn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraqs(value: String): Self = StObject.set(x, "extraqs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraqsUndefined: Self = StObject.set(x, "extraqs", js.undefined)
      
      @scala.inline
      def setNavbar(value: NavBarDisplay): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
    }
  }
  
  /**
    * Navigation Bar Display options for Xrm.Url.FormOpenParameters.navbar, Xrm.Url.ViewOpenParameters.navbar, and Xrm.Utility.FormOpenParameters.navbar.
    * @see {@link XrmEnum.NavBarDisplay}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.entity
    - typings.xrm.xrmStrings.off
    - typings.xrm.xrmStrings.on
  */
  trait NavBarDisplay extends StObject
  object NavBarDisplay {
    
    @scala.inline
    def entity: typings.xrm.xrmStrings.entity = "entity".asInstanceOf[typings.xrm.xrmStrings.entity]
    
    @scala.inline
    def off: typings.xrm.xrmStrings.off = "off".asInstanceOf[typings.xrm.xrmStrings.off]
    
    @scala.inline
    def on: typings.xrm.xrmStrings.on = "on".asInstanceOf[typings.xrm.xrmStrings.on]
  }
  
  /**
    * Report Open Action options for Xrm.Url.ReportOpenParameters.actions.
    * @see {@link XrmEnum.ReportAction}
    */
  /* Rewritten from type alias, can be one of: 
    - typings.xrm.xrmStrings.filter
    - typings.xrm.xrmStrings.run
  */
  trait ReportAction extends StObject
  object ReportAction {
    
    @scala.inline
    def filter: typings.xrm.xrmStrings.filter = "filter".asInstanceOf[typings.xrm.xrmStrings.filter]
    
    @scala.inline
    def run: typings.xrm.xrmStrings.run = "run".asInstanceOf[typings.xrm.xrmStrings.run]
  }
  
  /**
    * Interface for defining parameters of a request to open a report with viewer.apsx (as with
    * window.open).  Useful for parsing out the keys and values into a string of the format:
    * "&key=value"
    *
    * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
    */
  @js.native
  trait ReportOpenParameters extends StObject {
    
    /**
      * The action to perform, as either "run" or "filter".
      * @remarks **Actions**:
      * * "run"       Executes the report with default filters.
      * * "filter"    Presents the user with the filter editor, and a "Run Report" button.
      */
    var action: ReportAction = js.native
    
    /**
      * The file name of the report.  For out-of-box reports, this parameter enables context-sensitive
      * help.
      */
    var helpID: js.UndefOr[String] = js.native
    
    /**
      * The unique identifier, held in the report's 'reportid' attribute, in Guid format.
      */
    var id: String = js.native
  }
  object ReportOpenParameters {
    
    @scala.inline
    def apply(action: ReportAction, id: String): ReportOpenParameters = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportOpenParameters]
    }
    
    @scala.inline
    implicit class ReportOpenParametersMutableBuilder[Self <: ReportOpenParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ReportAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpID(value: String): Self = StObject.set(x, "helpID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpIDUndefined: Self = StObject.set(x, "helpID", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface for defining parameters on a request to open a view with main.aspx (as with
    * window.open). Useful for parsing the keys and values into a string of the format:
    * "&key=value".
    * @see {@link http://msdn.microsoft.com/en-us/library/gg328483.aspx External Link: Open forms, views, dialogs, and reports with a URL}
    * @remarks  A member for "pagetype" is not provided.  The value "entitylist" is required in
    *           the URL, for views. Example:  "pagetype=entitylist"
    */
  @js.native
  trait ViewOpenParameters extends StObject {
    
    /**
      * Controls whether the command bar is displayed.
      * @remarks **Accepted values are**:
      * * "true"    (The command bar is displayed.)
      * * "false"   (The command bar is not displayed.)
      */
    var cmdbar: js.UndefOr[CmdBarDisplay] = js.native
    
    /**
      * The logical name of the entity.
      */
    var etn: String = js.native
    
    /**
      * Controls whether the Navigation bar is displayed on the form.
      * @remarks **Accepted values are**:
      * * "on"      (The navigation bar is displayed.)
      * * "off"     (The navigation bar is not displayed.)
      * * "entity"  (On an entity form, only the navigation options for related entities are available.)
      */
    var navbar: js.UndefOr[NavBarDisplay] = js.native
    
    /**
      * The unique identifier of a view, in Guid format, which is valid for the entity described by
      * {@link etn}.
      */
    var viewid: String = js.native
    
    /**
      * The type of view identified by {@link viewid}.
      * @remarks **Accepted values are**:
      * * 1039    System View
      * * 4230    User View.
      */
    var viewtype: ViewType = js.native
  }
  object ViewOpenParameters {
    
    @scala.inline
    def apply(etn: String, viewid: String, viewtype: ViewType): ViewOpenParameters = {
      val __obj = js.Dynamic.literal(etn = etn.asInstanceOf[js.Any], viewid = viewid.asInstanceOf[js.Any], viewtype = viewtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewOpenParameters]
    }
    
    @scala.inline
    implicit class ViewOpenParametersMutableBuilder[Self <: ViewOpenParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmdbar(value: CmdBarDisplay): Self = StObject.set(x, "cmdbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmdbarUndefined: Self = StObject.set(x, "cmdbar", js.undefined)
      
      @scala.inline
      def setEtn(value: String): Self = StObject.set(x, "etn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbar(value: NavBarDisplay): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
      
      @scala.inline
      def setViewid(value: String): Self = StObject.set(x, "viewid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewtype(value: ViewType): Self = StObject.set(x, "viewtype", value.asInstanceOf[js.Any])
    }
  }
}
