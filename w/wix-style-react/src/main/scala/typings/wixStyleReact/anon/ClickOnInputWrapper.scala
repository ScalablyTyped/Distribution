package typings.wixStyleReact.anon

import typings.std.HTMLElement
import typings.wixStyleReact.distTypesTagTagDotdriverMod.TagDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickOnInputWrapper extends StObject {
  
  def clickOnInputWrapper(): Unit
  
  def customSuffixExists(): HTMLElement
  
  def getMaxHeight(): String
  
  def getTagDriverByTagId(tagId: String): TagDriver
  
  def getTagLabelAt(index: Double): String
  
  def inputWrapperHasFocus(): Boolean
  
  def inputWrapperIsDisabled(): Boolean
  
  def numberOfTags(): Double
  
  def pressCommaKey(): Unit
}
object ClickOnInputWrapper {
  
  inline def apply(
    clickOnInputWrapper: () => Unit,
    customSuffixExists: () => HTMLElement,
    getMaxHeight: () => String,
    getTagDriverByTagId: String => TagDriver,
    getTagLabelAt: Double => String,
    inputWrapperHasFocus: () => Boolean,
    inputWrapperIsDisabled: () => Boolean,
    numberOfTags: () => Double,
    pressCommaKey: () => Unit
  ): ClickOnInputWrapper = {
    val __obj = js.Dynamic.literal(clickOnInputWrapper = js.Any.fromFunction0(clickOnInputWrapper), customSuffixExists = js.Any.fromFunction0(customSuffixExists), getMaxHeight = js.Any.fromFunction0(getMaxHeight), getTagDriverByTagId = js.Any.fromFunction1(getTagDriverByTagId), getTagLabelAt = js.Any.fromFunction1(getTagLabelAt), inputWrapperHasFocus = js.Any.fromFunction0(inputWrapperHasFocus), inputWrapperIsDisabled = js.Any.fromFunction0(inputWrapperIsDisabled), numberOfTags = js.Any.fromFunction0(numberOfTags), pressCommaKey = js.Any.fromFunction0(pressCommaKey))
    __obj.asInstanceOf[ClickOnInputWrapper]
  }
  
  extension [Self <: ClickOnInputWrapper](x: Self) {
    
    inline def setClickOnInputWrapper(value: () => Unit): Self = StObject.set(x, "clickOnInputWrapper", js.Any.fromFunction0(value))
    
    inline def setCustomSuffixExists(value: () => HTMLElement): Self = StObject.set(x, "customSuffixExists", js.Any.fromFunction0(value))
    
    inline def setGetMaxHeight(value: () => String): Self = StObject.set(x, "getMaxHeight", js.Any.fromFunction0(value))
    
    inline def setGetTagDriverByTagId(value: String => TagDriver): Self = StObject.set(x, "getTagDriverByTagId", js.Any.fromFunction1(value))
    
    inline def setGetTagLabelAt(value: Double => String): Self = StObject.set(x, "getTagLabelAt", js.Any.fromFunction1(value))
    
    inline def setInputWrapperHasFocus(value: () => Boolean): Self = StObject.set(x, "inputWrapperHasFocus", js.Any.fromFunction0(value))
    
    inline def setInputWrapperIsDisabled(value: () => Boolean): Self = StObject.set(x, "inputWrapperIsDisabled", js.Any.fromFunction0(value))
    
    inline def setNumberOfTags(value: () => Double): Self = StObject.set(x, "numberOfTags", js.Any.fromFunction0(value))
    
    inline def setPressCommaKey(value: () => Unit): Self = StObject.set(x, "pressCommaKey", js.Any.fromFunction0(value))
  }
}
