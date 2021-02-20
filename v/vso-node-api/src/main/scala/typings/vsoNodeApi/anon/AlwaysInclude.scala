package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlwaysInclude extends StObject {
  
  var alwaysInclude: scala.Double = js.native
  
  var onlyIfLicensed: scala.Double = js.native
  
  var onlyIfUnlicensed: scala.Double = js.native
}
object AlwaysInclude {
  
  @scala.inline
  def apply(alwaysInclude: scala.Double, onlyIfLicensed: scala.Double, onlyIfUnlicensed: scala.Double): AlwaysInclude = {
    val __obj = js.Dynamic.literal(alwaysInclude = alwaysInclude.asInstanceOf[js.Any], onlyIfLicensed = onlyIfLicensed.asInstanceOf[js.Any], onlyIfUnlicensed = onlyIfUnlicensed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlwaysInclude]
  }
  
  @scala.inline
  implicit class AlwaysIncludeMutableBuilder[Self <: AlwaysInclude] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysInclude(value: scala.Double): Self = StObject.set(x, "alwaysInclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyIfLicensed(value: scala.Double): Self = StObject.set(x, "onlyIfLicensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyIfUnlicensed(value: scala.Double): Self = StObject.set(x, "onlyIfUnlicensed", value.asInstanceOf[js.Any])
  }
}
