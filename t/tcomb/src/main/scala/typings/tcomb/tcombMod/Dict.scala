package typings.tcomb.tcombMod

import org.scalablytyped.runtime.StringDictionary
import typings.tcomb.Anon_Codomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// dict combinator
//
@js.native
trait Dict[T] extends Type[StringDictionary[T]] {
  @JSName("meta")
  var meta_Dict: Anon_Codomain[T] = js.native
  @JSName("update")
  var update_Original: Update[StringDictionary[T]] = js.native
  def update(instance: StringDictionary[StringDictionary[T]], spec: UpdatePatch): StringDictionary[StringDictionary[T]] = js.native
}

