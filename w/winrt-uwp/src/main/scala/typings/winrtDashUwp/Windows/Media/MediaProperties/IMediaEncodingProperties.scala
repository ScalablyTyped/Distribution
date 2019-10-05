package typings.winrtDashUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of a media stream or media container. */
trait IMediaEncodingProperties extends js.Object {
  /** Gets additional format properties. */
  var properties: MediaPropertySet
  /** Gets or sets the subtype of the format. */
  var subtype: String
  /** Gets the format type. */
  var `type`: String
}

object IMediaEncodingProperties {
  @scala.inline
  def apply(properties: MediaPropertySet, subtype: String, `type`: String): IMediaEncodingProperties = {
    val __obj = js.Dynamic.literal(properties = properties, subtype = subtype)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMediaEncodingProperties]
  }
}

