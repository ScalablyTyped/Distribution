package typings.vsoNodeApi.interfacesDashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticVersion extends StObject {
  
  /**
    * Major version when you make incompatible API changes
    */
  var major: Double
  
  /**
    * Minor version when you add functionality in a backwards-compatible manner
    */
  var minor: Double
  
  /**
    * Patch version when you make backwards-compatible bug fixes
    */
  var patch: Double
}
object SemanticVersion {
  
  inline def apply(major: Double, minor: Double, patch: Double): SemanticVersion = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticVersion]
  }
  
  extension [Self <: SemanticVersion](x: Self) {
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
