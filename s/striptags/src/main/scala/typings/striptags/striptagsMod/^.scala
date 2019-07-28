package typings.striptags.striptagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("striptags", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Creates an array of elements split into groups the length of size. If collection can’t be split evenly, the
    * final chunk will be the remaining elements.
    *
    * @param html The text to process.
    * @param allowedTags Tags which aren't removed
    * @param tagReplacement Removed tags are replaced with this
    * @return Returns the input string, sans any html tags that weren't allowed
    */
  def apply(html: String): String = js.native
  def apply(html: String, allowedTags: String | js.Array[String]): String = js.native
  def apply(html: String, allowedTags: String | js.Array[String], tagReplacement: String): String = js.native
  def init_streaming_mode(): js.Function1[/* html */ String, String] = js.native
  def init_streaming_mode(allowedTags: String): js.Function1[/* html */ String, String] = js.native
  def init_streaming_mode(allowedTags: String, tagReplacement: String): js.Function1[/* html */ String, String] = js.native
  def init_streaming_mode(allowedTags: js.Array[String]): js.Function1[/* html */ String, String] = js.native
  def init_streaming_mode(allowedTags: js.Array[String], tagReplacement: String): js.Function1[/* html */ String, String] = js.native
}

