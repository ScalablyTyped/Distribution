package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredSWDestPartial extends StObject {
  
  /**
    * The path and filename of the service worker file that will be created by
    * the build process, relative to the current working directory. It must end
    * in '.js'.
    */
  var swDest: String
}
object RequiredSWDestPartial {
  
  inline def apply(swDest: String): RequiredSWDestPartial = {
    val __obj = js.Dynamic.literal(swDest = swDest.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredSWDestPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredSWDestPartial] (val x: Self) extends AnyVal {
    
    inline def setSwDest(value: String): Self = StObject.set(x, "swDest", value.asInstanceOf[js.Any])
  }
}
