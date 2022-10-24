package typings.wixStyleReact

import typings.wixStyleReact.distTypesSkeletonGroupMod.SkeletonGroupSkin
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonCircleSkeletonCircleDotuniDotdriverMod {
  
  trait SkeletonCircleUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getDiameter(): js.Promise[String]
    
    def getSkin(): js.Promise[SkeletonGroupSkin]
  }
  object SkeletonCircleUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getDiameter: () => js.Promise[String],
      getSkin: () => js.Promise[SkeletonGroupSkin]
    ): SkeletonCircleUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getDiameter = js.Any.fromFunction0(getDiameter), getSkin = js.Any.fromFunction0(getSkin))
      __obj.asInstanceOf[SkeletonCircleUniDriver]
    }
    
    extension [Self <: SkeletonCircleUniDriver](x: Self) {
      
      inline def setGetDiameter(value: () => js.Promise[String]): Self = StObject.set(x, "getDiameter", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => js.Promise[SkeletonGroupSkin]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
    }
  }
}
