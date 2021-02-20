package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildBadge extends StObject {
  
  /**
    * The ID of the build represented by this badge.
    */
  var buildId: Double = js.native
  
  /**
    * A link to the SVG resource.
    */
  var imageUrl: String = js.native
}
object BuildBadge {
  
  @scala.inline
  def apply(buildId: Double, imageUrl: String): BuildBadge = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildBadge]
  }
  
  @scala.inline
  implicit class BuildBadgeMutableBuilder[Self <: BuildBadge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
  }
}
