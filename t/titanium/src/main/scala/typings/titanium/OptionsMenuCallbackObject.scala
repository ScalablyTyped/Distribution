package typings.titanium

import typings.titanium.Titanium.Android.Menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object passed to the <Titanium.Android.Activity> callbacks for
  * onPrepareOptionsMenu and onCreateOptionsMenu.
  * Additional properties may be set on the Object.
  */
@js.native
trait OptionsMenuCallbackObject extends StObject {
  
  /**
    * The relevant Menu.
    */
  var menu: js.UndefOr[Menu] = js.native
}
object OptionsMenuCallbackObject {
  
  @scala.inline
  def apply(): OptionsMenuCallbackObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsMenuCallbackObject]
  }
  
  @scala.inline
  implicit class OptionsMenuCallbackObjectMutableBuilder[Self <: OptionsMenuCallbackObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMenu(value: Menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
  }
}
