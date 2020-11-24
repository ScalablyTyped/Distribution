package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `trainLanguageModel` operation. */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "TrainLanguageModelConstants")
@js.native
object TrainLanguageModelConstants extends js.Object {
  
  @js.native
  sealed trait WordTypeToAdd extends js.Object
  /** The type of words from the custom language model's words resource on which to train the model: * `all` (the default) trains the model on all new words, regardless of whether they were extracted from corpora or grammars or were added or modified by the user. * `user` trains the model only on new words that were added or modified by the user directly. The model is not trained on new words extracted from corpora or grammars. */
  @js.native
  object WordTypeToAdd extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WordTypeToAdd with String] = js.native
    
    @js.native
    sealed trait ALL extends WordTypeToAdd
    /* "all" */ @js.native
    object ALL extends TopLevel[ALL with String]
    
    @js.native
    sealed trait USER extends WordTypeToAdd
    /* "user" */ @js.native
    object USER extends TopLevel[USER with String]
  }
}
