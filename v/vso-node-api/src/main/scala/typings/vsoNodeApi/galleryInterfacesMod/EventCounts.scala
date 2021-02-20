package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventCounts extends StObject {
  
  /**
    * Average rating on the day for extension
    */
  var averageRating: Double = js.native
  
  /**
    * Number of times the extension was bought in hosted scenario (applies only to VSTS extensions)
    */
  var buyCount: Double = js.native
  
  /**
    * Number of times the extension was bought in connected scenario (applies only to VSTS extensions)
    */
  var connectedBuyCount: Double = js.native
  
  /**
    * Number of times the extension was installed in connected scenario (applies only to VSTS extensions)
    */
  var connectedInstallCount: Double = js.native
  
  /**
    * Number of times the extension was installed
    */
  var installCount: Double = js.native
  
  /**
    * Number of times the extension was installed as a trial (applies only to VSTS extensions)
    */
  var tryCount: Double = js.native
  
  /**
    * Number of times the extension was uninstalled (applies only to VSTS extensions)
    */
  var uninstallCount: Double = js.native
  
  /**
    * Number of times the extension was downloaded (applies to VSTS extensions and VSCode marketplace click installs)
    */
  var webDownloadCount: Double = js.native
  
  /**
    * Number of detail page views
    */
  var webPageViews: Double = js.native
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
    val __obj = js.Dynamic.literal(averageRating = averageRating.asInstanceOf[js.Any], buyCount = buyCount.asInstanceOf[js.Any], connectedBuyCount = connectedBuyCount.asInstanceOf[js.Any], connectedInstallCount = connectedInstallCount.asInstanceOf[js.Any], installCount = installCount.asInstanceOf[js.Any], tryCount = tryCount.asInstanceOf[js.Any], uninstallCount = uninstallCount.asInstanceOf[js.Any], webDownloadCount = webDownloadCount.asInstanceOf[js.Any], webPageViews = webPageViews.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCounts]
  }
  
  @scala.inline
  implicit class EventCountsMutableBuilder[Self <: EventCounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverageRating(value: Double): Self = StObject.set(x, "averageRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyCount(value: Double): Self = StObject.set(x, "buyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedBuyCount(value: Double): Self = StObject.set(x, "connectedBuyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedInstallCount(value: Double): Self = StObject.set(x, "connectedInstallCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallCount(value: Double): Self = StObject.set(x, "installCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryCount(value: Double): Self = StObject.set(x, "tryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninstallCount(value: Double): Self = StObject.set(x, "uninstallCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebDownloadCount(value: Double): Self = StObject.set(x, "webDownloadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPageViews(value: Double): Self = StObject.set(x, "webPageViews", value.asInstanceOf[js.Any])
  }
}
