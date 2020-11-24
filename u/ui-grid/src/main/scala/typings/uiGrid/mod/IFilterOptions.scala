package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilterOptions extends js.Object {
  
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
  implicit class IFilterOptionsOps[Self <: IFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setConditionFunction4(
      value: (/* searchTerm */ String, /* cellValue */ js.Any, /* row */ IGridRow, /* column */ IGridColumn) => Boolean
    ): Self = this.set("condition", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCondition(
      value: Double | (js.Function4[
          /* searchTerm */ String, 
          /* cellValue */ js.Any, 
          /* row */ IGridRow, 
          /* column */ IGridColumn, 
          Boolean
        ])
    ): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setDisableCancelFilterButton(value: Boolean): Self = this.set("disableCancelFilterButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCancelFilterButton: Self = this.set("disableCancelFilterButton", js.undefined)
    
    @scala.inline
    def setFlags(value: IFilterFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setNoTerm(value: Boolean): Self = this.set("noTerm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoTerm: Self = this.set("noTerm", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setSelectOptionsVarargs(value: ISelectOption*): Self = this.set("selectOptions", js.Array(value :_*))
    
    @scala.inline
    def setSelectOptions(value: js.Array[ISelectOption]): Self = this.set("selectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOptions: Self = this.set("selectOptions", js.undefined)
    
    @scala.inline
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerm: Self = this.set("term", js.undefined)
    
    @scala.inline
    def setType(value: Double | String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
