package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ScaledValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Band
  extends ScaledValueRef[js.Any] {
  
  var band: Boolean | Double = js.native
  
  var scale: typings.vegaTypings.encodeMod.Field = js.native
}
object Band {
  
  @scala.inline
  def apply(band: Boolean | Double, scale: typings.vegaTypings.encodeMod.Field): Band = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Band]
  }
  
  @scala.inline
  implicit class BandMutableBuilder[Self <: Band] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBand(value: Boolean | Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: typings.vegaTypings.encodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
