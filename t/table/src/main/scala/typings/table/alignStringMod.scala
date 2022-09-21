package typings.table

import typings.table.apiMod.Alignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignStringMod {
  
  @JSImport("table/dist/src/alignString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alignString(subject: String, containerWidth: Double, alignment: Alignment): String = (^.asInstanceOf[js.Dynamic].applyDynamic("alignString")(subject.asInstanceOf[js.Any], containerWidth.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any])).asInstanceOf[String]
}
