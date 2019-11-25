package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corpora. */
trait Corpora extends js.Object {
  /** An array of `Corpus` objects that provides information about the corpora for the custom model. The array is empty if the custom model has no corpora. */
  var corpora: js.Array[Corpus]
}

object Corpora {
  @scala.inline
  def apply(corpora: js.Array[Corpus]): Corpora = {
    val __obj = js.Dynamic.literal(corpora = corpora.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Corpora]
  }
}

