package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventCounts extends js.Object {
  
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
  implicit class EventCountsOps[Self <: EventCounts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAverageRating(value: Double): Self = this.set("averageRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyCount(value: Double): Self = this.set("buyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedBuyCount(value: Double): Self = this.set("connectedBuyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedInstallCount(value: Double): Self = this.set("connectedInstallCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallCount(value: Double): Self = this.set("installCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryCount(value: Double): Self = this.set("tryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninstallCount(value: Double): Self = this.set("uninstallCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebDownloadCount(value: Double): Self = this.set("webDownloadCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPageViews(value: Double): Self = this.set("webPageViews", value.asInstanceOf[js.Any])
  }
}
