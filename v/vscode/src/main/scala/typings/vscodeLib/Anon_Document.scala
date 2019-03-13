package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Document extends js.Object {
  var document: vscodeLib.vscodeMod.TextDocument
  var range: vscodeLib.vscodeMod.Range
}

object Anon_Document {
  @scala.inline
  def apply(document: vscodeLib.vscodeMod.TextDocument, range: vscodeLib.vscodeMod.Range): Anon_Document = {
    val __obj = js.Dynamic.literal(document = document, range = range)
  
    __obj.asInstanceOf[Anon_Document]
  }
}

