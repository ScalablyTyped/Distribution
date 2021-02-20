package typings.through

import typings.node.streamMod.Transform
import typings.through.anon.AutoDestroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("through", JSImport.Namespace)
  @js.native
  def apply(): ThroughStream = js.native
  @JSImport("through", JSImport.Namespace)
  @js.native
  def apply(write: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], opts: AutoDestroy): ThroughStream = js.native
  @JSImport("through", JSImport.Namespace)
  @js.native
  def apply(write: js.UndefOr[scala.Nothing], end: js.Function0[Unit]): ThroughStream = js.native
  @JSImport("through", JSImport.Namespace)
  @js.native
  def apply(write: js.UndefOr[scala.Nothing], end: js.Function0[Unit], opts: AutoDestroy): ThroughStream = js.native
  @JSImport("through", JSImport.Namespace)
  @js.native
  def apply(write: js.Function1[/* data */ js.Any, Unit]): ThroughStream = js.native
  @JSImport("through", JSImport.Namespace)
  @js.native
  def apply(write: js.Function1[/* data */ js.Any, Unit], end: js.UndefOr[scala.Nothing], opts: AutoDestroy): ThroughStream = js.native
  @JSImport("through", JSImport.Namespace)
  @js.native
  def apply(write: js.Function1[/* data */ js.Any, Unit], end: js.Function0[Unit]): ThroughStream = js.native
  @JSImport("through", JSImport.Namespace)
  @js.native
  def apply(write: js.Function1[/* data */ js.Any, Unit], end: js.Function0[Unit], opts: AutoDestroy): ThroughStream = js.native
  
  @js.native
  trait ThroughStream extends Transform {
    
    var autoDestroy: Boolean = js.native
    
    def queue(chunk: js.Any): js.Any = js.native
  }
}
