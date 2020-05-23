package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceEntry extends js.Object {
  var fileName: String
  var isWriteAccess: Boolean
  var limChar: Double
  var minChar: Double
}

object ReferenceEntry {
  @scala.inline
  def apply(fileName: String, isWriteAccess: Boolean, limChar: Double, minChar: Double): ReferenceEntry = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceEntry]
  }
}

