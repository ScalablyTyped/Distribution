package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  object Cache {
    
    @JSImport("three/src/loaders/Cache", "Cache")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def add(key: String, file: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
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
    
    @scala.inline
    def get(key: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
