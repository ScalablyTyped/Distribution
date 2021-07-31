package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SITYPEDEVELOPINGSERVER extends StObject {
  
  /**
    * Developing server
    * @since 2.3
    */
  var SI_TYPE_DEVELOPING_SERVER: `2`
  
  /**
    * Development server
    * @since 2.3
    */
  var SI_TYPE_DEVELOPMENT_SERVER: `1`
  
  /**
    * Operating server
    * @since 2.3
    */
  var SI_TYPE_OPERATIING_SERVER: `0`
}
object SITYPEDEVELOPINGSERVER {
  
  @scala.inline
  def apply(): SITYPEDEVELOPINGSERVER = {
    val __obj = js.Dynamic.literal(SI_TYPE_DEVELOPING_SERVER = 2, SI_TYPE_DEVELOPMENT_SERVER = 1, SI_TYPE_OPERATIING_SERVER = 0)
    __obj.asInstanceOf[SITYPEDEVELOPINGSERVER]
  }
  
  @scala.inline
  implicit class SITYPEDEVELOPINGSERVERMutableBuilder[Self <: SITYPEDEVELOPINGSERVER] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSI_TYPE_DEVELOPING_SERVER(value: `2`): Self = StObject.set(x, "SI_TYPE_DEVELOPING_SERVER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSI_TYPE_DEVELOPMENT_SERVER(value: `1`): Self = StObject.set(x, "SI_TYPE_DEVELOPMENT_SERVER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSI_TYPE_OPERATIING_SERVER(value: `0`): Self = StObject.set(x, "SI_TYPE_OPERATIING_SERVER", value.asInstanceOf[js.Any])
  }
}
