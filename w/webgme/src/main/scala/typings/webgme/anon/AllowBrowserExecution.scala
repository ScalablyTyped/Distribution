package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowBrowserExecution extends js.Object {
  /**
    * If true will enable execution of plugins on the server.
    *   config.plugin.allowBrowserExecution = true;
    */
  var allowBrowserExecution: Boolean = js.native
  /**
    * If true will enable execution of plugins on 
    * the server.config.plugin.allowServerExecution = false;
    */
  var allowServerExecution: Boolean = js.native
  /**
    * Same as for `config.addOns.basePath' 
    * [TODO: link to AddOns] but for plugins instead.
    *   config.plugin.basePaths = ['./src/plugin/coreplugins']
    */
  var basePaths: js.Array[String] = js.native
  /**
    * If true there is no need to register plugins on the 
    * root-node of project - all will be available from the drop-down.
    *   config.plugin.displayAll = false;
    */
  var displayAll: Boolean = js.native
  /**
    * Time, in milliseconds, results will be stored on 
    * the server after they have finished (when invoked via the REST api).
    *   config.plugin.serverResultTimeout = 60000;
    */
  var serverResultTimeout: Double = js.native
}

object AllowBrowserExecution {
  @scala.inline
  def apply(
    allowBrowserExecution: Boolean,
    allowServerExecution: Boolean,
    basePaths: js.Array[String],
    displayAll: Boolean,
    serverResultTimeout: Double
  ): AllowBrowserExecution = {
    val __obj = js.Dynamic.literal(allowBrowserExecution = allowBrowserExecution.asInstanceOf[js.Any], allowServerExecution = allowServerExecution.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], displayAll = displayAll.asInstanceOf[js.Any], serverResultTimeout = serverResultTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowBrowserExecution]
  }
  @scala.inline
  implicit class AllowBrowserExecutionOps[Self <: AllowBrowserExecution] (val x: Self) extends AnyVal {
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
    def setAllowBrowserExecution(value: Boolean): Self = this.set("allowBrowserExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowServerExecution(value: Boolean): Self = this.set("allowServerExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasePathsVarargs(value: String*): Self = this.set("basePaths", js.Array(value :_*))
    @scala.inline
    def setBasePaths(value: js.Array[String]): Self = this.set("basePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayAll(value: Boolean): Self = this.set("displayAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerResultTimeout(value: Double): Self = this.set("serverResultTimeout", value.asInstanceOf[js.Any])
  }
  
}

