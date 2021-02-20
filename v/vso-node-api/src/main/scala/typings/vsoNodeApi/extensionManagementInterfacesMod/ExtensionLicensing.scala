package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionLicensing extends StObject {
  
  /**
    * A list of contributions which deviate from the default licensing behavior
    */
  var overrides: js.Array[LicensingOverride] = js.native
}
object ExtensionLicensing {
  
  @scala.inline
  def apply(overrides: js.Array[LicensingOverride]): ExtensionLicensing = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionLicensing]
  }
  
  @scala.inline
  implicit class ExtensionLicensingMutableBuilder[Self <: ExtensionLicensing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrides(value: js.Array[LicensingOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesVarargs(value: LicensingOverride*): Self = StObject.set(x, "overrides", js.Array(value :_*))
  }
}
