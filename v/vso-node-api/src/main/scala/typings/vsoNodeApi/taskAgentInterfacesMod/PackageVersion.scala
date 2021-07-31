package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageVersion extends StObject {
  
  var major: Double
  
  var minor: Double
  
  var patch: Double
}
object PackageVersion {
  
  @scala.inline
  def apply(major: Double, minor: Double, patch: Double): PackageVersion = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersion]
  }
  
  @scala.inline
  implicit class PackageVersionMutableBuilder[Self <: PackageVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
