package typings.tizenCommonWeb.applicationMod

import typings.tizenCommonWeb.tizenCommonWebStrings.GROUP
import typings.tizenCommonWeb.tizenCommonWebStrings.SINGLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web/application", "ApplicationControl")
@js.native
class ApplicationControl protected () extends StObject {
  def this(
    operation: String,
    uri: js.UndefOr[String],
    mime: js.UndefOr[String],
    category: js.UndefOr[String],
    data: js.UndefOr[js.Array[ApplicationControlData]],
    launchMode: js.UndefOr[ApplicationControlLaunchMode | SINGLE | GROUP]
  ) = this()
  
  /**
    * An attribute to store the category of the application to be launched.
    */
  var category: js.UndefOr[String] = js.native
  
  /**
    * An array of attributes to store the data needed for an application control.
    */
  var data: js.Array[ApplicationControlData] = js.native
  
  /**
    * An attribute to specify launch mode. Default application launch mode is `SINGLE`.
    *
    * @since 2.4
    */
  var launchMode: ApplicationControlLaunchMode = js.native
  
  /**
    * An attribute to store the MIME type of content.
    */
  var mime: js.UndefOr[String] = js.native
  
  /**
    * An attribute to store the string that defines the action to be
    * performed by an application control.
    */
  var operation: String = js.native
  
  /**
    * An attribute to store the URI needed by an application control.
    */
  var uri: js.UndefOr[String] = js.native
}
