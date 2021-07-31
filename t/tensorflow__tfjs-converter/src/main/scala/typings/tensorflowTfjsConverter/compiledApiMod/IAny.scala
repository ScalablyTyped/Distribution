package typings.tensorflowTfjsConverter.compiledApiMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAny extends StObject {
  
  /** Any typeUrl */
  var typeUrl: js.UndefOr[String | Null] = js.undefined
  
  /** Any value */
  var value: js.UndefOr[Uint8Array | Null] = js.undefined
}
object IAny {
  
  @scala.inline
  def apply(): IAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAny]
  }
  
  @scala.inline
  implicit class IAnyMutableBuilder[Self <: IAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUrlNull: Self = StObject.set(x, "typeUrl", null)
    
    @scala.inline
    def setTypeUrlUndefined: Self = StObject.set(x, "typeUrl", js.undefined)
    
    @scala.inline
    def setValue(value: Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
