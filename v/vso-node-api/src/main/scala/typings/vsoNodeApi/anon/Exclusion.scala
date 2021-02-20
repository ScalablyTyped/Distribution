package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exclusion extends StObject {
  
  var exclusion: scala.Double = js.native
  
  var inclusion: scala.Double = js.native
}
object Exclusion {
  
  @scala.inline
  def apply(exclusion: scala.Double, inclusion: scala.Double): Exclusion = {
    val __obj = js.Dynamic.literal(exclusion = exclusion.asInstanceOf[js.Any], inclusion = inclusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclusion]
  }
  
  @scala.inline
  implicit class ExclusionMutableBuilder[Self <: Exclusion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusion(value: scala.Double): Self = StObject.set(x, "exclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusion(value: scala.Double): Self = StObject.set(x, "inclusion", value.asInstanceOf[js.Any])
  }
}
