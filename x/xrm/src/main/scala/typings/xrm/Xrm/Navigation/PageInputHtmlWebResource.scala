package typings.xrm.Xrm.Navigation

import typings.xrm.xrmStrings.webresource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInputHtmlWebResource extends js.Object {
  /**
    * The data to pass to the web resource.
    * */
  var data: js.UndefOr[String] = js.undefined
  var pageType: webresource
  /**
    * The name of the web resource to load.
    * */
  var webresourceName: String
}

object PageInputHtmlWebResource {
  @scala.inline
  def apply(pageType: webresource, webresourceName: String, data: String = null): PageInputHtmlWebResource = {
    val __obj = js.Dynamic.literal(pageType = pageType.asInstanceOf[js.Any], webresourceName = webresourceName.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInputHtmlWebResource]
  }
}

