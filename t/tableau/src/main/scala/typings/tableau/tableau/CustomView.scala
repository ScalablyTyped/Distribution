package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomView extends StObject {
  
  /** Indicates whether the custom view is public or private. */
  def getAdvertised(): Boolean = js.native
  
  /** Gets or sets whether this is the default custom view. */
  def getDefault(): Boolean = js.native
  
  /** User-friendly name for the custom view */
  def getName(): String = js.native
  
  /** Gets the user that created the custom view. */
  def getOwnerName(): String = js.native
  
  /** Unique URL to load this view again. */
  def getUrl(): String = js.native
  
  /** Gets the Workbook to which this CustomView belongs. */
  def getWorkbook(): Workbook = js.native
  
  /** After saveAsync() is called, the result of the getUrl method is no longer blank. */
  def saveAsync(): js.Promise[CustomView] = js.native
  
  /** Indicates whether the custom view is public or private. */
  def setAdvertised(bool: Boolean): Boolean = js.native
  
  /** User-friendly name for the custom view */
  def setName(name: String): String = js.native
}
object CustomView {
  
  @scala.inline
  def apply(
    getAdvertised: () => Boolean,
    getDefault: () => Boolean,
    getName: () => String,
    getOwnerName: () => String,
    getUrl: () => String,
    getWorkbook: () => Workbook,
    saveAsync: () => js.Promise[CustomView],
    setAdvertised: Boolean => Boolean,
    setName: String => String
  ): CustomView = {
    val __obj = js.Dynamic.literal(getAdvertised = js.Any.fromFunction0(getAdvertised), getDefault = js.Any.fromFunction0(getDefault), getName = js.Any.fromFunction0(getName), getOwnerName = js.Any.fromFunction0(getOwnerName), getUrl = js.Any.fromFunction0(getUrl), getWorkbook = js.Any.fromFunction0(getWorkbook), saveAsync = js.Any.fromFunction0(saveAsync), setAdvertised = js.Any.fromFunction1(setAdvertised), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[CustomView]
  }
  
  @scala.inline
  implicit class CustomViewMutableBuilder[Self <: CustomView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAdvertised(value: () => Boolean): Self = StObject.set(x, "getAdvertised", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefault(value: () => Boolean): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOwnerName(value: () => String): Self = StObject.set(x, "getOwnerName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorkbook(value: () => Workbook): Self = StObject.set(x, "getWorkbook", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveAsync(value: () => js.Promise[CustomView]): Self = StObject.set(x, "saveAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAdvertised(value: Boolean => Boolean): Self = StObject.set(x, "setAdvertised", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetName(value: String => String): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
