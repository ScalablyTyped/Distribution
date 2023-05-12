package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylePropertyMapReadOnly extends StObject {
  
  def forEach(
    callbackfn: js.Function3[/* value */ js.Array[CSSStyleValue], /* key */ String, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ js.Array[CSSStyleValue], /* key */ String, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  def get(property: String): js.UndefOr[CSSStyleValue] = js.native
  
  def getAll(property: String): js.Array[CSSStyleValue] = js.native
  
  def has(property: String): Boolean = js.native
  
  val size: Double = js.native
}
