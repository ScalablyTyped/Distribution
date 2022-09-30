package typings.webdriverio.typesMod

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChainablePromiseElement[T]
  extends StObject
     with AsyncElementProto
     with Promise[T] {
  
  /**
    * WebDriver element reference
    */
  var elementId: js.Promise[String] = js.native
  
  /**
    * Error message in case element fetch was not successful
    */
  var error: js.UndefOr[js.Promise[js.Error]] = js.native
  
  /**
    * index of the element if fetched with `$$`
    */
  var index: js.UndefOr[js.Promise[Double]] = js.native
  
  /**
    * parent of the element if fetched via `$(parent).$(child)`
    */
  var parent: js.Promise[
    typings.std.Element | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any)
  ] = js.native
  
  /**
    * selector used to fetch this element, can be
    * - undefined if element was created via `$({ 'element-6066-11e4-a52e-4f735466cecf': 'ELEMENT-1' })`
    * - a string if `findElement` was used and a reference was found
    * - or a functin if element was found via e.g. `$(() => document.body)`
    */
  var selector: js.Promise[Selector] = js.native
}
