package typings.videoJs.mod.videojs.Tech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Object containing a structure like: `{src: 'url', type: 'mimetype'}` or string
  * that just contains the src url alone.
  * `var SourceObject = {src: 'http://ex.com/video.mp4', type: 'video/mp4'};`
  * `var SourceString = 'http://example.com/some-video.mp4';`
  */
@js.native
trait SourceObject extends js.Object {
  
  /**
    * The url to the source
    */
  var src: String = js.native
  
  /**
    * The mime type of the source
    */
  var `type`: js.UndefOr[String] = js.native
}
object SourceObject {
  
  @scala.inline
  def apply(src: String): SourceObject = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceObject]
  }
  
  @scala.inline
  implicit class SourceObjectOps[Self <: SourceObject] (val x: Self) extends AnyVal {
    
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
