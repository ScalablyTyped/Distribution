package typings.yaireoTagify.mod

import typings.yaireoTagify.yaireoTagifyInts.`1`
import typings.yaireoTagify.yaireoTagifyInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the edit tags feature that can be activated via the
  * `editTags` option of the settings that are passed to tagify.
  */
/* Inlined parent std.Partial<@yaireo/tagify.@yaireo/tagify.EditTagsRuntimeSettings> */
trait EditTagsSettings extends StObject {
  
  var clicks: js.UndefOr[`1` | `2`] = js.undefined
  
  var keepInvalid: js.UndefOr[Boolean] = js.undefined
}
object EditTagsSettings {
  
  inline def apply(): EditTagsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditTagsSettings]
  }
  
  extension [Self <: EditTagsSettings](x: Self) {
    
    inline def setClicks(value: `1` | `2`): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    inline def setClicksUndefined: Self = StObject.set(x, "clicks", js.undefined)
    
    inline def setKeepInvalid(value: Boolean): Self = StObject.set(x, "keepInvalid", value.asInstanceOf[js.Any])
    
    inline def setKeepInvalidUndefined: Self = StObject.set(x, "keepInvalid", js.undefined)
  }
}
