package typings.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildOptions
  extends /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[Boolean] = js.native
  var dry: js.UndefOr[Boolean] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var incremental: js.UndefOr[Boolean] = js.native
  var traceResolution: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object BuildOptions {
  @scala.inline
  def apply(): BuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildOptions]
  }
  @scala.inline
  implicit class BuildOptionsOps[Self <: BuildOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssumeChangesOnlyAffectDirectDependencies(value: Boolean): Self = this.set("assumeChangesOnlyAffectDirectDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeChangesOnlyAffectDirectDependencies: Self = this.set("assumeChangesOnlyAffectDirectDependencies", js.undefined)
    @scala.inline
    def setDry(value: Boolean): Self = this.set("dry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDry: Self = this.set("dry", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setIncremental(value: Boolean): Self = this.set("incremental", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncremental: Self = this.set("incremental", js.undefined)
    @scala.inline
    def setTraceResolution(value: Boolean): Self = this.set("traceResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceResolution: Self = this.set("traceResolution", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

