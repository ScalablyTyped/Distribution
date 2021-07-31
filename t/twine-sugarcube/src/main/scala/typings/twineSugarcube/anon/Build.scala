package typings.twineSugarcube.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  val build: Double
  
  val date: Date
  
  val major: Double
  
  val minor: Double
  
  val patch: Double
  
  val prerelease: String | Null
  
  val title: String
}
object Build {
  
  @scala.inline
  def apply(build: Double, date: Date, major: Double, minor: Double, patch: Double, title: String): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], prerelease = null)
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit class BuildMutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrerelease(value: String): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrereleaseNull: Self = StObject.set(x, "prerelease", null)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
