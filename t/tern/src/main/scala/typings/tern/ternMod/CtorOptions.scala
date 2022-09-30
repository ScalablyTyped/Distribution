package typings.tern.ternMod

import org.scalablytyped.runtime.StringDictionary
import typings.tern.ternInts.`5`
import typings.tern.ternInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtorOptions extends StObject {
  
  /** The definition objects to load into the server’s environment. */
  var defs: js.UndefOr[js.Array[Def]] = js.undefined
  
  /** The ECMAScript version to parse. Should be either 5 or 6. Default is 6. */
  var ecmaVersion: js.UndefOr[`5` | `6`] = js.undefined
  
  /** Indicates the maximum amount of milliseconds to wait for an asynchronous getFile before giving up on it. Defaults to 1000. */
  var fetchTimeout: js.UndefOr[Double] = js.undefined
  
  /** Specifies the set of plugins that the server should load. The property names of the object name the plugins, and their values hold options that will be passed to them. */
  var plugins: js.UndefOr[StringDictionary[js.Object]] = js.undefined
}
object CtorOptions {
  
  inline def apply(): CtorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CtorOptions]
  }
  
  extension [Self <: CtorOptions](x: Self) {
    
    inline def setDefs(value: js.Array[Def]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
    
    inline def setDefsUndefined: Self = StObject.set(x, "defs", js.undefined)
    
    inline def setDefsVarargs(value: Def*): Self = StObject.set(x, "defs", js.Array(value*))
    
    inline def setEcmaVersion(value: `5` | `6`): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
    
    inline def setEcmaVersionUndefined: Self = StObject.set(x, "ecmaVersion", js.undefined)
    
    inline def setFetchTimeout(value: Double): Self = StObject.set(x, "fetchTimeout", value.asInstanceOf[js.Any])
    
    inline def setFetchTimeoutUndefined: Self = StObject.set(x, "fetchTimeout", js.undefined)
    
    inline def setPlugins(value: StringDictionary[js.Object]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
  }
}
