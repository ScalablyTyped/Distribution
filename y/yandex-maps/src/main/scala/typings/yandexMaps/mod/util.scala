package typings.yandexMaps.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("yandex-maps", "util.Storage")
  @js.native
  open class Storage () extends StObject {
    
    def add(key: String, `object`: js.Object): this.type = js.native
    
    def get(key: String): js.Object | String = js.native
    def get(key: js.Object): js.Object | String = js.native
    
    def remove(key: String): js.Object = js.native
  }
  
  object cursor {
    
    @JSImport("yandex-maps", "util.cursor.Accessor")
    @js.native
    open class Accessor protected () extends StObject {
      def this(key: String) = this()
      
      def getKey(): String = js.native
      
      def remove(): Unit = js.native
      
      def setKey(): Unit = js.native
    }
    
    @JSImport("yandex-maps", "util.cursor.Manager")
    @js.native
    open class Manager protected () extends StObject {
      def this(element: HTMLElement) = this()
      
      def push(key: String): Accessor = js.native
    }
  }
}
