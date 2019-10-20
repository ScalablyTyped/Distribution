package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** Pronunciation. */
trait Pronunciation extends js.Object {
  /** The pronunciation of the specified text in the requested voice and format. If a custom voice model is specified, the pronunciation also reflects that custom voice. */
  var pronunciation: String
}

object Pronunciation {
  @scala.inline
  def apply(pronunciation: String): Pronunciation = {
    val __obj = js.Dynamic.literal(pronunciation = pronunciation)
  
    __obj.asInstanceOf[Pronunciation]
  }
}

