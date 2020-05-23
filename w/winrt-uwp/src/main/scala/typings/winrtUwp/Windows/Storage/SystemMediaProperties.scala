package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for Windows media file properties. */
trait SystemMediaProperties extends js.Object {
  /** Gets the name of the System.Media.Duration property (one of the Windows media file properties). */
  var duration: String
  /** Gets the name of the System.Media.Producer property (one of the Windows media file properties). */
  var producer: String
  /** Gets the name of the System.Media.Publisher property (one of the Windows media file properties). */
  var publisher: String
  /** Gets the name of the System.Media.SubTitle property (one of the Windows media file properties). */
  var subTitle: String
  /** Gets the name of the System.Media.Writer property (one of the Windows media file properties). */
  var writer: String
  /** Gets the name of the System.Media.Year property (one of the Windows media file properties). */
  var year: String
}

object SystemMediaProperties {
  @scala.inline
  def apply(
    duration: String,
    producer: String,
    publisher: String,
    subTitle: String,
    writer: String,
    year: String
  ): SystemMediaProperties = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], producer = producer.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaProperties]
  }
}

