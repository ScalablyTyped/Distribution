package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.SourceReference, 'fileName' | 'line' | 'character'> */
trait SourceReference
  extends __ModelToObject[js.Any] {
  var character: ModelToObject[Double] | Double
  var fileName: ModelToObject[String] | String
  var line: ModelToObject[Double] | Double
}

object SourceReference {
  @scala.inline
  def apply(
    character: ModelToObject[Double] | Double,
    fileName: ModelToObject[String] | String,
    line: ModelToObject[Double] | Double
  ): SourceReference = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceReference]
  }
}

