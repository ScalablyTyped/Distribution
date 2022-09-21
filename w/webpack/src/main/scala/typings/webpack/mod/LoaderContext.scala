package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoaderContext[OptionsType]
  extends StObject
     with NormalModuleLoaderContext[OptionsType]
     with LoaderRunnerLoaderContext[OptionsType]
     with LoaderPluginLoaderContext
     with HotModuleReplacementPluginLoaderContext
