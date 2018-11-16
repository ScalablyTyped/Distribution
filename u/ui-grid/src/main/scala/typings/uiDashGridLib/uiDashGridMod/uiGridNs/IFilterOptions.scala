package typings
package uiDashGridLib.uiDashGridMod.uiGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFilterOptions extends js.Object {
  /**
           * String that will be set to the <input>.ariaLabel attribute. This is what is read as a label to screen reader users.
           */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
           * condition defines how rows are chosen as matching the filter term.
           * This can be set to one of the constants in uiGridConstants.filter,
           * or you can supply a custom filter function that gets passed the
           * following arguments: [searchTerm, cellValue, row, column].
           */
  var condition: js.UndefOr[
    scala.Double | (js.Function4[
      /* searchTerm */ java.lang.String, 
      /* cellValue */ js.Any, 
      /* row */ IGridRow, 
      /* column */ IGridColumn, 
      scala.Boolean
    ])
  ] = js.undefined
  /**
           * If set to true then the 'x' button that cancels/clears the filter will not be shown.
           * @default false
           */
  var disableCancelFilterButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * only flag currently available is caseSensitive, set to false if you don't want case sensitive matching
           */
  var flags: js.UndefOr[IFilterFlags] = js.undefined
  /**
           * set this to true if you have defined a custom function in condition,
           * and your custom function doesn't require a term
           * (so it can run even when the term is null)
           */
  var noTerm: js.UndefOr[scala.Boolean] = js.undefined
  /** String that will be set to the <input>.placeholder attribute */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /**
           * options in the format [{ value: 1, label: 'male' }]. No i18n filter is provided, you need to perform the i18n
           * on the values before you provide them
           */
  var selectOptions: js.UndefOr[js.Array[ISelectOption]] = js.undefined
  /**
           * If set, the filter field will be pre-populated with this value
           */
  var term: js.UndefOr[java.lang.String] = js.undefined
  /**
           * defaults to uiGridConstants.filter.INPUT, which gives a text box. If set to uiGridConstants.filter.SELECT
           * then a select box will be shown with options selectOptions
           */
  var `type`: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

