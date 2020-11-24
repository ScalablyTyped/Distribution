package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TVVIEWERBGEXECUTABLE extends js.Object {
  
  /**
    * Whether the application can be executed in the background
    */
  var TV_VIEWER_BG_EXECUTABLE: `0` = js.native
}
object TVVIEWERBGEXECUTABLE {
  
  @scala.inline
  def apply(TV_VIEWER_BG_EXECUTABLE: `0`): TVVIEWERBGEXECUTABLE = {
    val __obj = js.Dynamic.literal(TV_VIEWER_BG_EXECUTABLE = TV_VIEWER_BG_EXECUTABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TVVIEWERBGEXECUTABLE]
  }
  
  @scala.inline
  implicit class TVVIEWERBGEXECUTABLEOps[Self <: TVVIEWERBGEXECUTABLE] (val x: Self) extends AnyVal {
    
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
    def setTV_VIEWER_BG_EXECUTABLE(value: `0`): Self = this.set("TV_VIEWER_BG_EXECUTABLE", value.asInstanceOf[js.Any])
  }
}
