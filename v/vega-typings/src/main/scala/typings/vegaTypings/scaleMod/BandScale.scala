package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.band
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BandScale
  extends BaseBandScale
     with Scale {
  
  var paddingInner: js.UndefOr[Double | SignalRef] = js.native
  
  @JSName("type")
  var type_BandScale: band = js.native
}
object BandScale {
  
  @scala.inline
  def apply(name: String, `type`: band): BandScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandScale]
  }
  
  @scala.inline
  implicit class BandScaleMutableBuilder[Self <: BandScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaddingInner(value: Double | SignalRef): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
    
    @scala.inline
    def setType(value: band): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
