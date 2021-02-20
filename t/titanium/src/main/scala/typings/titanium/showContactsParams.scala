package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.Contacts.showContacts> method.
  */
@js.native
trait showContactsParams extends StObject {
  
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
  implicit class showContactsParamsMutableBuilder[Self <: showContactsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setCancel(value: /* param0 */ js.Any => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setSelectedPerson(value: /* param0 */ js.Any => Unit): Self = StObject.set(x, "selectedPerson", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedPersonUndefined: Self = StObject.set(x, "selectedPerson", js.undefined)
    
    @scala.inline
    def setSelectedProperty(value: /* param0 */ js.Any => Unit): Self = StObject.set(x, "selectedProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectedPropertyUndefined: Self = StObject.set(x, "selectedProperty", js.undefined)
  }
}
