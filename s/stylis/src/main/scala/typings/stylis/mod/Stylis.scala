package typings.stylis.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stylis
  extends Instantiable0[Stylis]
     with Instantiable1[/* options */ Options, Stylis] {
  
  def apply(namescope: String, input: String): String | js.Any = js.native
  
  def set(): Set = js.native
  def set(options: Options): Set = js.native
  @JSName("set")
  var set_Original: Set = js.native
  
  def use(): Use = js.native
  def use(plugin: js.Array[Plugin]): Use = js.native
  def use(plugin: Plugin): Use = js.native
  @JSName("use")
  var use_Original: Use = js.native
}
