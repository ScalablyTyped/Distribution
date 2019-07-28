package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizedSvg extends js.Object {
  var data: String
  var info: js.Object
}

object OptimizedSvg {
  @scala.inline
  def apply(data: String, info: js.Object): OptimizedSvg = {
    val __obj = js.Dynamic.literal(data = data, info = info)
  
    __obj.asInstanceOf[OptimizedSvg]
  }
}

