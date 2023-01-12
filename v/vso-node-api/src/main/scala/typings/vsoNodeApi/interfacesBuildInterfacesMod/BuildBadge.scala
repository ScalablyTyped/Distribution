package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBadge extends StObject {
  
  /**
    * The ID of the build represented by this badge.
    */
  var buildId: Double
  
  /**
    * A link to the SVG resource.
    */
  var imageUrl: String
}
object BuildBadge {
  
  inline def apply(buildId: Double, imageUrl: String): BuildBadge = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildBadge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildBadge] (val x: Self) extends AnyVal {
    
    inline def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
  }
}
