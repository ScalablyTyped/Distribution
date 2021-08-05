package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testimonialListUniDriverMod {
  
  trait TestimonialListUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getNumberOfTestimonials(): js.Promise[Double]
    
    def getTestimonialAuthorName(): js.Promise[String]
    
    def getTestimonialText(): js.Promise[String]
    
    def hasTestimonialAuthorName(): js.Promise[Boolean]
    
    def hasTestimonialAvatar(): js.Promise[Boolean]
    
    def hasTestimonialText(): js.Promise[Boolean]
  }
  object TestimonialListUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getNumberOfTestimonials: () => js.Promise[Double],
      getTestimonialAuthorName: () => js.Promise[String],
      getTestimonialText: () => js.Promise[String],
      hasTestimonialAuthorName: () => js.Promise[Boolean],
      hasTestimonialAvatar: () => js.Promise[Boolean],
      hasTestimonialText: () => js.Promise[Boolean]
    ): TestimonialListUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getNumberOfTestimonials = js.Any.fromFunction0(getNumberOfTestimonials), getTestimonialAuthorName = js.Any.fromFunction0(getTestimonialAuthorName), getTestimonialText = js.Any.fromFunction0(getTestimonialText), hasTestimonialAuthorName = js.Any.fromFunction0(hasTestimonialAuthorName), hasTestimonialAvatar = js.Any.fromFunction0(hasTestimonialAvatar), hasTestimonialText = js.Any.fromFunction0(hasTestimonialText))
      __obj.asInstanceOf[TestimonialListUniDriver]
    }
    
    extension [Self <: TestimonialListUniDriver](x: Self) {
      
      inline def setGetNumberOfTestimonials(value: () => js.Promise[Double]): Self = StObject.set(x, "getNumberOfTestimonials", js.Any.fromFunction0(value))
      
      inline def setGetTestimonialAuthorName(value: () => js.Promise[String]): Self = StObject.set(x, "getTestimonialAuthorName", js.Any.fromFunction0(value))
      
      inline def setGetTestimonialText(value: () => js.Promise[String]): Self = StObject.set(x, "getTestimonialText", js.Any.fromFunction0(value))
      
      inline def setHasTestimonialAuthorName(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasTestimonialAuthorName", js.Any.fromFunction0(value))
      
      inline def setHasTestimonialAvatar(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasTestimonialAvatar", js.Any.fromFunction0(value))
      
      inline def setHasTestimonialText(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasTestimonialText", js.Any.fromFunction0(value))
    }
  }
}
