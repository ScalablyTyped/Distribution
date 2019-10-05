package typings.xsdDashSchemaDashValidator

import typings.node.NodeJS.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xsd-schema-validator", JSImport.Namespace)
@js.native
object xsdDashSchemaDashValidatorMod extends js.Object {
  def validateXML(
    xml: String,
    pathToXsd: String,
    callback: js.Function2[/* err */ Error, /* result */ Anon_Messages, Unit]
  ): Unit = js.native
  def validateXML(
    xml: ReadableStream,
    pathToXsd: String,
    callback: js.Function2[/* err */ Error, /* result */ Anon_Messages, Unit]
  ): Unit = js.native
  def validateXML(
    xml: Anon_File,
    pathToXsd: String,
    callback: js.Function2[/* err */ Error, /* result */ Anon_Messages, Unit]
  ): Unit = js.native
}

