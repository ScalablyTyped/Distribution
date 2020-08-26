package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildSettings extends js.Object {
  /**
    * The number of days to keep records of deleted builds.
    */
  var daysToKeepDeletedBuildsBeforeDestroy: Double = js.native
  /**
    * The default retention policy.
    */
  var defaultRetentionPolicy: RetentionPolicy = js.native
  /**
    * The maximum retention policy.
    */
  var maximumRetentionPolicy: RetentionPolicy = js.native
}

object BuildSettings {
  @scala.inline
  def apply(
    daysToKeepDeletedBuildsBeforeDestroy: Double,
    defaultRetentionPolicy: RetentionPolicy,
    maximumRetentionPolicy: RetentionPolicy
  ): BuildSettings = {
    val __obj = js.Dynamic.literal(daysToKeepDeletedBuildsBeforeDestroy = daysToKeepDeletedBuildsBeforeDestroy.asInstanceOf[js.Any], defaultRetentionPolicy = defaultRetentionPolicy.asInstanceOf[js.Any], maximumRetentionPolicy = maximumRetentionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildSettings]
  }
  @scala.inline
  implicit class BuildSettingsOps[Self <: BuildSettings] (val x: Self) extends AnyVal {
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
    def setDaysToKeepDeletedBuildsBeforeDestroy(value: Double): Self = this.set("daysToKeepDeletedBuildsBeforeDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultRetentionPolicy(value: RetentionPolicy): Self = this.set("defaultRetentionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumRetentionPolicy(value: RetentionPolicy): Self = this.set("maximumRetentionPolicy", value.asInstanceOf[js.Any])
  }
  
}

