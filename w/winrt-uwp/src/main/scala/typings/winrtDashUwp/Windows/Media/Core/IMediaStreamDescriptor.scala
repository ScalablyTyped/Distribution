package typings.winrtDashUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a media stream. */
trait IMediaStreamDescriptor extends js.Object {
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  var isSelected: Boolean
  /** Gets or sets the RFC-1766 language code for the stream. */
  var language: String
  /** Gets or sets the name of the stream. */
  var name: String
}

object IMediaStreamDescriptor {
  @scala.inline
  def apply(isSelected: Boolean, language: String, name: String): IMediaStreamDescriptor = {
    val __obj = js.Dynamic.literal(isSelected = isSelected, language = language, name = name)
  
    __obj.asInstanceOf[IMediaStreamDescriptor]
  }
}

