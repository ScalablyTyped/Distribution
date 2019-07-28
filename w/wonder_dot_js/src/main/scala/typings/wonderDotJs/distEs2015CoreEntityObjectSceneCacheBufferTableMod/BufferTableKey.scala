package typings.wonderDotJs.distEs2015CoreEntityObjectSceneCacheBufferTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BufferTableKey extends js.Object

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/BufferTable", "BufferTableKey")
@js.native
object BufferTableKey extends js.Object {
  @js.native
  sealed trait PROCEDURAL_INDEX extends BufferTableKey
  
  @js.native
  sealed trait PROCEDURAL_VERTEX extends BufferTableKey
  
  /* 1 */ val PROCEDURAL_INDEX: typings.wonderDotJs.distEs2015CoreEntityObjectSceneCacheBufferTableMod.BufferTableKey.PROCEDURAL_INDEX with Double = js.native
  /* 0 */ val PROCEDURAL_VERTEX: typings.wonderDotJs.distEs2015CoreEntityObjectSceneCacheBufferTableMod.BufferTableKey.PROCEDURAL_VERTEX with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BufferTableKey with Double] = js.native
}

