package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCounts extends js.Object {
  /**
    * Average rating on the day for extension
    */
  var averageRating: scala.Double
  /**
    * Number of times the extension was bought in hosted scenario (applies only to VSTS extensions)
    */
  var buyCount: scala.Double
  /**
    * Number of times the extension was bought in connected scenario (applies only to VSTS extensions)
    */
  var connectedBuyCount: scala.Double
  /**
    * Number of times the extension was installed in connected scenario (applies only to VSTS extensions)
    */
  var connectedInstallCount: scala.Double
  /**
    * Number of times the extension was installed
    */
  var installCount: scala.Double
  /**
    * Number of times the extension was installed as a trial (applies only to VSTS extensions)
    */
  var tryCount: scala.Double
  /**
    * Number of times the extension was uninstalled (applies only to VSTS extensions)
    */
  var uninstallCount: scala.Double
  /**
    * Number of times the extension was downloaded (applies to VSTS extensions and VSCode marketplace click installs)
    */
  var webDownloadCount: scala.Double
  /**
    * Number of detail page views
    */
  var webPageViews: scala.Double
}

object EventCounts {
  @scala.inline
  def apply(
    averageRating: scala.Double,
    buyCount: scala.Double,
    connectedBuyCount: scala.Double,
    connectedInstallCount: scala.Double,
    installCount: scala.Double,
    tryCount: scala.Double,
    uninstallCount: scala.Double,
    webDownloadCount: scala.Double,
    webPageViews: scala.Double
  ): EventCounts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("averageRating")(averageRating)
    __obj.updateDynamic("buyCount")(buyCount)
    __obj.updateDynamic("connectedBuyCount")(connectedBuyCount)
    __obj.updateDynamic("connectedInstallCount")(connectedInstallCount)
    __obj.updateDynamic("installCount")(installCount)
    __obj.updateDynamic("tryCount")(tryCount)
    __obj.updateDynamic("uninstallCount")(uninstallCount)
    __obj.updateDynamic("webDownloadCount")(webDownloadCount)
    __obj.updateDynamic("webPageViews")(webPageViews)
    __obj.asInstanceOf[EventCounts]
  }
}

