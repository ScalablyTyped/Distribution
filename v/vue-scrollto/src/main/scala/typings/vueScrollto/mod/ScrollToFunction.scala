package typings.vueScrollto.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollToFunction extends js.Object {
  
  def apply(element: ElementDescriptor): js.Function0[Unit] = js.native
  def apply(element: ElementDescriptor, duration: Double): js.Function0[Unit] = js.native
  def apply(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit] = js.native
  def apply(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit] = js.native
  def apply(options: ScrollOptions): js.Function0[Unit] = js.native
}
