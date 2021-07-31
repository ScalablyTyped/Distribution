package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragAndDropOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
}
object DragAndDropOptions {
  
  @scala.inline
  def apply(): DragAndDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAndDropOptions]
  }
  
  @scala.inline
  implicit class DragAndDropOptionsMutableBuilder[Self <: DragAndDropOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
