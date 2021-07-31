package typings.uiBox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueToStringMod {
  
  @JSImport("ui-box/dist/src/value-to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(value: String, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(value: Double, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
}
