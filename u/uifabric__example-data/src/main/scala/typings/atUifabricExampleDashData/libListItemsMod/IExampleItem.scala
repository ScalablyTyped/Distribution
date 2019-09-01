package typings.atUifabricExampleDashData.libListItemsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExampleItem extends js.Object {
  var color: String
  var description: String
  var height: Double
  var key: String
  var location: String
  var name: String
  var shape: String
  var thumbnail: String
  var width: Double
}

object IExampleItem {
  @scala.inline
  def apply(
    color: String,
    description: String,
    height: Double,
    key: String,
    location: String,
    name: String,
    shape: String,
    thumbnail: String,
    width: Double
  ): IExampleItem = {
    val __obj = js.Dynamic.literal(color = color, description = description, height = height, key = key, location = location, name = name, shape = shape, thumbnail = thumbnail, width = width)
  
    __obj.asInstanceOf[IExampleItem]
  }
}

