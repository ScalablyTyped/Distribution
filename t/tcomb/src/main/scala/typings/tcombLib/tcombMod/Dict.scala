package typings
package tcombLib.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// dict combinator
//
@js.native
trait Dict[T]
  extends Type[ScalablyTyped.runtime.StringDictionary[T]] {
  @JSName("meta")
  var meta_Dict: tcombLib.Anon_NameDomain[T] = js.native
  @JSName("update")
  var update_Original: tcombLib.Update[ScalablyTyped.runtime.StringDictionary[T]] = js.native
  def update(
    instance: ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.StringDictionary[T]],
    spec: tcombLib.UpdatePatch
  ): ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.StringDictionary[T]] = js.native
}

