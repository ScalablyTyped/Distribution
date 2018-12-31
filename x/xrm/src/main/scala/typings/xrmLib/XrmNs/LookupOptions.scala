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

