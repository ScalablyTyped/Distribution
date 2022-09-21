package typings.styledComponents.nativeDistTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stringifier extends StObject {
  
  def apply(css: String): String = js.native
  def apply(css: String, selector: String): String = js.native
  def apply(css: String, selector: String, prefix: String): String = js.native
  def apply(css: String, selector: String, prefix: String, componentId: String): String = js.native
  def apply(css: String, selector: String, prefix: Unit, componentId: String): String = js.native
  def apply(css: String, selector: Unit, prefix: String): String = js.native
  def apply(css: String, selector: Unit, prefix: String, componentId: String): String = js.native
  def apply(css: String, selector: Unit, prefix: Unit, componentId: String): String = js.native
  
  var hash: String = js.native
}
