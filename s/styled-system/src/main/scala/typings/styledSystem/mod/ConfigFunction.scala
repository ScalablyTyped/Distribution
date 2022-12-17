package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigFunction extends StObject {
  
  def apply(value: Any, scale: Unit, props: Any): Any = js.native
  def apply(value: Any, scale: Scale, props: Any): Any = js.native
  
  /** A fallback scale object for when there isn't one defined in the `theme` object. */
  var defaults: js.UndefOr[Scale] = js.native
  
  /** A string referencing a key in the `theme` object. */
  var scale: js.UndefOr[String] = js.native
}
