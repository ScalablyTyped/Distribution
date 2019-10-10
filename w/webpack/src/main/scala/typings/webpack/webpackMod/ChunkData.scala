package typings.webpack.webpackMod

import typings.webpack.webpackMod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChunkData extends js.Object {
  var chunk: Chunk
}

object ChunkData {
  @scala.inline
  def apply(chunk: Chunk): ChunkData = {
    val __obj = js.Dynamic.literal(chunk = chunk)
  
    __obj.asInstanceOf[ChunkData]
  }
}

