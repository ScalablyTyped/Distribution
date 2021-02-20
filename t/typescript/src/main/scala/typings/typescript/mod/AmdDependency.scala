package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmdDependency extends StObject {
  
  var name: js.UndefOr[java.lang.String] = js.native
  
  var path: java.lang.String = js.native
}
object AmdDependency {
  
  @scala.inline
  def apply(path: java.lang.String): AmdDependency = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmdDependency]
  }
  
  @scala.inline
  implicit class AmdDependencyMutableBuilder[Self <: AmdDependency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
