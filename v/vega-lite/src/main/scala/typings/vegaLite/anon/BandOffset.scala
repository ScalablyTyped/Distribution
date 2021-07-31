package typings.vegaLite.anon

import typings.vegaLite.vegaSchemaMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BandOffset extends StObject {
  
  var band: js.UndefOr[Double | Boolean] = js.undefined
  
  var offset: js.UndefOr[Double | VgValueRef] = js.undefined
}
object BandOffset {
  
  @scala.inline
  def apply(): BandOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandOffset]
  }
  
  @scala.inline
  implicit class BandOffsetMutableBuilder[Self <: BandOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBand(value: Double | Boolean): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
