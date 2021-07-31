package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveToOptions extends StObject {
  
  var xOffset: js.UndefOr[Double] = js.undefined
  
  var yOffset: js.UndefOr[Double] = js.undefined
}
object MoveToOptions {
  
  @scala.inline
  def apply(): MoveToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveToOptions]
  }
  
  @scala.inline
  implicit class MoveToOptionsMutableBuilder[Self <: MoveToOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
    
    @scala.inline
    def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
  }
}
