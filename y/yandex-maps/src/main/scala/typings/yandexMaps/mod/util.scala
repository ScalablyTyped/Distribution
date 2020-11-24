package typings.yandexMaps.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "util")
@js.native
object util extends js.Object {
  
  @js.native
  class Storage () extends js.Object {
    
    def add(key: String, `object`: js.Object): this.type = js.native
    
    def get(key: String): js.Object | String = js.native
    def get(key: js.Object): js.Object | String = js.native
    
    def remove(key: String): js.Object = js.native
  }
  
  @js.native
  object cursor extends js.Object {
    
    @js.native
    class Accessor protected () extends js.Object {
      def this(key: String) = this()
      
      def getKey(): String = js.native
      
      def remove(): Unit = js.native
      
      def setKey(): Unit = js.native
    }
    
    @js.native
    class Manager protected () extends js.Object {
      def this(element: HTMLElement) = this()
      
      def push(key: String): Accessor = js.native
    }
  }
}
