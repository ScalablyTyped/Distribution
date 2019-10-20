package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.Sort
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.WordType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `listWords` operation. */
@JSImport("watson-developer-cloud/speech-to-text/v1-generated", "ListWordsConstants")
@js.native
object ListWordsConstants extends js.Object {
  @js.native
  sealed trait Sort extends js.Object
  
  @js.native
  sealed trait WordType extends js.Object
  
  /** Indicates the order in which the words are to be listed, `alphabetical` or by `count`. You can prepend an optional `+` or `-` to an argument to indicate whether the results are to be sorted in ascending or descending order. By default, words are sorted in ascending alphabetical order. For alphabetical ordering, the lexicographical precedence is numeric values, uppercase letters, and lowercase letters. For count ordering, values with the same count are ordered alphabetically. With the `curl` command, URL encode the `+` symbol as `%2B`. */
  @js.native
  object Sort extends js.Object {
    @js.native
    sealed trait ALPHABETICAL extends Sort
    
    @js.native
    sealed trait COUNT extends Sort
    
    /* "alphabetical" */ val ALPHABETICAL: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.Sort.ALPHABETICAL with String = js.native
    /* "count" */ val COUNT: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.Sort.COUNT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
  }
  
  /** The type of words to be listed from the custom language model's words resource: * `all` (the default) shows all words. * `user` shows only custom words that were added or modified by the user directly. * `corpora` shows only OOV that were extracted from corpora. * `grammars` shows only OOV words that are recognized by grammars. */
  @js.native
  object WordType extends js.Object {
    @js.native
    sealed trait ALL extends WordType
    
    @js.native
    sealed trait CORPORA extends WordType
    
    @js.native
    sealed trait GRAMMARS extends WordType
    
    @js.native
    sealed trait USER extends WordType
    
    /* "all" */ val ALL: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.WordType.ALL with String = js.native
    /* "corpora" */ val CORPORA: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.WordType.CORPORA with String = js.native
    /* "grammars" */ val GRAMMARS: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.WordType.GRAMMARS with String = js.native
    /* "user" */ val USER: typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.WordType.USER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WordType with String] = js.native
  }
  
}

