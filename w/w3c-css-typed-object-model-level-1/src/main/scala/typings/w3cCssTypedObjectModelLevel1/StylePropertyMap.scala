package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylePropertyMap
  extends StObject
     with StylePropertyMapReadOnly {
  
  def append(property: String, values: (CSSStyleValue | String)*): Unit = js.native
  
  def clear(): Unit = js.native
  
  def delete(property: String): Unit = js.native
  
  def set(property: String, values: (CSSStyleValue | String)*): Unit = js.native
}
