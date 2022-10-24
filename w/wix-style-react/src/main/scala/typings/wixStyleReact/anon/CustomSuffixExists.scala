package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomSuffixExists extends StObject {
  
  def clickOnInputWrapper(): js.Promise[Unit]
  
  def customSuffixExists(): js.Promise[Any]
  
  def getMaxHeight(): js.Promise[Any]
  
  def getTagDriverByTagId(tagId: String): js.Promise[TagUniDriverisCloseButton]
  
  def getTagLabelAt(index: Double): js.Promise[String]
  
  def inputWrapperHasFocus(): js.Promise[Any]
  
  def inputWrapperIsDisabled(): js.Promise[Any]
  
  def numberOfTags(): js.Promise[Double]
  
  def pressCommaKey(): js.Promise[Unit]
}
object CustomSuffixExists {
  
  inline def apply(
    clickOnInputWrapper: () => js.Promise[Unit],
    customSuffixExists: () => js.Promise[Any],
    getMaxHeight: () => js.Promise[Any],
    getTagDriverByTagId: String => js.Promise[TagUniDriverisCloseButton],
    getTagLabelAt: Double => js.Promise[String],
    inputWrapperHasFocus: () => js.Promise[Any],
    inputWrapperIsDisabled: () => js.Promise[Any],
    numberOfTags: () => js.Promise[Double],
    pressCommaKey: () => js.Promise[Unit]
  ): CustomSuffixExists = {
    val __obj = js.Dynamic.literal(clickOnInputWrapper = js.Any.fromFunction0(clickOnInputWrapper), customSuffixExists = js.Any.fromFunction0(customSuffixExists), getMaxHeight = js.Any.fromFunction0(getMaxHeight), getTagDriverByTagId = js.Any.fromFunction1(getTagDriverByTagId), getTagLabelAt = js.Any.fromFunction1(getTagLabelAt), inputWrapperHasFocus = js.Any.fromFunction0(inputWrapperHasFocus), inputWrapperIsDisabled = js.Any.fromFunction0(inputWrapperIsDisabled), numberOfTags = js.Any.fromFunction0(numberOfTags), pressCommaKey = js.Any.fromFunction0(pressCommaKey))
    __obj.asInstanceOf[CustomSuffixExists]
  }
  
  extension [Self <: CustomSuffixExists](x: Self) {
    
    inline def setClickOnInputWrapper(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnInputWrapper", js.Any.fromFunction0(value))
    
    inline def setCustomSuffixExists(value: () => js.Promise[Any]): Self = StObject.set(x, "customSuffixExists", js.Any.fromFunction0(value))
    
    inline def setGetMaxHeight(value: () => js.Promise[Any]): Self = StObject.set(x, "getMaxHeight", js.Any.fromFunction0(value))
    
    inline def setGetTagDriverByTagId(value: String => js.Promise[TagUniDriverisCloseButton]): Self = StObject.set(x, "getTagDriverByTagId", js.Any.fromFunction1(value))
    
    inline def setGetTagLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getTagLabelAt", js.Any.fromFunction1(value))
    
    inline def setInputWrapperHasFocus(value: () => js.Promise[Any]): Self = StObject.set(x, "inputWrapperHasFocus", js.Any.fromFunction0(value))
    
    inline def setInputWrapperIsDisabled(value: () => js.Promise[Any]): Self = StObject.set(x, "inputWrapperIsDisabled", js.Any.fromFunction0(value))
    
    inline def setNumberOfTags(value: () => js.Promise[Double]): Self = StObject.set(x, "numberOfTags", js.Any.fromFunction0(value))
    
    inline def setPressCommaKey(value: () => js.Promise[Unit]): Self = StObject.set(x, "pressCommaKey", js.Any.fromFunction0(value))
  }
}
