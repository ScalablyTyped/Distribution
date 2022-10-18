package typings.vueReactivity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/reactivity", "EffectScope")
@js.native
/* Excluded from this release type: active */
/* Excluded from this release type: effects */
/* Excluded from this release type: cleanups */
/* Excluded from this release type: parent */
/* Excluded from this release type: scopes */
/* Excluded from this release type: index */
open class EffectScope_ () extends StObject {
  def this(detached: Boolean) = this()
  
  var detached: Boolean = js.native
  
  def run[T](fn: js.Function0[T]): js.UndefOr[T] = js.native
  
  /* Excluded from this release type: on */
  /* Excluded from this release type: off */
  def stop(): Unit = js.native
  def stop(fromParent: Boolean): Unit = js.native
}
