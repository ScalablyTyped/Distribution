package typings.webpack.mod.compilation

import typings.std.Iterable
import typings.webpack.mod.SortableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.ChunkGroup")
@js.native
class ChunkGroup () extends js.Object {
  var childrenIterable: SortableSet[ChunkGroup] = js.native
  var chunks: js.Array[Chunk] = js.native
  var parentsIterable: SortableSet[ChunkGroup] = js.native
  def addChild(chunk: ChunkGroup): Boolean = js.native
  def getModuleIndex(module: Module): js.UndefOr[Double] = js.native
  def getModuleIndex2(module: Module): js.UndefOr[Double] = js.native
  def getNumberOfChildren(): Double = js.native
  def insertChunk(chunk: Chunk, before: Chunk): Boolean = js.native
  def removeChild(chunk: ChunkGroup): Boolean = js.native
  def setModuleIndex(module: Module, index: Double): Unit = js.native
  def setModuleIndex2(module: Module, index: Double): Unit = js.native
  def setParents(newParents: Iterable[ChunkGroup]): Unit = js.native
}

