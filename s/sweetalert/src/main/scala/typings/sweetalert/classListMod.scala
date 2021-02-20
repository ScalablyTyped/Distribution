package typings.sweetalert

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classListMod extends Shortcut {
  
  @JSImport("sweetalert/typings/modules/class-list", JSImport.Default)
  @js.native
  val default: ClassNameList = js.native
  
  @JSImport("sweetalert/typings/modules/class-list", "CLASS_NAMES")
  @js.native
  val CLASS_NAMES: ClassNameList = js.native
  
  type ClassNameList = StringDictionary[String]
  
  type _To = ClassNameList
  
  /* This means you don't have to write `default`, but can instead just say `classListMod.foo` */
  override def _to: ClassNameList = default
}
