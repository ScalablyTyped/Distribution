package typings.webVitals

import typings.webVitals.anon.IsUnloading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-vitals/dist/lib/onHidden", JSImport.Namespace)
@js.native
object onHiddenMod extends js.Object {
  def onHidden(cb: OnHiddenCallback): Unit = js.native
  def onHidden(cb: OnHiddenCallback, once: Boolean): Unit = js.native
  type OnHiddenCallback = js.Function1[/* hasTimeStampIsUnloading */ IsUnloading, Unit]
}

