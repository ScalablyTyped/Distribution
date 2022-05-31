package typings.yandexMaps.global.ymaps

import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  @JSGlobal("ymaps.layout.storage")
  @js.native
  val storage: Storage = js.native
  
  object templateBased {
    
    @JSGlobal("ymaps.layout.templateBased.Base")
    @js.native
    class Base protected ()
      extends typings.yandexMaps.mod.layout.templateBased.Base {
      def this(data: js.Object) = this()
    }
  }
}
