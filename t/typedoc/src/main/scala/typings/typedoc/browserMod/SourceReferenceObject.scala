package typings.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceReferenceObject extends js.Object {
  var character: Double
  var fileName: String
  var line: Double
}

object SourceReferenceObject {
  @scala.inline
  def apply(character: Double, fileName: String, line: Double): SourceReferenceObject = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceReferenceObject]
  }
}

