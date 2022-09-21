package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "ApplicationControl")
@js.native
open class ApplicationControl protected () extends StObject {
  def this(
    operation: String,
    uri: js.UndefOr[String | Null],
    mime: js.UndefOr[String | Null],
    category: js.UndefOr[String | Null],
    data: js.UndefOr[js.Array[ApplicationControlData] | Null],
    launchMode: js.UndefOr[ApplicationControlLaunchMode | Null]
  ) = this()
  
  /**
    * An attribute to store the category of the application to be launched.
    */
  var category: String | Null = js.native
  
  /**
    * An array of attributes to store the data needed for an application control.
    */
  var data: js.Array[ApplicationControlData] = js.native
  
  /**
    * An attribute to specify launch mode. Default application launch mode is _SINGLE_.
    *
    * @since 2.4
    */
  var launchMode: ApplicationControlLaunchMode = js.native
  
  /**
    * An attribute to store the MIME type of content.
    */
  var mime: String | Null = js.native
  
  /**
    * An attribute to store the string that defines the action to be
    * performed by an application control.
    */
  var operation: String = js.native
  
  /**
    * An attribute to store the URI needed by an application control.
    */
  var uri: String | Null = js.native
}
