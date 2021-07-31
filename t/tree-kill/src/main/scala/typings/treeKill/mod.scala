package typings.treeKill

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(pid: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(pid: Double, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(pid: Double, signal: String): Unit = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(pid: Double, signal: String, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(pid: Double, signal: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(pid: Double, signal: Double, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(pid: Double, signal: Unit, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(pid.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("tree-kill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
