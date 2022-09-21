package typings.yandexMaps.global.ymaps

import typings.yandexMaps.mod.IOptionManager
import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object option {
  
  @JSGlobal("ymaps.option.Manager")
  @js.native
  open class Manager ()
    extends typings.yandexMaps.mod.option.Manager {
    def this(options: js.Object) = this()
    def this(options: js.Object, parent: IOptionManager) = this()
    def this(options: Unit, parent: IOptionManager) = this()
    def this(options: js.Object, parent: Unit, name: String) = this()
    def this(options: js.Object, parent: IOptionManager, name: String) = this()
    def this(options: Unit, parent: Unit, name: String) = this()
    def this(options: Unit, parent: IOptionManager, name: String) = this()
  }
  
  @JSGlobal("ymaps.option.presetStorage")
  @js.native
  val presetStorage: Storage = js.native
}
