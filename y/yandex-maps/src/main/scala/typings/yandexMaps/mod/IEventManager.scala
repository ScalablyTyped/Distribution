package typings.yandexMaps.mod

import typings.std.MouseEvent
import typings.yandexMaps.yandexMapsStrings.mousedown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventManager[TargetGeometry] extends IEventTrigger {
  
  def add(types: String, callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit]): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: js.UndefOr[scala.Nothing],
    priority: Double
  ): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit]
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: js.UndefOr[scala.Nothing],
    priority: Double
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[/* event */ IEvent[js.Object, js.Object], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mousedown(types: mousedown, callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit]): this.type = js.native
  @JSName("add")
  def add_mousedown(
    types: mousedown,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.UndefOr[scala.Nothing],
    priority: Double
  ): this.type = js.native
  @JSName("add")
  def add_mousedown(
    types: mousedown,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object
  ): this.type = js.native
  @JSName("add")
  def add_mousedown(
    types: mousedown,
    callback: js.Function1[/* event */ IEvent[MouseEvent, TargetGeometry], Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  
  def getParent(): js.Object | Null = js.native
  
  def group(): IEventGroup = js.native
  
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.UndefOr[scala.Nothing],
    priority: Double
  ): this.type = js.native
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.UndefOr[scala.Nothing],
    priority: Double
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.Object
  ): this.type = js.native
  def remove(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
}
