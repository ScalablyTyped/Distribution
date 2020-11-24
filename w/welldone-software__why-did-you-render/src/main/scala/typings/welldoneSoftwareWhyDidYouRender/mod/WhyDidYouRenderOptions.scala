package typings.welldoneSoftwareWhyDidYouRender.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhyDidYouRenderOptions extends js.Object {
  
  var collapseGroups: js.UndefOr[Boolean] = js.native
  
  var customName: js.UndefOr[String] = js.native
  
  var diffNameColor: js.UndefOr[String] = js.native
  
  var diffPathColor: js.UndefOr[String] = js.native
  
  var exclude: js.UndefOr[js.Array[RegExp]] = js.native
  
  var hotReloadBufferMs: js.UndefOr[Double] = js.native
  
  var include: js.UndefOr[js.Array[RegExp]] = js.native
  
  var logOnDifferentValues: js.UndefOr[Boolean] = js.native
  
  var logOwnerReasons: js.UndefOr[Boolean] = js.native
  
  var notifier: js.UndefOr[Notifier] = js.native
  
  var onlyLogs: js.UndefOr[Boolean] = js.native
  
  var titleColor: js.UndefOr[String] = js.native
  
  var trackAllPureComponents: js.UndefOr[Boolean] = js.native
  
  var trackExtraHooks: js.UndefOr[js.Array[ExtraHookToTrack]] = js.native
  
  var trackHooks: js.UndefOr[Boolean] = js.native
}
object WhyDidYouRenderOptions {
  
  @scala.inline
  def apply(): WhyDidYouRenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WhyDidYouRenderOptions]
  }
  
  @scala.inline
  implicit class WhyDidYouRenderOptionsOps[Self <: WhyDidYouRenderOptions] (val x: Self) extends AnyVal {
    
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
    def setCollapseGroups(value: Boolean): Self = this.set("collapseGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseGroups: Self = this.set("collapseGroups", js.undefined)
    
    @scala.inline
    def setCustomName(value: String): Self = this.set("customName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomName: Self = this.set("customName", js.undefined)
    
    @scala.inline
    def setDiffNameColor(value: String): Self = this.set("diffNameColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffNameColor: Self = this.set("diffNameColor", js.undefined)
    
    @scala.inline
    def setDiffPathColor(value: String): Self = this.set("diffPathColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiffPathColor: Self = this.set("diffPathColor", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: RegExp*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[RegExp]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setHotReloadBufferMs(value: Double): Self = this.set("hotReloadBufferMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotReloadBufferMs: Self = this.set("hotReloadBufferMs", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: RegExp*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[RegExp]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setLogOnDifferentValues(value: Boolean): Self = this.set("logOnDifferentValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogOnDifferentValues: Self = this.set("logOnDifferentValues", js.undefined)
    
    @scala.inline
    def setLogOwnerReasons(value: Boolean): Self = this.set("logOwnerReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogOwnerReasons: Self = this.set("logOwnerReasons", js.undefined)
    
    @scala.inline
    def setNotifier(value: /* options */ UpdateInfo => Unit): Self = this.set("notifier", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifier: Self = this.set("notifier", js.undefined)
    
    @scala.inline
    def setOnlyLogs(value: Boolean): Self = this.set("onlyLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyLogs: Self = this.set("onlyLogs", js.undefined)
    
    @scala.inline
    def setTitleColor(value: String): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
    
    @scala.inline
    def setTrackAllPureComponents(value: Boolean): Self = this.set("trackAllPureComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackAllPureComponents: Self = this.set("trackAllPureComponents", js.undefined)
    
    @scala.inline
    def setTrackExtraHooksVarargs(value: ExtraHookToTrack*): Self = this.set("trackExtraHooks", js.Array(value :_*))
    
    @scala.inline
    def setTrackExtraHooks(value: js.Array[ExtraHookToTrack]): Self = this.set("trackExtraHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackExtraHooks: Self = this.set("trackExtraHooks", js.undefined)
    
    @scala.inline
    def setTrackHooks(value: Boolean): Self = this.set("trackHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackHooks: Self = this.set("trackHooks", js.undefined)
  }
}
