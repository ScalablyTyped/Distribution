package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeInjection extends StObject {
  
  var codeinjection_foot: js.UndefOr[Nullable[String]] = js.undefined
  
  var codeinjection_head: js.UndefOr[Nullable[String]] = js.undefined
}
object CodeInjection {
  
  @scala.inline
  def apply(): CodeInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeInjection]
  }
  
  @scala.inline
  implicit class CodeInjectionMutableBuilder[Self <: CodeInjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeinjection_foot(value: Nullable[String]): Self = StObject.set(x, "codeinjection_foot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeinjection_footNull: Self = StObject.set(x, "codeinjection_foot", null)
    
    @scala.inline
    def setCodeinjection_footUndefined: Self = StObject.set(x, "codeinjection_foot", js.undefined)
    
    @scala.inline
    def setCodeinjection_head(value: Nullable[String]): Self = StObject.set(x, "codeinjection_head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeinjection_headNull: Self = StObject.set(x, "codeinjection_head", null)
    
    @scala.inline
    def setCodeinjection_headUndefined: Self = StObject.set(x, "codeinjection_head", js.undefined)
  }
}
