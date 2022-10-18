package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selector
  extends StObject
     with SelectorAPI {
  
  /**
    * Creates parametrized selector.
    *
    * @param args - Selector parameters.
    */
  def apply(args: Any*): SelectorPromise = js.native
}
object Selector {
  
  inline def apply: SelectorFactory = js.Dynamic.global.selectDynamic("Selector").asInstanceOf[SelectorFactory]
}
