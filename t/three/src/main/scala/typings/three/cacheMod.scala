package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/loaders/Cache", JSImport.Namespace)
@js.native
object cacheMod extends js.Object {
  @js.native
  object Cache extends js.Object {
    var enabled: Boolean = js.native
    var files: js.Any = js.native
    def add(key: String, file: js.Any): Unit = js.native
    def clear(): Unit = js.native
    def get(key: String): js.Any = js.native
    def remove(key: String): Unit = js.native
  }
  
}

