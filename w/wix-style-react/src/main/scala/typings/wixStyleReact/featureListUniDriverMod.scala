package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureListUniDriverMod {
  
  trait FeatureListUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getFeatureText(): js.Promise[String]
    
    def getFeatureTitle(): js.Promise[String]
    
    def getNumberOfFeatures(): js.Promise[Double]
    
    def hasFeatureImage(): js.Promise[Boolean]
    
    def hasFeatureText(): js.Promise[Boolean]
    
    def hasFeatureTitle(): js.Promise[Boolean]
  }
  object FeatureListUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getFeatureText: () => js.Promise[String],
      getFeatureTitle: () => js.Promise[String],
      getNumberOfFeatures: () => js.Promise[Double],
      hasFeatureImage: () => js.Promise[Boolean],
      hasFeatureText: () => js.Promise[Boolean],
      hasFeatureTitle: () => js.Promise[Boolean]
    ): FeatureListUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getFeatureText = js.Any.fromFunction0(getFeatureText), getFeatureTitle = js.Any.fromFunction0(getFeatureTitle), getNumberOfFeatures = js.Any.fromFunction0(getNumberOfFeatures), hasFeatureImage = js.Any.fromFunction0(hasFeatureImage), hasFeatureText = js.Any.fromFunction0(hasFeatureText), hasFeatureTitle = js.Any.fromFunction0(hasFeatureTitle))
      __obj.asInstanceOf[FeatureListUniDriver]
    }
    
    extension [Self <: FeatureListUniDriver](x: Self) {
      
      inline def setGetFeatureText(value: () => js.Promise[String]): Self = StObject.set(x, "getFeatureText", js.Any.fromFunction0(value))
      
      inline def setGetFeatureTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getFeatureTitle", js.Any.fromFunction0(value))
      
      inline def setGetNumberOfFeatures(value: () => js.Promise[Double]): Self = StObject.set(x, "getNumberOfFeatures", js.Any.fromFunction0(value))
      
      inline def setHasFeatureImage(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasFeatureImage", js.Any.fromFunction0(value))
      
      inline def setHasFeatureText(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasFeatureText", js.Any.fromFunction0(value))
      
      inline def setHasFeatureTitle(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasFeatureTitle", js.Any.fromFunction0(value))
    }
  }
}
