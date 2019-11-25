package typings.twoDotJs

import typings.twoDotJs.twoDotJsMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left extends js.Object {
  var left: Vector
  var right: Vector
}

object Anon_Left {
  @scala.inline
  def apply(left: Vector, right: Vector): Anon_Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Left]
  }
}

