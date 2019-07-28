package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCounts extends js.Object {
  /**
    * Average rating on the day for extension
    */
  var averageRating: Double
  /**
    * Number of times the extension was bought in hosted scenario (applies only to VSTS extensions)
    */
  var buyCount: Double
  /**
    * Number of times the extension was bought in connected scenario (applies only to VSTS extensions)
    */
  var connectedBuyCount: Double
  /**
    * Number of times the extension was installed in connected scenario (applies only to VSTS extensions)
    */
  var connectedInstallCount: Double
  /**
    * Number of times the extension was installed
    */
  var installCount: Double
  /**
    * Number of times the extension was installed as a trial (applies only to VSTS extensions)
    */
  var tryCount: Double
  /**
    * Number of times the extension was uninstalled (applies only to VSTS extensions)
    */
  var uninstallCount: Double
  /**
    * Number of times the extension was downloaded (applies to VSTS extensions and VSCode marketplace click installs)
    */
  var webDownloadCount: Double
  /**
    * Number of detail page views
    */
  var webPageViews: Double
}

object EventCounts {
  @scala.inline
  def apply(
    averageRating: Double,
    buyCount: Double,
    connectedBuyCount: Double,
    connectedInstallCount: Double,
    installCount: Double,
    tryCount: Double,
    uninstallCount: Double,
    webDownloadCount: Double,
    webPageViews: Double
  ): EventCounts = {
    val __obj = js.Dynamic.literal(averageRating = averageRating, buyCount = buyCount, connectedBuyCount = connectedBuyCount, connectedInstallCount = connectedInstallCount, installCount = installCount, tryCount = tryCount, uninstallCount = uninstallCount, webDownloadCount = webDownloadCount, webPageViews = webPageViews)
  
    __obj.asInstanceOf[EventCounts]
  }
}

