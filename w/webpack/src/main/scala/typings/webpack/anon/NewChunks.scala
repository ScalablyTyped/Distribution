package typings.webpack.anon

import typings.webpack.mod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewChunks extends js.Object {
  var newChunks: js.Array[Chunk]
  var oldChunk: Chunk
}

object NewChunks {
  @scala.inline
  def apply(newChunks: js.Array[Chunk], oldChunk: Chunk): NewChunks = {
    val __obj = js.Dynamic.literal(newChunks = newChunks.asInstanceOf[js.Any], oldChunk = oldChunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewChunks]
  }
}

