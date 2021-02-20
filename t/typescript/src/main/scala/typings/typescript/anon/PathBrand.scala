package typings.typescript.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathBrand extends StObject {
  
  var __pathBrand: js.Any = js.native
}
object PathBrand {
  
  @scala.inline
  def apply(__pathBrand: js.Any): PathBrand = {
    val __obj = js.Dynamic.literal(__pathBrand = __pathBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBrand]
  }
  
  @scala.inline
  implicit class PathBrandMutableBuilder[Self <: PathBrand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__pathBrand(value: js.Any): Self = StObject.set(x, "__pathBrand", value.asInstanceOf[js.Any])
  }
}
