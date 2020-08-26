package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Translation. */
@js.native
trait Translation extends js.Object {
  /** Translation output in UTF-8. */
  var translation_output: String = js.native
}

object Translation {
  @scala.inline
  def apply(translation_output: String): Translation = {
    val __obj = js.Dynamic.literal(translation_output = translation_output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translation]
  }
  @scala.inline
  implicit class TranslationOps[Self <: Translation] (val x: Self) extends AnyVal {
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
    def setTranslation_output(value: String): Self = this.set("translation_output", value.asInstanceOf[js.Any])
  }
  
}

