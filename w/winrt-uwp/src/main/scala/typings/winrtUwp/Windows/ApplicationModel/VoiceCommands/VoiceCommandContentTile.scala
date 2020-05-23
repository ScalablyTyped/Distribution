package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An asset, containing image, text, and link data, provided by the background app service for display on the Cortana canvas. */
trait VoiceCommandContentTile extends js.Object {
  /** Gets or sets supplementary information the background app service can associate with the content tile. This information is not used by Cortana. */
  var appContext: js.Any
  /** Gets or sets a string as a launch parameter that can be associated with the response by the background app service. */
  var appLaunchArgument: String
  /** Gets or sets the layout template used to display the content tile on the Cortana canvas. */
  var contentTileType: VoiceCommandContentTileType
  /** Gets or sets an image the background app service can associate with the content tile. */
  var image: IStorageFile
  /** Gets or sets the first line of text the background app service can associate with the content tile. */
  var textLine1: String
  /** Gets or sets the second line of text the background app service can associate with the content tile. */
  var textLine2: String
  /** Gets or sets the third line of text the background app service can associate with the content tile. */
  var textLine3: String
  /** Gets or sets the title the background app service can associate with the content tile. */
  var title: String
}

object VoiceCommandContentTile {
  @scala.inline
  def apply(
    appContext: js.Any,
    appLaunchArgument: String,
    contentTileType: VoiceCommandContentTileType,
    image: IStorageFile,
    textLine1: String,
    textLine2: String,
    textLine3: String,
    title: String
  ): VoiceCommandContentTile = {
    val __obj = js.Dynamic.literal(appContext = appContext.asInstanceOf[js.Any], appLaunchArgument = appLaunchArgument.asInstanceOf[js.Any], contentTileType = contentTileType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], textLine1 = textLine1.asInstanceOf[js.Any], textLine2 = textLine2.asInstanceOf[js.Any], textLine3 = textLine3.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceCommandContentTile]
  }
}

