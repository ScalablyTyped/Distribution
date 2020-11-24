package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SITYPEDEVELOPINGSERVER extends js.Object {
  
  /**
    * Developing server
    * @since 2.3
    */
  var SI_TYPE_DEVELOPING_SERVER: `2` = js.native
  
  /**
    * Development server
    * @since 2.3
    */
  var SI_TYPE_DEVELOPMENT_SERVER: `1` = js.native
  
  /**
    * Operating server
    * @since 2.3
    */
  var SI_TYPE_OPERATIING_SERVER: `0` = js.native
}
object SITYPEDEVELOPINGSERVER {
  
  @scala.inline
  def apply(SI_TYPE_DEVELOPING_SERVER: `2`, SI_TYPE_DEVELOPMENT_SERVER: `1`, SI_TYPE_OPERATIING_SERVER: `0`): SITYPEDEVELOPINGSERVER = {
    val __obj = js.Dynamic.literal(SI_TYPE_DEVELOPING_SERVER = SI_TYPE_DEVELOPING_SERVER.asInstanceOf[js.Any], SI_TYPE_DEVELOPMENT_SERVER = SI_TYPE_DEVELOPMENT_SERVER.asInstanceOf[js.Any], SI_TYPE_OPERATIING_SERVER = SI_TYPE_OPERATIING_SERVER.asInstanceOf[js.Any])
    __obj.asInstanceOf[SITYPEDEVELOPINGSERVER]
  }
  
  @scala.inline
  implicit class SITYPEDEVELOPINGSERVEROps[Self <: SITYPEDEVELOPINGSERVER] (val x: Self) extends AnyVal {
    
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
    def setSI_TYPE_DEVELOPING_SERVER(value: `2`): Self = this.set("SI_TYPE_DEVELOPING_SERVER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSI_TYPE_DEVELOPMENT_SERVER(value: `1`): Self = this.set("SI_TYPE_DEVELOPMENT_SERVER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSI_TYPE_OPERATIING_SERVER(value: `0`): Self = this.set("SI_TYPE_OPERATIING_SERVER", value.asInstanceOf[js.Any])
  }
}
