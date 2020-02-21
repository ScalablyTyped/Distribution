package typings.vcardsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  var base64: Boolean
  var mediaType: String
  var url: String
  /**
    * Attach a photo from a URL
    * @param   url       URL where photo can be found
    * @param  mediaType Media type of photo (JPEG, PNG, GIF)
    */
  def attachFromUrl(url: String, mediaType: String): Unit
  /**
    * Embed a photo from a file using base-64 encoding (not implemented yet)
    * @param  fileLocation - filename
    */
  def embedFromFile(fileLocation: String): Unit
  /**
    * Embed a photo from a base-64 string
    * @param  base64String - the base64 string
    * @param  mediaType - the media type
    */
  def embedFromString(base64String: String, mediaType: String): Unit
}

object Photo {
  @scala.inline
  def apply(
    attachFromUrl: (String, String) => Unit,
    base64: Boolean,
    embedFromFile: String => Unit,
    embedFromString: (String, String) => Unit,
    mediaType: String,
    url: String
  ): Photo = {
    val __obj = js.Dynamic.literal(attachFromUrl = js.Any.fromFunction2(attachFromUrl), base64 = base64.asInstanceOf[js.Any], embedFromFile = js.Any.fromFunction1(embedFromFile), embedFromString = js.Any.fromFunction2(embedFromString), mediaType = mediaType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Photo]
  }
}

