package typings.vegaTypings.streamMod

import typings.vegaTypings.onEventsMod._EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Stream extends _EventListener
object _Stream {
  
  @scala.inline
  def DerivedStream(stream: Stream): _Stream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Stream]
  }
  
  @scala.inline
  def MergedStream(merge: js.Array[Stream]): _Stream = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Stream]
  }
}
