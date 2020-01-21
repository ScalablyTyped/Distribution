package typings.webpack.mod

import typings.webpack.mod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkData extends js.Object {
  var chunk: Chunk
}

object ChunkData {
  @scala.inline
  def apply(chunk: Chunk): ChunkData = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChunkData]
  }
}

