package typings.yaml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MAP extends js.Object {
  /** Default: `'tag:yaml.org,2002:map'` */
  var MAP: String
  /** Default: `'tag:yaml.org,2002:seq'` */
  var SEQ: String
  /** Default: `'tag:yaml.org,2002:str'` */
  var STR: String
}

object MAP {
  @scala.inline
  def apply(MAP: String, SEQ: String, STR: String): MAP = {
    val __obj = js.Dynamic.literal(MAP = MAP.asInstanceOf[js.Any], SEQ = SEQ.asInstanceOf[js.Any], STR = STR.asInstanceOf[js.Any])
    __obj.asInstanceOf[MAP]
  }
}

