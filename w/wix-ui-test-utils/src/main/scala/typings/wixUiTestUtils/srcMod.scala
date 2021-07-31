package typings.wixUiTestUtils

import typings.protractor.mod.ElementFinder
import typings.puppeteer.mod.ElementHandle
import typings.puppeteer.mod.Page
import typings.react.mod.ReactElement
import typings.react.mod.SFC
import typings.std.Element
import typings.std.HTMLElement
import typings.wixUiTestUtils.anon.DataHookPropName
import typings.wixUiTestUtils.anon.DataHookString
import typings.wixUiTestUtils.anon.DataHookWrapper
import typings.wixUiTestUtils.anon.Instantiable
import typings.wixUiTestUtils.anon.Wrapper
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import typings.wixUiTestUtils.createDriverFactoryMod.DriverFactory
import typings.wixUiTestUtils.enzymeEnzymeMod.EnzymeDriverFactory
import typings.wixUiTestUtils.enzymeEnzymeMod.MountFunctionType
import typings.wixUiTestUtils.enzymeEnzymeMod.Options
import typings.wixUiTestUtils.enzymeEnzymeMod.WrapperData
import typings.wixUiTestUtils.helpersMod.ControlledComponentProps
import typings.wixUiTestUtils.puppeteerPuppeteerMod.DriverFactoryOptions
import typings.wixUiTestUtils.vanillaVanillaMod.TestkitArgs
import typings.wixUiTestUtils.vanillaVanillaMod.TestkitOutputRegular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("wix-ui-test-utils/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object baseProtractorConfig {
    
    @JSImport("wix-ui-test-utils/dist/src", "baseProtractorConfig")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def afterLaunch(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLaunch")().asInstanceOf[js.Promise[js.Object]]
    
    @JSImport("wix-ui-test-utils/dist/src", "baseProtractorConfig.baseUrl")
    @js.native
    def baseUrl: String = js.native
    @scala.inline
    def baseUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeLaunch(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLaunch")().asInstanceOf[js.Promise[js.Object]]
    
    @scala.inline
    def onPrepare(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPrepare")().asInstanceOf[Unit]
    
    @JSImport("wix-ui-test-utils/dist/src", "baseProtractorConfig.specs")
    @js.native
    def specs: js.Array[String] = js.native
    @scala.inline
    def specs_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specs")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def createDriverFactory[TDriver /* <: BaseDriver */](driverFactory: DriverFactory[TDriver]): js.Function1[/* Component */ ReactElement, TDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDriverFactory")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ ReactElement, TDriver]]
  
  @scala.inline
  def enzymeTestkitFactoryCreator[T /* <: BaseDriver */](driverFactory: EnzymeDriverFactory[T]): js.Function1[/* obj */ WrapperData, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enzymeTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ WrapperData, T]]
  
  @scala.inline
  def getStoryUrl(kind: String, story: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStoryUrl")(kind.asInstanceOf[js.Any], story.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isClassExists(element: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassExists")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isEnzymeTestkitExists[T /* <: BaseDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isEnzymeTestkitExists[T /* <: BaseDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType,
    options: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isTestkitExists[T /* <: BaseDriver */](Element: ReactElement, testkitFactory: js.Function1[/* obj */ DataHookWrapper, T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isTestkitExists[T /* <: BaseDriver */](
    Element: ReactElement,
    testkitFactory: js.Function1[/* obj */ DataHookWrapper, T],
    options: DataHookPropName
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def makeControlled[T /* <: ControlledComponentProps */](Component: SFC[T]): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("makeControlled")(Component.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
  
  @scala.inline
  def protractorTestkitFactoryCreator[T](
    driverFactory: js.Function3[/* wrapper */ ElementFinder, /* body */ ElementFinder, /* options */ DataHookString, T]
  ): js.Function1[/* obj */ Wrapper, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("protractorTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Wrapper, T]]
  
  @scala.inline
  def puppeteerTestkitFactoryCreator[T](
    driverFactory: js.Function3[
      /* e */ ElementHandle[Element] | Null, 
      /* page */ Page, 
      /* options */ DriverFactoryOptions, 
      T
    ]
  ): js.Function1[/* obj */ typings.wixUiTestUtils.anon.Page, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("puppeteerTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ typings.wixUiTestUtils.anon.Page, js.Promise[T]]]
  
  @scala.inline
  def scrollToElement(element: ElementFinder): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToElement")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def testkitFactoryCreator[T /* <: BaseDriver */](driverFactory: TestkitOutputRegular[T]): js.Function1[/* testkitArgs */ TestkitArgs, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("testkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* testkitArgs */ TestkitArgs, T]]
  
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
}
