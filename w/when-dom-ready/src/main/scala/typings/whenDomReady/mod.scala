package typings.whenDomReady

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def apply(callback: js.Function0[Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def apply(callback: js.Function0[Unit], document: EventTarget): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def apply(callback: Unit, document: EventTarget): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def apply(document: EventTarget): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(document.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("when-dom-ready", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def resume[T](): js.Function1[/* value */ T, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")().asInstanceOf[js.Function1[/* value */ T, js.Promise[T]]]
  @scala.inline
  def resume[T](document: EventTarget): js.Function1[/* value */ T, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resume")(document.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ T, js.Promise[T]]]
}
