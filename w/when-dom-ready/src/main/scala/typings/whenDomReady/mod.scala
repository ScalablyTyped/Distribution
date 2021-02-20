package typings.whenDomReady

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("when-dom-ready", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[Unit] = js.native
  @JSImport("when-dom-ready", JSImport.Namespace)
  @js.native
  def apply(callback: js.UndefOr[scala.Nothing], document: EventTarget): js.Promise[Unit] = js.native
  @JSImport("when-dom-ready", JSImport.Namespace)
  @js.native
  def apply(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  @JSImport("when-dom-ready", JSImport.Namespace)
  @js.native
  def apply(callback: js.Function0[Unit], document: EventTarget): js.Promise[Unit] = js.native
  @JSImport("when-dom-ready", JSImport.Namespace)
  @js.native
  def apply(document: EventTarget): js.Promise[Unit] = js.native
  
  @JSImport("when-dom-ready", "resume")
  @js.native
  def resume[T](): js.Function1[/* value */ T, js.Promise[T]] = js.native
  @JSImport("when-dom-ready", "resume")
  @js.native
  def resume[T](document: EventTarget): js.Function1[/* value */ T, js.Promise[T]] = js.native
}
