package typings.validator.mod.validator

import typings.validator.validatorStrings.default
import typings.validator.validatorStrings.hour12
import typings.validator.validatorStrings.hour24
import typings.validator.validatorStrings.withSeconds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsTimeOptions extends StObject {
  
  /**
    * 'hour24' will validate hours in 24 format and 'hour12' will validate hours in 12 format.
    * @default 'hour24'
    */
  var hourFormat: js.UndefOr[hour12 | hour24] = js.undefined
  
  /**
    * 'default' will validate HH:MM format, 'withSeconds' will validate the HH:MM:SS format
    *
    * @default 'default'
    */
  var mode: js.UndefOr[default | withSeconds] = js.undefined
}
object IsTimeOptions {
  
  inline def apply(): IsTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsTimeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsTimeOptions] (val x: Self) extends AnyVal {
    
    inline def setHourFormat(value: hour12 | hour24): Self = StObject.set(x, "hourFormat", value.asInstanceOf[js.Any])
    
    inline def setHourFormatUndefined: Self = StObject.set(x, "hourFormat", js.undefined)
    
    inline def setMode(value: default | withSeconds): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
