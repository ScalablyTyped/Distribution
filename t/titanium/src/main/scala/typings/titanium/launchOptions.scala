package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary describing the arguments passed to the application on startup.
  * Use the [getArguments](Titanium.App.getArguments) method to retrieve the launch options.
  */
@js.native
trait launchOptions extends StObject {
  
  /**
    * If set to `true`, this key indicates that the application was launched in response to an
    * incoming location event.
    */
  var launchOptionsLocationKey: js.UndefOr[Boolean] = js.native
  
  /**
    * This key indicates that the application was launched by another
    * application with the specified bundle ID.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * This key indicates that the application was launched in order to open
    * the specified URL.
    */
  var url: js.UndefOr[String] = js.native
}
object launchOptions {
  
  @scala.inline
  def apply(): launchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[launchOptions]
  }
  
  @scala.inline
  implicit class launchOptionsMutableBuilder[Self <: launchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchOptionsLocationKey(value: Boolean): Self = StObject.set(x, "launchOptionsLocationKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchOptionsLocationKeyUndefined: Self = StObject.set(x, "launchOptionsLocationKey", js.undefined)
    
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
