package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageVersion extends StObject {
  
  var major: Double
  
  var minor: Double
  
  var patch: Double
}
object PackageVersion {
  
  inline def apply(major: Double, minor: Double, patch: Double): PackageVersion = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersion]
  }
  
  extension [Self <: PackageVersion](x: Self) {
    
    inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
