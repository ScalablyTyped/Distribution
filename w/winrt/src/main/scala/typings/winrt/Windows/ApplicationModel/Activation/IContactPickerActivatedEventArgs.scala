package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContactPickerActivatedEventArgs extends IActivatedEventArgs {
  
  var contactPickerUI: ContactPickerUI = js.native
}
object IContactPickerActivatedEventArgs {
  
  @scala.inline
  def apply(
    contactPickerUI: ContactPickerUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IContactPickerActivatedEventArgs = {
    val __obj = js.Dynamic.literal(contactPickerUI = contactPickerUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContactPickerActivatedEventArgs]
  }
  
  @scala.inline
  implicit class IContactPickerActivatedEventArgsMutableBuilder[Self <: IContactPickerActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactPickerUI(value: ContactPickerUI): Self = StObject.set(x, "contactPickerUI", value.asInstanceOf[js.Any])
  }
}
