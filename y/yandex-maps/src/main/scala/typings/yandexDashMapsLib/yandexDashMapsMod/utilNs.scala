package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "util")
@js.native
object utilNs extends js.Object {
  @js.native
  class Storage () extends js.Object {
    def add(key: java.lang.String, `object`: js.Object): this.type = js.native
    def get(key: java.lang.String): js.Object | java.lang.String = js.native
    def get(key: js.Object): js.Object | java.lang.String = js.native
    def remove(key: java.lang.String): js.Object = js.native
  }
  
  @JSName("cursor")
  @js.native
  object cursorNs extends js.Object {
    @js.native
    class Accessor protected () extends js.Object {
      def this(key: java.lang.String) = this()
      def getKey(): java.lang.String = js.native
      def remove(): scala.Unit = js.native
      def setKey(): scala.Unit = js.native
    }
    
    @js.native
    class Manager protected () extends js.Object {
      def this(element: stdLib.HTMLElement) = this()
      def push(key: java.lang.String): Accessor = js.native
    }
    
  }
  
}

