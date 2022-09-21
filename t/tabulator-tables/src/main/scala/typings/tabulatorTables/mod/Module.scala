package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabulator-tables", "Module")
@js.native
open class Module protected () extends StObject {
  def this(table: Tabulator) = this()
}
object Module {
  
  @JSImport("tabulator-tables", "Module")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("tabulator-tables", "Module.moduleName")
  @js.native
  def moduleName: String = js.native
  inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
}
