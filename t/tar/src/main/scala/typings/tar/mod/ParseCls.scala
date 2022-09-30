package typings.tar.mod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("tar", "Parse")
@js.native
open class ParseCls ()
  extends StObject
     with Parse {
  def this(opt: ParseOptions) = this()
  
  /* CompleteClass */
  var _ended: Boolean = js.native
  
  /* CompleteClass */
  override def _process(c: Buffer): Unit = js.native
  
  /* CompleteClass */
  override def _startEntry(c: Buffer): Unit = js.native
  
  /* CompleteClass */
  var _stream: Stream = js.native
  
  /* CompleteClass */
  override def _streamEnd(): Unit = js.native
  
  /* CompleteClass */
  var position: Double = js.native
}
