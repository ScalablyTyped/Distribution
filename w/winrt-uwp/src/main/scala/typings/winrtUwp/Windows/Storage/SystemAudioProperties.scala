package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for Windows audio file properties. */
@js.native
trait SystemAudioProperties extends js.Object {
  /** Gets the name of the System.Audio.EncodingBitrate property (one of the Windows audio file properties). */
  var encodingBitrate: String = js.native
}

object SystemAudioProperties {
  @scala.inline
  def apply(encodingBitrate: String): SystemAudioProperties = {
    val __obj = js.Dynamic.literal(encodingBitrate = encodingBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemAudioProperties]
  }
  @scala.inline
  implicit class SystemAudioPropertiesOps[Self <: SystemAudioProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncodingBitrate(value: String): Self = this.set("encodingBitrate", value.asInstanceOf[js.Any])
  }
  
}

