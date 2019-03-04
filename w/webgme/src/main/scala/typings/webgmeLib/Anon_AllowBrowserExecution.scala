package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowBrowserExecution extends js.Object {
  /**
    * If true will enable execution of plugins on the server.
    *   config.plugin.allowBrowserExecution = true;
    */
  var allowBrowserExecution: scala.Boolean
  /**
    * If true will enable execution of plugins on 
    * the server.config.plugin.allowServerExecution = false;
    */
  var allowServerExecution: scala.Boolean
  /**
    * Same as for `config.addOns.basePath' 
    * [TODO: link to AddOns] but for plugins instead.
    *   config.plugin.basePaths = ['./src/plugin/coreplugins']
    */
  var basePaths: js.Array[java.lang.String]
  /**
    * If true there is no need to register plugins on the 
    * root-node of project - all will be available from the drop-down.
    *   config.plugin.displayAll = false;
    */
  var displayAll: scala.Boolean
  /**
    * Time, in milliseconds, results will be stored on 
    * the server after they have finished (when invoked via the REST api).
    *   config.plugin.serverResultTimeout = 60000;
    */
  var serverResultTimeout: scala.Double
}

object Anon_AllowBrowserExecution {
  @scala.inline
  def apply(
    allowBrowserExecution: scala.Boolean,
    allowServerExecution: scala.Boolean,
    basePaths: js.Array[java.lang.String],
    displayAll: scala.Boolean,
    serverResultTimeout: scala.Double
  ): Anon_AllowBrowserExecution = {
    val __obj = js.Dynamic.literal(allowBrowserExecution = allowBrowserExecution, allowServerExecution = allowServerExecution, basePaths = basePaths, displayAll = displayAll, serverResultTimeout = serverResultTimeout)
  
    __obj.asInstanceOf[Anon_AllowBrowserExecution]
  }
}

