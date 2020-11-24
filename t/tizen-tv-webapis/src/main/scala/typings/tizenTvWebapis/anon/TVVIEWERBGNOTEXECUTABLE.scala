package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TVVIEWERBGNOTEXECUTABLE extends js.Object {
  
  /**
    * Background execution is supported
    */
  var TV_VIEWER_BG_EXECUTABLE: `1` = js.native
  
  /**
    * Background execution is not supported
    */
  var TV_VIEWER_BG_NOT_EXECUTABLE: `0` = js.native
}
object TVVIEWERBGNOTEXECUTABLE {
  
  @scala.inline
  def apply(TV_VIEWER_BG_EXECUTABLE: `1`, TV_VIEWER_BG_NOT_EXECUTABLE: `0`): TVVIEWERBGNOTEXECUTABLE = {
    val __obj = js.Dynamic.literal(TV_VIEWER_BG_EXECUTABLE = TV_VIEWER_BG_EXECUTABLE.asInstanceOf[js.Any], TV_VIEWER_BG_NOT_EXECUTABLE = TV_VIEWER_BG_NOT_EXECUTABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[TVVIEWERBGNOTEXECUTABLE]
  }
  
  @scala.inline
  implicit class TVVIEWERBGNOTEXECUTABLEOps[Self <: TVVIEWERBGNOTEXECUTABLE] (val x: Self) extends AnyVal {
    
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
    def setTV_VIEWER_BG_EXECUTABLE(value: `1`): Self = this.set("TV_VIEWER_BG_EXECUTABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTV_VIEWER_BG_NOT_EXECUTABLE(value: `0`): Self = this.set("TV_VIEWER_BG_NOT_EXECUTABLE", value.asInstanceOf[js.Any])
  }
}
