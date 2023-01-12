package typings.vueDevtoolsApi.anon

import typings.vueDevtoolsApi.vueDevtoolsApiStrings.default
import typings.vueDevtoolsApi.vueDevtoolsApiStrings.once
import typings.vueDevtoolsApi.vueDevtoolsApiStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  /** Vue 1 only */
  var mode: js.UndefOr[default | sync | once] = js.undefined
  
  var required: Boolean
  
  var `type`: String
}
object Mode {
  
  inline def apply(required: Boolean, `type`: String): Mode = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    inline def setMode(value: default | sync | once): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
