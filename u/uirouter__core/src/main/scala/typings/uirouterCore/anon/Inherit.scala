package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inherit extends StObject {
  
  var inherit: js.UndefOr[Boolean] = js.native
  
  var matchingKeys: js.UndefOr[js.Any] = js.native
}
object Inherit {
  
  @scala.inline
  def apply(): Inherit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inherit]
  }
  
  @scala.inline
  implicit class InheritMutableBuilder[Self <: Inherit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    @scala.inline
    def setMatchingKeys(value: js.Any): Self = StObject.set(x, "matchingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingKeysUndefined: Self = StObject.set(x, "matchingKeys", js.undefined)
  }
}
