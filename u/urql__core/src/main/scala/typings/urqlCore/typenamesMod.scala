package typings.urqlCore

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/utils/typenames", JSImport.Namespace)
@js.native
object typenamesMod extends js.Object {
  def collectTypesFromResponse(response: js.Object): js.Array[String] = js.native
  def formatDocument(node: DocumentNode): js.Any = js.native
}

