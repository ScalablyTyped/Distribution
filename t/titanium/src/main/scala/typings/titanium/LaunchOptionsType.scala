package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary object of parameters used to identify an incoming URL that is handled
  * by the application.
  */
@js.native
trait LaunchOptionsType extends StObject {
  
  /**
    * The application or service that triggered the handled URL.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * The url that was triggered by the application or service.
    */
  var url: js.UndefOr[String] = js.native
}
object LaunchOptionsType {
  
  @scala.inline
  def apply(): LaunchOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptionsType]
  }
  
  @scala.inline
  implicit class LaunchOptionsTypeMutableBuilder[Self <: LaunchOptionsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
