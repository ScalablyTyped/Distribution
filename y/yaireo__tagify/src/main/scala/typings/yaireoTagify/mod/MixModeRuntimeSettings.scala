package typings.yaireoTagify.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the mix mode feature at runtime.
  */
trait MixModeRuntimeSettings extends StObject {
  
  /**
    * Add after the added tag.
    * @default '\\u00A0'
    */
  var insertAfterTag: String | HTMLElement
}
object MixModeRuntimeSettings {
  
  inline def apply(insertAfterTag: String | HTMLElement): MixModeRuntimeSettings = {
    val __obj = js.Dynamic.literal(insertAfterTag = insertAfterTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MixModeRuntimeSettings]
  }
  
  extension [Self <: MixModeRuntimeSettings](x: Self) {
    
    inline def setInsertAfterTag(value: String | HTMLElement): Self = StObject.set(x, "insertAfterTag", value.asInstanceOf[js.Any])
  }
}
