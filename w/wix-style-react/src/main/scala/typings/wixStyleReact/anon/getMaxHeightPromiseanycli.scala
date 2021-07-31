package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {getMaxHeight (): std.Promise<any>, clickOnInputWrapper (): std.Promise<void>, inputWrapperHasFocus (): std.Promise<any>, inputWrapperIsDisabled (): std.Promise<any>, numberOfTags (): std.Promise<number>, getTagLabelAt (index : number): std.Promise<string>, pressCommaKey (): std.Promise<void>, getTagDriverByTagId (tagId : string): std.Promise<wix-style-react.wix-style-react/dist/es/src/Tag/Tag.uni.driver.TagUniDriver & {isCloseButtonSmall (): std.Promise<boolean>, isCloseButtonLarge (): std.Promise<boolean>, getTextSize (): wix-style-react.wix-style-react/dist/es/src/Text.TextSize, getTextWeight (): wix-style-react.wix-style-react/dist/es/src/Text.TextWeight, isClickable (): std.Promise<boolean>}>, customSuffixExists (): std.Promise<any>} & std.Pick<wix-style-react.wix-style-react/dist/es/src/InputWithOptions/InputWithOptions.uni.driver.InputWithOptionsUniDriver, 'driver'> & wix-ui-test-utils.wix-ui-test-utils/base-driver.BaseUniDriver */
trait getMaxHeightPromiseanycli extends StObject {
  
  /** click on the element */
  def click(): js.Promise[Unit]
  
  def clickOnInputWrapper(): js.Promise[Unit]
  
  def customSuffixExists(): js.Promise[js.Any]
  
  var driver: Focus
  
  /** returns the component element */
  def element(): js.Promise[js.Any]
  
  /** returns true if component exists */
  def exists(): js.Promise[Boolean]
  
  def getMaxHeight(): js.Promise[js.Any]
  
  def getTagDriverByTagId(tagId: String): js.Promise[TagUniDriverisCloseButton]
  
  def getTagLabelAt(index: Double): js.Promise[String]
  
  def inputWrapperHasFocus(): js.Promise[js.Any]
  
  def inputWrapperIsDisabled(): js.Promise[js.Any]
  
  def numberOfTags(): js.Promise[Double]
  
  def pressCommaKey(): js.Promise[Unit]
}
object getMaxHeightPromiseanycli {
  
  @scala.inline
  def apply(
    click: () => js.Promise[Unit],
    clickOnInputWrapper: () => js.Promise[Unit],
    customSuffixExists: () => js.Promise[js.Any],
    driver: Focus,
    element: () => js.Promise[js.Any],
    exists: () => js.Promise[Boolean],
    getMaxHeight: () => js.Promise[js.Any],
    getTagDriverByTagId: String => js.Promise[TagUniDriverisCloseButton],
    getTagLabelAt: Double => js.Promise[String],
    inputWrapperHasFocus: () => js.Promise[js.Any],
    inputWrapperIsDisabled: () => js.Promise[js.Any],
    numberOfTags: () => js.Promise[Double],
    pressCommaKey: () => js.Promise[Unit]
  ): getMaxHeightPromiseanycli = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOnInputWrapper = js.Any.fromFunction0(clickOnInputWrapper), customSuffixExists = js.Any.fromFunction0(customSuffixExists), driver = driver.asInstanceOf[js.Any], element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getMaxHeight = js.Any.fromFunction0(getMaxHeight), getTagDriverByTagId = js.Any.fromFunction1(getTagDriverByTagId), getTagLabelAt = js.Any.fromFunction1(getTagLabelAt), inputWrapperHasFocus = js.Any.fromFunction0(inputWrapperHasFocus), inputWrapperIsDisabled = js.Any.fromFunction0(inputWrapperIsDisabled), numberOfTags = js.Any.fromFunction0(numberOfTags), pressCommaKey = js.Any.fromFunction0(pressCommaKey))
    __obj.asInstanceOf[getMaxHeightPromiseanycli]
  }
  
  @scala.inline
  implicit class getMaxHeightPromiseanycliMutableBuilder[Self <: getMaxHeightPromiseanycli] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClickOnInputWrapper(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnInputWrapper", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCustomSuffixExists(value: () => js.Promise[js.Any]): Self = StObject.set(x, "customSuffixExists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDriver(value: Focus): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: () => js.Promise[js.Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxHeight(value: () => js.Promise[js.Any]): Self = StObject.set(x, "getMaxHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTagDriverByTagId(value: String => js.Promise[TagUniDriverisCloseButton]): Self = StObject.set(x, "getTagDriverByTagId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTagLabelAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getTagLabelAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputWrapperHasFocus(value: () => js.Promise[js.Any]): Self = StObject.set(x, "inputWrapperHasFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInputWrapperIsDisabled(value: () => js.Promise[js.Any]): Self = StObject.set(x, "inputWrapperIsDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumberOfTags(value: () => js.Promise[Double]): Self = StObject.set(x, "numberOfTags", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPressCommaKey(value: () => js.Promise[Unit]): Self = StObject.set(x, "pressCommaKey", js.Any.fromFunction0(value))
  }
}
