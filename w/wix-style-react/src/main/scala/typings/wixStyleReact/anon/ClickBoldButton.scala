package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickBoldButton extends StObject {
  
  def clickBoldButton(): Any
  
  def clickBulletedListButton(): Any
  
  def clickFormCancelButton(): Any
  
  def clickItalicButton(): Any
  
  def clickLinkButton(): Any
  
  def clickNumberedListButton(): Any
  
  def clickUnderlineButton(): Any
  
  def getBoldButton(): Any
  
  def getBulletedListButton(): Any
  
  def getButtonTypes(): Any
  
  def getItalicButton(): Any
  
  def getLinkButton(): Any
  
  def getNumberedListButton(): Any
  
  def getUnderlineButton(): Any
  
  def insertLink(text: Any, url: Any): js.Promise[Unit]
  
  def insertUrl(url: Any): Any
  
  def isActive(element: Any): js.Promise[Boolean]
  
  def isFormConfirmButtonDisabled(): js.Promise[Boolean]
  
  def isFormDisplayed(): Any
}
object ClickBoldButton {
  
  inline def apply(
    clickBoldButton: () => Any,
    clickBulletedListButton: () => Any,
    clickFormCancelButton: () => Any,
    clickItalicButton: () => Any,
    clickLinkButton: () => Any,
    clickNumberedListButton: () => Any,
    clickUnderlineButton: () => Any,
    getBoldButton: () => Any,
    getBulletedListButton: () => Any,
    getButtonTypes: () => Any,
    getItalicButton: () => Any,
    getLinkButton: () => Any,
    getNumberedListButton: () => Any,
    getUnderlineButton: () => Any,
    insertLink: (Any, Any) => js.Promise[Unit],
    insertUrl: Any => Any,
    isActive: Any => js.Promise[Boolean],
    isFormConfirmButtonDisabled: () => js.Promise[Boolean],
    isFormDisplayed: () => Any
  ): ClickBoldButton = {
    val __obj = js.Dynamic.literal(clickBoldButton = js.Any.fromFunction0(clickBoldButton), clickBulletedListButton = js.Any.fromFunction0(clickBulletedListButton), clickFormCancelButton = js.Any.fromFunction0(clickFormCancelButton), clickItalicButton = js.Any.fromFunction0(clickItalicButton), clickLinkButton = js.Any.fromFunction0(clickLinkButton), clickNumberedListButton = js.Any.fromFunction0(clickNumberedListButton), clickUnderlineButton = js.Any.fromFunction0(clickUnderlineButton), getBoldButton = js.Any.fromFunction0(getBoldButton), getBulletedListButton = js.Any.fromFunction0(getBulletedListButton), getButtonTypes = js.Any.fromFunction0(getButtonTypes), getItalicButton = js.Any.fromFunction0(getItalicButton), getLinkButton = js.Any.fromFunction0(getLinkButton), getNumberedListButton = js.Any.fromFunction0(getNumberedListButton), getUnderlineButton = js.Any.fromFunction0(getUnderlineButton), insertLink = js.Any.fromFunction2(insertLink), insertUrl = js.Any.fromFunction1(insertUrl), isActive = js.Any.fromFunction1(isActive), isFormConfirmButtonDisabled = js.Any.fromFunction0(isFormConfirmButtonDisabled), isFormDisplayed = js.Any.fromFunction0(isFormDisplayed))
    __obj.asInstanceOf[ClickBoldButton]
  }
  
  extension [Self <: ClickBoldButton](x: Self) {
    
    inline def setClickBoldButton(value: () => Any): Self = StObject.set(x, "clickBoldButton", js.Any.fromFunction0(value))
    
    inline def setClickBulletedListButton(value: () => Any): Self = StObject.set(x, "clickBulletedListButton", js.Any.fromFunction0(value))
    
    inline def setClickFormCancelButton(value: () => Any): Self = StObject.set(x, "clickFormCancelButton", js.Any.fromFunction0(value))
    
    inline def setClickItalicButton(value: () => Any): Self = StObject.set(x, "clickItalicButton", js.Any.fromFunction0(value))
    
    inline def setClickLinkButton(value: () => Any): Self = StObject.set(x, "clickLinkButton", js.Any.fromFunction0(value))
    
    inline def setClickNumberedListButton(value: () => Any): Self = StObject.set(x, "clickNumberedListButton", js.Any.fromFunction0(value))
    
    inline def setClickUnderlineButton(value: () => Any): Self = StObject.set(x, "clickUnderlineButton", js.Any.fromFunction0(value))
    
    inline def setGetBoldButton(value: () => Any): Self = StObject.set(x, "getBoldButton", js.Any.fromFunction0(value))
    
    inline def setGetBulletedListButton(value: () => Any): Self = StObject.set(x, "getBulletedListButton", js.Any.fromFunction0(value))
    
    inline def setGetButtonTypes(value: () => Any): Self = StObject.set(x, "getButtonTypes", js.Any.fromFunction0(value))
    
    inline def setGetItalicButton(value: () => Any): Self = StObject.set(x, "getItalicButton", js.Any.fromFunction0(value))
    
    inline def setGetLinkButton(value: () => Any): Self = StObject.set(x, "getLinkButton", js.Any.fromFunction0(value))
    
    inline def setGetNumberedListButton(value: () => Any): Self = StObject.set(x, "getNumberedListButton", js.Any.fromFunction0(value))
    
    inline def setGetUnderlineButton(value: () => Any): Self = StObject.set(x, "getUnderlineButton", js.Any.fromFunction0(value))
    
    inline def setInsertLink(value: (Any, Any) => js.Promise[Unit]): Self = StObject.set(x, "insertLink", js.Any.fromFunction2(value))
    
    inline def setInsertUrl(value: Any => Any): Self = StObject.set(x, "insertUrl", js.Any.fromFunction1(value))
    
    inline def setIsActive(value: Any => js.Promise[Boolean]): Self = StObject.set(x, "isActive", js.Any.fromFunction1(value))
    
    inline def setIsFormConfirmButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFormConfirmButtonDisabled", js.Any.fromFunction0(value))
    
    inline def setIsFormDisplayed(value: () => Any): Self = StObject.set(x, "isFormDisplayed", js.Any.fromFunction0(value))
  }
}
