package typings.yaml.mod.Document

import typings.yaml.typesMod.Node
import typings.yaml.typesMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parsed
  extends typings.yaml.mod.Document {
  
  @JSName("contents")
  var contents_Parsed: Node | Null = js.native
  
  /** The schema used with the document. */
  @JSName("schema")
  var schema_Parsed: Schema = js.native
}
