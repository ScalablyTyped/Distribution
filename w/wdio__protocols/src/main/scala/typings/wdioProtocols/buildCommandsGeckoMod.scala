package typings.wdioProtocols

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsGeckoMod {
  
  trait GeckoCommands extends StObject {
    
    /**
      * Gecko Protocol Command
      *
      * Captures a screenshot of the entire page.
      * @ref https://phabricator.services.mozilla.com/source/mozilla-central/browse/default/testing/geckodriver/src/command.rs$43-46
      *
      */
    def fullPageScreenshot(): js.Promise[String]
    
    /**
      * Gecko Protocol Command
      *
      * Get the context that is currently in effect, e.g. `CHROME` or `CONTENT`.
      * @ref https://github.com/SeleniumHQ/selenium/blob/586affe0cf675b1d5c8abc756defa4a46d95391b/javascript/node/selenium-webdriver/firefox.js#L615-L622
      *
      * @example
      * ```js
      * console.log(await browser.getMozContext()); // outputs: 'CHROME'
      * ```
      */
    def getMozContext(): js.Promise[String]
    
    /**
      * Gecko Protocol Command
      *
      * Installs a new addon with the current session. This function will return an ID that may later be used to uninstall the addon using `uninstallAddon`.
      * @ref https://github.com/SeleniumHQ/selenium/blob/586affe0cf675b1d5c8abc756defa4a46d95391b/javascript/node/selenium-webdriver/firefox.js#L647-L668
      *
      * @example
      * ```js
      * // Create a buffer of the add on .zip file
      * const extension = await fs.promises.readFile('/path/to/extension.zip')
      * // Load extension in Firefox
      * const id = await browser.installAddOn(extension.toString('base64'), false);
      * ```
      */
    def installAddOn(addon: String, temporary: Boolean): js.Promise[String]
    
    /**
      * Gecko Protocol Command
      *
      * Changes target context for commands between chrome- and content.<br /><br />Changing the current context has a stateful impact on all subsequent commands. The `CONTENT` context has normal web platform document permissions, as if you would evaluate arbitrary JavaScript. The `CHROME` context gets elevated permissions that lets you manipulate the browser chrome itself, with full access to the XUL toolkit.
      * @ref https://github.com/SeleniumHQ/selenium/blob/586affe0cf675b1d5c8abc756defa4a46d95391b/javascript/node/selenium-webdriver/firefox.js#L615-L645
      *
      * @example
      * ```js
      * console.log(await browser.getMozContext()); // outputs: 'CHROME'
      * browser.setMozContext('CONTENT');
      * console.log(await browser.getMozContext()); // outputs: 'CONTENT'
      * ```
      */
    def setMozContext(context: String): js.Promise[Unit]
    
    /**
      * Gecko Protocol Command
      *
      * Uninstalls an addon from the current browser session's profile.
      * @ref https://github.com/SeleniumHQ/selenium/blob/586affe0cf675b1d5c8abc756defa4a46d95391b/javascript/node/selenium-webdriver/firefox.js#L670-L687
      *
      * @example
      * ```js
      * // Create a buffer of the add on .zip file
      * const extension = await fs.promises.readFile('/path/to/extension.zip')
      * // Load extension in Firefox
      * const id = await browser.installAddOn(extension.toString('base64'), false);
      * // ...
      * await browser.uninstallAddOn(id)
      * ```
      */
    def uninstallAddOn(id: String): js.Promise[Unit]
  }
  object GeckoCommands {
    
    inline def apply(
      fullPageScreenshot: () => js.Promise[String],
      getMozContext: () => js.Promise[String],
      installAddOn: (String, Boolean) => js.Promise[String],
      setMozContext: String => js.Promise[Unit],
      uninstallAddOn: String => js.Promise[Unit]
    ): GeckoCommands = {
      val __obj = js.Dynamic.literal(fullPageScreenshot = js.Any.fromFunction0(fullPageScreenshot), getMozContext = js.Any.fromFunction0(getMozContext), installAddOn = js.Any.fromFunction2(installAddOn), setMozContext = js.Any.fromFunction1(setMozContext), uninstallAddOn = js.Any.fromFunction1(uninstallAddOn))
      __obj.asInstanceOf[GeckoCommands]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeckoCommands] (val x: Self) extends AnyVal {
      
      inline def setFullPageScreenshot(value: () => js.Promise[String]): Self = StObject.set(x, "fullPageScreenshot", js.Any.fromFunction0(value))
      
      inline def setGetMozContext(value: () => js.Promise[String]): Self = StObject.set(x, "getMozContext", js.Any.fromFunction0(value))
      
      inline def setInstallAddOn(value: (String, Boolean) => js.Promise[String]): Self = StObject.set(x, "installAddOn", js.Any.fromFunction2(value))
      
      inline def setSetMozContext(value: String => js.Promise[Unit]): Self = StObject.set(x, "setMozContext", js.Any.fromFunction1(value))
      
      inline def setUninstallAddOn(value: String => js.Promise[Unit]): Self = StObject.set(x, "uninstallAddOn", js.Any.fromFunction1(value))
    }
  }
}
