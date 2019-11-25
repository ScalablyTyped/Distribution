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
  def update(instance: StringDictionary[T], spec: UpdatePatch): StringDictionary[T] = js.native
}

@JSImport("tcomb", "dict")
@js.native
object dict extends js.Object {
  def apply[T](domain: Constructor[java.lang.String], codomain: Constructor[T]): Dict[T] = js.native
  def apply[T](domain: Constructor[java.lang.String], codomain: Constructor[T], name: java.lang.String): Dict[T] = js.native
}

