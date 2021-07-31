package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.webdriverio.webdriverioStrings.ELEMENT
import typings.webdriverio.webdriverioStrings.`element-6066-11e4-a52e-4f735466cecf`
import typings.webdriverio.webdriverioStrings.elementId
import typings.webdriverio.webdriverioStrings.index
import typings.webdriverio.webdriverioStrings.isMultiremote
import typings.webdriverio.webdriverioStrings.parent
import typings.webdriverio.webdriverioStrings.selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverwriteCommandFn[ElementKey /* <: selector | elementId | `element-6066-11e4-a52e-4f735466cecf` | ELEMENT | index | parent */, BrowserKey /* <: isMultiremote */, IsElement /* <: Boolean */] extends StObject {
  
  def apply(
    origCommand: /* import warning: importer.ImportType#apply Failed type conversion: webdriverio.webdriverio/webdriverio-core.WebdriverIO.BrowserObject[BrowserKey] */ js.Any,
    args: js.Any*
  ): js.Any = js.native
}
