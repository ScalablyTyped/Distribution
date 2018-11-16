package typings
package stylisLib.stylisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stylis
  extends ScalablyTyped.runtime.Instantiable0[Stylis]
     with ScalablyTyped.runtime.Instantiable1[/* options */ Options, Stylis] {
  @JSName("set")
  var set_Original: Set = js.native
  @JSName("use")
  var use_Original: Use = js.native
  def apply(namescope: java.lang.String, input: java.lang.String): java.lang.String | js.Any = js.native
  def set(): Set = js.native
  def set(options: Options): Set = js.native
  def use(): Use = js.native
  def use(plugin: js.Array[Plugin]): Use = js.native
  def use(plugin: Plugin): Use = js.native
}

