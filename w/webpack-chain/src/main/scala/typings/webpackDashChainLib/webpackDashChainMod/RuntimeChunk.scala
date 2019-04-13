package typings
package webpackDashChainLib.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeChunk extends js.Object {
  var name: java.lang.String | RuntimeChunkFunction
}

object RuntimeChunk {
  @scala.inline
  def apply(name: java.lang.String | RuntimeChunkFunction): RuntimeChunk = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RuntimeChunk]
  }
}

