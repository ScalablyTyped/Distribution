package typings.tizenCommonWeb.mod

import typings.tizenCommonWeb.applicationMod.ApplicationControlConstructor
import typings.tizenCommonWeb.applicationMod.ApplicationControlDataConstructor
import typings.tizenCommonWeb.applicationMod.ApplicationManager
import typings.tizenCommonWeb.downloadMod.DownloadManager
import typings.tizenCommonWeb.downloadMod.DownloadRequestConstructor
import typings.tizenCommonWeb.filesystemMod.FilesystemManager
import typings.tizenCommonWeb.packageMod.PackageManager
import typings.tizenCommonWeb.systeminfoMod.SystemInfoManager
import typings.tizenCommonWeb.tizenMod.AttributeFilterConstructor
import typings.tizenCommonWeb.tizenMod.AttributeRangeFilterConstructor
import typings.tizenCommonWeb.tizenMod.BundleConstructor
import typings.tizenCommonWeb.tizenMod.CompositeFilterConstructor
import typings.tizenCommonWeb.tizenMod.SimpleCoordinatesConstructor
import typings.tizenCommonWeb.tizenMod.SortModeConstructor
import typings.tizenCommonWeb.tvaudiocontrolMod.TVAudioControlManager
import typings.tizenCommonWeb.tvdisplaycontrolMod.TVDisplayControlManager
import typings.tizenCommonWeb.tvinfoMod.TVInfoManager
import typings.tizenCommonWeb.tvinputdeviceMod.TVInputDeviceManager
import typings.tizenCommonWeb.tvwindowMod.TVWindowManager
import typings.tizenCommonWeb.websettingMod.WebSettingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tizen extends js.Object {
  var ApplicationControl: ApplicationControlConstructor = js.native
  var ApplicationControlData: ApplicationControlDataConstructor = js.native
  var AttributeFilter: AttributeFilterConstructor = js.native
  var AttributeRangeFilter: AttributeRangeFilterConstructor = js.native
  var Bundle: BundleConstructor = js.native
  var CompositeFilter: CompositeFilterConstructor = js.native
  var DownloadRequest: DownloadRequestConstructor = js.native
  var SimpleCoordinates: SimpleCoordinatesConstructor = js.native
  var SortMode: SortModeConstructor = js.native
  @JSName("package")
  var _package: PackageManager = js.native
  var application: ApplicationManager = js.native
  var download: DownloadManager = js.native
  var filesystem: FilesystemManager = js.native
  var systeminfo: SystemInfoManager = js.native
  var tvaudiocontrol: TVAudioControlManager = js.native
  var tvdisplaycontrol: TVDisplayControlManager = js.native
  var tvinfo: TVInfoManager = js.native
  var tvinputdevice: TVInputDeviceManager = js.native
  var tvwindow: TVWindowManager = js.native
  var websetting: WebSettingManager = js.native
}

object Tizen {
  @scala.inline
  def apply(
    ApplicationControl: ApplicationControlConstructor,
    ApplicationControlData: ApplicationControlDataConstructor,
    AttributeFilter: AttributeFilterConstructor,
    AttributeRangeFilter: AttributeRangeFilterConstructor,
    Bundle: BundleConstructor,
    CompositeFilter: CompositeFilterConstructor,
    DownloadRequest: DownloadRequestConstructor,
    SimpleCoordinates: SimpleCoordinatesConstructor,
    SortMode: SortModeConstructor,
    _package: PackageManager,
    application: ApplicationManager,
    download: DownloadManager,
    filesystem: FilesystemManager,
    systeminfo: SystemInfoManager,
    tvaudiocontrol: TVAudioControlManager,
    tvdisplaycontrol: TVDisplayControlManager,
    tvinfo: TVInfoManager,
    tvinputdevice: TVInputDeviceManager,
    tvwindow: TVWindowManager,
    websetting: WebSettingManager
  ): Tizen = {
    val __obj = js.Dynamic.literal(ApplicationControl = ApplicationControl.asInstanceOf[js.Any], ApplicationControlData = ApplicationControlData.asInstanceOf[js.Any], AttributeFilter = AttributeFilter.asInstanceOf[js.Any], AttributeRangeFilter = AttributeRangeFilter.asInstanceOf[js.Any], Bundle = Bundle.asInstanceOf[js.Any], CompositeFilter = CompositeFilter.asInstanceOf[js.Any], DownloadRequest = DownloadRequest.asInstanceOf[js.Any], SimpleCoordinates = SimpleCoordinates.asInstanceOf[js.Any], SortMode = SortMode.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], filesystem = filesystem.asInstanceOf[js.Any], systeminfo = systeminfo.asInstanceOf[js.Any], tvaudiocontrol = tvaudiocontrol.asInstanceOf[js.Any], tvdisplaycontrol = tvdisplaycontrol.asInstanceOf[js.Any], tvinfo = tvinfo.asInstanceOf[js.Any], tvinputdevice = tvinputdevice.asInstanceOf[js.Any], tvwindow = tvwindow.asInstanceOf[js.Any], websetting = websetting.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tizen]
  }
  @scala.inline
  implicit class TizenOps[Self <: Tizen] (val x: Self) extends AnyVal {
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
    def setApplicationControl(value: ApplicationControlConstructor): Self = this.set("ApplicationControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationControlData(value: ApplicationControlDataConstructor): Self = this.set("ApplicationControlData", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeFilter(value: AttributeFilterConstructor): Self = this.set("AttributeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributeRangeFilter(value: AttributeRangeFilterConstructor): Self = this.set("AttributeRangeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setBundle(value: BundleConstructor): Self = this.set("Bundle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompositeFilter(value: CompositeFilterConstructor): Self = this.set("CompositeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadRequest(value: DownloadRequestConstructor): Self = this.set("DownloadRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSimpleCoordinates(value: SimpleCoordinatesConstructor): Self = this.set("SimpleCoordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortMode(value: SortModeConstructor): Self = this.set("SortMode", value.asInstanceOf[js.Any])
    @scala.inline
    def set_package(value: PackageManager): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: ApplicationManager): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownload(value: DownloadManager): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesystem(value: FilesystemManager): Self = this.set("filesystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSysteminfo(value: SystemInfoManager): Self = this.set("systeminfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setTvaudiocontrol(value: TVAudioControlManager): Self = this.set("tvaudiocontrol", value.asInstanceOf[js.Any])
    @scala.inline
    def setTvdisplaycontrol(value: TVDisplayControlManager): Self = this.set("tvdisplaycontrol", value.asInstanceOf[js.Any])
    @scala.inline
    def setTvinfo(value: TVInfoManager): Self = this.set("tvinfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setTvinputdevice(value: TVInputDeviceManager): Self = this.set("tvinputdevice", value.asInstanceOf[js.Any])
    @scala.inline
    def setTvwindow(value: TVWindowManager): Self = this.set("tvwindow", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebsetting(value: WebSettingManager): Self = this.set("websetting", value.asInstanceOf[js.Any])
  }
  
}

