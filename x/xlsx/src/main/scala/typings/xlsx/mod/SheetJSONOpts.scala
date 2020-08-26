package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetJSONOpts
  extends JSON2SheetOpts
     with OriginOption

object SheetJSONOpts {
  @scala.inline
  def apply(): SheetJSONOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetJSONOpts]
  }
}

