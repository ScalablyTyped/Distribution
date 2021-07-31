package typings.validator.mod.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMACAddressOptions extends StObject {
  
  /**
    * If `no_colons` is `true`, the validator will allow MAC addresses without the colons.
    * Also, it allows the use of hyphens or spaces.
    *
    * e.g. `01 02 03 04 05 ab` or `01-02-03-04-05-ab`.
    *
    * @default false
    */
  var no_colons: js.UndefOr[Boolean] = js.undefined
}
object IsMACAddressOptions {
  
  @scala.inline
  def apply(): IsMACAddressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsMACAddressOptions]
  }
  
  @scala.inline
  implicit class IsMACAddressOptionsMutableBuilder[Self <: IsMACAddressOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNo_colons(value: Boolean): Self = StObject.set(x, "no_colons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo_colonsUndefined: Self = StObject.set(x, "no_colons", js.undefined)
  }
}
