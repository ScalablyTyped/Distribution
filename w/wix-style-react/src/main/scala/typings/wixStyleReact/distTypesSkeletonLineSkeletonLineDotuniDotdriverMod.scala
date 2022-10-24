package typings.wixStyleReact

import typings.wixStyleReact.distTypesSkeletonGroupMod.SkeletonGroupSkin
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSkeletonLineSkeletonLineDotuniDotdriverMod {
  
  trait SkeletonLineUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getSkin(): js.Promise[SkeletonGroupSkin]
    
    def getWidth(): js.Promise[String]
  }
  object SkeletonLineUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getSkin: () => js.Promise[SkeletonGroupSkin],
      getWidth: () => js.Promise[String]
    ): SkeletonLineUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getSkin = js.Any.fromFunction0(getSkin), getWidth = js.Any.fromFunction0(getWidth))
      __obj.asInstanceOf[SkeletonLineUniDriver]
    }
    
    extension [Self <: SkeletonLineUniDriver](x: Self) {
      
      inline def setGetSkin(value: () => js.Promise[SkeletonGroupSkin]): Self = StObject.set(x, "getSkin", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => js.Promise[String]): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    }
  }
}
