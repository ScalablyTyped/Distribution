package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  object Cache {
    
    @JSImport("three/src/loaders/Cache", "Cache")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/src/loaders/Cache", "Cache.add")
    @js.native
    def add(key: String, file: js.Any): Unit = js.native
    
    @JSImport("three/src/loaders/Cache", "Cache.clear")
    @js.native
    def clear(): Unit = js.native
    
    @JSImport("three/src/loaders/Cache", "Cache.enabled")
    @js.native
    def enabled: Boolean = js.native
    @scala.inline
    def enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/loaders/Cache", "Cache.files")
    @js.native
    def files: js.Any = js.native
    @scala.inline
    def files_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("files")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/loaders/Cache", "Cache.get")
    @js.native
    def get(key: String): js.Any = js.native
    
    @JSImport("three/src/loaders/Cache", "Cache.remove")
    @js.native
    def remove(key: String): Unit = js.native
  }
}
