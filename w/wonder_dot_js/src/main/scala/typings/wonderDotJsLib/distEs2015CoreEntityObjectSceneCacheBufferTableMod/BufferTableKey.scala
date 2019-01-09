package typings
package wonderDotJsLib.distEs2015CoreEntityObjectSceneCacheBufferTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BufferTableKey extends js.Object

@JSImport("wonder.js/dist/es2015/core/entityObject/scene/cache/BufferTable", "BufferTableKey")
@js.native
object BufferTableKey extends js.Object {
  @js.native
  sealed trait PROCEDURAL_INDEX
    extends wonderDotJsLib.distEs2015CoreEntityObjectSceneCacheBufferTableMod.BufferTableKey
  
  @js.native
  sealed trait PROCEDURAL_VERTEX
    extends wonderDotJsLib.distEs2015CoreEntityObjectSceneCacheBufferTableMod.BufferTableKey
  
  val PROCEDURAL_INDEX: PROCEDURAL_INDEX with java.lang.String = js.native
  val PROCEDURAL_VERTEX: PROCEDURAL_VERTEX with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    wonderDotJsLib.distEs2015CoreEntityObjectSceneCacheBufferTableMod.BufferTableKey with java.lang.String
  ] = js.native
}

