package typings.yandexMaps.mod.control

import typings.std.HTMLElement
import typings.yandexMaps.mod.ControlKey
import typings.yandexMaps.mod.IControl
import typings.yandexMaps.mod.Map_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "control.Manager")
@js.native
class Manager protected () extends StObject {
  def this(map: Map_) = this()
  def this(map: Map_, controls: js.Array[String | IControl]) = this()
  def this(map: Map_, controls: js.UndefOr[scala.Nothing], options: IManagerOptions) = this()
  def this(map: Map_, controls: js.Array[String | IControl], options: IManagerOptions) = this()
  
  def add(control: ControlKey): this.type = js.native
  def add(control: ControlKey, options: IManagerControlOptions): this.type = js.native
  def add(control: IControl): this.type = js.native
  def add(control: IControl, options: IManagerControlOptions): this.type = js.native
  
  def each(callback: js.Function1[/* control */ IControl, Unit]): this.type = js.native
  def each(callback: js.Function1[/* control */ IControl, Unit], context: js.Object): this.type = js.native
  
  var events: typings.yandexMaps.mod.event.Manager[js.Object] = js.native
  
  def get(index: String): IControl | Null = js.native
  def get(index: Double): IControl | Null = js.native
  
  def getChildElement(control: IControl): js.Promise[HTMLElement] = js.native
  
  def getContainer(): HTMLElement = js.native
  
  def getMap(): Map_ = js.native
  
  def indexOf(childToFind: String): Double = js.native
  def indexOf(childToFind: IControl): Double = js.native
  
  var options: typings.yandexMaps.mod.option.Manager = js.native
  
  def remove(control: String): this.type = js.native
  def remove(control: IControl): this.type = js.native
  
  var state: typings.yandexMaps.mod.data.Manager = js.native
}
