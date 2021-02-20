package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllBuild extends StObject {
  
  var all: scala.Double = js.native
  
  var build: scala.Double = js.native
  
  var release: scala.Double = js.native
}
object AllBuild {
  
  @scala.inline
  def apply(all: scala.Double, build: scala.Double, release: scala.Double): AllBuild = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllBuild]
  }
  
  @scala.inline
  implicit class AllBuildMutableBuilder[Self <: AllBuild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuild(value: scala.Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: scala.Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
