package typings.thunderbirdWebextBrowser.anon

import typings.thunderbirdWebextBrowser.messenger.manifest.ExtensionURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Persistent extends StObject {
  
  /** Not supported on manifest versions above 2. */
  var persistent: js.UndefOr[Boolean] = js.undefined
  
  var scripts: js.Array[ExtensionURL]
}
object Persistent {
  
  inline def apply(scripts: js.Array[ExtensionURL]): Persistent = {
    val __obj = js.Dynamic.literal(scripts = scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persistent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Persistent] (val x: Self) extends AnyVal {
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    
    inline def setScripts(value: js.Array[ExtensionURL]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsVarargs(value: ExtensionURL*): Self = StObject.set(x, "scripts", js.Array(value*))
  }
}
