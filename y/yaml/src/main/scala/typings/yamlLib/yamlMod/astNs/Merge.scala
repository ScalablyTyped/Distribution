package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Merge extends Node {
  @JSName("cstNode")
  var cstNode_Merge: js.UndefOr[yamlLib.yamlMod.cstNs.PlainValue] = js.undefined
  /**
    * key is always Scalar('<<'), defined by the type specification
    */
  var key: PlainValue
  var `type`: yamlLib.yamlLibStrings.MERGE_PAIR
  /**
    * value is always Seq<Alias(Map)>, stringified as *A if length = 1
    */
  var value: SeqBase
}

