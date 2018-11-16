package typings
package striptagsLib.striptagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("striptags", JSImport.Namespace)
@js.native
object striptagsModMembers extends js.Object {
  val init_streaming_mode: js.Function2[
    /* allowedTags */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
    /* tagReplacement */ js.UndefOr[java.lang.String], 
    js.Function1[/* html */ java.lang.String, java.lang.String]
  ] = js.native
  /**
   * Creates an array of elements split into groups the length of size. If collection can’t be split evenly, the
   * final chunk will be the remaining elements.
   *
   * @param html The text to process.
   * @param allowedTags Tags which aren't removed
   * @param tagReplacement Removed tags are replaced with this
   * @return Returns the input string, sans any html tags that weren't allowed
   */
  def apply(html: java.lang.String): java.lang.String = js.native
  /**
   * Creates an array of elements split into groups the length of size. If collection can’t be split evenly, the
   * final chunk will be the remaining elements.
   *
   * @param html The text to process.
   * @param allowedTags Tags which aren't removed
   * @param tagReplacement Removed tags are replaced with this
   * @return Returns the input string, sans any html tags that weren't allowed
   */
  def apply(html: java.lang.String, allowedTags: java.lang.String | js.Array[java.lang.String]): java.lang.String = js.native
  /**
   * Creates an array of elements split into groups the length of size. If collection can’t be split evenly, the
   * final chunk will be the remaining elements.
   *
   * @param html The text to process.
   * @param allowedTags Tags which aren't removed
   * @param tagReplacement Removed tags are replaced with this
   * @return Returns the input string, sans any html tags that weren't allowed
   */
  def apply(
    html: java.lang.String,
    allowedTags: java.lang.String | js.Array[java.lang.String],
    tagReplacement: java.lang.String
  ): java.lang.String = js.native
}

