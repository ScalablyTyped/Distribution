package typings.wordpressCustomizeBrowser.controlConstructorMod

import org.scalablytyped.runtime.Instantiable0
import typings.wordpressCustomizeBrowser.backgroundControlMod.BackgroundControl
import typings.wordpressCustomizeBrowser.backgroundPositionControlMod.BackgroundPositionControl
import typings.wordpressCustomizeBrowser.codeEditorControlMod.CodeEditorControl
import typings.wordpressCustomizeBrowser.colorControlMod.ColorControl
import typings.wordpressCustomizeBrowser.croppedImageControlMod.CroppedImageControl
import typings.wordpressCustomizeBrowser.dateTimeControlMod.DateTimeControl
import typings.wordpressCustomizeBrowser.headerControlMod.HeaderControl
import typings.wordpressCustomizeBrowser.imageControlMod.ImageControl
import typings.wordpressCustomizeBrowser.mediaControlMod.MediaControl
import typings.wordpressCustomizeBrowser.siteIconControlMod.SiteIconControl
import typings.wordpressCustomizeBrowser.themeControlMod.ThemeControl
import typings.wordpressCustomizeBrowser.uploadControlMod.UploadControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlConstructor extends js.Object {
  
  var background: Instantiable0[BackgroundControl] = js.native
  
  var background_position: Instantiable0[BackgroundPositionControl] = js.native
  
  var code_editor: Instantiable0[CodeEditorControl] = js.native
  
  var color: Instantiable0[ColorControl] = js.native
  
  var cropped_image: Instantiable0[CroppedImageControl] = js.native
  
  var date_time: Instantiable0[DateTimeControl] = js.native
  
  var header: Instantiable0[HeaderControl] = js.native
  
  var image: Instantiable0[ImageControl] = js.native
  
  var media: Instantiable0[MediaControl] = js.native
  
  var site_icon: Instantiable0[SiteIconControl] = js.native
  
  var theme: Instantiable0[ThemeControl] = js.native
  
  var upload: Instantiable0[UploadControl] = js.native
}
object ControlConstructor {
  
  @scala.inline
  def apply(
    background: Instantiable0[BackgroundControl],
    background_position: Instantiable0[BackgroundPositionControl],
    code_editor: Instantiable0[CodeEditorControl],
    color: Instantiable0[ColorControl],
    cropped_image: Instantiable0[CroppedImageControl],
    date_time: Instantiable0[DateTimeControl],
    header: Instantiable0[HeaderControl],
    image: Instantiable0[ImageControl],
    media: Instantiable0[MediaControl],
    site_icon: Instantiable0[SiteIconControl],
    theme: Instantiable0[ThemeControl],
    upload: Instantiable0[UploadControl]
  ): ControlConstructor = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], background_position = background_position.asInstanceOf[js.Any], code_editor = code_editor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], cropped_image = cropped_image.asInstanceOf[js.Any], date_time = date_time.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], site_icon = site_icon.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlConstructor]
  }
  
  @scala.inline
  implicit class ControlConstructorOps[Self <: ControlConstructor] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: Instantiable0[BackgroundControl]): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground_position(value: Instantiable0[BackgroundPositionControl]): Self = this.set("background_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode_editor(value: Instantiable0[CodeEditorControl]): Self = this.set("code_editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Instantiable0[ColorControl]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropped_image(value: Instantiable0[CroppedImageControl]): Self = this.set("cropped_image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate_time(value: Instantiable0[DateTimeControl]): Self = this.set("date_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: Instantiable0[HeaderControl]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: Instantiable0[ImageControl]): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: Instantiable0[MediaControl]): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSite_icon(value: Instantiable0[SiteIconControl]): Self = this.set("site_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: Instantiable0[ThemeControl]): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: Instantiable0[UploadControl]): Self = this.set("upload", value.asInstanceOf[js.Any])
  }
}
