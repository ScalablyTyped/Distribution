package typings.vegaDashLite

import typings.vegaDashLite.buildSrcTitleMod.TitleBase
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgMarkConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mark extends js.Object {
  var mark: VgMarkConfig
  var nonMark: TitleBase
}

object Anon_Mark {
  @scala.inline
  def apply(mark: VgMarkConfig, nonMark: TitleBase): Anon_Mark = {
    val __obj = js.Dynamic.literal(mark = mark, nonMark = nonMark)
  
    __obj.asInstanceOf[Anon_Mark]
  }
}

