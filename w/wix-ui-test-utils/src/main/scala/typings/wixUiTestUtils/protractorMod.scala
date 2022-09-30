package typings.wixUiTestUtils

import typings.protractor.mod.ElementFinder
import typings.protractor.mod.WebElement
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.anon.DataHookString
import typings.wixUiTestUtils.anon.Wrapper
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.protractorHelpersMod.ILocation
import typings.wixUiTestUtils.protractorHelpersMod.StoryUrlParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protractorMod {
  
  @JSImport("wix-ui-test-utils/dist/src/protractor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object baseProtractorConfig {
    
    @JSImport("wix-ui-test-utils/dist/src/protractor", "baseProtractorConfig")
    @js.native
    val ^ : js.Any = js.native
    
    inline def afterLaunch(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLaunch")().asInstanceOf[js.Promise[Any]]
    
    @JSImport("wix-ui-test-utils/dist/src/protractor", "baseProtractorConfig.baseUrl")
    @js.native
    def baseUrl: String = js.native
    inline def baseUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(x.asInstanceOf[js.Any])
    
    inline def beforeLaunch(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLaunch")().asInstanceOf[js.Promise[Any]]
    
    inline def onPrepare(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPrepare")().asInstanceOf[Unit]
    
    @JSImport("wix-ui-test-utils/dist/src/protractor", "baseProtractorConfig.specs")
    @js.native
    def specs: js.Array[String] = js.native
    inline def specs_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specs")(x.asInstanceOf[js.Any])
  }
  
  inline def createStoryUrl(hasKindStoryWithExamples: StoryUrlParams): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createStoryUrl")(hasKindStoryWithExamples.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getElementByDataHook(dataHook: String): ElementFinder = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementByDataHook")(dataHook.asInstanceOf[js.Any]).asInstanceOf[ElementFinder]
  
  inline def getStoryUrl(kind: String, story: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStoryUrl")(kind.asInstanceOf[js.Any], story.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hasAttribute(elementFinder: ElementFinder, attributeName: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAttribute")(elementFinder.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def hasEllipsis(element: ElementFinder): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEllipsis")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def isFocused(element: ElementFinder): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocused")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def mouseEnter(element: WebElement): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseEnter")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def mouseEnter(element: ILocation): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseEnter")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def mouseLeave(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseLeave")().asInstanceOf[js.Promise[Unit]]
  
  inline def protractorTestkitFactoryCreator[T](
    driverFactory: js.Function3[/* wrapper */ ElementFinder, /* body */ ElementFinder, /* options */ DataHookString, T]
  ): js.Function1[/* obj */ Wrapper, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("protractorTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Wrapper, T]]
  
  inline def protractorUniTestkitFactoryCreator[T /* <: BaseUniDriver */](
    driverFactory: js.Function3[/* base */ UniDriver[Any], /* body */ UniDriver[Any], /* options */ DataHookString, T]
  ): js.Function1[/* obj */ DataHookString, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("protractorUniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ DataHookString, T]]
  
  inline def scrollToElement(element: ElementFinder): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToElement")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def waitForVisibilityOf(elements: js.Array[ElementFinder]): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: js.Array[ElementFinder], errorMsg: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: js.Array[ElementFinder], errorMsg: String, timeout: Double): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: js.Array[ElementFinder], errorMsg: Unit, timeout: Double): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: ElementFinder): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: ElementFinder, errorMsg: String): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: ElementFinder, errorMsg: String, timeout: Double): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def waitForVisibilityOf(elements: ElementFinder, errorMsg: Unit, timeout: Double): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForVisibilityOf")(elements.asInstanceOf[js.Any], errorMsg.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
}
