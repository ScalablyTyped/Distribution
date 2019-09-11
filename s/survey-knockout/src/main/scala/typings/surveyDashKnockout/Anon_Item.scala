package typings.surveyDashKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item extends js.Object {
  var item: String
  var itemDecorator: String
  var label: String
  var materialDecorator: String
  var root: String
}

object Anon_Item {
  @scala.inline
  def apply(item: String, itemDecorator: String, label: String, materialDecorator: String, root: String): Anon_Item = {
    val __obj = js.Dynamic.literal(item = item, itemDecorator = itemDecorator, label = label, materialDecorator = materialDecorator, root = root)
  
    __obj.asInstanceOf[Anon_Item]
  }
}

