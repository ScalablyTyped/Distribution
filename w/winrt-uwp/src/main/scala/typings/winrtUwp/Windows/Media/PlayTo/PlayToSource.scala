package typings.winrtUwp.Windows.Media.PlayTo

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media element to connect to a Play To target. */
trait PlayToSource extends js.Object {
  /** Gets the connection to the Play To target. */
  var connection: PlayToConnection
  /** Gets or sets the next Play To source element. */
  var next: PlayToSource
  /** Specifies a preferred Uniform Resource Identifier (URI) for the media stream, such as a cloud based media server, used is used for Play To by reference. */
  var preferredSourceUri: Uri
  /** Connects the next Play To source element to the Play To target. */
  def playNext(): Unit
}

object PlayToSource {
  @scala.inline
  def apply(connection: PlayToConnection, next: PlayToSource, playNext: () => Unit, preferredSourceUri: Uri): PlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], playNext = js.Any.fromFunction0(playNext), preferredSourceUri = preferredSourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToSource]
  }
}

