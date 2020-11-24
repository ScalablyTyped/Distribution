package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventGroup extends js.Object {
  
  def add(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit]
  ): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.UndefOr[scala.Nothing],
    priority: Double
  ): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: String,
    callback: js.Function1[/* event */ js.Object | (IEvent[js.Object, js.Object]), Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit]
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.UndefOr[scala.Nothing],
    priority: Double
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: js.Array[js.Array[String] | String],
    callback: js.Function1[(IEvent[js.Object, js.Object]) | js.Object, Unit],
    context: js.Object,
    priority: Double
  ): this.type = js.native
  
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
  
  def removeAll(): this.type = js.native
}
