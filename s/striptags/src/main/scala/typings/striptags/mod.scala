package typings.striptags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates an array of elements split into groups the length of size. If collection can’t be split evenly, the
    * final chunk will be the remaining elements.
    *
    * @param html The text to process.
    * @param allowedTags Tags which aren't removed
    * @param tagReplacement Removed tags are replaced with this
    * @return Returns the input string, sans any html tags that weren't allowed
    */
  @scala.inline
  def apply(html: String): String = ^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(html: String, allowedTags: String): String = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], allowedTags.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(html: String, allowedTags: String, tagReplacement: String): String = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], allowedTags.asInstanceOf[js.Any], tagReplacement.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(html: String, allowedTags: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], allowedTags.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(html: String, allowedTags: js.Array[String], tagReplacement: String): String = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], allowedTags.asInstanceOf[js.Any], tagReplacement.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(html: String, allowedTags: Unit, tagReplacement: String): String = (^.asInstanceOf[js.Dynamic].apply(html.asInstanceOf[js.Any], allowedTags.asInstanceOf[js.Any], tagReplacement.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("striptags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def initStreamingMode(): js.Function1[/* html */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("init_streaming_mode")().asInstanceOf[js.Function1[/* html */ String, String]]
  @scala.inline
  def initStreamingMode(allowedTags: String): js.Function1[/* html */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("init_streaming_mode")(allowedTags.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* html */ String, String]]
  @scala.inline
  def initStreamingMode(allowedTags: String, tagReplacement: String): js.Function1[/* html */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("init_streaming_mode")(allowedTags.asInstanceOf[js.Any], tagReplacement.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* html */ String, String]]
  @scala.inline
  def initStreamingMode(allowedTags: js.Array[String]): js.Function1[/* html */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("init_streaming_mode")(allowedTags.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* html */ String, String]]
  @scala.inline
  def initStreamingMode(allowedTags: js.Array[String], tagReplacement: String): js.Function1[/* html */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("init_streaming_mode")(allowedTags.asInstanceOf[js.Any], tagReplacement.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* html */ String, String]]
  @scala.inline
  def initStreamingMode(allowedTags: Unit, tagReplacement: String): js.Function1[/* html */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("init_streaming_mode")(allowedTags.asInstanceOf[js.Any], tagReplacement.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* html */ String, String]]
}
