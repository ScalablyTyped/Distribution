package typings.watsonDeveloperCloud.textToSpeechV1GeneratedMod.GetPronunciationConstants

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Format with String] = js.native
  /* "ibm" */ @js.native
  object IBM extends TopLevel[IBM with String]
  
  /* "ipa" */ @js.native
  object IPA extends TopLevel[IPA with String]
  
}

