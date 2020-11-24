package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for options used in Xrm.Utility.lookupObjects
  */
@js.native
trait LookupOptions extends js.Object {
  
  /**
    * Indicates whether the lookup allows more than one item to be selected.
    */
  var allowMultiSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * The default entity type to use.
    */
  var defaultEntityType: js.UndefOr[String] = js.native
  
  /**
    * The default view to use.
    */
  var defaultViewId: js.UndefOr[String] = js.native
  
  /**
    * The entity types to display.
    */
  var entityTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Indicates whether the lookup control should show the barcode scanner in mobile clients.
    */
  var showBarcodeScanner: js.UndefOr[Boolean] = js.native
  
  /**
    * The views to be available in the view picker.Only system views are supported.
    */
  var viewIds: js.UndefOr[js.Array[String]] = js.native
}
object LookupOptions {
  
  @scala.inline
  def apply(): LookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOptions]
  }
  
  @scala.inline
  implicit class LookupOptionsOps[Self <: LookupOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowMultiSelect(value: Boolean): Self = this.set("allowMultiSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiSelect: Self = this.set("allowMultiSelect", js.undefined)
    
    @scala.inline
    def setDefaultEntityType(value: String): Self = this.set("defaultEntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEntityType: Self = this.set("defaultEntityType", js.undefined)
    
    @scala.inline
    def setDefaultViewId(value: String): Self = this.set("defaultViewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultViewId: Self = this.set("defaultViewId", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: String*): Self = this.set("entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEntityTypes(value: js.Array[String]): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityTypes: Self = this.set("entityTypes", js.undefined)
    
    @scala.inline
    def setShowBarcodeScanner(value: Boolean): Self = this.set("showBarcodeScanner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBarcodeScanner: Self = this.set("showBarcodeScanner", js.undefined)
    
    @scala.inline
    def setViewIdsVarargs(value: String*): Self = this.set("viewIds", js.Array(value :_*))
    
    @scala.inline
    def setViewIds(value: js.Array[String]): Self = this.set("viewIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewIds: Self = this.set("viewIds", js.undefined)
  }
}
