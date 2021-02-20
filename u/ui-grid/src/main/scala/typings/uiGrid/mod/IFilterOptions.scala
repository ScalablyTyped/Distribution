package typings.uiGrid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilterOptions extends StObject {
  
  /**
    * String that will be set to the <input>.ariaLabel attribute. This is what is read as a label to screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * condition defines how rows are chosen as matching the filter term.
    * This can be set to one of the constants in uiGridConstants.filter,
    * or you can supply a custom filter function that gets passed the
    * following arguments: [searchTerm, cellValue, row, column].
    */
  var condition: js.UndefOr[
    Double | (js.Function4[
      /* searchTerm */ String, 
      /* cellValue */ js.Any, 
      /* row */ IGridRow, 
      /* column */ IGridColumn, 
      Boolean
    ])
  ] = js.native
  
  /**
    * If set to true then the 'x' button that cancels/clears the filter will not be shown.
    * @default false
    */
  var disableCancelFilterButton: js.UndefOr[Boolean] = js.native
  
  /**
    * only flag currently available is caseSensitive, set to false if you don't want case sensitive matching
    */
  var flags: js.UndefOr[IFilterFlags] = js.native
  
  /**
    * set this to true if you have defined a custom function in condition,
    * and your custom function doesn't require a term
    * (so it can run even when the term is null)
    */
  var noTerm: js.UndefOr[Boolean] = js.native
  
  /** String that will be set to the <input>.placeholder attribute */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * options in the format [{ value: 1, label: 'male' }]. No i18n filter is provided, you need to perform the i18n
    * on the values before you provide them
    */
  var selectOptions: js.UndefOr[js.Array[ISelectOption]] = js.native
  
  /**
    * If set, the filter field will be pre-populated with this value
    */
  var term: js.UndefOr[String] = js.native
  
  /**
    * defaults to uiGridConstants.filter.INPUT, which gives a text box. If set to uiGridConstants.filter.SELECT
    * then a select box will be shown with options selectOptions
    */
  var `type`: js.UndefOr[Double | String] = js.native
}
object IFilterOptions {
  
  @scala.inline
  def apply(): IFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterOptions]
  }
  
  @scala.inline
  implicit class IFilterOptionsMutableBuilder[Self <: IFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    @scala.inline
    def setCondition(
      value: Double | (js.Function4[
          /* searchTerm */ String, 
          /* cellValue */ js.Any, 
          /* row */ IGridRow, 
          /* column */ IGridColumn, 
          Boolean
        ])
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionFunction4(
      value: (/* searchTerm */ String, /* cellValue */ js.Any, /* row */ IGridRow, /* column */ IGridColumn) => Boolean
    ): Self = StObject.set(x, "condition", js.Any.fromFunction4(value))
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setDisableCancelFilterButton(value: Boolean): Self = StObject.set(x, "disableCancelFilterButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCancelFilterButtonUndefined: Self = StObject.set(x, "disableCancelFilterButton", js.undefined)
    
    @scala.inline
    def setFlags(value: IFilterFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setNoTerm(value: Boolean): Self = StObject.set(x, "noTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoTermUndefined: Self = StObject.set(x, "noTerm", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSelectOptions(value: js.Array[ISelectOption]): Self = StObject.set(x, "selectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectOptionsUndefined: Self = StObject.set(x, "selectOptions", js.undefined)
    
    @scala.inline
    def setSelectOptionsVarargs(value: ISelectOption*): Self = StObject.set(x, "selectOptions", js.Array(value :_*))
    
    @scala.inline
    def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    
    @scala.inline
    def setType(value: Double | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
