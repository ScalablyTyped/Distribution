package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `trainLanguageModel` operation. */
object TrainLanguageModelConstants {
  
  @js.native
  sealed trait WordTypeToAdd extends StObject
  /** The type of words from the custom language model's words resource on which to train the model: * `all` (the default) trains the model on all new words, regardless of whether they were extracted from corpora or grammars or were added or modified by the user. * `user` trains the model only on new words that were added or modified by the user directly. The model is not trained on new words extracted from corpora or grammars. */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "TrainLanguageModelConstants.WordTypeToAdd")
  @js.native
  object WordTypeToAdd extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WordTypeToAdd & String] = js.native
    
    @js.native
    sealed trait ALL
      extends StObject
         with WordTypeToAdd
    /* "all" */ val ALL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.TrainLanguageModelConstants.WordTypeToAdd.ALL & String = js.native
    
    @js.native
    sealed trait USER
      extends StObject
         with WordTypeToAdd
    /* "user" */ val USER: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.TrainLanguageModelConstants.WordTypeToAdd.USER & String = js.native
  }
}
