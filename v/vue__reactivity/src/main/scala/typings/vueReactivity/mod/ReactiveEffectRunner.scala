package typings.vueReactivity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactiveEffectRunner[T] extends StObject {
  
  def apply(): T = js.native
  
  var effect: ReactiveEffect[Any] = js.native
}
