package typings.webpackDevMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReporterOptions extends js.Object {
  
  var log: Logger = js.native
  
  var state: Boolean = js.native
  
  var stats: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
  ] = js.native
}
object ReporterOptions {
  
  @scala.inline
  def apply(log: Logger, state: Boolean): ReporterOptions = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReporterOptions]
  }
  
  @scala.inline
  implicit class ReporterOptionsOps[Self <: ReporterOptions] (val x: Self) extends AnyVal {
    
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
    def setLog(value: Logger): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Boolean): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Stats */ js.Any
    ): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
}
