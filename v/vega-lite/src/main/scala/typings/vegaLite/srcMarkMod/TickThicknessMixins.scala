package typings.vegaLite.srcMarkMod

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickThicknessMixins extends StObject {
  
  /**
    * Thickness of the tick mark.
    *
    * __Default value:__  `1`
    *
    * @minimum 0
    */
  var thickness: js.UndefOr[Double | SignalRef] = js.undefined
}
object TickThicknessMixins {
  
  @scala.inline
  def apply(): TickThicknessMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickThicknessMixins]
  }
  
  @scala.inline
  implicit class TickThicknessMixinsMutableBuilder[Self <: TickThicknessMixins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThickness(value: Double | SignalRef): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
  }
}
