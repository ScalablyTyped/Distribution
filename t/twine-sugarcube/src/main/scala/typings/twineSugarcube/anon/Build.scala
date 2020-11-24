package typings.twineSugarcube.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Build extends js.Object {
  
  val build: Double = js.native
  
  val date: Date = js.native
  
  val major: Double = js.native
  
  val minor: Double = js.native
  
  val patch: Double = js.native
  
  val prerelease: String | Null = js.native
  
  val title: String = js.native
}
object Build {
  
  @scala.inline
  def apply(build: Double, date: Date, major: Double, minor: Double, patch: Double, title: String): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBuild(value: Double): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: Double): Self = this.set("major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = this.set("minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch(value: Double): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrerelease(value: String): Self = this.set("prerelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrereleaseNull: Self = this.set("prerelease", null)
  }
}
