package typings.yandexDashMaps.yandexDashMapsMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "Circle")
@js.native
class Circle protected () extends GeoObject {
  def this(geometry: js.Array[js.Array[js.Array[js.Array[ICircleGeometry]] | Double]]) = this()
  def this(geometry: js.Object) = this()
  def this(geometry: js.Array[js.Array[js.Array[js.Array[ICircleGeometry]] | Double]], properties: js.Object) = this()
  def this(
    geometry: js.Array[js.Array[js.Array[js.Array[ICircleGeometry]] | Double]],
    properties: IDataManager
  ) = this()
  def this(geometry: js.Object, properties: js.Object) = this()
  def this(geometry: js.Object, properties: IDataManager) = this()
  def this(
    geometry: js.Array[js.Array[js.Array[js.Array[ICircleGeometry]] | Double]],
    properties: js.Object,
    options: ICircleOptions
  ) = this()
  def this(
    geometry: js.Array[js.Array[js.Array[js.Array[ICircleGeometry]] | Double]],
    properties: IDataManager,
    options: ICircleOptions
  ) = this()
  def this(geometry: js.Object, properties: js.Object, options: ICircleOptions) = this()
  def this(geometry: js.Object, properties: IDataManager, options: ICircleOptions) = this()
  var indices: ArrayBuffer = js.native
  var vertices: ArrayBuffer = js.native
}

