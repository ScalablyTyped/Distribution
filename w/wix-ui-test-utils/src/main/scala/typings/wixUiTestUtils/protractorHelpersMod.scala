package typings.wixUiTestUtils

import typings.protractor.mod.ElementFinder
import typings.protractor.mod.WebElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protractorHelpersMod {
  
  @JSImport("wix-ui-test-utils/dist/src/protractor/protractor-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createStoryUrl(hasKindStoryWithExamples: StoryUrlParams): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createStoryUrl")(hasKindStoryWithExamples.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getElementByDataHook(dataHook: String): ElementFinder = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementByDataHook")(dataHook.asInstanceOf[js.Any]).asInstanceOf[ElementFinder]
  
  @scala.inline
  def getStoryUrl(kind: String, story: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStoryUrl")(kind.asInstanceOf[js.Any], story.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def hasAttribute(elementFinder: ElementFinder, attributeName: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAttribute")(elementFinder.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def hasEllipsis(element: ElementFinder): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEllipsis")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def isFocused(element: ElementFinder): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocused")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def mouseEnter(element: WebElement): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseEnter")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def mouseEnter(element: ILocation): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseEnter")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def mouseLeave(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseLeave")().asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def scrollToElement(element: ElementFinder): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToElement")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def waitForVisibilityOf(elements: js.Array[ElementFinder]): js.Promise[js.Array[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Object]]]
  @scala.inline
  def waitForVisibilityOf(elements: js.Array[ElementFinder], errorMsg: String): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
  @scala.inline
  def waitForVisibilityOf(elements: js.Array[ElementFinder], errorMsg: String, timeout: Double): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
  @scala.inline
  def waitForVisibilityOf(elements: js.Array[ElementFinder], errorMsg: Unit, timeout: Double): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
  @scala.inline
  def waitForVisibilityOf(elements: ElementFinder): js.Promise[js.Array[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Object]]]
  @scala.inline
  def waitForVisibilityOf(elements: ElementFinder, errorMsg: String): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
  @scala.inline
  def waitForVisibilityOf(elements: ElementFinder, errorMsg: String, timeout: Double): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
  @scala.inline
  def waitForVisibilityOf(elements: ElementFinder, errorMsg: Unit, timeout: Double): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
  
  trait ILocation extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object ILocation {
    
    @scala.inline
    def apply(x: Double, y: Double): ILocation = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILocation]
    }
    
    @scala.inline
    implicit class ILocationMutableBuilder[Self <: ILocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryUrlParams extends StObject {
    
    var kind: String
    
    var story: String
    
    var withExamples: js.UndefOr[Boolean] = js.undefined
  }
  object StoryUrlParams {
    
    @scala.inline
    def apply(kind: String, story: String): StoryUrlParams = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryUrlParams]
    }
    
    @scala.inline
    implicit class StoryUrlParamsMutableBuilder[Self <: StoryUrlParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory(value: String): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithExamples(value: Boolean): Self = StObject.set(x, "withExamples", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithExamplesUndefined: Self = StObject.set(x, "withExamples", js.undefined)
    }
  }
}
