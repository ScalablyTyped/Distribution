package typings.yaireoTagify.mod

import typings.yaireoTagify.yaireoTagifyInts.`1`
import typings.yaireoTagify.yaireoTagifyInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the edit tags feature at runtime.
  */
trait EditTagsRuntimeSettings extends StObject {
  
  /**
    * Number of clicks to enter `edit` mode: `1` for single click. Any
    * other value is considered as double-click
    * @default 2
    */
  var clicks: `1` | `2`
  
  /**
    * When `true`, keeps invalid edits as-is until the escape key is
    * pressed while in focus.
    * @default true
    */
  var keepInvalid: Boolean
}
object EditTagsRuntimeSettings {
  
  inline def apply(clicks: `1` | `2`, keepInvalid: Boolean): EditTagsRuntimeSettings = {
    val __obj = js.Dynamic.literal(clicks = clicks.asInstanceOf[js.Any], keepInvalid = keepInvalid.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditTagsRuntimeSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditTagsRuntimeSettings] (val x: Self) extends AnyVal {
    
    inline def setClicks(value: `1` | `2`): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    inline def setKeepInvalid(value: Boolean): Self = StObject.set(x, "keepInvalid", value.asInstanceOf[js.Any])
  }
}
