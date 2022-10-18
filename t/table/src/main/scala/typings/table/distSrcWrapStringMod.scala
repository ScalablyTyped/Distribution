package typings.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWrapStringMod {
  
  @JSImport("table/dist/src/wrapString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapString(subject: String, size: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapString")(subject.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
