package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alias extends StObject {
  
  /**
  				 * New request
  				 */
  var alias: js.UndefOr[String] = js.native
  
  /**
  				 * Request to be redirected
  				 */
  var name: js.UndefOr[String] = js.native
  
  /**
  				 * Redirect only exact matching request
  				 */
  var onlyModule: js.UndefOr[Boolean] = js.native
}
object Alias {
  
  @scala.inline
  def apply(): Alias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alias]
  }
  
  @scala.inline
  implicit class AliasMutableBuilder[Self <: Alias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnlyModule(value: Boolean): Self = StObject.set(x, "onlyModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyModuleUndefined: Self = StObject.set(x, "onlyModule", js.undefined)
  }
}
