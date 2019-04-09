package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a Lookup control.
  * @see {@link StandardControl}
  */
@js.native
trait LookupControl extends StandardControl {
  /**
    * Adds an additional custom filter to the lookup, with the "AND" filter operator.
    * Can only be used within a "pre search" event handler
    * @see {@link addPreSearch}
    * @param filter Specifies the filter, as a serialized FetchXML "filter" node.
    * @param entityLogicalName (Optional) The logical name of the entity.
    * @remarks     If entityLogicalName is not specified, the filter will be applied to all entities
    *              valid for the Lookup control.
    * @example     Example filter: <filter type="and">
    *                              <condition attribute="address1_city" operator="eq" value="Redmond" />
    *                              </filter>
    */
  def addCustomFilter(filter: java.lang.String): scala.Unit = js.native
  def addCustomFilter(filter: java.lang.String, entityLogicalName: java.lang.String): scala.Unit = js.native
  /**
    * Adds a custom view for the Lookup dialog.
    * @param viewId Unique identifier for the view, in Guid format.
    * @param entityName Name of the entity.
    * @param viewDisplayName Name of the view to display.
    * @param fetchXml The FetchXML query for the view's contents, serialized as a string.
    * @param layoutXml The Layout XML, serialized as a string.
    * @param isDefault true, to treat this view as default.
    * @remarks Cannot be used on "Owner" Lookup controls.
    *          The viewId is never saved to CRM, but must be unique across available views.  Generating
    *          a new value can be accomplished with a {@link http://www.guidgen.com/ Guid generator(external link)}.
    * @example Example viewId value: "{00000000-0000-0000-0000-000000000001}"
    * @see {@link http://msdn.microsoft.com/en-us/library/gg334522.aspx External Link: Layout XML Reference}
    */
  def addCustomView(
    viewId: java.lang.String,
    entityName: java.lang.String,
    viewDisplayName: java.lang.String,
    fetchXml: java.lang.String,
    layoutXml: java.lang.String,
    isDefault: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Adds a handler to the "pre search" event of the Lookup control.
    * @param handler The handler.
    */
  def addPreSearch(handler: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler): scala.Unit = js.native
  /**
    * Gets the unique identifier of the default view.
    * @returns The default view, in Guid format.
    * @example Example return: "{00000000-0000-0000-0000-000000000000}"
    */
  def getDefaultView(): java.lang.String = js.native
  /**
    * Gets the types of entities allowed in the lookup control.
    */
  def getEntityTypes(): js.Array[java.lang.String] = js.native
  /**
    * Removes the handler from the "pre search" event of the Lookup control.
    * @param handler The handler.
    */
  def removePreSearch(handler: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler): scala.Unit = js.native
  /**
    * Sets the Lookup's default view.
    * @param viewGuid Unique identifier for the view.
    * @example Example viewGuid value: "{00000000-0000-0000-0000-000000000000}"
    */
  def setDefaultView(viewGuid: java.lang.String): scala.Unit = js.native
  /**
    * Sets the types of entities allowed in the lookup control.
    */
  def setEntityTypes(entityLogicalNames: js.Array[java.lang.String]): scala.Unit = js.native
}

