package typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.Sort
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.Sort.ALPHABETICAL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.Sort.COUNT
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.WordType
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.WordType.ALL
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.WordType.CORPORA
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.WordType.GRAMMARS
import typings.watsonDashDeveloperDashCloud.speechDashToDashTextV1DashGeneratedMod.ListWordsConstants.WordType.USER
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Sort with String] = js.native
    /* "alphabetical" */ @js.native
    object ALPHABETICAL extends TopLevel[ALPHABETICAL with String]
    
    /* "count" */ @js.native
    object COUNT extends TopLevel[COUNT with String]
    
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WordType with String] = js.native
    /* "all" */ @js.native
    object ALL extends TopLevel[ALL with String]
    
    /* "corpora" */ @js.native
    object CORPORA extends TopLevel[CORPORA with String]
    
    /* "grammars" */ @js.native
    object GRAMMARS extends TopLevel[GRAMMARS with String]
    
    /* "user" */ @js.native
    object USER extends TopLevel[USER with String]
    
  }
  
}

