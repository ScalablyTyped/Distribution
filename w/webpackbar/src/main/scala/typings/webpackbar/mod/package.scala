package typings.webpackbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * 'context' is the reference to the plugin
    * You can use 'context.state' to access status
    */
  type ReporterContextFunc = js.Function1[/* context */ typings.webpackbar.mod.WebpackBar, scala.Unit]
}
