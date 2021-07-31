package typings.themeUiCss.scalesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeightsCSSProperties extends StObject {
  
  var lineHeight: js.UndefOr[LineHeights] = js.undefined
}
object LineHeightsCSSProperties {
  
  @scala.inline
  def apply(): LineHeightsCSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineHeightsCSSProperties]
  }
  
  @scala.inline
  implicit class LineHeightsCSSPropertiesMutableBuilder[Self <: LineHeightsCSSProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineHeight(value: LineHeights): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
  }
}
