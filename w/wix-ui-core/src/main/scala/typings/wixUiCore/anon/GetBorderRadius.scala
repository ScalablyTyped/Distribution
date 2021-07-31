package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBorderRadius extends StObject {
  
  /** returns elements border-radius css property */
  def getBorderRadius(): String
  
  /** returns elements height css property */
  def getHeight(): String
  
  /** returns elements min-width css property */
  def getMinWidth(): String
  
  /** returns elements padding css property */
  def getPadding(): String
  
  /** returns elements width css property */
  def getWidth(): String
}
object GetBorderRadius {
  
  @scala.inline
  def apply(
    getBorderRadius: () => String,
    getHeight: () => String,
    getMinWidth: () => String,
    getPadding: () => String,
    getWidth: () => String
  ): GetBorderRadius = {
    val __obj = js.Dynamic.literal(getBorderRadius = js.Any.fromFunction0(getBorderRadius), getHeight = js.Any.fromFunction0(getHeight), getMinWidth = js.Any.fromFunction0(getMinWidth), getPadding = js.Any.fromFunction0(getPadding), getWidth = js.Any.fromFunction0(getWidth))
    __obj.asInstanceOf[GetBorderRadius]
  }
  
  @scala.inline
  implicit class GetBorderRadiusMutableBuilder[Self <: GetBorderRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBorderRadius(value: () => String): Self = StObject.set(x, "getBorderRadius", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeight(value: () => String): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinWidth(value: () => String): Self = StObject.set(x, "getMinWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPadding(value: () => String): Self = StObject.set(x, "getPadding", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => String): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
  }
}
