package typings.webdriverio.buildTypesMod

import typings.wdioProtocols.buildTypesMod.ElementReference
import typings.webdriverio.webdriverioBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementBase
  extends InstanceBase
     with ElementReference
     with CustomInstanceCommands[typings.std.Element] {
  
  /**
    * WebDriver element reference
    */
  var ELEMENT: String = js.native
  
  /**
    * WebDriver element reference
    */
  var elementId: String = js.native
  
  /**
    * error response if element was not found
    */
  var error: js.UndefOr[js.Error] = js.native
  
  /**
    * index of the element if fetched with `$$`
    */
  var index: js.UndefOr[Double] = js.native
  
  var isMultiremote: `false` = js.native
  
  /**
    * true if element is a React component
    */
  var isReactElement: js.UndefOr[Boolean] = js.native
  
  /**
    * parent of the element if fetched via `$(parent).$(child)`
    */
  var parent: typings.std.Element | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) = js.native
  
  /**
    * selector used to fetch this element, can be
    * - undefined if element was created via `$({ 'element-6066-11e4-a52e-4f735466cecf': 'ELEMENT-1' })`
    * - a string if `findElement` was used and a reference was found
    * - or a functin if element was found via e.g. `$(() => document.body)`
    */
  var selector: Selector = js.native
}
