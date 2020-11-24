package typings.umzug.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UmzugStatic
  extends Instantiable0[Umzug]
     with Instantiable1[/* options */ UmzugOptions, Umzug] {
  
  def migrationsList(migrations: js.Array[MigrationDefinitionWithName]): js.Array[Migration] = js.native
  def migrationsList(migrations: js.Array[MigrationDefinitionWithName], parameters: js.Array[_]): js.Array[Migration] = js.native
}
