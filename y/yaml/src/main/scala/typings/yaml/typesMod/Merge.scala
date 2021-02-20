package typings.yaml.typesMod

import typings.yaml.typesMod.AST.PlainValue
import typings.yaml.typesMod.Pair.Type.MERGE_PAIR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yaml/types", "Merge")
@js.native
class Merge protected () extends Pair {
  def this(key: js.Any) = this()
  def this(key: js.Any, value: js.Any) = this()
  
  /** Always Scalar('<<'), defined by the type specification */
  @JSName("key")
  var key_Merge: PlainValue = js.native
  
  @JSName("type")
  var type_Merge: MERGE_PAIR = js.native
  
  /** Always YAMLSeq<Alias(Map)>, stringified as *A if length = 1 */
  @JSName("value")
  var value_Merge: YAMLSeq = js.native
}
