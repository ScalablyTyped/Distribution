package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Amd extends StObject {
  
  /**
  				 * Set comment for `amd` section in UMD
  				 */
  var amd: js.UndefOr[String] = js.native
  
  /**
  				 * Set comment for `commonjs` (exports) section in UMD
  				 */
  var commonjs: js.UndefOr[String] = js.native
  
  /**
  				 * Set comment for `commonjs2` (module.exports) section in UMD
  				 */
  var commonjs2: js.UndefOr[String] = js.native
  
  /**
  				 * Set comment for `root` (global variable) section in UMD
  				 */
  var root: js.UndefOr[String] = js.native
}
object Amd {
  
  @scala.inline
  def apply(): Amd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Amd]
  }
  
  @scala.inline
  implicit class AmdMutableBuilder[Self <: Amd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmd(value: String): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
    
    @scala.inline
    def setCommonjs(value: String): Self = StObject.set(x, "commonjs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonjs2(value: String): Self = StObject.set(x, "commonjs2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonjs2Undefined: Self = StObject.set(x, "commonjs2", js.undefined)
    
    @scala.inline
    def setCommonjsUndefined: Self = StObject.set(x, "commonjs", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
