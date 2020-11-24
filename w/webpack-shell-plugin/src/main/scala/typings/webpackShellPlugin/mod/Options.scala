package typings.webpackShellPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Switch for development environments.
    * This causes scripts to execute once.
    * Useful for running HMR on webpack-dev-server or webpack watch mode.
    * @default true
    */
  var dev: js.UndefOr[Boolean] = js.native
  
  /**
    * scripts to execute after files are emitted at the end of the compilation
    * @default []
    */
  var onBuildEnd: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * scripts to execute after webpack process is complete
    * @default []
    */
  var onBuildExit: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * scripts to execute on the initial build
    * @default []
    */
  var onBuildStart: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Switches script execution process from spawn to exec.
    * If running into problems with spawn, turn this setting on.
    * @default false
    */
  var safe: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable for verbose output
    * @deprecated
    * @default false
    */
  var verbose: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDev(value: Boolean): Self = this.set("dev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
    
    @scala.inline
    def setOnBuildEndVarargs(value: String*): Self = this.set("onBuildEnd", js.Array(value :_*))
    
    @scala.inline
    def setOnBuildEnd(value: js.Array[String]): Self = this.set("onBuildEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBuildEnd: Self = this.set("onBuildEnd", js.undefined)
    
    @scala.inline
    def setOnBuildExitVarargs(value: String*): Self = this.set("onBuildExit", js.Array(value :_*))
    
    @scala.inline
    def setOnBuildExit(value: js.Array[String]): Self = this.set("onBuildExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBuildExit: Self = this.set("onBuildExit", js.undefined)
    
    @scala.inline
    def setOnBuildStartVarargs(value: String*): Self = this.set("onBuildStart", js.Array(value :_*))
    
    @scala.inline
    def setOnBuildStart(value: js.Array[String]): Self = this.set("onBuildStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnBuildStart: Self = this.set("onBuildStart", js.undefined)
    
    @scala.inline
    def setSafe(value: Boolean): Self = this.set("safe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafe: Self = this.set("safe", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
