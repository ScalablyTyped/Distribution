package typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.GetPronunciationConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Format extends js.Object

/** The phoneme format in which to return the pronunciation. Omit the parameter to obtain the pronunciation in the default format. */
@JSImport("watson-developer-cloud/text-to-speech/v1-generated", "GetPronunciationConstants.Format")
@js.native
object Format extends js.Object {
  @js.native
  sealed trait IBM extends Format
  
  @js.native
  sealed trait IPA extends Format
  
  /* "ibm" */ val IBM: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.GetPronunciationConstants.Format.IBM with String = js.native
  /* "ipa" */ val IPA: typings.watsonDashDeveloperDashCloud.textDashToDashSpeechV1DashGeneratedMod.GetPronunciationConstants.Format.IPA with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Format with String] = js.native
}

