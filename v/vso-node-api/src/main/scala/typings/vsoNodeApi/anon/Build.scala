package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Build extends StObject {
  
  var build: scala.Double = js.native
  
  var xaml: scala.Double = js.native
}
object Build {
  
  @scala.inline
  def apply(build: scala.Double, xaml: scala.Double): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], xaml = xaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
  
  @scala.inline
  implicit class BuildMutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: scala.Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaml(value: scala.Double): Self = StObject.set(x, "xaml", value.asInstanceOf[js.Any])
  }
}
