package typings.unifiedEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unified-engine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def engine(options: typings.unifiedEngine.libMod.Options, callback: typings.unifiedEngine.libMod.Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("engine")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = typings.unifiedEngine.libMod.Callback
  
  type Completer = typings.unifiedEngine.libMod.Completer
  
  type ConfigTransform = typings.unifiedEngine.libMod.ConfigTransform
  
  type Context = typings.unifiedEngine.libMod.Context
  
  type FileSet = typings.unifiedEngine.libMod.FileSet
  
  type Options = typings.unifiedEngine.libMod.Options
  
  type Preset = typings.unifiedEngine.libMod.Preset
  
  type ResolveFrom = typings.unifiedEngine.libMod.ResolveFrom
  
  type VFileReporter = typings.unifiedEngine.libMod.VFileReporter
  
  type VFileReporterOptions = typings.unifiedEngine.libMod.VFileReporterOptions
}
