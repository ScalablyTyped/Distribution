package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberName extends StObject {
  
  def isArray(): Boolean
  
  def isMarker(): Boolean
  
  def isString(): Boolean
  
  var prefix: String
  
  var suffix: String
}
object MemberName {
  
  @scala.inline
  def apply(
    isArray: () => Boolean,
    isMarker: () => Boolean,
    isString: () => Boolean,
    prefix: String,
    suffix: String
  ): MemberName = {
    val __obj = js.Dynamic.literal(isArray = js.Any.fromFunction0(isArray), isMarker = js.Any.fromFunction0(isMarker), isString = js.Any.fromFunction0(isString), prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberName]
  }
  
  @scala.inline
  implicit class MemberNameMutableBuilder[Self <: MemberName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsArray(value: () => Boolean): Self = StObject.set(x, "isArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMarker(value: () => Boolean): Self = StObject.set(x, "isMarker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsString(value: () => Boolean): Self = StObject.set(x, "isString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
  }
}
