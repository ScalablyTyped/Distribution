package typings.yaml.typesMod

import typings.yaml.typesMod.AST.PlainValue
import typings.yaml.typesMod.Pair.Type.MERGE_PAIR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml/types", "Merge")
@js.native
class Merge () extends Pair {
  /** Always Scalar('<<'), defined by the type specification */
  @JSName("key")
  var key_Merge: PlainValue = js.native
  @JSName("type")
  var type_Merge: MERGE_PAIR = js.native
  /** Always YAMLSeq<Alias(Map)>, stringified as *A if length = 1 */
  @JSName("value")
  var value_Merge: YAMLSeq = js.native
}

