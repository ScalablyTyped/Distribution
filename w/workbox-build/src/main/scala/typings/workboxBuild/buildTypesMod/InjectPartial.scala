package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InjectPartial extends StObject {
  
  /**
    * The string to find inside of the `swSrc` file. Once found, it will be
    * replaced by the generated precache manifest.
    * @default "self.__WB_MANIFEST"
    */
  var injectionPoint: js.UndefOr[String] = js.undefined
  
  /**
    * The path and filename of the service worker file that will be read during
    * the build process, relative to the current working directory.
    */
  var swSrc: String
}
object InjectPartial {
  
  inline def apply(swSrc: String): InjectPartial = {
    val __obj = js.Dynamic.literal(swSrc = swSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InjectPartial] (val x: Self) extends AnyVal {
    
    inline def setInjectionPoint(value: String): Self = StObject.set(x, "injectionPoint", value.asInstanceOf[js.Any])
    
    inline def setInjectionPointUndefined: Self = StObject.set(x, "injectionPoint", js.undefined)
    
    inline def setSwSrc(value: String): Self = StObject.set(x, "swSrc", value.asInstanceOf[js.Any])
  }
}
