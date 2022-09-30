package typings.webdriverio.typesMod

import typings.std.HTMLElement
import typings.std.Record
import typings.webdriverio.webdriverioStrings.$
import typings.webdriverio.webdriverioStrings.DollarDollar
import typings.webdriverio.webdriverioStrings.addValue
import typings.webdriverio.webdriverioStrings.call
import typings.webdriverio.webdriverioStrings.clearValue
import typings.webdriverio.webdriverioStrings.click
import typings.webdriverio.webdriverioStrings.custom$
import typings.webdriverio.webdriverioStrings.customDollarDollar
import typings.webdriverio.webdriverioStrings.debug
import typings.webdriverio.webdriverioStrings.deleteCookies
import typings.webdriverio.webdriverioStrings.doubleClick
import typings.webdriverio.webdriverioStrings.dragAndDrop
import typings.webdriverio.webdriverioStrings.execute
import typings.webdriverio.webdriverioStrings.executeAsync
import typings.webdriverio.webdriverioStrings.getAttribute
import typings.webdriverio.webdriverioStrings.getCSSProperty
import typings.webdriverio.webdriverioStrings.getComputedLabel
import typings.webdriverio.webdriverioStrings.getComputedRole
import typings.webdriverio.webdriverioStrings.getCookies
import typings.webdriverio.webdriverioStrings.getHTML
import typings.webdriverio.webdriverioStrings.getLocation
import typings.webdriverio.webdriverioStrings.getProperty
import typings.webdriverio.webdriverioStrings.getPuppeteer
import typings.webdriverio.webdriverioStrings.getSize
import typings.webdriverio.webdriverioStrings.getTagName
import typings.webdriverio.webdriverioStrings.getText
import typings.webdriverio.webdriverioStrings.getValue
import typings.webdriverio.webdriverioStrings.getWindowSize
import typings.webdriverio.webdriverioStrings.isClickable
import typings.webdriverio.webdriverioStrings.isDisplayed
import typings.webdriverio.webdriverioStrings.isDisplayedInViewport
import typings.webdriverio.webdriverioStrings.isEnabled
import typings.webdriverio.webdriverioStrings.isEqual
import typings.webdriverio.webdriverioStrings.isExisting
import typings.webdriverio.webdriverioStrings.isFocused
import typings.webdriverio.webdriverioStrings.isSelected
import typings.webdriverio.webdriverioStrings.keys
import typings.webdriverio.webdriverioStrings.mock
import typings.webdriverio.webdriverioStrings.mockClearAll
import typings.webdriverio.webdriverioStrings.mockRestoreAll
import typings.webdriverio.webdriverioStrings.moveTo
import typings.webdriverio.webdriverioStrings.newWindow
import typings.webdriverio.webdriverioStrings.nextElement
import typings.webdriverio.webdriverioStrings.parentElement
import typings.webdriverio.webdriverioStrings.pause
import typings.webdriverio.webdriverioStrings.previousElement
import typings.webdriverio.webdriverioStrings.react$
import typings.webdriverio.webdriverioStrings.reactDollarDollar
import typings.webdriverio.webdriverioStrings.reloadSession
import typings.webdriverio.webdriverioStrings.savePDF
import typings.webdriverio.webdriverioStrings.saveRecordingScreen
import typings.webdriverio.webdriverioStrings.saveScreenshot
import typings.webdriverio.webdriverioStrings.scrollIntoView
import typings.webdriverio.webdriverioStrings.selectByAttribute
import typings.webdriverio.webdriverioStrings.selectByIndex
import typings.webdriverio.webdriverioStrings.selectByVisibleText
import typings.webdriverio.webdriverioStrings.setCookies
import typings.webdriverio.webdriverioStrings.setTimeout
import typings.webdriverio.webdriverioStrings.setValue
import typings.webdriverio.webdriverioStrings.setWindowSize
import typings.webdriverio.webdriverioStrings.shadow$
import typings.webdriverio.webdriverioStrings.shadowDollarDollar
import typings.webdriverio.webdriverioStrings.switchWindow
import typings.webdriverio.webdriverioStrings.throttle
import typings.webdriverio.webdriverioStrings.touchAction
import typings.webdriverio.webdriverioStrings.uploadFile
import typings.webdriverio.webdriverioStrings.url
import typings.webdriverio.webdriverioStrings.waitForClickable
import typings.webdriverio.webdriverioStrings.waitForDisplayed
import typings.webdriverio.webdriverioStrings.waitForEnabled
import typings.webdriverio.webdriverioStrings.waitForExist
import typings.webdriverio.webdriverioStrings.waitUntil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomInstanceCommands[T] extends StObject {
  
  /**
    * add command to `browser` or `element` scope
    */
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFn): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFnScoped[T, IsElement]): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFnScoped[T, IsElement], attachToElement: IsElement): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: IsElement,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: Unit,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFn, attachToElement: IsElement): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFn,
    attachToElement: IsElement,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFn, attachToElement: IsElement, proto: Record[String, Any]): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFn,
    attachToElement: IsElement,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFn,
    attachToElement: Unit,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFn, attachToElement: Unit, proto: Record[String, Any]): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFn,
    attachToElement: Unit,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  
  def addLocatorStrategy(name: String, func: js.Function1[/* selector */ String, CustomLocatorReturnValue]): Unit = js.native
  /**
    * create custom selector
    */
  def addLocatorStrategy(
    name: String,
    func: js.Function2[/* selector */ String, /* root */ HTMLElement, CustomLocatorReturnValue]
  ): Unit = js.native
  
  /**
    * overwrite `browser` or `element` command
    */
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](name: BrowserKey | ElementKey, func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement]): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](name: BrowserKey | ElementKey, func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement]): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: BrowserKey | ElementKey,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
}
