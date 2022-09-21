package typings.tinymce.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndoManager extends StObject {
  
  def add(): js.Object = js.native
  def add(level: js.Object): js.Object = js.native
  def add(level: js.Object, event: Event): js.Object = js.native
  def add(level: Unit, event: Event): js.Object = js.native
  
  def beforeChange(): Unit = js.native
  
  def clear(): Unit = js.native
  
  def extra(callback1: js.Function0[Unit], callback2: js.Function0[Unit]): Unit = js.native
  
  def hasRedo(): Boolean = js.native
  
  def hasUndo(): Boolean = js.native
  
  def ignore(callback: js.Function0[Unit]): Unit = js.native
  
  def redo(): js.Object = js.native
  
  def transact(callback: js.Function0[Unit]): js.Object = js.native
  
  def undo(): js.Object = js.native
}
