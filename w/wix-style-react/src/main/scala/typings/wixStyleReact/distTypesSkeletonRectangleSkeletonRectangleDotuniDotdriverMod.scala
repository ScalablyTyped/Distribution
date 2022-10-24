package typings.wixStyleReact

import typings.wixStyleReact.distTypesSkeletonGroupMod.SkeletonGroupSkin
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonRectangleSkeletonRectangleDotuniDotdriverMod {
  
  trait SkeletonRectangleUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getHeight(): js.Promise[String]
    
    def getSkin(): js.Promise[SkeletonGroupSkin]
    
    def getWidth(): js.Promise[String]
  }
  object SkeletonRectangleUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getHeight: () => js.Promise[String],
      getSkin: () => js.Promise[SkeletonGroupSkin],
      getWidth: () => js.Promise[String]
    ): SkeletonRectangleUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getHeight = js.Any.fromFunction0(getHeight), getSkin = js.Any.fromFunction0(getSkin), getWidth = js.Any.fromFunction0(getWidth))
      __obj.asInstanceOf[SkeletonRectangleUniDriver]
    }
    
    extension [Self <: SkeletonRectangleUniDriver](x: Self) {
      
      inline def setGetHeight(value: () => js.Promise[String]): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      inline def setGetSkin(value: () => js.Promise[SkeletonGroupSkin]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => js.Promise[String]): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    }
  }
}
