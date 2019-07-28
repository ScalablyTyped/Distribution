package typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media element to connect to a Play To target. */
@JSGlobal("Windows.Media.PlayTo.PlayToSource")
@js.native
abstract class PlayToSource () extends js.Object {
  /** Gets the connection to the Play To target. */
  var connection: PlayToConnection = js.native
  /** Gets or sets the next Play To source element. */
  var next: PlayToSource = js.native
  /** Specifies a preferred Uniform Resource Identifier (URI) for the media stream, such as a cloud based media server, used is used for Play To by reference. */
  var preferredSourceUri: Uri = js.native
  /** Connects the next Play To source element to the Play To target. */
  def playNext(): Unit = js.native
}

