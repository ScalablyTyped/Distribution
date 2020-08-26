package typings.winrtUwp.Windows.Media.PlayTo

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media element to connect to a Play To target. */
@js.native
trait PlayToSource extends js.Object {
  /** Gets the connection to the Play To target. */
  var connection: PlayToConnection = js.native
  /** Gets or sets the next Play To source element. */
  var next: PlayToSource = js.native
  /** Specifies a preferred Uniform Resource Identifier (URI) for the media stream, such as a cloud based media server, used is used for Play To by reference. */
  var preferredSourceUri: Uri = js.native
  /** Connects the next Play To source element to the Play To target. */
  def playNext(): Unit = js.native
}

object PlayToSource {
  @scala.inline
  def apply(connection: PlayToConnection, next: PlayToSource, playNext: () => Unit, preferredSourceUri: Uri): PlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], playNext = js.Any.fromFunction0(playNext), preferredSourceUri = preferredSourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToSource]
  }
  @scala.inline
  implicit class PlayToSourceOps[Self <: PlayToSource] (val x: Self) extends AnyVal {
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
    def setConnection(value: PlayToConnection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: PlayToSource): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayNext(value: () => Unit): Self = this.set("playNext", js.Any.fromFunction0(value))
    @scala.inline
    def setPreferredSourceUri(value: Uri): Self = this.set("preferredSourceUri", value.asInstanceOf[js.Any])
  }
  
}

