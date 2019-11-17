package typings.webpack

import typings.webpack.webpackMod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewChunks extends js.Object {
  var newChunks: js.Array[Chunk]
  var oldChunk: Chunk
}

object Anon_NewChunks {
  @scala.inline
  def apply(newChunks: js.Array[Chunk], oldChunk: Chunk): Anon_NewChunks = {
    val __obj = js.Dynamic.literal(newChunks = newChunks, oldChunk = oldChunk)
  
    __obj.asInstanceOf[Anon_NewChunks]
  }
}

