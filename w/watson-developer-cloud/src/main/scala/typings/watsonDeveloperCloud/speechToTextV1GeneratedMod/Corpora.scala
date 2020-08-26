package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corpora. */
@js.native
trait Corpora extends js.Object {
  /** An array of `Corpus` objects that provides information about the corpora for the custom model. The array is empty if the custom model has no corpora. */
  var corpora: js.Array[Corpus] = js.native
}

object Corpora {
  @scala.inline
  def apply(corpora: js.Array[Corpus]): Corpora = {
    val __obj = js.Dynamic.literal(corpora = corpora.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corpora]
  }
  @scala.inline
  implicit class CorporaOps[Self <: Corpora] (val x: Self) extends AnyVal {
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
    def setCorporaVarargs(value: Corpus*): Self = this.set("corpora", js.Array(value :_*))
    @scala.inline
    def setCorpora(value: js.Array[Corpus]): Self = this.set("corpora", value.asInstanceOf[js.Any])
  }
  
}

