package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//[Supplemental, NoInterfaceObject]
@js.native
trait WorkerUtilsDatabase extends StObject {
  
  def openDatabase(name: DOMString, version: DOMString, displayName: DOMString, estimatedSize: Double): Database = js.native
  def openDatabase(
    name: DOMString,
    version: DOMString,
    displayName: DOMString,
    estimatedSize: Double,
    creationCallback: DatabaseCallback
  ): Database = js.native
  
  def openDatabaseSync(name: DOMString, version: DOMString, displayName: DOMString, estimatedSize: Double): DatabaseSync = js.native
  def openDatabaseSync(
    name: DOMString,
    version: DOMString,
    displayName: DOMString,
    estimatedSize: Double,
    creationCallback: DatabaseCallback
  ): DatabaseSync = js.native
}
