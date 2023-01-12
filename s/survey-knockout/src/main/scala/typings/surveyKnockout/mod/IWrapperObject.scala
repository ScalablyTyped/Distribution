package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWrapperObject extends StObject {
  
  def getClassNameProperty(): String
  
  def getOriginalObj(): Base
}
object IWrapperObject {
  
  inline def apply(getClassNameProperty: () => String, getOriginalObj: () => Base): IWrapperObject = {
    val __obj = js.Dynamic.literal(getClassNameProperty = js.Any.fromFunction0(getClassNameProperty), getOriginalObj = js.Any.fromFunction0(getOriginalObj))
    __obj.asInstanceOf[IWrapperObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWrapperObject] (val x: Self) extends AnyVal {
    
    inline def setGetClassNameProperty(value: () => String): Self = StObject.set(x, "getClassNameProperty", js.Any.fromFunction0(value))
    
    inline def setGetOriginalObj(value: () => Base): Self = StObject.set(x, "getOriginalObj", js.Any.fromFunction0(value))
  }
}
