package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `listWords` operation. */
object ListWordsConstants {
  
  @js.native
  sealed trait Sort extends StObject
  /** Indicates the order in which the words are to be listed, `alphabetical` or by `count`. You can prepend an optional `+` or `-` to an argument to indicate whether the results are to be sorted in ascending or descending order. By default, words are sorted in ascending alphabetical order. For alphabetical ordering, the lexicographical precedence is numeric values, uppercase letters, and lowercase letters. For count ordering, values with the same count are ordered alphabetically. With the `curl` command, URL encode the `+` symbol as `%2B`. */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "ListWordsConstants.Sort")
  @js.native
  object Sort extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    
    @js.native
    sealed trait ALPHABETICAL extends Sort
    /* "alphabetical" */ val ALPHABETICAL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.ListWordsConstants.Sort.ALPHABETICAL with String = js.native
    
    @js.native
    sealed trait COUNT extends Sort
    /* "count" */ val COUNT: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.ListWordsConstants.Sort.COUNT with String = js.native
  }
  
  @js.native
  sealed trait WordType extends StObject
  /** The type of words to be listed from the custom language model's words resource: * `all` (the default) shows all words. * `user` shows only custom words that were added or modified by the user directly. * `corpora` shows only OOV that were extracted from corpora. * `grammars` shows only OOV words that are recognized by grammars. */
  @JSImport("watson-developer-cloud/speech-to-text/v1-generated", "ListWordsConstants.WordType")
  @js.native
  object WordType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WordType with String] = js.native
    
    @js.native
    sealed trait ALL extends WordType
    /* "all" */ val ALL: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.ListWordsConstants.WordType.ALL with String = js.native
    
    @js.native
    sealed trait CORPORA extends WordType
    /* "corpora" */ val CORPORA: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.ListWordsConstants.WordType.CORPORA with String = js.native
    
    @js.native
    sealed trait GRAMMARS extends WordType
    /* "grammars" */ val GRAMMARS: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.ListWordsConstants.WordType.GRAMMARS with String = js.native
    
    @js.native
    sealed trait USER extends WordType
    /* "user" */ val USER: typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.ListWordsConstants.WordType.USER with String = js.native
  }
}
