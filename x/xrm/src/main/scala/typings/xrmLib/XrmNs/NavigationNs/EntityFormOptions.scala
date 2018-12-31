package typings
package xrmLib.XrmNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entity form options for opening the form
  */
trait EntityFormOptions extends js.Object {
  /**
    * Indicates whether to display the command bar.If you do not specify this parameter, the command bar is displayed by default.
    */
  var cmdbar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Designates a record that will provide default values based on mapped attribute values.The lookup object has the following String properties: entityType, id, and name (optional).
    */
  var createFromEntity: js.UndefOr[xrmLib.XrmNs.LookupValue] = js.undefined
  /**
    * ID of the entity record to display the form for.
    */
  var entityId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Logical name of the entity to display the form for.
    */
  var entityName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID of the form instance to be displayed.
    */
  var formId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Height of the form window to be displayed in pixels.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Undocumented at this time
    */
  var isCrossEntityNavigate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Undocumented at this time
    */
  var isOfflineSyncError: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls whether the navigation bar is displayed and whether application navigation is available using the areas and subareas defined in the sitemap.Valid vlaues are: "on", "off", or "entity".
    * * on: The navigation bar is displayed.This is the default behavior if the navBar parameter is not used.
    * * off: The navigation bar is not displayed.People can navigate using other user interface elements or the back and forward buttons.
    * * entity: On an entity form, only the navigation options for related entities are available.After navigating to a related entity, a back button is displayed in the navigation bar to allow returning to the original record.
    */
  var navBar: js.UndefOr[xrmLib.XrmNs.UrlNs.NavBarDisplay] = js.undefined
  /**
    * Indicates whether to display form in a new window.
    */
  var openInNewWindow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * ID of the business process to be displayed on the form.
    */
  var processId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID of the business process instance to be displayed on the form.
    */
  var processInstanceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define a relationship object to display the related records on the form.
    */
  var relationship: js.UndefOr[Relationship] = js.undefined
  /**
    * ID of the selected stage in business process instance.
    */
  var selectedStageId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether to open a quick create form.
    */
  var useQuickCreateForm: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Width of the form window to be displayed in pixels.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify one of the following values for the window position of the form on the screen:
    * * 1:center
    * * 2:side
    */
  var windowPosition: js.UndefOr[xrmLib.XrmEnumNs.WindowPositions] = js.undefined
}

