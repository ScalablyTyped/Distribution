package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface for the formContext.data object.
     * @note NTOE NOTE
     * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data External Link: formContext.data (Client API reference)}
     */
@js.native
trait Data extends js.Object {
  /**
           * Collection of non-entity data on the form.
           * Items in this collection are of the same type as the attributes collection, but they are not attributes of the form entity.
           * In V9 this is only available in the Unified Client
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/attributes External Link: Attributes (Client API reference)}
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
           * @see {@link Attributes}
           */
  var attributes: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.AttributesNs.Attribute] = js.native
  /**
           * The record context of the form, {@link Entity formContext.data.entity}
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data-entity External Link: formContext.data.entity (Client API reference)}
           */
  var entity: Entity = js.native
  /**
           * The process API for {@link ProcessFlow.ProcessManager formContext.ui.process}.
           * @remarks This member may be undefined when Process Flows are not used by the current entity.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data-process External Link: formContext.data.process (Client API reference)}
           */
  var process: xrmLib.XrmNs.ProcessFlowNs.ProcessManager = js.native
  /**
           * Asynchronously refreshes data on the form, without reloading the page.
           * @param save true to save the record, after the refresh.
           * @returns Returns an asynchronous promise.
           */
  def refresh(save: scala.Boolean): xrmLib.XrmNs.AsyncNs.PromiseLike[js.UndefOr[scala.Nothing]] = js.native
  /**
           * Asynchronously saves the record.
           * @returns Returns an asynchronous promise.
           */
  def save(): xrmLib.XrmNs.AsyncNs.PromiseLike[js.UndefOr[scala.Nothing]] = js.native
  /**
           * Asynchronously saves the record  with the option to set callback functions to be executed after the save operation is completed.
           * @param saveOptions Options to control how appointment, recurring appointment, or service activity records are processed.
           * @returns Returns an asynchronous promise.
           */
  def save(saveOptions: SaveOptions): xrmLib.XrmNs.AsyncNs.PromiseLike[js.UndefOr[scala.Nothing]] = js.native
}

