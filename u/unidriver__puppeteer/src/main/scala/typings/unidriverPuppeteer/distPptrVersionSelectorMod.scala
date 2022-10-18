package typings.unidriverPuppeteer

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPptrVersionSelectorMod {
  
  @JSImport("@unidriver/puppeteer/dist/pptrVersionSelector", "pptrCorePage")
  @js.native
  open class pptrCorePage ()
    extends typings.puppeteerCore.mod.Page
  
  @JSImport("@unidriver/puppeteer/dist/pptrVersionSelector", "pptrPage")
  @js.native
  open class pptrPage ()
    extends typings.puppeteer.mod.Page
  
  type ElementHandle = typings.puppeteerCore.mod.ElementHandle[Element] | typings.puppeteer.mod.ElementHandle[Element]
  
  type Frame = typings.puppeteerCore.mod.Frame | typings.puppeteer.mod.Frame
  
  type Page = typings.puppeteerCore.mod.Page | typings.puppeteer.mod.Page
}
