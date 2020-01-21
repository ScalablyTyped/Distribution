package typings.webpack

import typings.webpack.mod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewChunks extends js.Object {
  var newChunks: js.Array[Chunk]
  var oldChunk: Chunk
}

object AnonNewChunks {
  @scala.inline
  def apply(newChunks: js.Array[Chunk], oldChunk: Chunk): AnonNewChunks = {
    val __obj = js.Dynamic.literal(newChunks = newChunks.asInstanceOf[js.Any], oldChunk = oldChunk.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewChunks]
  }
}

