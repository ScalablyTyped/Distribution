package typings.webdriverio.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragAndDropOptions extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
}
object DragAndDropOptions {
  
  inline def apply(): DragAndDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAndDropOptions]
  }
  
  extension [Self <: DragAndDropOptions](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
