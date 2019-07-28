package typings.vegaDashLite

import typings.vegaDashLite.buildSrcFielddefMod.FieldDefBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Title extends js.Object {
  var title: String | js.Array[FieldDefBase[String]]
}

object Anon_Title {
  @scala.inline
  def apply(title: String | js.Array[FieldDefBase[String]]): Anon_Title = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Title]
  }
}

