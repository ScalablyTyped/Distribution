package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SemanticVersion extends StObject {
  
  /**
    * Major version when you make incompatible API changes
    */
  var major: Double = js.native
  
  /**
    * Minor version when you add functionality in a backwards-compatible manner
    */
  var minor: Double = js.native
  
  /**
    * Patch version when you make backwards-compatible bug fixes
    */
  var patch: Double = js.native
}
object SemanticVersion {
  
  @scala.inline
  def apply(major: Double, minor: Double, patch: Double): SemanticVersion = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticVersion]
  }
  
  @scala.inline
  implicit class SemanticVersionMutableBuilder[Self <: SemanticVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
