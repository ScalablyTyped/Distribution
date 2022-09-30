package typings.webdriverio.typesMod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementArray
  extends StObject
     with Array[typings.std.Element] {
  
  var foundWith: String = js.native
  
  var parent: typings.std.Element | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any) = js.native
  
  var props: js.Array[Any] = js.native
  
  var selector: Selector = js.native
}
