package typings.workboxSw.mod.global.workbox

import typings.workboxSw.mod.global.workbox.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def loadModule(moduleName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setConfig(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")().asInstanceOf[Unit]
inline def setConfig(options: WorkboxOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

type ModulePathCallback = js.Function2[/* moduleName */ String, /* debug */ Boolean, String]
