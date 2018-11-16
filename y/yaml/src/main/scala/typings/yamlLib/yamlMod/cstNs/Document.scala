package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Document extends Node {
  @JSName("anchor")
  val anchor_Document: scala.Null
  @JSName("comment")
  val comment_Document: scala.Null
  var contents: js.Array[Comment | ContentNode]
  var directives: js.Array[Comment | Directive]
  @JSName("tag")
  val tag_Document: scala.Null
  @JSName("type")
  var type_Document: yamlLib.yamlLibStrings.DOCUMENT
}

