package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enable presets of externals for specific targets.
  */
trait ExternalsPresets extends StObject {
  
  /**
  	 * Treat common electron built-in modules in main and preload context like 'electron', 'ipc' or 'shell' as external and load them via require() when used.
  	 */
  var electron: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Treat electron built-in modules in the main context like 'app', 'ipc-main' or 'shell' as external and load them via require() when used.
  	 */
  var electronMain: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Treat electron built-in modules in the preload context like 'web-frame', 'ipc-renderer' or 'shell' as external and load them via require() when used.
  	 */
  var electronPreload: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Treat electron built-in modules in the renderer context like 'web-frame', 'ipc-renderer' or 'shell' as external and load them via require() when used.
  	 */
  var electronRenderer: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Treat node.js built-in modules like fs, path or vm as external and load them via require() when used.
  	 */
  var node: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Treat NW.js legacy nw.gui module as external and load it via require() when used.
  	 */
  var nwjs: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Treat references to 'http(s)://...' and 'std:...' as external and load them via import when used (Note that this changes execution order as externals are executed before any other code in the chunk).
  	 */
  var web: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Treat references to 'http(s)://...' and 'std:...' as external and load them via async import() when used (Note that this external type is an async module, which has various effects on the execution).
  	 */
  var webAsync: js.UndefOr[Boolean] = js.undefined
}
object ExternalsPresets {
  
  inline def apply(): ExternalsPresets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalsPresets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalsPresets] (val x: Self) extends AnyVal {
    
    inline def setElectron(value: Boolean): Self = StObject.set(x, "electron", value.asInstanceOf[js.Any])
    
    inline def setElectronMain(value: Boolean): Self = StObject.set(x, "electronMain", value.asInstanceOf[js.Any])
    
    inline def setElectronMainUndefined: Self = StObject.set(x, "electronMain", js.undefined)
    
    inline def setElectronPreload(value: Boolean): Self = StObject.set(x, "electronPreload", value.asInstanceOf[js.Any])
    
    inline def setElectronPreloadUndefined: Self = StObject.set(x, "electronPreload", js.undefined)
    
    inline def setElectronRenderer(value: Boolean): Self = StObject.set(x, "electronRenderer", value.asInstanceOf[js.Any])
    
    inline def setElectronRendererUndefined: Self = StObject.set(x, "electronRenderer", js.undefined)
    
    inline def setElectronUndefined: Self = StObject.set(x, "electron", js.undefined)
    
    inline def setNode(value: Boolean): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setNwjs(value: Boolean): Self = StObject.set(x, "nwjs", value.asInstanceOf[js.Any])
    
    inline def setNwjsUndefined: Self = StObject.set(x, "nwjs", js.undefined)
    
    inline def setWeb(value: Boolean): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebAsync(value: Boolean): Self = StObject.set(x, "webAsync", value.asInstanceOf[js.Any])
    
    inline def setWebAsyncUndefined: Self = StObject.set(x, "webAsync", js.undefined)
    
    inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
  }
}
