package typings.yandexMaps.mod

import typings.yandexMaps.mod.objectManager.ObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "ObjectManager")
@js.native
class ObjectManager_ protected () extends js.Object {
  def this(options: IObjectManagerOptions) = this()
  
  def add(params: js.Object): ObjectManager_ = js.native
  
  var objects: ObjectCollection = js.native
  
  def removeAll(): this.type = js.native
}
