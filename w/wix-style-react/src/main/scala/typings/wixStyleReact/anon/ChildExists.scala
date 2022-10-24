package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildExists extends StObject {
  
  def _closeButtonExists(): Boolean
  
  def _hasClass(className: Any): Boolean
  
  def _helpButtonExists(): Boolean
  
  /** Checks that a node with the provided dataHook exists */
  def childExists(dataHook: Any): Boolean
  
  /** Click the modal close-button */
  def clickCloseButton(): Unit
  
  def clickHelpButton(): Unit
  
  def exists(): Boolean
  
  def getIllustrationSrc(): Any
  
  /** Return the secondary button driver */
  def getPrimaryButtonDriver(): Any
  
  /** Return the primary button tooltip's content */
  def getPrimaryButtonTooltipContent(): js.UndefOr[String | Null]
  
  /** Return the secondary button driver*/
  def getSecondaryButtonDriver(): Any
  
  /** Get the subtitle's text */
  def getSubtitleText(): Any
  
  /** Returns the modal theme */
  def getTheme(): Any
  
  /** Get the title's text */
  def getTitleText(): Any
}
object ChildExists {
  
  inline def apply(
    _closeButtonExists: () => Boolean,
    _hasClass: Any => Boolean,
    _helpButtonExists: () => Boolean,
    childExists: Any => Boolean,
    clickCloseButton: () => Unit,
    clickHelpButton: () => Unit,
    exists: () => Boolean,
    getIllustrationSrc: () => Any,
    getPrimaryButtonDriver: () => Any,
    getPrimaryButtonTooltipContent: () => js.UndefOr[String | Null],
    getSecondaryButtonDriver: () => Any,
    getSubtitleText: () => Any,
    getTheme: () => Any,
    getTitleText: () => Any
  ): ChildExists = {
    val __obj = js.Dynamic.literal(_closeButtonExists = js.Any.fromFunction0(_closeButtonExists), _hasClass = js.Any.fromFunction1(_hasClass), _helpButtonExists = js.Any.fromFunction0(_helpButtonExists), childExists = js.Any.fromFunction1(childExists), clickCloseButton = js.Any.fromFunction0(clickCloseButton), clickHelpButton = js.Any.fromFunction0(clickHelpButton), exists = js.Any.fromFunction0(exists), getIllustrationSrc = js.Any.fromFunction0(getIllustrationSrc), getPrimaryButtonDriver = js.Any.fromFunction0(getPrimaryButtonDriver), getPrimaryButtonTooltipContent = js.Any.fromFunction0(getPrimaryButtonTooltipContent), getSecondaryButtonDriver = js.Any.fromFunction0(getSecondaryButtonDriver), getSubtitleText = js.Any.fromFunction0(getSubtitleText), getTheme = js.Any.fromFunction0(getTheme), getTitleText = js.Any.fromFunction0(getTitleText))
    __obj.asInstanceOf[ChildExists]
  }
  
  extension [Self <: ChildExists](x: Self) {
    
    inline def setChildExists(value: Any => Boolean): Self = StObject.set(x, "childExists", js.Any.fromFunction1(value))
    
    inline def setClickCloseButton(value: () => Unit): Self = StObject.set(x, "clickCloseButton", js.Any.fromFunction0(value))
    
    inline def setClickHelpButton(value: () => Unit): Self = StObject.set(x, "clickHelpButton", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetIllustrationSrc(value: () => Any): Self = StObject.set(x, "getIllustrationSrc", js.Any.fromFunction0(value))
    
    inline def setGetPrimaryButtonDriver(value: () => Any): Self = StObject.set(x, "getPrimaryButtonDriver", js.Any.fromFunction0(value))
    
    inline def setGetPrimaryButtonTooltipContent(value: () => js.UndefOr[String | Null]): Self = StObject.set(x, "getPrimaryButtonTooltipContent", js.Any.fromFunction0(value))
    
    inline def setGetSecondaryButtonDriver(value: () => Any): Self = StObject.set(x, "getSecondaryButtonDriver", js.Any.fromFunction0(value))
    
    inline def setGetSubtitleText(value: () => Any): Self = StObject.set(x, "getSubtitleText", js.Any.fromFunction0(value))
    
    inline def setGetTheme(value: () => Any): Self = StObject.set(x, "getTheme", js.Any.fromFunction0(value))
    
    inline def setGetTitleText(value: () => Any): Self = StObject.set(x, "getTitleText", js.Any.fromFunction0(value))
    
    inline def set_closeButtonExists(value: () => Boolean): Self = StObject.set(x, "_closeButtonExists", js.Any.fromFunction0(value))
    
    inline def set_hasClass(value: Any => Boolean): Self = StObject.set(x, "_hasClass", js.Any.fromFunction1(value))
    
    inline def set_helpButtonExists(value: () => Boolean): Self = StObject.set(x, "_helpButtonExists", js.Any.fromFunction0(value))
  }
}
