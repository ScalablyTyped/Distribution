package typings.winrt.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageVersion extends StObject {
  
  var build: Double
  
  var major: Double
  
  var minor: Double
  
  var revision: Double
}
object PackageVersion {
  
  @scala.inline
  def apply(build: Double, major: Double, minor: Double, revision: Double): PackageVersion = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersion]
  }
  
  @scala.inline
  implicit class PackageVersionMutableBuilder[Self <: PackageVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
