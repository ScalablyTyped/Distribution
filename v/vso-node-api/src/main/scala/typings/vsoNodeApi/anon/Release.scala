package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Release extends StObject {
  
  var build: scala.Double = js.native
  
  var release: scala.Double = js.native
}
object Release {
  
  @scala.inline
  def apply(build: scala.Double, release: scala.Double): Release = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[Release]
  }
  
  @scala.inline
  implicit class ReleaseMutableBuilder[Self <: Release] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: scala.Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: scala.Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
