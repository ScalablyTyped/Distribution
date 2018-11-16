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

