package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.SourceReference, 'fileName' | 'line' | 'character'> */
@js.native
trait SourceReference
  extends __ModelToObject[js.Any] {
  var character: ModelToObject[Double] | Double = js.native
  var fileName: ModelToObject[String] | String = js.native
  var line: ModelToObject[Double] | Double = js.native
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
  @scala.inline
  implicit class SourceReferenceOps[Self <: SourceReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCharacterVarargs(value: _ModelToObject[js.Any]*): Self = this.set("character", js.Array(value :_*))
    @scala.inline
    def setCharacter(value: ModelToObject[Double] | Double): Self = this.set("character", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileNameVarargs(value: _ModelToObject[js.Any]*): Self = this.set("fileName", js.Array(value :_*))
    @scala.inline
    def setFileName(value: ModelToObject[String] | String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineVarargs(value: _ModelToObject[js.Any]*): Self = this.set("line", js.Array(value :_*))
    @scala.inline
    def setLine(value: ModelToObject[Double] | Double): Self = this.set("line", value.asInstanceOf[js.Any])
  }
  
}

