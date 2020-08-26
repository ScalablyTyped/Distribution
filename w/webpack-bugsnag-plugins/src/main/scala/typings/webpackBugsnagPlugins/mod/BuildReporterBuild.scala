package typings.webpackBugsnagPlugins.mod

import typings.webpackBugsnagPlugins.anon.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildReporterBuild extends js.Object {
  /**
    * Your Bugsnag API key
    */
  var apiKey: String = js.native
  /**
    * The version of the application you are building (this should match the
    * `appVersion` configured in your notifier)
    */
  var appVersion: String = js.native
  /**
    * Automatically associate this build with any new error events and sessions
    * that are received for the releaseStage until a subsequent build
    * notification is received. If this is set to true and no `releaseStage`
    * is provided the build will be applied to 'production'. You should only use
    * this option if you aren’t able to set an `appVersion` in your notifier.
    */
  var autoAssignRelease: js.UndefOr[Boolean] = js.native
  /**
    * The name of the person/machine that created this build (defaults to the
    * result of the `whoami` command)
    */
  var builderName: js.UndefOr[String] = js.native
  /**
    * 'production', 'staging' etc. (leave blank if this build can be released to
    * different releaseStages)
    */
  var releaseStage: js.UndefOr[String] = js.native
  /**
    * An object describing the source control of the build (if not specified,
    * the module will attempt to detect source control information from .git, .
    * hg and the nearest package.json)
    */
  var sourceControl: js.UndefOr[Provider] = js.native
}

object BuildReporterBuild {
  @scala.inline
  def apply(apiKey: String, appVersion: String): BuildReporterBuild = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildReporterBuild]
  }
  @scala.inline
  implicit class BuildReporterBuildOps[Self <: BuildReporterBuild] (val x: Self) extends AnyVal {
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppVersion(value: String): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoAssignRelease(value: Boolean): Self = this.set("autoAssignRelease", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAssignRelease: Self = this.set("autoAssignRelease", js.undefined)
    @scala.inline
    def setBuilderName(value: String): Self = this.set("builderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuilderName: Self = this.set("builderName", js.undefined)
    @scala.inline
    def setReleaseStage(value: String): Self = this.set("releaseStage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseStage: Self = this.set("releaseStage", js.undefined)
    @scala.inline
    def setSourceControl(value: Provider): Self = this.set("sourceControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceControl: Self = this.set("sourceControl", js.undefined)
  }
  
}

