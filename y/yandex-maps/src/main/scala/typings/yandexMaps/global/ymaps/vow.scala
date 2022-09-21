package typings.yandexMaps.global.ymaps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vow {
  
  @JSGlobal("ymaps.vow.Deferred")
  @js.native
  open class Deferred ()
    extends typings.yandexMaps.mod.vow.Deferred
  
  @JSGlobal("ymaps.vow.Promise")
  @js.native
  open class Promise ()
    extends typings.yandexMaps.mod.vow.Promise {
    def this(resolver: js.Function0[Unit]) = this()
  }
}
