package typings.trezorConnect.anon

import typings.trezorConnect.trezorConnectStrings.preloaded
import typings.trezorConnect.trezorConnectStrings.smart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blocks extends StObject {
  
  var blocks: js.UndefOr[js.Array[Double]] = js.undefined
  
  var feeLevels: js.UndefOr[preloaded | smart] = js.undefined
  
  var specific: js.UndefOr[Conservative] = js.undefined
}
object Blocks {
  
  inline def apply(): Blocks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blocks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blocks] (val x: Self) extends AnyVal {
    
    inline def setBlocks(value: js.Array[Double]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
    
    inline def setBlocksVarargs(value: Double*): Self = StObject.set(x, "blocks", js.Array(value*))
    
    inline def setFeeLevels(value: preloaded | smart): Self = StObject.set(x, "feeLevels", value.asInstanceOf[js.Any])
    
    inline def setFeeLevelsUndefined: Self = StObject.set(x, "feeLevels", js.undefined)
    
    inline def setSpecific(value: Conservative): Self = StObject.set(x, "specific", value.asInstanceOf[js.Any])
    
    inline def setSpecificUndefined: Self = StObject.set(x, "specific", js.undefined)
  }
}
