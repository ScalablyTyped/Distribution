package typings.terminalKit.anon

import typings.terminalKit.rectMod.Rect
import typings.terminalKit.terminalKitStrings.x
import typings.terminalKit.terminalKitStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DstRect extends StObject {
  
  var dstRect: Rect
  
  var offsetX: Double
  
  var offsetY: Double
  
  var srcRect: Rect
  
  var wrapOnly: js.UndefOr[x | y] = js.undefined
}
object DstRect {
  
  @scala.inline
  def apply(dstRect: Rect, offsetX: Double, offsetY: Double, srcRect: Rect): DstRect = {
    val __obj = js.Dynamic.literal(dstRect = dstRect.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], srcRect = srcRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[DstRect]
  }
  
  @scala.inline
  implicit class DstRectMutableBuilder[Self <: DstRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDstRect(value: Rect): Self = StObject.set(x, "dstRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcRect(value: Rect): Self = StObject.set(x, "srcRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapOnly(value: typings.terminalKit.terminalKitStrings.x | y): Self = StObject.set(x, "wrapOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapOnlyUndefined: Self = StObject.set(x, "wrapOnly", js.undefined)
  }
}
