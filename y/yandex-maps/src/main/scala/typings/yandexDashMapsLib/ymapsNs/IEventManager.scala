package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventManager extends IEventTrigger {
  def add(types: java.lang.String, callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit]): this.type = js.native
  def add(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: java.lang.String,
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def add(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit]
  ): this.type = js.native
  def add(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object
  ): this.type = js.native
  def add(
    types: js.Array[java.lang.String | js.Array[java.lang.String]],
    callback: js.Function1[/* event */ js.Object | IEvent, scala.Unit],
    context: js.Object,
    priority: scala.Double
  ): this.type = js.native
  def getParent(): js.Object | scala.Null = js.native
  def group(): IEventGroup = js.native
  //remove(types: string[][] | string[] | string, callback: (event: object | IEvent) => void, context?: object, priority?: number): this;
  def setParent(): this.type = js.native
  //remove(types: string[][] | string[] | string, callback: (event: object | IEvent) => void, context?: object, priority?: number): this;
  def setParent(parent: js.Object): this.type = js.native
}

