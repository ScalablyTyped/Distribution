package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for options used in Xrm.Utility.lookupObjects
  */
trait LookupOptions extends js.Object {
  /**
    * Indicates whether the lookup allows more than one item to be selected.
    */
  var allowMultiSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The default entity type to use.
    */
  var defaultEntityType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default view to use.
    */
  var defaultViewId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The entity types to display.
    */
  var entityTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Indicates whether the lookup control should show the barcode scanner in mobile clients.
    */
  var showBarcodeScanner: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The views to be available in the view picker.Only system views are supported.
    */
  var viewIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object LookupOptions {
  @scala.inline
  def apply(
    allowMultiSelect: js.UndefOr[scala.Boolean] = js.undefined,
    defaultEntityType: java.lang.String = null,
    defaultViewId: java.lang.String = null,
    entityTypes: js.Array[java.lang.String] = null,
    showBarcodeScanner: js.UndefOr[scala.Boolean] = js.undefined,
    viewIds: js.Array[java.lang.String] = null
  ): LookupOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultiSelect)) __obj.updateDynamic("allowMultiSelect")(allowMultiSelect)
    if (defaultEntityType != null) __obj.updateDynamic("defaultEntityType")(defaultEntityType)
    if (defaultViewId != null) __obj.updateDynamic("defaultViewId")(defaultViewId)
    if (entityTypes != null) __obj.updateDynamic("entityTypes")(entityTypes)
    if (!js.isUndefined(showBarcodeScanner)) __obj.updateDynamic("showBarcodeScanner")(showBarcodeScanner)
    if (viewIds != null) __obj.updateDynamic("viewIds")(viewIds)
    __obj.asInstanceOf[LookupOptions]
  }
}

