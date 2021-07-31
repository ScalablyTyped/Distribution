package typings.timezonecomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringsMod {
  
  @JSImport("timezonecomplete/dist/lib/strings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def padLeft(s: String, width: Double, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padLeft")(s.asInstanceOf[js.Any], width.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def padRight(s: String, width: Double, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padRight")(s.asInstanceOf[js.Any], width.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
}
