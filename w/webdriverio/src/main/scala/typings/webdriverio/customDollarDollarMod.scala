package typings.webdriverio

import typings.webdriverio.typesMod.ElementArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customDollarDollarMod {
  
  @JSImport("webdriverio/build/commands/element/custom$$", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * The `customs$$` allows you to use a custom strategy declared by using `browser.addLocatorStrategy`
    *
    * <example>
    :example.js
    it('should get all the plugin wrapper buttons', async () => {
    await browser.url('https://webdriver.io')
    await browser.addLocatorStrategy('myStrat', (selector) => {
    return document.querySelectorAll(selector)
    })
    const pluginRowBlock = await browser.custom$('myStrat', '.pluginRowBlock')
    const pluginWrapper = await pluginRowBlock.custom$$('myStrat', '.pluginWrapper')
    console.log(pluginWrapper.length) // 4
    })
    * </example>
    *
    * @alias custom$$
    * @param {String} strategyName
    * @param {Any} strategyArguments
    * @return {ElementArray}
    */
  inline def default(strategyName: String, strategyArguments: Any*): js.Promise[ElementArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(strategyName.asInstanceOf[js.Any]).`++`(strategyArguments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[ElementArray]]
}
