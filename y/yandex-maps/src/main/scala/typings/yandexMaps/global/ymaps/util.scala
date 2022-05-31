package typings.yandexMaps.global.ymaps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSGlobal("ymaps.util.Storage")
  @js.native
  class Storage ()
    extends typings.yandexMaps.mod.util.Storage
  
  object cursor {
    
    @JSGlobal("ymaps.util.cursor.Accessor")
    @js.native
    class Accessor protected ()
      extends typings.yandexMaps.mod.util.cursor.Accessor {
      def this(key: String) = this()
    }
    
    @JSGlobal("ymaps.util.cursor.Manager")
    @js.native
    class Manager protected ()
      extends typings.yandexMaps.mod.util.cursor.Manager {
      def this(element: HTMLElement) = this()
    }
  }
}
