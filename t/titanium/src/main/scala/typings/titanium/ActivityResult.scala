package typings.titanium

import typings.titanium.Titanium.Android.Intent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object passed to the
  * [startActivityForResult](Titanium.Android.Activity.startActivityForResult) callback.
  */
@js.native
trait ActivityResult extends StObject {
  
  /**
    * Intent that can contain data returned to the caller. Data can be attached to
    * the intent as "extras").
    */
  var intent: js.UndefOr[Intent] = js.native
  
  /**
    * Unique, automatically generated integer request code.
    */
  var requestCode: js.UndefOr[Double] = js.native
  
  /**
    * Integer result code that the started activity passed to
    * [setResult](Titanium.Android.Activity.setResult).
    */
  var resultCode: js.UndefOr[Double] = js.native
}
object ActivityResult {
  
  @scala.inline
  def apply(): ActivityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityResult]
  }
  
  @scala.inline
  implicit class ActivityResultMutableBuilder[Self <: ActivityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    @scala.inline
    def setRequestCode(value: Double): Self = StObject.set(x, "requestCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCodeUndefined: Self = StObject.set(x, "requestCode", js.undefined)
    
    @scala.inline
    def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultCodeUndefined: Self = StObject.set(x, "resultCode", js.undefined)
  }
}
