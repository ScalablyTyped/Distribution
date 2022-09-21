package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  @JSImport("webpack", "config")
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyWebpackOptionsDefaults(options: WebpackOptionsNormalized): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyWebpackOptionsDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getNormalizedWebpackOptions(config: Configuration): WebpackOptionsNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedWebpackOptions")(config.asInstanceOf[js.Any]).asInstanceOf[WebpackOptionsNormalized]
}
