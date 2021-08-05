package typings.webpackFailPlugin

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Webpack plugin that will make the process return status code 1 when it finishes with errors in single-run mode.
    */
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  
  @JSImport("webpack-fail-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
