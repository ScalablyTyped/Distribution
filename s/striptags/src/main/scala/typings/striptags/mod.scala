package typings.striptags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("striptags", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  def apply(html: String, allowedTags: js.UndefOr[scala.Nothing], tagReplacement: String): String = js.native
  def apply(html: String, allowedTags: String): String = js.native
  def apply(html: String, allowedTags: String, tagReplacement: String): String = js.native
  def apply(html: String, allowedTags: js.Array[String]): String = js.native
  def apply(html: String, allowedTags: js.Array[String], tagReplacement: String): String = js.native
  @JSName("init_streaming_mode")
  def initStreamingMode(): js.Function1[/* html */ String, String] = js.native
  @JSName("init_streaming_mode")
  def initStreamingMode(allowedTags: js.UndefOr[scala.Nothing], tagReplacement: String): js.Function1[/* html */ String, String] = js.native
  @JSName("init_streaming_mode")
  def initStreamingMode(allowedTags: String): js.Function1[/* html */ String, String] = js.native
  @JSName("init_streaming_mode")
  def initStreamingMode(allowedTags: String, tagReplacement: String): js.Function1[/* html */ String, String] = js.native
  @JSName("init_streaming_mode")
  def initStreamingMode(allowedTags: js.Array[String]): js.Function1[/* html */ String, String] = js.native
  @JSName("init_streaming_mode")
  def initStreamingMode(allowedTags: js.Array[String], tagReplacement: String): js.Function1[/* html */ String, String] = js.native
}

