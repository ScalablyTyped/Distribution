package typings.winrtUwp.Windows.ApplicationModel.VoiceCommands

import typings.winrtUwp.Windows.Storage.IStorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An asset, containing image, text, and link data, provided by the background app service for display on the Cortana canvas. */
trait VoiceCommandContentTile extends StObject {
  
  /** Gets or sets supplementary information the background app service can associate with the content tile. This information is not used by Cortana. */
  var appContext: Any
  
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
  
  inline def apply(
    appContext: Any,
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceCommandContentTile] (val x: Self) extends AnyVal {
    
    inline def setAppContext(value: Any): Self = StObject.set(x, "appContext", value.asInstanceOf[js.Any])
    
    inline def setAppLaunchArgument(value: String): Self = StObject.set(x, "appLaunchArgument", value.asInstanceOf[js.Any])
    
    inline def setContentTileType(value: VoiceCommandContentTileType): Self = StObject.set(x, "contentTileType", value.asInstanceOf[js.Any])
    
    inline def setImage(value: IStorageFile): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setTextLine1(value: String): Self = StObject.set(x, "textLine1", value.asInstanceOf[js.Any])
    
    inline def setTextLine2(value: String): Self = StObject.set(x, "textLine2", value.asInstanceOf[js.Any])
    
    inline def setTextLine3(value: String): Self = StObject.set(x, "textLine3", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
