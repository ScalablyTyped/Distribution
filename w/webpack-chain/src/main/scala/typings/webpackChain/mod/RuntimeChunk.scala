package typings.webpackChain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeChunk extends js.Object {
  var name: String | RuntimeChunkFunction
}

object RuntimeChunk {
  @scala.inline
  def apply(name: String | RuntimeChunkFunction): RuntimeChunk = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RuntimeChunk]
  }
}

