package typings.xsdSchemaValidator

import typings.node.NodeJS.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xsd-schema-validator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def validateXML(
    xml: String,
    pathToXsd: String,
    callback: js.Function2[/* err */ Error, /* result */ AnonMessages, Unit]
  ): Unit = js.native
  def validateXML(
    xml: ReadableStream,
    pathToXsd: String,
    callback: js.Function2[/* err */ Error, /* result */ AnonMessages, Unit]
  ): Unit = js.native
  def validateXML(
    xml: AnonFile,
    pathToXsd: String,
    callback: js.Function2[/* err */ Error, /* result */ AnonMessages, Unit]
  ): Unit = js.native
}

