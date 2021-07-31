package typings.webdriverio

import typings.node.Buffer
import typings.std.Element
import typings.webdriverio.WebdriverIO.BrowserObject
import typings.webdriverio.anon.Duration
import typings.webdriverio.anon.Props
import typings.webdriverio.anon.TranslateToUnicode
import typings.webdriverio.anon.XOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  @JSImport("webdriverio/build/commands/element", "$$")
  @js.native
  val $: js.ThisFunction1[/* this */ BrowserObject, /* selector */ String, js.Promise[js.Array[js.Object]]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "$")
  @js.native
  val _empty: js.Function1[/* selector */ js.Any, js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "addValue")
  @js.native
  val addValue: js.Function2[
    /* value */ js.Any, 
    /* hasTranslateToUnicode */ js.UndefOr[TranslateToUnicode], 
    js.Any
  ] = js.native
  
  @JSImport("webdriverio/build/commands/element", "clearValue")
  @js.native
  val clearValue: js.Function0[js.Any] = js.native
  
  @JSImport("webdriverio/build/commands/element", "click")
  @js.native
  val click: js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "custom$")
  @js.native
  val custom: js.Function2[/* strategyName */ js.Any, /* strategyArguments */ js.Any, js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "custom$$")
  @js.native
  val custom$: js.Function2[
    /* strategyName */ js.Any, 
    /* strategyArguments */ js.Any, 
    js.Promise[js.Array[js.Object]]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/element", "doubleClick")
  @js.native
  val doubleClick: js.Function0[js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "dragAndDrop")
  @js.native
  val dragAndDrop: js.Function2[/* target */ js.Any, /* hasDuration */ js.UndefOr[Duration], js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "getAttribute")
  @js.native
  val getAttribute: js.Function1[/* attributeName */ String, String | Null] = js.native
  
  @JSImport("webdriverio/build/commands/element", "getCSSProperty")
  @js.native
  val getCSSProperty: js.Function1[/* cssProperty */ js.Any, js.Promise[js.Object]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "getHTML")
  @js.native
  val getHTML: js.Function1[/* includeSelectorTag */ js.UndefOr[Boolean], js.Any] = js.native
  
  @JSImport("webdriverio/build/commands/element", "getLocation")
  @js.native
  val getLocation: js.Function1[/* prop */ js.Any, js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "getProperty")
  @js.native
  val getProperty: js.Function1[/* property */ js.Any, js.Any] = js.native
  
  @JSImport("webdriverio/build/commands/element", "getSize")
  @js.native
  val getSize: js.Function1[/* prop */ js.UndefOr[js.Any], js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "getTagName")
  @js.native
  val getTagName: js.Function0[String] = js.native
  
  @JSImport("webdriverio/build/commands/element", "getText")
  @js.native
  val getText: js.Function0[String] = js.native
  
  @JSImport("webdriverio/build/commands/element", "getValue")
  @js.native
  val getValue: js.Function0[String] = js.native
  
  @JSImport("webdriverio/build/commands/element", "isClickable")
  @js.native
  val isClickable: js.Function0[js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "isDisplayed")
  @js.native
  val isDisplayed: js.Function0[js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "isDisplayedInViewport")
  @js.native
  val isDisplayedInViewport: js.Function0[js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "isEnabled")
  @js.native
  val isEnabled: js.Function0[Boolean] = js.native
  
  @JSImport("webdriverio/build/commands/element", "isEqual")
  @js.native
  val isEqual: js.Function1[/* el */ js.Any, js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "isExisting")
  @js.native
  val isExisting: js.Function0[Boolean] = js.native
  
  @JSImport("webdriverio/build/commands/element", "isFocused")
  @js.native
  val isFocused: js.Function0[js.Promise[Boolean]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "isSelected")
  @js.native
  val isSelected: js.Function0[Boolean] = js.native
  
  @JSImport("webdriverio/build/commands/element", "moveTo")
  @js.native
  val moveTo: js.Function1[/* hasXOffsetYOffset */ js.UndefOr[XOffset], js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "nextElement")
  @js.native
  val nextElement: js.Function0[Element] = js.native
  
  @JSImport("webdriverio/build/commands/element", "parentElement")
  @js.native
  val parentElement: js.Function0[Element] = js.native
  
  @JSImport("webdriverio/build/commands/element", "previousElement")
  @js.native
  val previousElement: js.Function0[Element] = js.native
  
  @JSImport("webdriverio/build/commands/element", "react$")
  @js.native
  val react: js.Function2[/* selector */ js.Any, /* hasPropsState */ js.UndefOr[Props], js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "react$$")
  @js.native
  val react$: js.Function2[
    /* selector */ js.Any, 
    /* hasPropsState */ js.UndefOr[Props], 
    js.Promise[js.Array[js.Object]]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/element", "saveScreenshot")
  @js.native
  val saveScreenshot: js.Function1[/* filepath */ js.Any, js.Promise[Buffer]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "scrollIntoView")
  @js.native
  val scrollIntoView: js.Function1[/* scrollIntoViewOptions */ js.UndefOr[Boolean], js.Any] = js.native
  
  @JSImport("webdriverio/build/commands/element", "selectByAttribute")
  @js.native
  val selectByAttribute: js.Function2[/* attribute */ js.Any, /* value */ js.Any, js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "selectByIndex")
  @js.native
  val selectByIndex: js.Function1[/* index */ js.Any, js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "selectByVisibleText")
  @js.native
  val selectByVisibleText: js.Function1[/* text */ js.Any, js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "setValue")
  @js.native
  val setValue: js.Function2[
    /* value */ String | Double | Boolean | js.Object | js.Array[js.Any], 
    /* hasTranslateToUnicode */ js.UndefOr[js.Any], 
    js.Promise[js.Any]
  ] = js.native
  
  @JSImport("webdriverio/build/commands/element", "shadow$")
  @js.native
  val shadow: js.Function1[/* selector */ js.Any, js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "shadow$$")
  @js.native
  val shadow$: js.Function1[/* selector */ js.Any, js.Promise[js.Any]] = js.native
  
  @JSImport("webdriverio/build/commands/element", "touchAction")
  @js.native
  val touchAction: js.Function1[/* repeated */ js.Any, js.Any] = js.native
  
  @JSImport("webdriverio/build/commands/element", "waitForClickable")
  @js.native
  val waitForClickable: js.Function1[/* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[js.Any], Boolean] = js.native
  
  @JSImport("webdriverio/build/commands/element", "waitForDisplayed")
  @js.native
  val waitForDisplayed: js.Function1[/* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[js.Any], Boolean] = js.native
  
  @JSImport("webdriverio/build/commands/element", "waitForEnabled")
  @js.native
  val waitForEnabled: js.Function1[/* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[js.Any], Boolean] = js.native
  
  @JSImport("webdriverio/build/commands/element", "waitForExist")
  @js.native
  val waitForExist: js.Function1[/* hasTimeoutIntervalReverseTimeoutMsg */ js.UndefOr[js.Any], Boolean] = js.native
  
  @JSImport("webdriverio/build/commands/element", "waitUntil")
  @js.native
  val waitUntil: js.ThisFunction2[
    /* this */ BrowserObject, 
    /* condition */ js.Function0[Boolean | js.Promise[Boolean]], 
    /* hasTimeoutIntervalTimeoutMsg */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.WaitUntilOptions */ js.Any
    ], 
    js.Any
  ] = js.native
}
