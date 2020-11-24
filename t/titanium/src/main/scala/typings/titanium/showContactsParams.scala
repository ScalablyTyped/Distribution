package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.Contacts.showContacts> method.
  */
@js.native
trait showContactsParams extends js.Object {
  
  /**
    * Determines whether to animate the show/hide of the contacts picker (iPhone, iPad only.)
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Function to call when selection is canceled.
    */
  var cancel: js.UndefOr[js.Function1[/* param0 */ js.Any, Unit]] = js.native
  
  /**
    * Field names to show when selecting properties. By default, shows all available.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Function to call when a person is selected. Must not be used with `selectedProperty` property.
    */
  var selectedPerson: js.UndefOr[js.Function1[/* param0 */ js.Any, Unit]] = js.native
  
  /**
    * Function to call when a property is selected. Must not be used with `selectedPerson`
    * property.
    * Note: If ringtone or texttone is selected, null values are returned, since these are unsupported
    * by Apple.
    * Since iOS 9.0, there is a native apple issue whereby it may return null if the birthday property
    * is selected on certain device models.
    * The callback contains the selected property and a 'person' object of type <Titanium.Contacts.Person>.
    * Since iOS 9.0, apple only returns the person object with partial information. Currently it is known to
    * at least contain the selected property and fullName.
    */
  var selectedProperty: js.UndefOr[js.Function1[/* param0 */ js.Any, Unit]] = js.native
}
object showContactsParams {
  
  @scala.inline
  def apply(): showContactsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[showContactsParams]
  }
  
  @scala.inline
  implicit class showContactsParamsOps[Self <: showContactsParams] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setCancel(value: /* param0 */ js.Any => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setSelectedPerson(value: /* param0 */ js.Any => Unit): Self = this.set("selectedPerson", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectedPerson: Self = this.set("selectedPerson", js.undefined)
    
    @scala.inline
    def setSelectedProperty(value: /* param0 */ js.Any => Unit): Self = this.set("selectedProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectedProperty: Self = this.set("selectedProperty", js.undefined)
  }
}
